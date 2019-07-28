package typings.asn1js.asn1jsMod

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
    blockLength: Int | Double = null,
    error: String = null,
    valueBeforeDecode: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalBaseBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalBaseBlockParams]
  }
}

