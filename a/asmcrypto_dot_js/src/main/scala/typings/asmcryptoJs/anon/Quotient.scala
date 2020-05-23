package typings.asmcryptoJs.anon

import typings.asmcryptoJs.bignumMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quotient extends js.Object {
  var quotient: BigNumber
  var remainder: BigNumber
}

object Quotient {
  @scala.inline
  def apply(quotient: BigNumber, remainder: BigNumber): Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quotient]
  }
}

