package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSidValueBlockParams extends LocalHexBlockParams {
  var isFirstSid: js.UndefOr[scala.Boolean] = js.undefined
  var valueDec: js.UndefOr[Double] = js.undefined
}

object LocalSidValueBlockParams {
  @scala.inline
  def apply(
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    isFirstSid: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: ArrayBuffer = null,
    valueDec: js.UndefOr[Double] = js.undefined,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstSid)) __obj.updateDynamic("isFirstSid")(isFirstSid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.get.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (!js.isUndefined(valueDec)) __obj.updateDynamic("valueDec")(valueDec.get.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
}

