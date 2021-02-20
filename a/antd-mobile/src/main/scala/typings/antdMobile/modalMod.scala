package typings.antdMobile

import typings.antdMobile.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("antd-mobile/lib/modal", JSImport.Default)
  @js.native
  class default ()
    extends typings.antdMobile.modalModalMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/modal", "default.defaultProps")
    @js.native
    def defaultProps: Animated = js.native
    @scala.inline
    def defaultProps_=(x: Animated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
