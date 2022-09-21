package typings.antDesignReactNative

import typings.antDesignReactNative.anon.MinuteStep
import typings.antDesignReactNative.datePickerViewPropsTypeMod.DatePickerProps
import typings.react.mod.Component
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewDatePickerViewMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Default)
  @js.native
  open class default () extends DatePickerView
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", "default.defaultProps")
    @js.native
    def defaultProps: MinuteStep = js.native
    inline def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePickerView extends Component[DatePickerProps, Any, Any]
}
