package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USD extends js.Object {
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.Cents] = js.undefined
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.Dollars] = js.undefined
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TenthFractionsOfACent] = js.undefined
}

object USD {
  @scala.inline
  def apply(
    Cents: js.UndefOr[Cents] = js.undefined,
    Dollars: js.UndefOr[Dollars] = js.undefined,
    TenthFractionsOfACent: js.UndefOr[TenthFractionsOfACent] = js.undefined
  ): USD = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Cents)) __obj.updateDynamic("Cents")(Cents)
    if (!js.isUndefined(Dollars)) __obj.updateDynamic("Dollars")(Dollars)
    if (!js.isUndefined(TenthFractionsOfACent)) __obj.updateDynamic("TenthFractionsOfACent")(TenthFractionsOfACent)
    __obj.asInstanceOf[USD]
  }
}

