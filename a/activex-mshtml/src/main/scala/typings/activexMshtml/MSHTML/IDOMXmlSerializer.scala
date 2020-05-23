package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMXmlSerializer extends js.Object {
  @JSName("MSHTML.IDOMXmlSerializer_typekey")
  var MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer
  def serializeToString(pNode: IHTMLDOMNode): String
}

object IDOMXmlSerializer {
  @scala.inline
  def apply(MSHTMLDotIDOMXmlSerializer_typekey: IDOMXmlSerializer, serializeToString: IHTMLDOMNode => String): IDOMXmlSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.IDOMXmlSerializer_typekey")(MSHTMLDotIDOMXmlSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMXmlSerializer]
  }
}

