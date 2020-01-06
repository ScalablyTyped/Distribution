package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSlotTypesResponse extends js.Object {
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects, one for each slot type, that provides information such as the name of the slot type, the version, and a description.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.native
}

object GetSlotTypesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, slotTypes: SlotTypeMetadataList = null): GetSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (slotTypes != null) __obj.updateDynamic("slotTypes")(slotTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypesResponse]
  }
}

