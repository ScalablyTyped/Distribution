package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockServiceLinkedRoleResponse extends js.Object {
  var CanBeDeleted: js.UndefOr[__boolean] = js.native
  var ReasonOfFailure: js.UndefOr[__stringMin1Max1600] = js.native
  var RelatedResources: js.UndefOr[__listOfDiscovererSummary] = js.native
}

object LockServiceLinkedRoleResponse {
  @scala.inline
  def apply(
    CanBeDeleted: js.UndefOr[Boolean] = js.undefined,
    ReasonOfFailure: __stringMin1Max1600 = null,
    RelatedResources: __listOfDiscovererSummary = null
  ): LockServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CanBeDeleted)) __obj.updateDynamic("CanBeDeleted")(CanBeDeleted.asInstanceOf[js.Any])
    if (ReasonOfFailure != null) __obj.updateDynamic("ReasonOfFailure")(ReasonOfFailure.asInstanceOf[js.Any])
    if (RelatedResources != null) __obj.updateDynamic("RelatedResources")(RelatedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockServiceLinkedRoleResponse]
  }
}

