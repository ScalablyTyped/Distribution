package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMRange")
@js.native
class HTMLDOMRange protected () extends js.Object {
  @JSName("MSHTML.HTMLDOMRange_typekey")
  var MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange = js.native
  val collapsed: Boolean = js.native
  val commonAncestorContainer: IHTMLDOMNode = js.native
  val endContainer: IHTMLDOMNode = js.native
  val endOffset: Double = js.native
  val startContainer: IHTMLDOMNode = js.native
  val startOffset: Double = js.native
  def Detach(): Unit = js.native
  def cloneContents(): js.Any = js.native
  def cloneRange(): IHTMLDOMRange = js.native
  def collapse(toStart: Boolean): Unit = js.native
  def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double = js.native
  def deleteContents(): Unit = js.native
  def extractContents(): js.Any = js.native
  def getBoundingClientRect(): IHTMLRect = js.native
  def getClientRects(): IHTMLRectCollection = js.native
  def insertNode(newNode: js.Any): Unit = js.native
  def selectNode(refNode: js.Any): Unit = js.native
  def selectNodeContents(refNode: js.Any): Unit = js.native
  def setEnd(refNode: js.Any, offset: Double): Unit = js.native
  def setEndAfter(refNode: js.Any): Unit = js.native
  def setEndBefore(refNode: js.Any): Unit = js.native
  def setStart(refNode: js.Any, offset: Double): Unit = js.native
  def setStartAfter(refNode: js.Any): Unit = js.native
  def setStartBefore(refNode: js.Any): Unit = js.native
  def surroundContents(newParent: js.Any): Unit = js.native
}

