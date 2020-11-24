package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGElementInstance extends js.Object {
  
  @JSName("MSHTML.SVGElementInstance_typekey")
  var MSHTMLDotSVGElementInstance_typekey: SVGElementInstance = js.native
  
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  
  val childNodes: ISVGElementInstanceList = js.native
  
  val correspondingElement: ISVGElement = js.native
  
  val correspondingUseElement: ISVGUseElement = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  val firstChild: ISVGElementInstance = js.native
  
  val lastChild: ISVGElementInstance = js.native
  
  val nextSibling: ISVGElementInstance = js.native
  
  val parentNode: ISVGElementInstance = js.native
  
  val previousSibling: ISVGElementInstance = js.native
  
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}
object SVGElementInstance {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGElementInstance_typekey: SVGElementInstance,
    addEventListener: (String, js.Any, Boolean) => Unit,
    childNodes: ISVGElementInstanceList,
    correspondingElement: ISVGElement,
    correspondingUseElement: ISVGUseElement,
    dispatchEvent: IDOMEvent => Boolean,
    firstChild: ISVGElementInstance,
    lastChild: ISVGElementInstance,
    nextSibling: ISVGElementInstance,
    parentNode: ISVGElementInstance,
    previousSibling: ISVGElementInstance,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): SVGElementInstance = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), childNodes = childNodes.asInstanceOf[js.Any], correspondingElement = correspondingElement.asInstanceOf[js.Any], correspondingUseElement = correspondingUseElement.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.SVGElementInstance_typekey")(MSHTMLDotSVGElementInstance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstance]
  }
  
  @scala.inline
  implicit class SVGElementInstanceOps[Self <: SVGElementInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotSVGElementInstance_typekey(value: SVGElementInstance): Self = this.set("MSHTML.SVGElementInstance_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEventListener(value: (String, js.Any, Boolean) => Unit): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChildNodes(value: ISVGElementInstanceList): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrespondingElement(value: ISVGElement): Self = this.set("correspondingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrespondingUseElement(value: ISVGUseElement): Self = this.set("correspondingUseElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchEvent(value: IDOMEvent => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstChild(value: ISVGElementInstance): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChild(value: ISVGElementInstance): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSibling(value: ISVGElementInstance): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNode(value: ISVGElementInstance): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSibling(value: ISVGElementInstance): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: (String, js.Any, Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
  }
}
