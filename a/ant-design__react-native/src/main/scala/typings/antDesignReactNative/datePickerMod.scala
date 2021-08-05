package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Mode
import typings.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.pickerStyleMod.PickerStyle
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: Mode = js.native
    inline def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, js.Any]
  
  trait DatePickerProps
    extends StObject
       with DatePickerPropsType
       with WithThemeStyles[PickerStyle] {
    
    var triggerTypes: js.UndefOr[String] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
