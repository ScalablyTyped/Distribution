package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.Extra
import typings.antdMobileRn.datePickerViewPropsTypeMod.DatePickerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewMod {
  
  @JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", JSImport.Default)
  @js.native
  open class default () extends DatePickerView
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/date-picker-view", "default.defaultProps")
    @js.native
    def defaultProps: Extra = js.native
    inline def defaultProps_=(x: Extra): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePickerView extends Component[DatePickerProps, Any, Any]
}
