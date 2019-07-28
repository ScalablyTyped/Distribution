package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSetSummary extends js.Object {
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetId] = js.undefined
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetName] = js.undefined
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.undefined
}

object StackSetSummary {
  @scala.inline
  def apply(
    Description: Description = null,
    StackSetId: StackSetId = null,
    StackSetName: StackSetName = null,
    Status: StackSetStatus = null
  ): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId)
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetSummary]
  }
}

