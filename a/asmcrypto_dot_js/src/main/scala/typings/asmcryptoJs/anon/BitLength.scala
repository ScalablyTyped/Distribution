package typings.asmcryptoJs.anon

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitLength extends js.Object {
  var bitLength: Double
  var limbs: Uint32Array
  var sign: Double
}

object BitLength {
  @scala.inline
  def apply(bitLength: Double, limbs: Uint32Array, sign: Double): BitLength = {
    val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], limbs = limbs.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitLength]
  }
}

