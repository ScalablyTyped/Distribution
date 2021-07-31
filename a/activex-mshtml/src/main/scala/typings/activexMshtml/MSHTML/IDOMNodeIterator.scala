package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMNodeIterator extends StObject {
  
  def Detach(): Unit
  
  @JSName("MSHTML.IDOMNodeIterator_typekey")
  var MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator
  
  val expandEntityReferences: Boolean
  
  val filter: js.Any
  
  def nextNode(): js.Any
  
  def previousNode(): js.Any
  
  val root: js.Any
  
  val whatToShow: Double
}
object IDOMNodeIterator {
  
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator,
    expandEntityReferences: Boolean,
    filter: js.Any,
    nextNode: () => js.Any,
    previousNode: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): IDOMNodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMNodeIterator_typekey")(MSHTMLDotIDOMNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMNodeIterator]
  }
  
  @scala.inline
  implicit class IDOMNodeIteratorMutableBuilder[Self <: IDOMNodeIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "Detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIDOMNodeIterator_typekey(value: IDOMNodeIterator): Self = StObject.set(x, "MSHTML.IDOMNodeIterator_typekey", value.asInstanceOf[js.Any])
    
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
