package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLDOMRange extends js.Object {
  @JSName("MSHTML.IHTMLDOMRange_typekey")
  var MSHTMLDotIHTMLDOMRange_typekey: IHTMLDOMRange
  val collapsed: Boolean
  val commonAncestorContainer: IHTMLDOMNode
  val endContainer: IHTMLDOMNode
  val endOffset: Double
  val startContainer: IHTMLDOMNode
  val startOffset: Double
  def Detach(): Unit
  def cloneContents(): js.Any
  def cloneRange(): IHTMLDOMRange
  def collapse(toStart: Boolean): Unit
  def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double
  def deleteContents(): Unit
  def extractContents(): js.Any
  def getBoundingClientRect(): IHTMLRect
  def getClientRects(): IHTMLRectCollection
  def insertNode(newNode: js.Any): Unit
  def selectNode(refNode: js.Any): Unit
  def selectNodeContents(refNode: js.Any): Unit
  def setEnd(refNode: js.Any, offset: Double): Unit
  def setEndAfter(refNode: js.Any): Unit
  def setEndBefore(refNode: js.Any): Unit
  def setStart(refNode: js.Any, offset: Double): Unit
  def setStartAfter(refNode: js.Any): Unit
  def setStartBefore(refNode: js.Any): Unit
  def surroundContents(newParent: js.Any): Unit
}

object IHTMLDOMRange {
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotIHTMLDOMRange_typekey: IHTMLDOMRange,
    cloneContents: () => js.Any,
    cloneRange: () => IHTMLDOMRange,
    collapse: Boolean => Unit,
    collapsed: Boolean,
    commonAncestorContainer: IHTMLDOMNode,
    compareBoundaryPoints: (Double, js.Any) => Double,
    deleteContents: () => Unit,
    endContainer: IHTMLDOMNode,
    endOffset: Double,
    extractContents: () => js.Any,
    getBoundingClientRect: () => IHTMLRect,
    getClientRects: () => IHTMLRectCollection,
    insertNode: js.Any => Unit,
    selectNode: js.Any => Unit,
    selectNodeContents: js.Any => Unit,
    setEnd: (js.Any, Double) => Unit,
    setEndAfter: js.Any => Unit,
    setEndBefore: js.Any => Unit,
    setStart: (js.Any, Double) => Unit,
    setStartAfter: js.Any => Unit,
    setStartBefore: js.Any => Unit,
    startContainer: IHTMLDOMNode,
    startOffset: Double,
    surroundContents: js.Any => Unit
  ): IHTMLDOMRange = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), cloneContents = js.Any.fromFunction0(cloneContents), cloneRange = js.Any.fromFunction0(cloneRange), collapse = js.Any.fromFunction1(collapse), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), deleteContents = js.Any.fromFunction0(deleteContents), endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], extractContents = js.Any.fromFunction0(extractContents), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), insertNode = js.Any.fromFunction1(insertNode), selectNode = js.Any.fromFunction1(selectNode), selectNodeContents = js.Any.fromFunction1(selectNodeContents), setEnd = js.Any.fromFunction2(setEnd), setEndAfter = js.Any.fromFunction1(setEndAfter), setEndBefore = js.Any.fromFunction1(setEndBefore), setStart = js.Any.fromFunction2(setStart), setStartAfter = js.Any.fromFunction1(setStartAfter), setStartBefore = js.Any.fromFunction1(setStartBefore), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1(surroundContents))
    __obj.updateDynamic("MSHTML.IHTMLDOMRange_typekey")(MSHTMLDotIHTMLDOMRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMRange]
  }
}

