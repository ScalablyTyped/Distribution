package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/textarea-item/demo/basic", JSImport.Namespace)
@js.native
object textareaItemDemoBasicMod extends js.Object {
  @js.native
  trait BasicTextAreaItemExample
    extends Component[js.Any, js.Any, js.Any] {
    def onChange(`val`: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends BasicTextAreaItemExample {
    def this(props: js.Any) = this()
  }
  
}

