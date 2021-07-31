package typings.antdMobile

import typings.antdMobile.anon.WrapLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("antd-mobile/lib/radio", JSImport.Default)
  @js.native
  class default ()
    extends typings.antdMobile.radioRadioMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/radio", "default.RadioItem")
    @js.native
    def RadioItem: js.Any = js.native
    @scala.inline
    def RadioItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/radio", "default.defaultProps")
    @js.native
    def defaultProps: WrapLabel = js.native
    @scala.inline
    def defaultProps_=(x: WrapLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
