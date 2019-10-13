package typings.asn1js.asn1jsMod

import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UTCTimeParams extends LocalHexBlockParams {
  var value: js.UndefOr[String] = js.undefined
  var valueDate: js.UndefOr[Date] = js.undefined
}

object UTCTimeParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    value: String = null,
    valueBeforeDecode: ArrayBuffer = null,
    valueDate: Date = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
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

