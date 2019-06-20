package typings
package antdLib.esGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends reactLib.reactMod.Component[RowProps, RowState, js.Any] {
  var token: java.lang.String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRow(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRow(): scala.Unit = js.native
  def getGutter(): js.UndefOr[scala.Double] = js.native
  def renderRow(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

