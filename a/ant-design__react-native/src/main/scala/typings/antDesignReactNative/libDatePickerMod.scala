package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Mode
import typings.antDesignReactNative.libDatePickerPropsTypeMod.DatePickerPropsType
import typings.antDesignReactNative.libPickerStyleMod.PickerStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/date-picker", "default.defaultProps")
    @js.native
    def defaultProps: Mode = js.native
    inline def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, Any]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setTriggerTypes(value: String): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
    }
  }
}
