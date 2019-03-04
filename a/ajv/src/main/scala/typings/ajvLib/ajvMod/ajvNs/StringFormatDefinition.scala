package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormatDefinition extends FormatDefinition {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var compare: js.UndefOr[
    js.Function2[/* data1 */ java.lang.String, /* data2 */ java.lang.String, scala.Double]
  ] = js.undefined
  var `type`: js.UndefOr[ajvLib.ajvLibStrings.string] = js.undefined
  var validate: FormatValidator
}

object StringFormatDefinition {
  @scala.inline
  def apply(
    validate: FormatValidator,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    compare: js.Function2[/* data1 */ java.lang.String, /* data2 */ java.lang.String, scala.Double] = null,
    `type`: ajvLib.ajvLibStrings.string = null
  ): StringFormatDefinition = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringFormatDefinition]
  }
}

