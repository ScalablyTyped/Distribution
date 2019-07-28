package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetSummary extends js.Object {
  /**
    * The identifier used by users to sign into the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.CompanyCode] = js.undefined
  /**
    * The time when the fleet was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.FleetArn] = js.undefined
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.FleetName] = js.undefined
  /**
    * The status of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.FleetStatus] = js.undefined
  /**
    * The time when the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[DateTime] = js.undefined
}

object FleetSummary {
  @scala.inline
  def apply(
    CompanyCode: CompanyCode = null,
    CreatedTime: DateTime = null,
    DisplayName: DisplayName = null,
    FleetArn: FleetArn = null,
    FleetName: FleetName = null,
    FleetStatus: FleetStatus = null,
    LastUpdatedTime: DateTime = null
  ): FleetSummary = {
    val __obj = js.Dynamic.literal()
    if (CompanyCode != null) __obj.updateDynamic("CompanyCode")(CompanyCode)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn)
    if (FleetName != null) __obj.updateDynamic("FleetName")(FleetName)
    if (FleetStatus != null) __obj.updateDynamic("FleetStatus")(FleetStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    __obj.asInstanceOf[FleetSummary]
  }
}

