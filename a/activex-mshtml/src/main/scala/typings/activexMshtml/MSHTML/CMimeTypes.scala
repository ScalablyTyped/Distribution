package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CMimeTypes extends js.Object {
  @JSName("MSHTML.CMimeTypes_typekey")
  var MSHTMLDotCMimeTypes_typekey: CMimeTypes
  val length: Double
}

object CMimeTypes {
  @scala.inline
  def apply(MSHTMLDotCMimeTypes_typekey: CMimeTypes, length: Double): CMimeTypes = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CMimeTypes_typekey")(MSHTMLDotCMimeTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMimeTypes]
  }
}

