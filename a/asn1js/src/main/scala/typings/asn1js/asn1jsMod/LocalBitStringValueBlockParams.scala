package typings.asn1js.asn1jsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.asn1js.asn1jsMod.LocalBaseBlockParams because Already inherited
- typings.asn1js.asn1jsMod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ trait LocalBitStringValueBlockParams extends LocalConstructedValueBlockParams {
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  var unusedBits: js.UndefOr[Double] = js.undefined
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}

object LocalBitStringValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isConstructed: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined,
    unusedBits: Int | Double = null,
    value: LocalValueBlock = null,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed)
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly)
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm)
    if (unusedBits != null) __obj.updateDynamic("unusedBits")(unusedBits.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
}

