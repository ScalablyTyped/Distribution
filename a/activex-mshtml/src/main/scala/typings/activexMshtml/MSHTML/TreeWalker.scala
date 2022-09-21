package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeWalker extends StObject {
  
  /* private */ @JSName("MSHTML.TreeWalker_typekey")
  var MSHTMLDotTreeWalker_typekey: TreeWalker
  
  var currentNode: Any
  
  val expandEntityReferences: Boolean
  
  val filter: Any
  
  def firstChild(): Any
  
  def lastChild(): Any
  
  def nextNode(): Any
  
  def nextSibling(): Any
  
  def parentNode(): Any
  
  def previousNode(): Any
  
  def previousSibling(): Any
  
  val root: Any
  
  val whatToShow: Double
}
object TreeWalker {
  
  inline def apply(
    MSHTMLDotTreeWalker_typekey: TreeWalker,
    currentNode: Any,
    expandEntityReferences: Boolean,
    filter: Any,
    firstChild: () => Any,
    lastChild: () => Any,
    nextNode: () => Any,
    nextSibling: () => Any,
    parentNode: () => Any,
    previousNode: () => Any,
    previousSibling: () => Any,
    root: Any,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.TreeWalker_typekey")(MSHTMLDotTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  
  extension [Self <: TreeWalker](x: Self) {
    
    inline def setCurrentNode(value: Any): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    inline def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: () => Any): Self = StObject.set(x, "firstChild", js.Any.fromFunction0(value))
    
    inline def setLastChild(value: () => Any): Self = StObject.set(x, "lastChild", js.Any.fromFunction0(value))
    
    inline def setMSHTMLDotTreeWalker_typekey(value: TreeWalker): Self = StObject.set(x, "MSHTML.TreeWalker_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextNode(value: () => Any): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setNextSibling(value: () => Any): Self = StObject.set(x, "nextSibling", js.Any.fromFunction0(value))
    
    inline def setParentNode(value: () => Any): Self = StObject.set(x, "parentNode", js.Any.fromFunction0(value))
    
    inline def setPreviousNode(value: () => Any): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setPreviousSibling(value: () => Any): Self = StObject.set(x, "previousSibling", js.Any.fromFunction0(value))
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
