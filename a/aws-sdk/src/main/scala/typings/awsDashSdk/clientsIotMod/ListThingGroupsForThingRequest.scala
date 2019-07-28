package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingGroupsForThingRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The thing name.
    */
  var thingName: ThingName
}

object ListThingGroupsForThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListThingGroupsForThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListThingGroupsForThingRequest]
  }
}

