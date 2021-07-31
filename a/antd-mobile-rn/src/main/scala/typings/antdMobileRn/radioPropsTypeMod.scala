package typings.antdMobileRn

import typings.antdMobileRn.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioPropsTypeMod {
  
  trait RadioItemPropsType
    extends StObject
       with RadioPropsType {
    
    var onClick: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var radioProps: js.UndefOr[js.Object] = js.undefined
  }
  object RadioItemPropsType {
    
    @scala.inline
    def apply(): RadioItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemPropsType]
    }
    
    @scala.inline
    implicit class RadioItemPropsTypeMutableBuilder[Self <: RadioItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: () => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRadioProps(value: js.Object): Self = StObject.set(x, "radioProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioPropsUndefined: Self = StObject.set(x, "radioProps", js.undefined)
    }
  }
  
  trait RadioPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var wrapLabel: js.UndefOr[Boolean] = js.undefined
  }
  object RadioPropsType {
    
    @scala.inline
    def apply(): RadioPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioPropsType]
    }
    
    @scala.inline
    implicit class RadioPropsTypeMutableBuilder[Self <: RadioPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapLabelUndefined: Self = StObject.set(x, "wrapLabel", js.undefined)
    }
  }
}
