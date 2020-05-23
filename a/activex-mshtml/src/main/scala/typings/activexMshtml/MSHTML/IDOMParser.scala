package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMParser extends js.Object {
  @JSName("MSHTML.IDOMParser_typekey")
  var MSHTMLDotIDOMParser_typekey: IDOMParser
  def parseFromString(xmlSource: String, mimeType: String): IHTMLDocument2
}

object IDOMParser {
  @scala.inline
  def apply(MSHTMLDotIDOMParser_typekey: IDOMParser, parseFromString: (String, String) => IHTMLDocument2): IDOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.updateDynamic("MSHTML.IDOMParser_typekey")(MSHTMLDotIDOMParser_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMParser]
  }
}

