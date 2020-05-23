package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLSelection")
@js.native
class IHTMLSelection protected ()
  extends typings.activexMshtml.MSHTML.IHTMLSelection {
  /* CompleteClass */
  @JSName("MSHTML.IHTMLSelection_typekey")
  override var MSHTMLDotIHTMLSelection_typekey: typings.activexMshtml.MSHTML.IHTMLSelection = js.native
  /* CompleteClass */
  override val anchorNode: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  /* CompleteClass */
  override val anchorOffset: Double = js.native
  /* CompleteClass */
  override val focusNode: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  /* CompleteClass */
  override val focusOffset: Double = js.native
  /* CompleteClass */
  override val isCollapsed: Boolean = js.native
  /* CompleteClass */
  override val rangeCount: Double = js.native
  /* CompleteClass */
  override def addRange(range: js.Any): Unit = js.native
  /* CompleteClass */
  override def collapse(parentNode: js.Any, offfset: Double): Unit = js.native
  /* CompleteClass */
  override def collapseToEnd(): Unit = js.native
  /* CompleteClass */
  override def collapseToStart(): Unit = js.native
  /* CompleteClass */
  override def deleteFromDocument(): Unit = js.native
  /* CompleteClass */
  override def getRangeAt(index: Double): typings.activexMshtml.MSHTML.IHTMLDOMRange = js.native
  /* CompleteClass */
  override def removeAllRanges(): Unit = js.native
  /* CompleteClass */
  override def removeRange(range: js.Any): Unit = js.native
  /* CompleteClass */
  override def selectAllChildren(parentNode: js.Any): Unit = js.native
}

