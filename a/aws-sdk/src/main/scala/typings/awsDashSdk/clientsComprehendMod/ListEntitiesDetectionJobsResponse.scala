package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntitiesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var EntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EntitiesDetectionJobPropertiesList] = js.undefined
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListEntitiesDetectionJobsResponse {
  @scala.inline
  def apply(
    EntitiesDetectionJobPropertiesList: EntitiesDetectionJobPropertiesList = null,
    NextToken: String = null
  ): ListEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitiesDetectionJobPropertiesList != null) __obj.updateDynamic("EntitiesDetectionJobPropertiesList")(EntitiesDetectionJobPropertiesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
  }
}

