package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCDefaultDispatch extends StObject {
  
  def CreateEventObject(): IHTMLEventObj
  
  /* private */ @JSName("MSHTML.HTCDefaultDispatch_typekey")
  var MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch
  
  val defaults: Any
  
  val document: Any
  
  val element: IHTMLElement
}
object HTCDefaultDispatch {
  
  inline def apply(
    CreateEventObject: () => IHTMLEventObj,
    MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch,
    defaults: Any,
    document: Any,
    element: IHTMLElement
  ): HTCDefaultDispatch = {
    val __obj = js.Dynamic.literal(CreateEventObject = js.Any.fromFunction0(CreateEventObject), defaults = defaults.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(MSHTMLDotHTCDefaultDispatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDefaultDispatch]
  }
  
  extension [Self <: HTCDefaultDispatch](x: Self) {
    
    inline def setCreateEventObject(value: () => IHTMLEventObj): Self = StObject.set(x, "CreateEventObject", js.Any.fromFunction0(value))
    
    inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setElement(value: IHTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTCDefaultDispatch_typekey(value: HTCDefaultDispatch): Self = StObject.set(x, "MSHTML.HTCDefaultDispatch_typekey", value.asInstanceOf[js.Any])
  }
}
