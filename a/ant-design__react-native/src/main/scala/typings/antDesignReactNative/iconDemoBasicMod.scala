package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Data
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/icon/demo/basic", JSImport.Namespace)
@js.native
object iconDemoBasicMod extends js.Object {
  @js.native
  trait IConDemo
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_IConDemo: Data = js.native
  }
  
  @js.native
  class default () extends IConDemo
  
  val description: /* "Icon Example" */ String = js.native
  val title: /* "Icon" */ String = js.native
}

