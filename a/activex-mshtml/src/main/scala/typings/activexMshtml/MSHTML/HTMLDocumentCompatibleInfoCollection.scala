package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLDocumentCompatibleInfoCollection extends js.Object {
  @JSName("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection
  val constructor: js.Any
}

object HTMLDocumentCompatibleInfoCollection {
  @scala.inline
  def apply(
    MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection,
    constructor: js.Any
  ): HTMLDocumentCompatibleInfoCollection = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")(MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfoCollection]
  }
}

