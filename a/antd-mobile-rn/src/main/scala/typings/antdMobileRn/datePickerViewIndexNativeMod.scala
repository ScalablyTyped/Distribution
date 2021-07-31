package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/date-picker-view/index.native", JSImport.Default)
  @js.native
  class default ()
    extends typings.antdMobileRn.datePickerViewMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/date-picker-view/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Extra = js.native
    @scala.inline
    def defaultProps_=(x: Extra): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
