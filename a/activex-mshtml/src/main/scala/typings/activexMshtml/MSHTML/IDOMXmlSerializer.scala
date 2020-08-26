package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDOMXmlSerializer extends js.Object {
  @JSName("MSHTML.IDOMXmlSerializer_typekey")
  var MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer = js.native
  def serializeToString(pNode: IHTMLDOMNode): String = js.native
}

object IDOMXmlSerializer {
  @scala.inline
  def apply(MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer, serializeToString: IHTMLDOMNode => String): IDOMXmlSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.IDOMXmlSerializer_typekey")(MSHTMLDotIDOMXmlSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMXmlSerializer]
  }
  @scala.inline
  implicit class IDOMXmlSerializerOps[Self <: IDOMXmlSerializer] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIDOMXmlSerializer_typekey(value: IDOMXmlSerializer): Self = this.set("MSHTML.IDOMXmlSerializer_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializeToString(value: IHTMLDOMNode => String): Self = this.set("serializeToString", js.Any.fromFunction1(value))
  }
  
}

