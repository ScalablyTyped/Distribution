package typings
package atAntDashDesignProDashLayoutLib.libGlobalHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeader
  extends reactLib.reactMod.Component[GlobalHeaderProps, js.Object, js.Any] {
  var triggerResizeEvent: js.Function0[scala.Unit] with lodashLib.lodashMod.Cancelable = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGlobalHeader(): scala.Unit = js.native
  def renderCollapsedButton(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def toggle(): scala.Unit = js.native
}

