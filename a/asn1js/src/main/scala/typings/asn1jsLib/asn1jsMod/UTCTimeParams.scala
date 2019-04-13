package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UTCTimeParams extends LocalSimpleLocalSimpleStringValueBlockParams {
  var value: js.UndefOr[java.lang.String] = js.undefined
  var valueDate: js.UndefOr[stdLib.Date] = js.undefined
}

object UTCTimeParams {
  @scala.inline
  def apply(
    blockLength: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null,
    valueBeforeDecode: stdLib.ArrayBuffer = null,
    valueDate: stdLib.Date = null,
    valueHex: stdLib.ArrayBuffer = null,
    warnings: js.Array[java.lang.String] = null
  ): UTCTimeParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate)
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[UTCTimeParams]
  }
}

