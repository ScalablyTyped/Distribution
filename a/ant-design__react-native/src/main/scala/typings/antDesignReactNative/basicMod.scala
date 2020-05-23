package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActiveSections
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/accordion/demo/basic", JSImport.Namespace)
@js.native
object basicMod extends js.Object {
  @js.native
  trait AccordionExmple
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_AccordionExmple: ActiveSections = js.native
    def onChange(activeSections: js.Array[Double]): Unit = js.native
  }
  
  @js.native
  class default () extends AccordionExmple
  
}

