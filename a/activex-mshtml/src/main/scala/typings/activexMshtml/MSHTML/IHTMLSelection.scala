package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLSelection extends StObject {
  
  @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection = js.native
  
  def addRange(range: js.Any): Unit = js.native
  
  val anchorNode: IHTMLDOMNode = js.native
  
  val anchorOffset: Double = js.native
  
  def collapse(parentNode: js.Any, offfset: Double): Unit = js.native
  
  def collapseToEnd(): Unit = js.native
  
  def collapseToStart(): Unit = js.native
  
  def deleteFromDocument(): Unit = js.native
  
  val focusNode: IHTMLDOMNode = js.native
  
  val focusOffset: Double = js.native
  
  def getRangeAt(index: Double): IHTMLDOMRange = js.native
  
  val isCollapsed: Boolean = js.native
  
  val rangeCount: Double = js.native
  
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
  implicit class IHTMLSelectionMutableBuilder[Self <: IHTMLSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRange(value: js.Any => Unit): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnchorNode(value: IHTMLDOMNode): Self = StObject.set(x, "anchorNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapse(value: (js.Any, Double) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseToEnd(value: () => Unit): Self = StObject.set(x, "collapseToEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseToStart(value: () => Unit): Self = StObject.set(x, "collapseToStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteFromDocument(value: () => Unit): Self = StObject.set(x, "deleteFromDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocusNode(value: IHTMLDOMNode): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRangeAt(value: Double => IHTMLDOMRange): Self = StObject.set(x, "getRangeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLSelection_typekey(value: IHTMLSelection): Self = StObject.set(x, "MSHTML.IHTMLSelection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeCount(value: Double): Self = StObject.set(x, "rangeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllRanges(value: () => Unit): Self = StObject.set(x, "removeAllRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRange(value: js.Any => Unit): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAllChildren(value: js.Any => Unit): Self = StObject.set(x, "selectAllChildren", js.Any.fromFunction1(value))
  }
}
