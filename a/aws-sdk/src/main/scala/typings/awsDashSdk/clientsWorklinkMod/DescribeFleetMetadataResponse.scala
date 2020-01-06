package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetMetadataResponse extends js.Object {
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.CompanyCode] = js.native
  /**
    * The time that the fleet was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.native
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.FleetName] = js.native
  /**
    * The current state of the fleet.
    */
  var FleetStatus: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.FleetStatus] = js.native
  /**
    * The time that the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}

object DescribeFleetMetadataResponse {
  @scala.inline
  def apply(
    CompanyCode: CompanyCode = null,
    CreatedTime: DateTime = null,
    DisplayName: DisplayName = null,
    FleetName: FleetName = null,
    FleetStatus: FleetStatus = null,
    LastUpdatedTime: DateTime = null,
    OptimizeForEndUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeFleetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (CompanyCode != null) __obj.updateDynamic("CompanyCode")(CompanyCode.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (FleetName != null) __obj.updateDynamic("FleetName")(FleetName.asInstanceOf[js.Any])
    if (FleetStatus != null) __obj.updateDynamic("FleetStatus")(FleetStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(OptimizeForEndUserLocation)) __obj.updateDynamic("OptimizeForEndUserLocation")(OptimizeForEndUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetadataResponse]
  }
}

