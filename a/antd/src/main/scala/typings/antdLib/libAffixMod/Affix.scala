package typings
package antdLib.libAffixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affix
  extends reactLib.reactMod.Component[AffixProps, AffixState, js.Any] {
  var eventHandlers: js.Any = js.native
  val events: js.Any = js.native
  var fixedNode: js.Any = js.native
  var placeholderNode: js.Any = js.native
  @JSName("state")
  var state_Affix: AffixState = js.native
  var timeout: js.Any = js.native
  def clearEventListeners(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAffix(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MAffix(nextProps: AffixProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAffix(): scala.Unit = js.native
  def saveFixedNode(node: reactLib.HTMLDivElement): scala.Unit = js.native
  def savePlaceholderNode(node: reactLib.HTMLDivElement): scala.Unit = js.native
  def setAffixStyle(e: reactLib.Event): scala.Unit = js.native
  def setAffixStyle(e: reactLib.Event, affixStyle: reactLib.reactMod.ReactNs.CSSProperties): scala.Unit = js.native
  def setPlaceholderStyle(): scala.Unit = js.native
  def setPlaceholderStyle(placeholderStyle: reactLib.reactMod.ReactNs.CSSProperties): scala.Unit = js.native
  def setTargetEventListeners(getTarget: js.Function0[reactLib.HTMLElement | stdLib.Window | scala.Null]): scala.Unit = js.native
  def syncPlaceholderStyle(e: reactLib.Event): scala.Unit = js.native
  def updatePosition(e: reactLib.Event): scala.Unit = js.native
}

