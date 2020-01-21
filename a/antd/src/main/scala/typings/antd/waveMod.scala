package typings.antd

import typings.antd.antdStrings.`ant-click-animating-without-extra-node`
import typings.antd.antdStrings.`ant-click-animating`
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.AnimationEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/wave", JSImport.Namespace)
@js.native
object waveMod extends js.Object {
  @js.native
  trait Wave
    extends Component[AnonInsertExtraNode, js.Object, js.Any] {
    var animationStart: js.Any = js.native
    var animationStartId: js.Any = js.native
    var clickWaveTimeoutId: js.Any = js.native
    var csp: js.UndefOr[js.Any] = js.native
    var destroy: js.Any = js.native
    var extraNode: js.Any = js.native
    var instance: js.UndefOr[js.Any] = js.native
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[AnonCancel] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MWave(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWave(): Unit = js.native
    def getAttributeName(): `ant-click-animating` | `ant-click-animating-without-extra-node` = js.native
    def onClick(node: HTMLElement, waveColor: String): Unit = js.native
    def onTransitionEnd(e: AnimationEvent): Unit = js.native
    def onTransitionStart(e: AnimationEvent): Unit = js.native
    def renderWave(hasCsp: ConfigConsumerProps): ReactNode = js.native
    def resetEffect(node: HTMLElement): Unit = js.native
  }
  
  @js.native
  class default () extends Wave
  
}

