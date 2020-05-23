package typings.asmcryptoJs.anon

import typings.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y extends js.Object {
  var gcd: BigNumber
  var x: BigNumber
  var y: BigNumber
}

object Y {
  @scala.inline
  def apply(gcd: BigNumber, x: BigNumber, y: BigNumber): Y = {
    val __obj = js.Dynamic.literal(gcd = gcd.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
}

