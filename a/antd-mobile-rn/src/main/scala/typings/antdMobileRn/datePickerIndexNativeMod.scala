package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.MinuteStep
import typings.antdMobileRn.datePickerPropsTypeMod.DatePickerPropsType
import typings.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/date-picker/index.native", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/date-picker/index.native", "default.defaultProps")
    @js.native
    def defaultProps: MinuteStep = js.native
    inline def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker extends Component[DatePickerNativeProps, Any, Any]
  
  trait DatePickerNativeProps
    extends StObject
       with DatePickerPropsType {
    
    var styles: js.UndefOr[IPickerStyle] = js.undefined
    
    var triggerTypes: js.UndefOr[String] = js.undefined
  }
  object DatePickerNativeProps {
    
    inline def apply(): DatePickerNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerNativeProps]
    }
    
    extension [Self <: DatePickerNativeProps](x: Self) {
      
      inline def setStyles(value: IPickerStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
