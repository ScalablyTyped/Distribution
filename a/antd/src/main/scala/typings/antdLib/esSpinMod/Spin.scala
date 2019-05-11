package typings
package antdLib.esSpinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spin
  extends reactLib.reactMod.Component[SpinProps, SpinState, js.Any] {
  def cancelExistingSpin(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSpin(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpin(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSpin(): scala.Unit = js.native
  def debouncifyUpdateSpinning(): scala.Unit = js.native
  def debouncifyUpdateSpinning(props: SpinProps): scala.Unit = js.native
  def isNestedPattern(): scala.Boolean = js.native
  def originalUpdateSpinning(): scala.Unit = js.native
  def renderSpin(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def updateSpinning(): scala.Unit = js.native
}

