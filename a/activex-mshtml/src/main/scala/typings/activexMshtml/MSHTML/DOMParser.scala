package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMParser extends js.Object {
  
  @JSName("MSHTML.DOMParser_typekey")
  var MSHTMLDotDOMParser_typekey: DOMParser = js.native
  
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2 = js.native
}
object DOMParser {
  
  @scala.inline
  def apply(MSHTMLDotDOMParser_typekey: DOMParser, parseFromString: (String, String) => IHTMLDocument2): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.DOMParser_typekey")(MSHTMLDotDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMParser]
  }
  
  @scala.inline
  implicit class DOMParserOps[Self <: DOMParser] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotDOMParser_typekey(value: DOMParser): Self = this.set("MSHTML.DOMParser_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFromString(value: (String, String) => IHTMLDocument2): Self = this.set("parseFromString", js.Any.fromFunction2(value))
  }
}
