package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLSelection extends js.Object {
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
  @scala.inline
  implicit class IHTMLSelectionOps[Self <: IHTMLSelection] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLSelection_typekey(value: IHTMLSelection): Self = this.set("MSHTML.IHTMLSelection_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddRange(value: js.Any => Unit): Self = this.set("addRange", js.Any.fromFunction1(value))
    @scala.inline
    def setAnchorNode(value: IHTMLDOMNode): Self = this.set("anchorNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorOffset(value: Double): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapse(value: (js.Any, Double) => Unit): Self = this.set("collapse", js.Any.fromFunction2(value))
    @scala.inline
    def setCollapseToEnd(value: () => Unit): Self = this.set("collapseToEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseToStart(value: () => Unit): Self = this.set("collapseToStart", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteFromDocument(value: () => Unit): Self = this.set("deleteFromDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setFocusNode(value: IHTMLDOMNode): Self = this.set("focusNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusOffset(value: Double): Self = this.set("focusOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRangeAt(value: Double => IHTMLDOMRange): Self = this.set("getRangeAt", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeCount(value: Double): Self = this.set("rangeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAllRanges(value: () => Unit): Self = this.set("removeAllRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveRange(value: js.Any => Unit): Self = this.set("removeRange", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectAllChildren(value: js.Any => Unit): Self = this.set("selectAllChildren", js.Any.fromFunction1(value))
  }
  
}

