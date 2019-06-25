package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsItemSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. 
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[OpsItemId] = js.undefined
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  /**
    * The impacted AWS resource.
    */
  var Source: js.UndefOr[OpsItemSource] = js.undefined
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
}

object OpsItemSummary {
  @scala.inline
  def apply(
    CreatedBy: String = null,
    CreatedTime: DateTime = null,
    LastModifiedBy: String = null,
    LastModifiedTime: DateTime = null,
    OperationalData: OpsItemOperationalData = null,
    OpsItemId: OpsItemId = null,
    Priority: js.UndefOr[OpsItemPriority] = js.undefined,
    Source: OpsItemSource = null,
    Status: OpsItemStatus = null,
    Title: OpsItemTitle = null
  ): OpsItemSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (OperationalData != null) __obj.updateDynamic("OperationalData")(OperationalData)
    if (OpsItemId != null) __obj.updateDynamic("OpsItemId")(OpsItemId)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[OpsItemSummary]
  }
}

