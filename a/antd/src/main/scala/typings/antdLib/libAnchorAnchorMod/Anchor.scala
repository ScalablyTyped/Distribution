package typings
package antdLib.libAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor
  extends reactLib.reactMod.Component[AnchorProps, AnchorState, js.Any] {
  var animating: js.Any = js.native
  var inkNode: js.Any = js.native
  var links: js.Any = js.native
  var scrollEvent: js.Any = js.native
  @JSName("state")
  var state_Anchor: antdLib.Anon_ActiveLink = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchor(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchor(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchor(): scala.Unit = js.native
  def getChildContext(): antdLib.Anon_AntAnchor = js.native
  def getCurrentAnchor(): java.lang.String = js.native
  def getCurrentAnchor(offsetTop: scala.Double): java.lang.String = js.native
  def getCurrentAnchor(offsetTop: scala.Double, bounds: scala.Double): java.lang.String = js.native
  def handleScroll(): scala.Unit = js.native
  def handleScrollTo(link: java.lang.String): scala.Unit = js.native
  def saveInkNode(node: reactLib.HTMLSpanElement): scala.Unit = js.native
  def updateInk(): scala.Unit = js.native
}

