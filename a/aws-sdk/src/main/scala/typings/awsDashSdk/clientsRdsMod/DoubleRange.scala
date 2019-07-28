package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleRange extends js.Object {
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Double] = js.undefined
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Double] = js.undefined
}

object DoubleRange {
  @scala.inline
  def apply(From: js.UndefOr[Double] = js.undefined, To: js.UndefOr[Double] = js.undefined): DoubleRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(From)) __obj.updateDynamic("From")(From)
    if (!js.isUndefined(To)) __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[DoubleRange]
  }
}

