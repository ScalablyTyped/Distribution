package typings.asn1js.asn1jsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalPrimitiveValueBlock")
@js.native
class LocalPrimitiveValueBlock () extends LocalValueBlock {
  var isHexOnly: scala.Boolean = js.native
  var valueHex: ArrayBuffer = js.native
}

