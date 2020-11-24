package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/action-sheet/demo/basic", JSImport.Namespace)
@js.native
object demoBasicMod extends js.Object {
  
  val description: /* "ActionSheet example" */ String = js.native
  
  val title: /* "ActionSheet" */ String = js.native
  
  @js.native
  trait Test
    extends Component[js.Any, js.Any, js.Any] {
    
    def showActionSheet(): Unit = js.native
    
    def showShareActionSheet(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Test {
    def this(props: js.Any) = this()
  }
}
