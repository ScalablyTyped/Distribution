package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLang extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
}

object FormatLang {
  @scala.inline
  def apply(format: String = null, lang: String = null): FormatLang = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLang]
  }
}

