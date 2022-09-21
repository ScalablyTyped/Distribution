package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLDOMRange extends StObject {
  
  def Detach(): Unit
  
  /* private */ @JSName("MSHTML.HTMLDOMRange_typekey")
  var MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange
  
  def cloneContents(): Any
  
  def cloneRange(): IHTMLDOMRange
  
  def collapse(toStart: Boolean): Unit
  
  val collapsed: Boolean
  
  val commonAncestorContainer: IHTMLDOMNode
  
  def compareBoundaryPoints(how: Double, sourceRange: Any): Double
  
  def deleteContents(): Unit
  
  val endContainer: IHTMLDOMNode
  
  val endOffset: Double
  
  def extractContents(): Any
  
  def getBoundingClientRect(): IHTMLRect
  
  def getClientRects(): IHTMLRectCollection
  
  def insertNode(newNode: Any): Unit
  
  def selectNode(refNode: Any): Unit
  
  def selectNodeContents(refNode: Any): Unit
  
  def setEnd(refNode: Any, offset: Double): Unit
  
  def setEndAfter(refNode: Any): Unit
  
  def setEndBefore(refNode: Any): Unit
  
  def setStart(refNode: Any, offset: Double): Unit
  
  def setStartAfter(refNode: Any): Unit
  
  def setStartBefore(refNode: Any): Unit
  
  val startContainer: IHTMLDOMNode
  
  val startOffset: Double
  
  def surroundContents(newParent: Any): Unit
}
object HTMLDOMRange {
  
  inline def apply(
    Detach: () => Unit,
    MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange,
    cloneContents: () => Any,
    cloneRange: () => IHTMLDOMRange,
    collapse: Boolean => Unit,
    collapsed: Boolean,
    commonAncestorContainer: IHTMLDOMNode,
    compareBoundaryPoints: (Double, Any) => Double,
    deleteContents: () => Unit,
    endContainer: IHTMLDOMNode,
    endOffset: Double,
    extractContents: () => Any,
    getBoundingClientRect: () => IHTMLRect,
    getClientRects: () => IHTMLRectCollection,
    insertNode: Any => Unit,
    selectNode: Any => Unit,
    selectNodeContents: Any => Unit,
    setEnd: (Any, Double) => Unit,
    setEndAfter: Any => Unit,
    setEndBefore: Any => Unit,
    setStart: (Any, Double) => Unit,
    setStartAfter: Any => Unit,
    setStartBefore: Any => Unit,
    startContainer: IHTMLDOMNode,
    startOffset: Double,
    surroundContents: Any => Unit
  ): HTMLDOMRange = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), cloneContents = js.Any.fromFunction0(cloneContents), cloneRange = js.Any.fromFunction0(cloneRange), collapse = js.Any.fromFunction1(collapse), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), deleteContents = js.Any.fromFunction0(deleteContents), endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], extractContents = js.Any.fromFunction0(extractContents), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), insertNode = js.Any.fromFunction1(insertNode), selectNode = js.Any.fromFunction1(selectNode), selectNodeContents = js.Any.fromFunction1(selectNodeContents), setEnd = js.Any.fromFunction2(setEnd), setEndAfter = js.Any.fromFunction1(setEndAfter), setEndBefore = js.Any.fromFunction1(setEndBefore), setStart = js.Any.fromFunction2(setStart), setStartAfter = js.Any.fromFunction1(setStartAfter), setStartBefore = js.Any.fromFunction1(setStartBefore), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1(surroundContents))
    __obj.updateDynamic("MSHTML.HTMLDOMRange_typekey")(MSHTMLDotHTMLDOMRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDOMRange]
  }
  
  extension [Self <: HTMLDOMRange](x: Self) {
    
    inline def setCloneContents(value: () => Any): Self = StObject.set(x, "cloneContents", js.Any.fromFunction0(value))
    
    inline def setCloneRange(value: () => IHTMLDOMRange): Self = StObject.set(x, "cloneRange", js.Any.fromFunction0(value))
    
    inline def setCollapse(value: Boolean => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCommonAncestorContainer(value: IHTMLDOMNode): Self = StObject.set(x, "commonAncestorContainer", value.asInstanceOf[js.Any])
    
    inline def setCompareBoundaryPoints(value: (Double, Any) => Double): Self = StObject.set(x, "compareBoundaryPoints", js.Any.fromFunction2(value))
    
    inline def setDeleteContents(value: () => Unit): Self = StObject.set(x, "deleteContents", js.Any.fromFunction0(value))
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "Detach", js.Any.fromFunction0(value))
    
    inline def setEndContainer(value: IHTMLDOMNode): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setExtractContents(value: () => Any): Self = StObject.set(x, "extractContents", js.Any.fromFunction0(value))
    
    inline def setGetBoundingClientRect(value: () => IHTMLRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    
    inline def setGetClientRects(value: () => IHTMLRectCollection): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
    
    inline def setInsertNode(value: Any => Unit): Self = StObject.set(x, "insertNode", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotHTMLDOMRange_typekey(value: HTMLDOMRange): Self = StObject.set(x, "MSHTML.HTMLDOMRange_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelectNode(value: Any => Unit): Self = StObject.set(x, "selectNode", js.Any.fromFunction1(value))
    
    inline def setSelectNodeContents(value: Any => Unit): Self = StObject.set(x, "selectNodeContents", js.Any.fromFunction1(value))
    
    inline def setSetEnd(value: (Any, Double) => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction2(value))
    
    inline def setSetEndAfter(value: Any => Unit): Self = StObject.set(x, "setEndAfter", js.Any.fromFunction1(value))
    
    inline def setSetEndBefore(value: Any => Unit): Self = StObject.set(x, "setEndBefore", js.Any.fromFunction1(value))
    
    inline def setSetStart(value: (Any, Double) => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction2(value))
    
    inline def setSetStartAfter(value: Any => Unit): Self = StObject.set(x, "setStartAfter", js.Any.fromFunction1(value))
    
    inline def setSetStartBefore(value: Any => Unit): Self = StObject.set(x, "setStartBefore", js.Any.fromFunction1(value))
    
    inline def setStartContainer(value: IHTMLDOMNode): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setSurroundContents(value: Any => Unit): Self = StObject.set(x, "surroundContents", js.Any.fromFunction1(value))
  }
}
