package typings.acceptDashLanguageDashParser.acceptDashLanguageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var code: String
  var quality: Double
  var region: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String | Null] = js.undefined
}

object Language {
  @scala.inline
  def apply(code: String, quality: Double, region: String = null, script: String = null): Language = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

