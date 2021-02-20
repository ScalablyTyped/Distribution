package typings.antDesignReactNative

import typings.antDesignReactNative.popupPickerTypesMod.PopupPickerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", JSImport.Default)
  @js.native
  class default () extends PopupDatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      @scala.inline
      def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      @scala.inline
      def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupDatePicker
    extends Component[PopupDatePickerProps, js.Any, js.Any] {
    
    def onOk(v: js.Any): Unit = js.native
  }
  
  @js.native
  trait PopupDatePickerProps extends PopupPickerProps {
    
    var date: js.UndefOr[js.Any] = js.native
    
    var datePicker: ReactElement = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object PopupDatePickerProps {
    
    @scala.inline
    def apply(datePicker: ReactElement): PopupDatePickerProps = {
      val __obj = js.Dynamic.literal(datePicker = datePicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDatePickerProps]
    }
    
    @scala.inline
    implicit class PopupDatePickerPropsMutableBuilder[Self <: PopupDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePicker(value: ReactElement): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* date */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
