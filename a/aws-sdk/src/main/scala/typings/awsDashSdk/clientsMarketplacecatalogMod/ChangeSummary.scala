package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSummary extends js.Object {
  /**
    * The type of the change.
    */
  var ChangeType: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.ChangeType] = js.native
  /**
    * The entity to be changed.
    */
  var Entity: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.Entity] = js.native
  /**
    * An array of ErrorDetail objects associated with the change.
    */
  var ErrorDetailList: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.ErrorDetailList] = js.native
}

object ChangeSummary {
  @scala.inline
  def apply(ChangeType: ChangeType = null, Entity: Entity = null, ErrorDetailList: ErrorDetailList = null): ChangeSummary = {
    val __obj = js.Dynamic.literal()
    if (ChangeType != null) __obj.updateDynamic("ChangeType")(ChangeType.asInstanceOf[js.Any])
    if (Entity != null) __obj.updateDynamic("Entity")(Entity.asInstanceOf[js.Any])
    if (ErrorDetailList != null) __obj.updateDynamic("ErrorDetailList")(ErrorDetailList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeSummary]
  }
}

