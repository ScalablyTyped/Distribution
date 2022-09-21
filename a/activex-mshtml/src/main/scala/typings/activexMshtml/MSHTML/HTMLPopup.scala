package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPopup extends StObject {
  
  def Hide(): Unit
  
  /* private */ @JSName("MSHTML.HTMLPopup_typekey")
  var MSHTMLDotHTMLPopup_typekey: HTMLPopup
  
  def Show(x: Double, y: Double, w: Double, h: Double, pElement: Any): Unit
  
  val constructor: Any
  
  val document: IHTMLDocument
  
  val isOpen: Boolean
}
object HTMLPopup {
  
  inline def apply(
    Hide: () => Unit,
    MSHTMLDotHTMLPopup_typekey: HTMLPopup,
    Show: (Double, Double, Double, Double, Any) => Unit,
    constructor: Any,
    document: IHTMLDocument,
    isOpen: Boolean
  ): HTMLPopup = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction0(Hide), Show = js.Any.fromFunction5(Show), constructor = constructor.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPopup_typekey")(MSHTMLDotHTMLPopup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPopup]
  }
  
  extension [Self <: HTMLPopup](x: Self) {
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: IHTMLDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLPopup_typekey(value: HTMLPopup): Self = StObject.set(x, "MSHTML.HTMLPopup_typekey", value.asInstanceOf[js.Any])
    
    inline def setShow(value: (Double, Double, Double, Double, Any) => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction5(value))
  }
}
