package typings.asn1js.asn1jsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalConstructedValueBlockParams extends LocalBaseBlockParams {
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[LocalValueBlock] = js.undefined
}

object LocalConstructedValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined,
    value: LocalValueBlock = null,
    valueBeforeDecode: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
}

