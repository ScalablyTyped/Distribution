package typings.antDesignReactNative

import typings.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewPropsTypeMod {
  
  trait DatePickerProps
    extends StObject
       with DatePickerPropsType {
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var triggerTypes: js.UndefOr[String] = js.undefined
  }
  object DatePickerProps {
    
    @scala.inline
    def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
