package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsRequest extends js.Object {
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}

object ListJobsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
    nextToken: NextToken = null,
    status: JobStatus = null,
    targetSelection: TargetSelection = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    __obj.asInstanceOf[ListJobsRequest]
  }
}

