package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationCoverageGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * How much instance usage this group of reservations covered.
    */
  var Coverage: js.UndefOr[Coverage] = js.undefined
}

object ReservationCoverageGroup {
  @scala.inline
  def apply(Attributes: Attributes = null, Coverage: Coverage = null): ReservationCoverageGroup = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Coverage != null) __obj.updateDynamic("Coverage")(Coverage)
    __obj.asInstanceOf[ReservationCoverageGroup]
  }
}

