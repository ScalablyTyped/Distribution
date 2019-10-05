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
  def apply(Eq: Int | scala.Double = null, Gte: Int | scala.Double = null, Lte: Int | scala.Double = null): NumberFilter = {
    val __obj = js.Dynamic.literal()
    if (Eq != null) __obj.updateDynamic("Eq")(Eq.asInstanceOf[js.Any])
    if (Gte != null) __obj.updateDynamic("Gte")(Gte.asInstanceOf[js.Any])
    if (Lte != null) __obj.updateDynamic("Lte")(Lte.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilter]
  }
}

