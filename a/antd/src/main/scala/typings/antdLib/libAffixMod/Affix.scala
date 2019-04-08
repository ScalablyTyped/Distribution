package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affix
  extends reactLib.reactMod.Component[AffixProps, AffixState, js.Any] {
  var fixedNode: stdLib.HTMLDivElement = js.native
  var placeholderNode: stdLib.HTMLDivElement = js.native
  @JSName("state")
  var state_Affix: AffixState = js.native
  var timeout: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAffix(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAffix(prevProps: AffixProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAffix(): scala.Unit = js.native
  def measure(): scala.Unit = js.native
  def renderAffix(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveFixedNode(node: stdLib.HTMLDivElement): scala.Unit = js.native
  def savePlaceholderNode(node: stdLib.HTMLDivElement): scala.Unit = js.native
  def updatePosition(): scala.Unit = js.native
  def updatePosition(e: stdLib.Event): scala.Unit = js.native
}

