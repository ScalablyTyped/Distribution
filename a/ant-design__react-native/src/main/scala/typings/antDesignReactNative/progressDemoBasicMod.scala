package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/progress/demo/basic", JSImport.Namespace)
@js.native
object progressDemoBasicMod extends js.Object {
  
  @js.native
  trait BasicProgressExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onAdd(): Unit = js.native
  }
  
  @js.native
  class default protected () extends BasicProgressExample {
    def this(props: js.Any) = this()
  }
}
