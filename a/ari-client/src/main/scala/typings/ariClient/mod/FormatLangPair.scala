package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatLangPair extends js.Object {
  /**
    * Format.
    */
  var format: String = js.native
  /**
    * Language.
    */
  var language: String = js.native
}

object FormatLangPair {
  @scala.inline
  def apply(format: String, language: String): FormatLangPair = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLangPair]
  }
  @scala.inline
  implicit class FormatLangPairOps[Self <: FormatLangPair] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
  }
  
}

