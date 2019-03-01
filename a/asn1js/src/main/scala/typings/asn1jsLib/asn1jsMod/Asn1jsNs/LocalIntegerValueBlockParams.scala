package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalIntegerValueBlockParams extends LocalHexBlockParams

object LocalIntegerValueBlockParams {
  @scala.inline
  def apply(
    blockLength: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: stdLib.ArrayBuffer = null,
    valueHex: stdLib.ArrayBuffer = null,
    warnings: js.Array[java.lang.String] = null
  ): LocalIntegerValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalIntegerValueBlockParams]
  }
}

