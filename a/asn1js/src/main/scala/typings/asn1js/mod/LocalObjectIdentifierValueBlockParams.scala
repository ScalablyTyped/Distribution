package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalObjectIdentifierValueBlockParams extends LocalBaseBlockParams {
  var value: js.UndefOr[String] = js.undefined
}

object LocalObjectIdentifierValueBlockParams {
  @scala.inline
  def apply(
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    value: String = null,
    valueBeforeDecode: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalObjectIdentifierValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectIdentifierValueBlockParams]
  }
}

