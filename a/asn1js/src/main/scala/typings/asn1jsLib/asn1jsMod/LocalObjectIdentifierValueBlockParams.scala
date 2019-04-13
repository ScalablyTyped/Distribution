package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalObjectIdentifierValueBlockParams extends LocalBaseBlockParams {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object LocalObjectIdentifierValueBlockParams {
  @scala.inline
  def apply(
    blockLength: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    value: java.lang.String = null,
    valueBeforeDecode: stdLib.ArrayBuffer = null,
    warnings: js.Array[java.lang.String] = null
  ): LocalObjectIdentifierValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalObjectIdentifierValueBlockParams]
  }
}

