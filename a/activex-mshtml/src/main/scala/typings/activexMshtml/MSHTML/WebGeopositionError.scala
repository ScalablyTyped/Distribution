package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGeopositionError extends js.Object {
  
  @JSName("MSHTML.WebGeopositionError_typekey")
  var MSHTMLDotWebGeopositionError_typekey: WebGeopositionError = js.native
  
  val code: Double = js.native
  
  val message: String = js.native
}
object WebGeopositionError {
  
  @scala.inline
  def apply(MSHTMLDotWebGeopositionError_typekey: WebGeopositionError, code: Double, message: String): WebGeopositionError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeopositionError_typekey")(MSHTMLDotWebGeopositionError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeopositionError]
  }
  
  @scala.inline
  implicit class WebGeopositionErrorOps[Self <: WebGeopositionError] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotWebGeopositionError_typekey(value: WebGeopositionError): Self = this.set("MSHTML.WebGeopositionError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
