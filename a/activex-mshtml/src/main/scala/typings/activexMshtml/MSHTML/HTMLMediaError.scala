package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMediaError extends js.Object {
  
  @JSName("MSHTML.HTMLMediaError_typekey")
  var MSHTMLDotHTMLMediaError_typekey: HTMLMediaError = js.native
  
  val code: Double = js.native
}
object HTMLMediaError {
  
  @scala.inline
  def apply(MSHTMLDotHTMLMediaError_typekey: HTMLMediaError, code: Double): HTMLMediaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMediaError_typekey")(MSHTMLDotHTMLMediaError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMediaError]
  }
  
  @scala.inline
  implicit class HTMLMediaErrorOps[Self <: HTMLMediaError] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLMediaError_typekey(value: HTMLMediaError): Self = this.set("MSHTML.HTMLMediaError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
  }
}
