package typings.antdMobile

import typings.antdMobile.anon.Mode
import typings.antdMobile.navBarPropsTypeMod.NavBarProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBarMod {
  
  @JSImport("antd-mobile/lib/nav-bar", JSImport.Default)
  @js.native
  class default () extends NavBar
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/nav-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/nav-bar", "default.defaultProps")
    @js.native
    def defaultProps: Mode = js.native
    inline def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NavBar
    extends Component[NavBarProps, js.Any, js.Any]
}
