package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  @JSName("MSHTML.XMLSerializer_typekey")
  var MSHTMLDotXMLSerializer_typekey: XMLSerializer
  def serializeToString(pNode: IHTMLDOMNode): String
}

object XMLSerializer {
  @scala.inline
  def apply(MSHTMLDotXMLSerializer_typekey: XMLSerializer, serializeToString: IHTMLDOMNode => String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.updateDynamic("MSHTML.XMLSerializer_typekey")(MSHTMLDotXMLSerializer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLSerializer]
  }
}

