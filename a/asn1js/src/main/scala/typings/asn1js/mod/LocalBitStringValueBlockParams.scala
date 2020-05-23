package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because Already inherited
- typings.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ trait LocalBitStringValueBlockParams extends LocalConstructedValueBlockParams {
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  var unusedBits: js.UndefOr[Double] = js.undefined
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}

object LocalBitStringValueBlockParams {
  @scala.inline
  def apply(
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    isConstructed: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined,
    unusedBits: js.UndefOr[Double] = js.undefined,
    value: LocalValueBlock = null,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unusedBits)) __obj.updateDynamic("unusedBits")(unusedBits.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
}

