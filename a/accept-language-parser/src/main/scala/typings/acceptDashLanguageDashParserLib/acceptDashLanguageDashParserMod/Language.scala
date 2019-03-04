package typings
package acceptDashLanguageDashParserLib.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var code: java.lang.String
  var quality: scala.Double
  var region: js.UndefOr[java.lang.String] = js.undefined
  var script: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Language {
  @scala.inline
  def apply(
    code: java.lang.String,
    quality: scala.Double,
    region: java.lang.String = null,
    script: java.lang.String = null
  ): Language = {
    val __obj = js.Dynamic.literal(code = code, quality = quality)
    if (region != null) __obj.updateDynamic("region")(region)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[Language]
  }
}

