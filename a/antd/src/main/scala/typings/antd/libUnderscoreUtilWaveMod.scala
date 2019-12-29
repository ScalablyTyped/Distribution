package typings.antd

import typings.antd.antdStrings.`ant-click-animating-without-extra-node`
import typings.antd.antdStrings.`ant-click-animating`
import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.std.AnimationEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/wave", JSImport.Namespace)
@js.native
object libUnderscoreUtilWaveMod extends js.Object {
  @js.native
  trait Wave
    extends Component[Anon_InsertExtraNode, js.Object, js.Any] {
    var animationStart: js.Any = js.native
    var animationStartId: js.Any = js.native
    var clickWaveTimeoutId: js.Any = js.native
    var csp: js.UndefOr[js.Any] = js.native
    var destroy: js.Any = js.native
    var extraNode: js.Any = js.native
    var instance: js.UndefOr[js.Any] = js.native
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[Anon_Cancel] = js.native
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

