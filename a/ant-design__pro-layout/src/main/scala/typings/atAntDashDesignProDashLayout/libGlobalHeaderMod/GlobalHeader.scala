package typings.atAntDashDesignProDashLayout.libGlobalHeaderMod

import typings.lodash.lodashMod.Cancelable
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeader
  extends Component[GlobalHeaderProps, js.Object, js.Any] {
  var triggerResizeEvent: js.Function0[Unit] with Cancelable = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGlobalHeader(): Unit = js.native
  def renderCollapsedButton(): Element | Null = js.native
  def toggle(): Unit = js.native
}

