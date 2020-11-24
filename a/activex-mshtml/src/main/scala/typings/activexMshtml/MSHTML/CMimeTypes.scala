package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMimeTypes extends js.Object {
  
  @JSName("MSHTML.CMimeTypes_typekey")
  var MSHTMLDotCMimeTypes_typekey: CMimeTypes = js.native
  
  val length: Double = js.native
}
object CMimeTypes {
  
  @scala.inline
  def apply(MSHTMLDotCMimeTypes_typekey: CMimeTypes, length: Double): CMimeTypes = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CMimeTypes_typekey")(MSHTMLDotCMimeTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMimeTypes]
  }
  
  @scala.inline
  implicit class CMimeTypesOps[Self <: CMimeTypes] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotCMimeTypes_typekey(value: CMimeTypes): Self = this.set("MSHTML.CMimeTypes_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
