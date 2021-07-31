package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCDefaultDispatch extends StObject {
  
  def CreateEventObject(): IHTMLEventObj
  
  @JSName("MSHTML.HTCDefaultDispatch_typekey")
  var MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch
  
  val defaults: js.Any
  
  val document: js.Any
  
  val element: IHTMLElement
}
object HTCDefaultDispatch {
  
  @scala.inline
  def apply(
    CreateEventObject: () => IHTMLEventObj,
    MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch,
    defaults: js.Any,
    document: js.Any,
    element: IHTMLElement
  ): HTCDefaultDispatch = {
    val __obj = js.Dynamic.literal(CreateEventObject = js.Any.fromFunction0(CreateEventObject), defaults = defaults.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(MSHTMLDotHTCDefaultDispatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDefaultDispatch]
  }
  
  @scala.inline
  implicit class HTCDefaultDispatchMutableBuilder[Self <: HTCDefaultDispatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateEventObject(value: () => IHTMLEventObj): Self = StObject.set(x, "CreateEventObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IHTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTCDefaultDispatch_typekey(value: HTCDefaultDispatch): Self = StObject.set(x, "MSHTML.HTCDefaultDispatch_typekey", value.asInstanceOf[js.Any])
  }
}
