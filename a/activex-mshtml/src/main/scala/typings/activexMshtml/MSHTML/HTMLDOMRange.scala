package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDOMRange extends StObject {
  
  def Detach(): Unit = js.native
  
  @JSName("MSHTML.HTMLDOMRange_typekey")
  var MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange = js.native
  
  def cloneContents(): js.Any = js.native
  
  def cloneRange(): IHTMLDOMRange = js.native
  
  def collapse(toStart: Boolean): Unit = js.native
  
  val collapsed: Boolean = js.native
  
  val commonAncestorContainer: IHTMLDOMNode = js.native
  
  def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double = js.native
  
  def deleteContents(): Unit = js.native
  
  val endContainer: IHTMLDOMNode = js.native
  
  val endOffset: Double = js.native
  
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
  
  val startContainer: IHTMLDOMNode = js.native
  
  val startOffset: Double = js.native
  
  def surroundContents(newParent: js.Any): Unit = js.native
}
object HTMLDOMRange {
  
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange,
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
  ): HTMLDOMRange = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), cloneContents = js.Any.fromFunction0(cloneContents), cloneRange = js.Any.fromFunction0(cloneRange), collapse = js.Any.fromFunction1(collapse), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), deleteContents = js.Any.fromFunction0(deleteContents), endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], extractContents = js.Any.fromFunction0(extractContents), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), insertNode = js.Any.fromFunction1(insertNode), selectNode = js.Any.fromFunction1(selectNode), selectNodeContents = js.Any.fromFunction1(selectNodeContents), setEnd = js.Any.fromFunction2(setEnd), setEndAfter = js.Any.fromFunction1(setEndAfter), setEndBefore = js.Any.fromFunction1(setEndBefore), setStart = js.Any.fromFunction2(setStart), setStartAfter = js.Any.fromFunction1(setStartAfter), setStartBefore = js.Any.fromFunction1(setStartBefore), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1(surroundContents))
    __obj.updateDynamic("MSHTML.HTMLDOMRange_typekey")(MSHTMLDotHTMLDOMRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDOMRange]
  }
  
  @scala.inline
  implicit class HTMLDOMRangeMutableBuilder[Self <: HTMLDOMRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneContents(value: () => js.Any): Self = StObject.set(x, "cloneContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneRange(value: () => IHTMLDOMRange): Self = StObject.set(x, "cloneRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapse(value: Boolean => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonAncestorContainer(value: IHTMLDOMNode): Self = StObject.set(x, "commonAncestorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareBoundaryPoints(value: (Double, js.Any) => Double): Self = StObject.set(x, "compareBoundaryPoints", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteContents(value: () => Unit): Self = StObject.set(x, "deleteContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "Detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndContainer(value: IHTMLDOMNode): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractContents(value: () => js.Any): Self = StObject.set(x, "extractContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoundingClientRect(value: () => IHTMLRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientRects(value: () => IHTMLRectCollection): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertNode(value: js.Any => Unit): Self = StObject.set(x, "insertNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMSHTMLDotHTMLDOMRange_typekey(value: HTMLDOMRange): Self = StObject.set(x, "MSHTML.HTMLDOMRange_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectNode(value: js.Any => Unit): Self = StObject.set(x, "selectNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectNodeContents(value: js.Any => Unit): Self = StObject.set(x, "selectNodeContents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: (js.Any, Double) => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetEndAfter(value: js.Any => Unit): Self = StObject.set(x, "setEndAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEndBefore(value: js.Any => Unit): Self = StObject.set(x, "setEndBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: (js.Any, Double) => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStartAfter(value: js.Any => Unit): Self = StObject.set(x, "setStartAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartBefore(value: js.Any => Unit): Self = StObject.set(x, "setStartBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartContainer(value: IHTMLDOMNode): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundContents(value: js.Any => Unit): Self = StObject.set(x, "surroundContents", js.Any.fromFunction1(value))
  }
}
