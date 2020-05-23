package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLDocumentCompatibleInfo extends js.Object {
  @JSName("MSHTML.IHTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo
  val userAgent: String
  val version: String
}

object IHTMLDocumentCompatibleInfo {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo,
    userAgent: String,
    version: String
  ): IHTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocumentCompatibleInfo_typekey")(MSHTMLDotIHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocumentCompatibleInfo]
  }
}

