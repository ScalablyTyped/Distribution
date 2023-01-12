package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMNodeIterator extends StObject {
  
  def Detach(): Unit
  
  /* private */ @JSName("MSHTML.IDOMNodeIterator_typekey")
  var MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator
  
  val expandEntityReferences: Boolean
  
  val filter: Any
  
  def nextNode(): Any
  
  def previousNode(): Any
  
  val root: Any
  
  val whatToShow: Double
}
object IDOMNodeIterator {
  
  inline def apply(
    Detach: () => Unit,
    MSHTMLDotIDOMNodeIterator_typekey: IDOMNodeIterator,
    expandEntityReferences: Boolean,
    filter: Any,
    nextNode: () => Any,
    previousNode: () => Any,
    root: Any,
    whatToShow: Double
  ): IDOMNodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMNodeIterator_typekey")(MSHTMLDotIDOMNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMNodeIterator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDOMNodeIterator] (val x: Self) extends AnyVal {
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "Detach", js.Any.fromFunction0(value))
    
    inline def setExpandEntityReferences(value: Boolean): Self = StObject.set(x, "expandEntityReferences", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIDOMNodeIterator_typekey(value: IDOMNodeIterator): Self = StObject.set(x, "MSHTML.IDOMNodeIterator_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextNode(value: () => Any): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setPreviousNode(value: () => Any): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
