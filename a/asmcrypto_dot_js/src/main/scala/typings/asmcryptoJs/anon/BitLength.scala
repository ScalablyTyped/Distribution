package typings.asmcryptoJs.anon

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitLength extends js.Object {
  var bitLength: Double = js.native
  var limbs: Uint32Array = js.native
  var sign: Double = js.native
}

object BitLength {
  @scala.inline
  def apply(bitLength: Double, limbs: Uint32Array, sign: Double): BitLength = {
    val __obj = js.Dynamic.literal(bitLength = bitLength.asInstanceOf[js.Any], limbs = limbs.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitLength]
  }
  @scala.inline
  implicit class BitLengthOps[Self <: BitLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitLength(value: Double): Self = this.set("bitLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimbs(value: Uint32Array): Self = this.set("limbs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: Double): Self = this.set("sign", value.asInstanceOf[js.Any])
  }
  
}

