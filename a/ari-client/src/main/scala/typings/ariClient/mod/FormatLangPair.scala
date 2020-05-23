package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLangPair extends js.Object {
  var format: String
  /* Properties */
  var language: String
}

object FormatLangPair {
  @scala.inline
  def apply(format: String, language: String): FormatLangPair = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLangPair]
  }
}

