package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeIterator extends StObject {
  
  def Detach(): Unit
  
  @JSName("MSHTML.NodeIterator_typekey")
  var MSHTMLDotNodeIterator_typekey: NodeIterator
  
  val expandEntityReferences: Boolean
  
  val filter: js.Any
  
  def nextNode(): js.Any
  
  def previousNode(): js.Any
  
  val root: js.Any
  
  val whatToShow: Double
}
object NodeIterator {
  
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotNodeIterator_typekey: NodeIterator,
    expandEntityReferences: Boolean,
    filter: js.Any,
    nextNode: () => js.Any,
    previousNode: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.NodeIterator_typekey")(MSHTMLDotNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
  
  @scala.inline
  implicit class NodeIteratorMutableBuilder[Self <: NodeIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "Detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotNodeIterator_typekey(value: NodeIterator): Self = StObject.set(x, "MSHTML.NodeIterator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNode(value: () => js.Any): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousNode(value: () => js.Any): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
