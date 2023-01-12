package typings.antDesignReactNative

import typings.antDesignReactNative.libPickerPopupPickerTypesMod.PopupPickerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerDatepickerPopupMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", JSImport.Default)
  @js.native
  open class default () extends PopupDatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      inline def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/date-picker/datepicker/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      inline def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupDatePicker extends Component[PopupDatePickerProps, Any, Any] {
    
    def onOk(v: Any): Unit = js.native
  }
  
  trait PopupDatePickerProps
    extends StObject
       with PopupPickerProps {
    
    var date: js.UndefOr[Any] = js.undefined
    
    var datePicker: ReactElement
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object PopupDatePickerProps {
    
    inline def apply(datePicker: ReactElement): PopupDatePickerProps = {
      val __obj = js.Dynamic.literal(datePicker = datePicker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupDatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupDatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDatePicker(value: ReactElement): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setOnChange(value: /* date */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
