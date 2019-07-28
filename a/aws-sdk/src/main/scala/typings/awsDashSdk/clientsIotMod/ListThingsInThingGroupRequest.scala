package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingsInThingGroupRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * When true, list things in this thing group and in all child groups as well.
    */
  var recursive: js.UndefOr[Recursive] = js.undefined
  /**
    * The thing group name.
    */
  var thingGroupName: ThingGroupName
}

object ListThingsInThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    nextToken: NextToken = null,
    recursive: js.UndefOr[Recursive] = js.undefined
  ): ListThingsInThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[ListThingsInThingGroupRequest]
  }
}

