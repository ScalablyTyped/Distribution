package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilter extends js.Object {
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.native
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.native
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.native
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

