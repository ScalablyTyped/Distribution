package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLSelection")
@js.native
class IHTMLSelection protected () extends js.Object {
  @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection = js.native
  val anchorNode: IHTMLDOMNode = js.native
  val anchorOffset: Double = js.native
  val focusNode: IHTMLDOMNode = js.native
  val focusOffset: Double = js.native
  val isCollapsed: Boolean = js.native
  val rangeCount: Double = js.native
  def addRange(range: js.Any): Unit = js.native
  def collapse(parentNode: js.Any, offfset: Double): Unit = js.native
  def collapseToEnd(): Unit = js.native
  def collapseToStart(): Unit = js.native
  def deleteFromDocument(): Unit = js.native
  def getRangeAt(index: Double): IHTMLDOMRange = js.native
  def removeAllRanges(): Unit = js.native
  def removeRange(range: js.Any): Unit = js.native
  def selectAllChildren(parentNode: js.Any): Unit = js.native
}

