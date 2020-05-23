package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMParser extends js.Object {
  @JSName("MSHTML.DOMParser_typekey")
  var MSHTMLDotDOMParser_typekey: DOMParser
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2
}

object DOMParser {
  @scala.inline
  def apply(MSHTMLDotDOMParser_typekey: DOMParser, parseFromString: (String, String) => IHTMLDocument2): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.DOMParser_typekey")(MSHTMLDotDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMParser]
  }
}

