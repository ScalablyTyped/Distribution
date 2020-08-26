package typings.asmcryptoJs.rsaMod

import typings.asmcryptoJs.bignumMod.BigNumber
import typings.asmcryptoJs.bignumMod.Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait key extends js.Object {
  var `0`: Modulus = js.native
  var `1`: BigNumber = js.native
  var `2`: js.UndefOr[BigNumber] = js.native
  var `3`: js.UndefOr[Modulus] = js.native
  var `4`: js.UndefOr[Modulus] = js.native
  var `5`: js.UndefOr[BigNumber] = js.native
  var `6`: js.UndefOr[BigNumber] = js.native
  var `7`: js.UndefOr[BigNumber] = js.native
}

object key {
  @scala.inline
  def apply(`0`: Modulus, `1`: BigNumber): key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[key]
  }
  @scala.inline
  implicit class keyOps[Self <: key] (val x: Self) extends AnyVal {
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
    def set0(value: Modulus): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: BigNumber): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def set2(value: BigNumber): Self = this.set("2", value.asInstanceOf[js.Any])
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
    @scala.inline
    def set3(value: Modulus): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
    @scala.inline
    def set4(value: Modulus): Self = this.set("4", value.asInstanceOf[js.Any])
    @scala.inline
    def delete4: Self = this.set("4", js.undefined)
    @scala.inline
    def set5(value: BigNumber): Self = this.set("5", value.asInstanceOf[js.Any])
    @scala.inline
    def delete5: Self = this.set("5", js.undefined)
    @scala.inline
    def set6(value: BigNumber): Self = this.set("6", value.asInstanceOf[js.Any])
    @scala.inline
    def delete6: Self = this.set("6", js.undefined)
    @scala.inline
    def set7(value: BigNumber): Self = this.set("7", value.asInstanceOf[js.Any])
    @scala.inline
    def delete7: Self = this.set("7", js.undefined)
  }
  
}

