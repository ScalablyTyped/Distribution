package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalBaseBlockParams extends js.Object {
  var blockLength: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object LocalBaseBlockParams {
  @scala.inline
  def apply(
    blockLength: js.UndefOr[Double] = js.undefined,
    error: String = null,
    valueBeforeDecode: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalBaseBlockParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockLength)) __obj.updateDynamic("blockLength")(blockLength.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBaseBlockParams]
  }
}

