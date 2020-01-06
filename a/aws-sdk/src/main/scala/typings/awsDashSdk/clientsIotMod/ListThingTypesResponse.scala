package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingTypesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing types.
    */
  var thingTypes: js.UndefOr[ThingTypeList] = js.native
}

object ListThingTypesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, thingTypes: ThingTypeList = null): ListThingTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (thingTypes != null) __obj.updateDynamic("thingTypes")(thingTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingTypesResponse]
  }
}

