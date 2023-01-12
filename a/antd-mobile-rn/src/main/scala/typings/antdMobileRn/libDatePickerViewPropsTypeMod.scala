package typings.antdMobileRn

import typings.antdMobileRn.libDatePickerPropsTypeMod.DatePickerPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerViewPropsTypeMod {
  
  trait DatePickerProps
    extends StObject
       with DatePickerPropsType {
    
    var onScrollChange: js.UndefOr[js.Function3[/* newValue */ Any, /* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    /** rn only */
    var styles: js.UndefOr[Any] = js.undefined
    
    /** rn only */
    var triggerTypes: js.UndefOr[String] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setOnScrollChange(value: (/* newValue */ Any, /* vals */ Any, /* index */ Double) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
