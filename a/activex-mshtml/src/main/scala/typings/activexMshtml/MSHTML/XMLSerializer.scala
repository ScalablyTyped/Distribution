package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLSerializer extends js.Object {
  
  @JSName("MSHTML.XMLSerializer_typekey")
  var MSHTMLDotXMLSerializer_typekey: XMLSerializer = js.native
  
  def serializeToString(pNode: IHTMLDOMNode): String = js.native
}
object XMLSerializer {
  
  @scala.inline
  def apply(MSHTMLDotXMLSerializer_typekey: XMLSerializer, serializeToString: IHTMLDOMNode => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.XMLSerializer_typekey")(MSHTMLDotXMLSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSerializer]
  }
  
  @scala.inline
  implicit class XMLSerializerOps[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotXMLSerializer_typekey(value: XMLSerializer): Self = this.set("MSHTML.XMLSerializer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeToString(value: IHTMLDOMNode => String): Self = this.set("serializeToString", js.Any.fromFunction1(value))
  }
}
