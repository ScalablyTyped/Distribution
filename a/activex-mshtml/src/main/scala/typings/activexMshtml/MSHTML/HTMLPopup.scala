package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLPopup extends js.Object {
  
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
  implicit class HTMLPopupOps[Self <: HTMLPopup] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("Hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotHTMLPopup_typekey(value: HTMLPopup): Self = this.set("MSHTML.HTMLPopup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: (Double, Double, Double, Double, js.Any) => Unit): Self = this.set("Show", js.Any.fromFunction5(value))
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: IHTMLDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
  }
}
