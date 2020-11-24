package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGException extends js.Object {
  
  @JSName("MSHTML.SVGException_typekey")
  var MSHTMLDotSVGException_typekey: SVGException = js.native
  
  var code: Double = js.native
  
  val message: String = js.native
}
object SVGException {
  
  @scala.inline
  def apply(MSHTMLDotSVGException_typekey: SVGException, code: Double, message: String): SVGException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGException_typekey")(MSHTMLDotSVGException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGException]
  }
  
  @scala.inline
  implicit class SVGExceptionOps[Self <: SVGException] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGException_typekey(value: SVGException): Self = this.set("MSHTML.SVGException_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
