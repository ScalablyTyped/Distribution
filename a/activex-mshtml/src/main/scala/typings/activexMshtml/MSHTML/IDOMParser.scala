package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDOMParser extends js.Object {
  
  @JSName("MSHTML.IDOMParser_typekey")
  var MSHTMLDotIDOMParser_typekey: IDOMParser = js.native
  
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2 = js.native
}
object IDOMParser {
  
  @scala.inline
  def apply(MSHTMLDotIDOMParser_typekey: IDOMParser, parseFromString: (String, String) => IHTMLDocument2): IDOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.IDOMParser_typekey")(MSHTMLDotIDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMParser]
  }
  
  @scala.inline
  implicit class IDOMParserOps[Self <: IDOMParser] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIDOMParser_typekey(value: IDOMParser): Self = this.set("MSHTML.IDOMParser_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFromString(value: (String, String) => IHTMLDocument2): Self = this.set("parseFromString", js.Any.fromFunction2(value))
  }
}
