package typings.asmcryptoJs.anon

import typings.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Y extends js.Object {
  var gcd: BigNumber = js.native
  var x: BigNumber = js.native
  var y: BigNumber = js.native
}

object Y {
  @scala.inline
  def apply(gcd: BigNumber, x: BigNumber, y: BigNumber): Y = {
    val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  @scala.inline
  implicit class YOps[Self <: Y] (val x: Self) extends AnyVal {
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
    def setGcd(value: BigNumber): Self = this.set("gcd", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: BigNumber): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: BigNumber): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

