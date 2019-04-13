package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSlotTypesResponse extends js.Object {
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of objects, one for each slot type, that provides information such as the name of the slot type, the version, and a description.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
}

object GetSlotTypesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, slotTypes: SlotTypeMetadataList = null): GetSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (slotTypes != null) __obj.updateDynamic("slotTypes")(slotTypes)
    __obj.asInstanceOf[GetSlotTypesResponse]
  }
}

