package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLPopup extends StObject {
  
  def Hide(): Unit = js.native
  
  @JSName("MSHTML.HTMLPopup_typekey")
  var MSHTMLDotHTMLPopup_typekey: HTMLPopup = js.native
  
  def Show(x: Double, y: Double, w: Double, h: Double, pElement: js.Any): Unit = js.native
  
  val constructor: js.Any = js.native
  
  val document: IHTMLDocument = js.native
  
  val isOpen: Boolean = js.native
}
object HTMLPopup {
  
  @scala.inline
  def apply(
    Hide: () => Unit,
    MSHTMLDotHTMLPopup_typekey: HTMLPopup,
    Show: (Double, Double, Double, Double, js.Any) => Unit,
    constructor: js.Any,
    document: IHTMLDocument,
    isOpen: Boolean
  ): HTMLPopup = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction0(Hide), Show = js.Any.fromFunction5(Show), constructor = constructor.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPopup_typekey")(MSHTMLDotHTMLPopup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPopup]
  }
  
  @scala.inline
  implicit class HTMLPopupMutableBuilder[Self <: HTMLPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: IHTMLDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLPopup_typekey(value: HTMLPopup): Self = StObject.set(x, "MSHTML.HTMLPopup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: (Double, Double, Double, Double, js.Any) => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction5(value))
  }
}
