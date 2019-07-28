package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilter extends js.Object {
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.undefined
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.undefined
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.undefined
}

object NumberFilter {
  @scala.inline
  def apply(
    Eq: js.UndefOr[Double] = js.undefined,
    Gte: js.UndefOr[Double] = js.undefined,
    Lte: js.UndefOr[Double] = js.undefined
  ): NumberFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Eq)) __obj.updateDynamic("Eq")(Eq)
    if (!js.isUndefined(Gte)) __obj.updateDynamic("Gte")(Gte)
    if (!js.isUndefined(Lte)) __obj.updateDynamic("Lte")(Lte)
    __obj.asInstanceOf[NumberFilter]
  }
}

