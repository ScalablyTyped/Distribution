package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBlockParams extends LocalBaseBlockParams {
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var primitiveSchema: js.UndefOr[js.Object] = js.undefined
}

object BaseBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    name: String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    primitiveSchema: js.Object = null,
    valueBeforeDecode: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): BaseBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (primitiveSchema != null) __obj.updateDynamic("primitiveSchema")(primitiveSchema)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[BaseBlockParams]
  }
}

