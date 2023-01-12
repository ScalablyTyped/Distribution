package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLSelection extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection
  
  def addRange(range: Any): Unit
  
  val anchorNode: IHTMLDOMNode
  
  val anchorOffset: Double
  
  def collapse(parentNode: Any, offfset: Double): Unit
  
  def collapseToEnd(): Unit
  
  def collapseToStart(): Unit
  
  def deleteFromDocument(): Unit
  
  val focusNode: IHTMLDOMNode
  
  val focusOffset: Double
  
  def getRangeAt(index: Double): IHTMLDOMRange
  
  val isCollapsed: Boolean
  
  val rangeCount: Double
  
  def removeAllRanges(): Unit
  
  def removeRange(range: Any): Unit
  
  def selectAllChildren(parentNode: Any): Unit
}
object IHTMLSelection {
  
  inline def apply(
    MSHTMLDotIHTMLSelection_typekey: IHTMLSelection,
    addRange: Any => Unit,
    anchorNode: IHTMLDOMNode,
    anchorOffset: Double,
    collapse: (Any, Double) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    deleteFromDocument: () => Unit,
    focusNode: IHTMLDOMNode,
    focusOffset: Double,
    getRangeAt: Double => IHTMLDOMRange,
    isCollapsed: Boolean,
    rangeCount: Double,
    removeAllRanges: () => Unit,
    removeRange: Any => Unit,
    selectAllChildren: Any => Unit
  ): IHTMLSelection = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), anchorNode = anchorNode.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], collapse = js.Any.fromFunction2(collapse), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), deleteFromDocument = js.Any.fromFunction0(deleteFromDocument), focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], getRangeAt = js.Any.fromFunction1(getRangeAt), isCollapsed = isCollapsed.asInstanceOf[js.Any], rangeCount = rangeCount.asInstanceOf[js.Any], removeAllRanges = js.Any.fromFunction0(removeAllRanges), removeRange = js.Any.fromFunction1(removeRange), selectAllChildren = js.Any.fromFunction1(selectAllChildren))
    __obj.updateDynamic("MSHTML.IHTMLSelection_typekey")(MSHTMLDotIHTMLSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHTMLSelection] (val x: Self) extends AnyVal {
    
    inline def setAddRange(value: Any => Unit): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    inline def setAnchorNode(value: IHTMLDOMNode): Self = StObject.set(x, "anchorNode", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setCollapse(value: (Any, Double) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    inline def setCollapseToEnd(value: () => Unit): Self = StObject.set(x, "collapseToEnd", js.Any.fromFunction0(value))
    
    inline def setCollapseToStart(value: () => Unit): Self = StObject.set(x, "collapseToStart", js.Any.fromFunction0(value))
    
    inline def setDeleteFromDocument(value: () => Unit): Self = StObject.set(x, "deleteFromDocument", js.Any.fromFunction0(value))
    
    inline def setFocusNode(value: IHTMLDOMNode): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
    
    inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
    
    inline def setGetRangeAt(value: Double => IHTMLDOMRange): Self = StObject.set(x, "getRangeAt", js.Any.fromFunction1(value))
    
    inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLSelection_typekey(value: IHTMLSelection): Self = StObject.set(x, "MSHTML.IHTMLSelection_typekey", value.asInstanceOf[js.Any])
    
    inline def setRangeCount(value: Double): Self = StObject.set(x, "rangeCount", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllRanges(value: () => Unit): Self = StObject.set(x, "removeAllRanges", js.Any.fromFunction0(value))
    
    inline def setRemoveRange(value: Any => Unit): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    inline def setSelectAllChildren(value: Any => Unit): Self = StObject.set(x, "selectAllChildren", js.Any.fromFunction1(value))
  }
}
