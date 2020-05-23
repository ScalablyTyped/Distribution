package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLSelection extends js.Object {
  @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection
  val anchorNode: IHTMLDOMNode
  val anchorOffset: Double
  val focusNode: IHTMLDOMNode
  val focusOffset: Double
  val isCollapsed: Boolean
  val rangeCount: Double
  def addRange(range: js.Any): Unit
  def collapse(parentNode: js.Any, offfset: Double): Unit
  def collapseToEnd(): Unit
  def collapseToStart(): Unit
  def deleteFromDocument(): Unit
  def getRangeAt(index: Double): IHTMLDOMRange
  def removeAllRanges(): Unit
  def removeRange(range: js.Any): Unit
  def selectAllChildren(parentNode: js.Any): Unit
}

object IHTMLSelection {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelection_typekey: IHTMLSelection,
    addRange: js.Any => Unit,
    anchorNode: IHTMLDOMNode,
    anchorOffset: Double,
    collapse: (js.Any, Double) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    deleteFromDocument: () => Unit,
    focusNode: IHTMLDOMNode,
    focusOffset: Double,
    getRangeAt: Double => IHTMLDOMRange,
    isCollapsed: Boolean,
    rangeCount: Double,
    removeAllRanges: () => Unit,
    removeRange: js.Any => Unit,
    selectAllChildren: js.Any => Unit
  ): IHTMLSelection = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), anchorNode = anchorNode.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], collapse = js.Any.fromFunction2(collapse), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), deleteFromDocument = js.Any.fromFunction0(deleteFromDocument), focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], getRangeAt = js.Any.fromFunction1(getRangeAt), isCollapsed = isCollapsed.asInstanceOf[js.Any], rangeCount = rangeCount.asInstanceOf[js.Any], removeAllRanges = js.Any.fromFunction0(removeAllRanges), removeRange = js.Any.fromFunction1(removeRange), selectAllChildren = js.Any.fromFunction1(selectAllChildren))
    __obj.updateDynamic("MSHTML.IHTMLSelection_typekey")(MSHTMLDotIHTMLSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelection]
  }
}

