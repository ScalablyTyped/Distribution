package typings.asn1js

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asn1js.asn1js.LocalHexBlockParams & {  isConstructed ? :boolean,   tagClass ? :number,   tagNumber ? :number} */
trait LocalHexBlockParamsisCons extends js.Object {
  var blockLength: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var isConstructed: js.UndefOr[Boolean] = js.undefined
  var isHexOnly: js.UndefOr[Boolean] = js.undefined
  var tagClass: js.UndefOr[Double] = js.undefined
  var tagNumber: js.UndefOr[Double] = js.undefined
  var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.undefined
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object LocalHexBlockParamsisCons {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isConstructed: js.UndefOr[Boolean] = js.undefined,
    isHexOnly: js.UndefOr[Boolean] = js.undefined,
    tagClass: Int | Double = null,
    tagNumber: Int | Double = null,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalHexBlockParamsisCons = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.asInstanceOf[js.Any])
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagNumber != null) __obj.updateDynamic("tagNumber")(tagNumber.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalHexBlockParamsisCons]
  }
}

