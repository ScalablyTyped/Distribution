package typings.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: String
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String | Double] = js.undefined
  var src: String
}

object Anon_FontFamily {
  @scala.inline
  def apply(fontFamily: String, src: String, fontStyle: String = null, fontWeight: String | Double = null): Anon_FontFamily = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

