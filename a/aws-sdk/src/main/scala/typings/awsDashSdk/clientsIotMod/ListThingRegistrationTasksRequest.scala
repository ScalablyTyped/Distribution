package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingRegistrationTasksRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The status of the bulk thing provisioning task.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object ListThingRegistrationTasksRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null, status: Status = null): ListThingRegistrationTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTasksRequest]
  }
}

