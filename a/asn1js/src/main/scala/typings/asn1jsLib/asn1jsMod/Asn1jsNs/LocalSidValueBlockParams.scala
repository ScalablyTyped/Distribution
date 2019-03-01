package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSidValueBlockParams extends LocalHexBlockParams {
  var isFirstSid: js.UndefOr[scala.Boolean] = js.undefined
  var valueDec: js.UndefOr[scala.Double] = js.undefined
}

object LocalSidValueBlockParams {
  @scala.inline
  def apply(
    blockLength: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    isFirstSid: js.UndefOr[scala.Boolean] = js.undefined,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: stdLib.ArrayBuffer = null,
    valueDec: scala.Int | scala.Double = null,
    valueHex: stdLib.ArrayBuffer = null,
    warnings: js.Array[java.lang.String] = null
  ): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isFirstSid)) __obj.updateDynamic("isFirstSid")(isFirstSid)
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (valueDec != null) __obj.updateDynamic("valueDec")(valueDec.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
}

