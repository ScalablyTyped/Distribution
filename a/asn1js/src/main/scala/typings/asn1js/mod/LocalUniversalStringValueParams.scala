package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalUniversalStringValueParams extends LocalHexBlockParams

object LocalUniversalStringValueParams {
  @scala.inline
  def apply(
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalUniversalStringValueParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.get.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalUniversalStringValueParams]
  }
}

