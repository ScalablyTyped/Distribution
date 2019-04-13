package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivitiesResponse extends js.Object {
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  /**
    * The list of activities for the specified user and time period.
    */
  var UserActivities: js.UndefOr[UserActivities] = js.undefined
}

object DescribeActivitiesResponse {
  @scala.inline
  def apply(Marker: MarkerType = null, UserActivities: UserActivities = null): DescribeActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (UserActivities != null) __obj.updateDynamic("UserActivities")(UserActivities)
    __obj.asInstanceOf[DescribeActivitiesResponse]
  }
}

