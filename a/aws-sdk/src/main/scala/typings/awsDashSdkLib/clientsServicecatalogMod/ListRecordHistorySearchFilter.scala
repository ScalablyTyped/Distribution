package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecordHistorySearchFilter extends js.Object {
  /**
    * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
    */
  var Key: js.UndefOr[SearchFilterKey] = js.undefined
  /**
    * The filter value.
    */
  var Value: js.UndefOr[SearchFilterValue] = js.undefined
}

object ListRecordHistorySearchFilter {
  @scala.inline
  def apply(Key: SearchFilterKey = null, Value: SearchFilterValue = null): ListRecordHistorySearchFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ListRecordHistorySearchFilter]
  }
}

