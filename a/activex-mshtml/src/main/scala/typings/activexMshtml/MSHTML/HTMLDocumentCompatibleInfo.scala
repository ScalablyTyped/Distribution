package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLDocumentCompatibleInfo extends js.Object {
  @JSName("MSHTML.HTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo
  val constructor: js.Any
}

object HTMLDocumentCompatibleInfo {
  @scala.inline
  def apply(MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo, constructor: js.Any): HTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfo_typekey")(MSHTMLDotHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfo]
  }
}

