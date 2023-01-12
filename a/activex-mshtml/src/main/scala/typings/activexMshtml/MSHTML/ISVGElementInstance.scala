package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGElementInstance extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGElementInstance_typekey")
  var MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance
  
  val childNodes: ISVGElementInstanceList
  
  val correspondingElement: ISVGElement
  
  val correspondingUseElement: ISVGUseElement
  
  val firstChild: ISVGElementInstance
  
  val lastChild: ISVGElementInstance
  
  val nextSibling: ISVGElementInstance
  
  val parentNode: ISVGElementInstance
  
  val previousSibling: ISVGElementInstance
}
object ISVGElementInstance {
  
  inline def apply(
    MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance
  ): ISVGElementInstance = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstance_typekey")(MSHTMLDotISVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISVGElementInstance] (val x: Self) extends AnyVal {
    
    inline def setChildNodes(value: ISVGElementInstanceList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingElement(value: ISVGElement): Self = StObject.set(x, "correspondingElement", value.asInstanceOf[js.Any])
    
    inline def setCorrespondingUseElement(value: ISVGUseElement): Self = StObject.set(x, "correspondingUseElement", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: ISVGElementInstance): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setLastChild(value: ISVGElementInstance): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotISVGElementInstance_typekey(value: ISVGElementInstance): Self = StObject.set(x, "MSHTML.ISVGElementInstance_typekey", value.asInstanceOf[js.Any])
    
    inline def setNextSibling(value: ISVGElementInstance): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: ISVGElementInstance): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setPreviousSibling(value: ISVGElementInstance): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
  }
}
