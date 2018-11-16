package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLSelection")
@js.native
class IHTMLSelection protected () extends js.Object {
  var `MSHTML.IHTMLSelection_typekey`: IHTMLSelection = js.native
  val anchorNode: IHTMLDOMNode = js.native
  val anchorOffset: scala.Double = js.native
  val focusNode: IHTMLDOMNode = js.native
  val focusOffset: scala.Double = js.native
  val isCollapsed: scala.Boolean = js.native
  val rangeCount: scala.Double = js.native
  def addRange(range: js.Any): scala.Unit = js.native
  def collapse(parentNode: js.Any, offfset: scala.Double): scala.Unit = js.native
  def collapseToEnd(): scala.Unit = js.native
  def collapseToStart(): scala.Unit = js.native
  def deleteFromDocument(): scala.Unit = js.native
  def getRangeAt(index: scala.Double): IHTMLDOMRange = js.native
  def removeAllRanges(): scala.Unit = js.native
  def removeRange(range: js.Any): scala.Unit = js.native
  def selectAllChildren(parentNode: js.Any): scala.Unit = js.native
}

