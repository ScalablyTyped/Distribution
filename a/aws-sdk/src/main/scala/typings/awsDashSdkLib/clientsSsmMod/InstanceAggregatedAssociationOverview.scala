package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAggregatedAssociationOverview extends js.Object {
  /**
    * Detailed status information about the aggregated associations.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  /**
    * The number of associations for the instance(s).
    */
  var InstanceAssociationStatusAggregatedCount: js.UndefOr[InstanceAssociationStatusAggregatedCount] = js.undefined
}

object InstanceAggregatedAssociationOverview {
  @scala.inline
  def apply(
    DetailedStatus: StatusName = null,
    InstanceAssociationStatusAggregatedCount: InstanceAssociationStatusAggregatedCount = null
  ): InstanceAggregatedAssociationOverview = {
    val __obj = js.Dynamic.literal()
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus)
    if (InstanceAssociationStatusAggregatedCount != null) __obj.updateDynamic("InstanceAssociationStatusAggregatedCount")(InstanceAssociationStatusAggregatedCount)
    __obj.asInstanceOf[InstanceAggregatedAssociationOverview]
  }
}

