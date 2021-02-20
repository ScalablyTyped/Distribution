package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.MinuteStep
import typings.antDesignReactNative.datePickerViewPropsTypeMod.DatePickerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewDatePickerViewMod {
  
  @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Default)
  @js.native
  class default () extends DatePickerView
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/date-picker-view/date-picker-view", "default.defaultProps")
    @js.native
    def defaultProps: MinuteStep = js.native
    @scala.inline
    def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
}
