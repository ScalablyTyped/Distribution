package typings
package antdLib.libSpinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spin
  extends reactLib.reactMod.Component[SpinProps, SpinState, js.Any] {
  var debounceTimeout: scala.Double = js.native
  var delayTimeout: scala.Double = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSpin(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSpin(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSpin(): scala.Unit = js.native
  def delayUpdateSpinning(): scala.Unit = js.native
  def isNestedPattern(): scala.Boolean = js.native
}

