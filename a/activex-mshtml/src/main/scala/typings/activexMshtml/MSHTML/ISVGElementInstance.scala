package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGElementInstance extends StObject {
  
  @JSName("MSHTML.ISVGElementInstance_typekey")
  var MSHTMLDotISVGElementInstance_typekey: ISVGElementInstance = js.native
  
  val childNodes: ISVGElementInstanceList = js.native
  
  val correspondingElement: ISVGElement = js.native
  
  val correspondingUseElement: ISVGUseElement = js.native
  
  val firstChild: ISVGElementInstance = js.native
  
  val lastChild: ISVGElementInstance = js.native
  
  val nextSibling: ISVGElementInstance = js.native
  
  val parentNode: ISVGElementInstance = js.native
  
  val previousSibling: ISVGElementInstance = js.native
}
object ISVGElementInstance {
  
  @scala.inline
  def apply(
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
  implicit class ISVGElementInstanceMutableBuilder[Self <: ISVGElementInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildNodes(value: ISVGElementInstanceList): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrespondingElement(value: ISVGElement): Self = StObject.set(x, "correspondingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrespondingUseElement(value: ISVGUseElement): Self = StObject.set(x, "correspondingUseElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChild(value: ISVGElementInstance): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChild(value: ISVGElementInstance): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotISVGElementInstance_typekey(value: ISVGElementInstance): Self = StObject.set(x, "MSHTML.ISVGElementInstance_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSibling(value: ISVGElementInstance): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: ISVGElementInstance): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSibling(value: ISVGElementInstance): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
  }
}
