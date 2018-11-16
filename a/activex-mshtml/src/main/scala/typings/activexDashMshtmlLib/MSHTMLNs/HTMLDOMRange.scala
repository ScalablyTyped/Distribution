package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMRange")
@js.native
class HTMLDOMRange protected () extends js.Object {
  var `MSHTML.HTMLDOMRange_typekey`: HTMLDOMRange = js.native
  val collapsed: scala.Boolean = js.native
  val commonAncestorContainer: IHTMLDOMNode = js.native
  val endContainer: IHTMLDOMNode = js.native
  val endOffset: scala.Double = js.native
  val startContainer: IHTMLDOMNode = js.native
  val startOffset: scala.Double = js.native
  def Detach(): scala.Unit = js.native
  def cloneContents(): js.Any = js.native
  def cloneRange(): IHTMLDOMRange = js.native
  def collapse(toStart: scala.Boolean): scala.Unit = js.native
  def compareBoundaryPoints(how: scala.Double, sourceRange: js.Any): scala.Double = js.native
  def deleteContents(): scala.Unit = js.native
  def extractContents(): js.Any = js.native
  def getBoundingClientRect(): IHTMLRect = js.native
  def getClientRects(): IHTMLRectCollection = js.native
  def insertNode(newNode: js.Any): scala.Unit = js.native
  def selectNode(refNode: js.Any): scala.Unit = js.native
  def selectNodeContents(refNode: js.Any): scala.Unit = js.native
  def setEnd(refNode: js.Any, offset: scala.Double): scala.Unit = js.native
  def setEndAfter(refNode: js.Any): scala.Unit = js.native
  def setEndBefore(refNode: js.Any): scala.Unit = js.native
  def setStart(refNode: js.Any, offset: scala.Double): scala.Unit = js.native
  def setStartAfter(refNode: js.Any): scala.Unit = js.native
  def setStartBefore(refNode: js.Any): scala.Unit = js.native
  def surroundContents(newParent: js.Any): scala.Unit = js.native
}

