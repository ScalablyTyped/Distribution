package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDOMRange extends js.Object {
  @JSName("MSHTML.IHTMLDOMRange_typekey")
  var MSHTMLDotIHTMLDOMRange_typekey: IHTMLDOMRange = js.native
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
  @scala.inline
  implicit class IHTMLDOMRangeOps[Self <: IHTMLDOMRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("Detach", js.Any.fromFunction0(value))
    @scala.inline
    def setMSHTMLDotIHTMLDOMRange_typekey(value: IHTMLDOMRange): Self = this.set("MSHTML.IHTMLDOMRange_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloneContents(value: () => js.Any): Self = this.set("cloneContents", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneRange(value: () => IHTMLDOMRange): Self = this.set("cloneRange", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonAncestorContainer(value: IHTMLDOMNode): Self = this.set("commonAncestorContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompareBoundaryPoints(value: (Double, js.Any) => Double): Self = this.set("compareBoundaryPoints", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteContents(value: () => Unit): Self = this.set("deleteContents", js.Any.fromFunction0(value))
    @scala.inline
    def setEndContainer(value: IHTMLDOMNode): Self = this.set("endContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractContents(value: () => js.Any): Self = this.set("extractContents", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBoundingClientRect(value: () => IHTMLRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClientRects(value: () => IHTMLRectCollection): Self = this.set("getClientRects", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertNode(value: js.Any => Unit): Self = this.set("insertNode", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectNode(value: js.Any => Unit): Self = this.set("selectNode", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectNodeContents(value: js.Any => Unit): Self = this.set("selectNodeContents", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnd(value: (js.Any, Double) => Unit): Self = this.set("setEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setSetEndAfter(value: js.Any => Unit): Self = this.set("setEndAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEndBefore(value: js.Any => Unit): Self = this.set("setEndBefore", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStart(value: (js.Any, Double) => Unit): Self = this.set("setStart", js.Any.fromFunction2(value))
    @scala.inline
    def setSetStartAfter(value: js.Any => Unit): Self = this.set("setStartAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStartBefore(value: js.Any => Unit): Self = this.set("setStartBefore", js.Any.fromFunction1(value))
    @scala.inline
    def setStartContainer(value: IHTMLDOMNode): Self = this.set("startContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurroundContents(value: js.Any => Unit): Self = this.set("surroundContents", js.Any.fromFunction1(value))
  }
  
}

