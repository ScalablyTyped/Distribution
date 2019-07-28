package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ trait LocalOctetStringValueBlockParams extends LocalConstructedValueBlockParams {
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}

object LocalOctetStringValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isConstructed: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined,
    value: LocalValueBlock = null,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalOctetStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed)
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly)
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalOctetStringValueBlockParams]
  }
}

