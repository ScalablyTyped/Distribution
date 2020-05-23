package typings.asn1js.anon

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
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    isConstructed: js.UndefOr[Boolean] = js.undefined,
    isHexOnly: js.UndefOr[Boolean] = js.undefined,
    tagClass: js.UndefOr[Double] = js.undefined,
    tagNumber: js.UndefOr[Double] = js.undefined,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalHexBlockParamsisCons = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tagClass)) __obj.updateDynamic("tagClass")(tagClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tagNumber)) __obj.updateDynamic("tagNumber")(tagNumber.get.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalHexBlockParamsisCons]
  }
}

