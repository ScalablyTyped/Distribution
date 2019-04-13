package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuiltinSlotTypesResponse extends js.Object {
  /**
    * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
    */
  var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.undefined
}

object GetBuiltinSlotTypesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, slotTypes: BuiltinSlotTypeMetadataList = null): GetBuiltinSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (slotTypes != null) __obj.updateDynamic("slotTypes")(slotTypes)
    __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
  }
}

