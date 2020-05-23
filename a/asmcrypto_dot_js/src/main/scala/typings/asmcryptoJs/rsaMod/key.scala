package typings.asmcryptoJs.rsaMod

import typings.asmcryptoJs.bignumMod.BigNumber
import typings.asmcryptoJs.bignumMod.Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait key extends js.Object {
  var `0`: Modulus
  var `1`: BigNumber
  var `2`: js.UndefOr[BigNumber] = js.undefined
  var `3`: js.UndefOr[Modulus] = js.undefined
  var `4`: js.UndefOr[Modulus] = js.undefined
  var `5`: js.UndefOr[BigNumber] = js.undefined
  var `6`: js.UndefOr[BigNumber] = js.undefined
  var `7`: js.UndefOr[BigNumber] = js.undefined
}

object key {
  @scala.inline
  def apply(
    `0`: Modulus,
    `1`: BigNumber,
    `2`: BigNumber = null,
    `3`: Modulus = null,
    `4`: Modulus = null,
    `5`: BigNumber = null,
    `6`: BigNumber = null,
    `7`: BigNumber = null
  ): key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    if (`4` != null) __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    if (`5` != null) __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    if (`6` != null) __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    if (`7` != null) __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.asInstanceOf[key]
  }
}

