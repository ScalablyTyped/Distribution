package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingTypesRequest extends js.Object {
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}

object ListThingTypesRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null, thingTypeName: ThingTypeName = null): ListThingTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    __obj.asInstanceOf[ListThingTypesRequest]
  }
}

