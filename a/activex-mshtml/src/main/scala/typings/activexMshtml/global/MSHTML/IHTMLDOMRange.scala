package typings.activexMshtml.global.MSHTML

import typings.activexMshtml.MSHTML.IHTMLRectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.IHTMLDOMRange")
@js.native
class IHTMLDOMRange protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.IHTMLDOMRange {
  
  /* CompleteClass */
  override def Detach(): Unit = js.native
  
  /* CompleteClass */
  @JSName("MSHTML.IHTMLDOMRange_typekey")
  var MSHTMLDotIHTMLDOMRange_typekey: typings.activexMshtml.MSHTML.IHTMLDOMRange = js.native
  
  /* CompleteClass */
  override def cloneContents(): js.Any = js.native
  
  /* CompleteClass */
  override def cloneRange(): typings.activexMshtml.MSHTML.IHTMLDOMRange = js.native
  
  /* CompleteClass */
  override def collapse(toStart: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val collapsed: Boolean = js.native
  
  /* CompleteClass */
  override val commonAncestorContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  
  /* CompleteClass */
  override def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double = js.native
  
  /* CompleteClass */
  override def deleteContents(): Unit = js.native
  
  /* CompleteClass */
  override val endContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /* CompleteClass */
  override def extractContents(): js.Any = js.native
  
  /* CompleteClass */
  override def getBoundingClientRect(): typings.activexMshtml.MSHTML.IHTMLRect = js.native
  
  /* CompleteClass */
  override def getClientRects(): IHTMLRectCollection = js.native
  
  /* CompleteClass */
  override def insertNode(newNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def selectNode(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def selectNodeContents(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def setEnd(refNode: js.Any, offset: Double): Unit = js.native
  
  /* CompleteClass */
  override def setEndAfter(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def setEndBefore(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def setStart(refNode: js.Any, offset: Double): Unit = js.native
  
  /* CompleteClass */
  override def setStartAfter(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def setStartBefore(refNode: js.Any): Unit = js.native
  
  /* CompleteClass */
  override val startContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  
  /* CompleteClass */
  override val startOffset: Double = js.native
  
  /* CompleteClass */
  override def surroundContents(newParent: js.Any): Unit = js.native
}
