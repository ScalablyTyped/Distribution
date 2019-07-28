package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobExecutionsForThingRequest extends js.Object {
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  /**
    * The thing name.
    */
  var thingName: ThingName
}

object ListJobExecutionsForThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    maxResults: js.UndefOr[LaserMaxResults] = js.undefined,
    nextToken: NextToken = null,
    status: JobExecutionStatus = null
  ): ListJobExecutionsForThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForThingRequest]
  }
}

