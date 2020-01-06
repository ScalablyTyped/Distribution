package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sort extends js.Object {
  /**
    * For ListEntities, supported attributes include LastModifiedDate (default), Visibility, EntityId, and Name. For ListChangeSets, supported attributes include StartTime and EndTime.
    */
  var SortBy: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.SortBy] = js.native
  /**
    * The sorting order. Can be ASCENDING or DESCENDING. The default value is DESCENDING.
    */
  var SortOrder: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.SortOrder] = js.native
}

object Sort {
  @scala.inline
  def apply(SortBy: SortBy = null, SortOrder: SortOrder = null): Sort = {
    val __obj = js.Dynamic.literal()
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
}

