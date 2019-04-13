package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingTypesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The thing types.
    */
  var thingTypes: js.UndefOr[ThingTypeList] = js.undefined
}

object ListThingTypesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, thingTypes: ThingTypeList = null): ListThingTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (thingTypes != null) __obj.updateDynamic("thingTypes")(thingTypes)
    __obj.asInstanceOf[ListThingTypesResponse]
  }
}

