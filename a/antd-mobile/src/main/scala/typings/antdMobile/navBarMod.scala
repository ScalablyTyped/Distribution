package typings.antdMobile

import typings.antdMobile.navBarPropsTypeMod.NavBarProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/nav-bar", JSImport.Namespace)
@js.native
object navBarMod extends js.Object {
  @js.native
  trait NavBar
    extends Component[NavBarProps, js.Any, js.Any]
  
  @js.native
  class default () extends NavBar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonMode = js.native
  }
  
}

