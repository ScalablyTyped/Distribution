package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libAccordionDemoBasicMod.AccordionExmple
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/accordion/demo/basic", JSImport.Namespace)
@js.native
object libAccordionDemoBasicMod extends js.Object {
  @js.native
  trait AccordionExmple
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_AccordionExmple: Anon_ActiveSections = js.native
    def onChange(activeSections: js.Array[Double]): Unit = js.native
  }
  
  @js.native
  class default () extends AccordionExmple
  
}

