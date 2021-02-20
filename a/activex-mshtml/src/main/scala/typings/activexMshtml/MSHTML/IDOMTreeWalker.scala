package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDOMTreeWalker extends StObject {
  
  @JSName("MSHTML.IDOMTreeWalker_typekey")
  var MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker = js.native
  
  var currentNode: js.Any = js.native
  
  val expandEntityReferences: Boolean = js.native
  
  val filter: js.Any = js.native
  
  def firstChild(): js.Any = js.native
  
  def lastChild(): js.Any = js.native
  
  def nextNode(): js.Any = js.native
  
  def nextSibling(): js.Any = js.native
  
  def parentNode(): js.Any = js.native
  
  def previousNode(): js.Any = js.native
  
  def previousSibling(): js.Any = js.native
  
  val root: js.Any = js.native
  
  val whatToShow: Double = js.native
}
object IDOMTreeWalker {
  
  @scala.inline
  def apply(
    MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker,
    currentNode: js.Any,
    expandEntityReferences: Boolean,
    filter: js.Any,
    firstChild: () => js.Any,
    lastChild: () => js.Any,
    nextNode: () => js.Any,
    nextSibling: () => js.Any,
    parentNode: () => js.Any,
    previousNode: () => js.Any,
    previousSibling: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): IDOMTreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMTreeWalker_typekey")(MSHTMLDotIDOMTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMTreeWalker]
  }
  
  @scala.inline
  implicit class IDOMTreeWalkerMutableBuilder[Self <: IDOMTreeWalker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentNode(value: js.Any): Self = StObject.set(x, "currentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChild(value: () => js.Any): Self = StObject.set(x, "firstChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastChild(value: () => js.Any): Self = StObject.set(x, "lastChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotIDOMTreeWalker_typekey(value: IDOMTreeWalker): Self = StObject.set(x, "MSHTML.IDOMTreeWalker_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNode(value: () => js.Any): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextSibling(value: () => js.Any): Self = StObject.set(x, "nextSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParentNode(value: () => js.Any): Self = StObject.set(x, "parentNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousNode(value: () => js.Any): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousSibling(value: () => js.Any): Self = StObject.set(x, "previousSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
