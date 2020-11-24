package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDocumentCompatibleInfo extends js.Object {
  
  @JSName("MSHTML.HTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo = js.native
  
  val constructor: js.Any = js.native
}
object HTMLDocumentCompatibleInfo {
  
  @scala.inline
  def apply(MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo, constructor: js.Any): HTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfo_typekey")(MSHTMLDotHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfo]
  }
  
  @scala.inline
  implicit class HTMLDocumentCompatibleInfoOps[Self <: HTMLDocumentCompatibleInfo] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLDocumentCompatibleInfo_typekey(value: HTMLDocumentCompatibleInfo): Self = this.set("MSHTML.HTMLDocumentCompatibleInfo_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
  }
}
