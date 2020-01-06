package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationOverview extends js.Object {
  /**
    * Returns the number of targets for the association status. For example, if you created an association with two instances, and one of them was successful, this would return the count of instances by status.
    */
  var AssociationStatusAggregatedCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationStatusAggregatedCount] = js.native
  /**
    * A detailed status of the association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The status of the association. Status can be: Pending, Success, or Failed.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationOverview {
  @scala.inline
  def apply(
    AssociationStatusAggregatedCount: AssociationStatusAggregatedCount = null,
    DetailedStatus: StatusName = null,
    Status: StatusName = null
  ): AssociationOverview = {
    val __obj = js.Dynamic.literal()
    if (AssociationStatusAggregatedCount != null) __obj.updateDynamic("AssociationStatusAggregatedCount")(AssociationStatusAggregatedCount.asInstanceOf[js.Any])
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOverview]
  }
}

