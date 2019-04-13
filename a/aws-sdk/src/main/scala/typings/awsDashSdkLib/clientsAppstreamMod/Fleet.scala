package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fleet extends js.Object {
  /**
    * The ARN for the fleet.
    */
  var Arn: awsDashSdkLib.clientsAppstreamMod.Arn
  /**
    * The capacity status for the fleet.
    */
  var ComputeCapacityStatus: awsDashSdkLib.clientsAppstreamMod.ComputeCapacityStatus
  /**
    * The time the fleet was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The time after disconnection when a session is considered to have ended, in seconds. If a user who was disconnected reconnects within this time interval, the user is connected to their previous session. Specify a value between 60 and 360000. By default, this value is 900 seconds (15 minutes).
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
  /**
    * Indicates whether default internet access is enabled for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The fleet errors.
    */
  var FleetErrors: js.UndefOr[FleetErrors] = js.undefined
  /**
    * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
    */
  var FleetType: js.UndefOr[FleetType] = js.undefined
  /**
    * The ARN for the public, private, or shared image.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the image used to create the fleet.
    */
  var ImageName: js.UndefOr[String] = js.undefined
  /**
    * The instance type to use when launching fleet instances.
    */
  var InstanceType: String
  /**
    * The maximum time that a streaming session can run, in seconds. Specify a value between 600 and 360000.
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The name of the fleet.
    */
  var Name: String
  /**
    * The current state for the fleet.
    */
  var State: FleetState
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object Fleet {
  @scala.inline
  def apply(
    Arn: Arn,
    ComputeCapacityStatus: ComputeCapacityStatus,
    InstanceType: String,
    Name: String,
    State: FleetState,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined,
    DisplayName: String = null,
    DomainJoinInfo: DomainJoinInfo = null,
    EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
    FleetErrors: FleetErrors = null,
    FleetType: FleetType = null,
    ImageArn: Arn = null,
    ImageName: String = null,
    MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined,
    VpcConfig: VpcConfig = null
  ): Fleet = {
    val __obj = js.Dynamic.literal(Arn = Arn, ComputeCapacityStatus = ComputeCapacityStatus, InstanceType = InstanceType, Name = Name, State = State.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisconnectTimeoutInSeconds)) __obj.updateDynamic("DisconnectTimeoutInSeconds")(DisconnectTimeoutInSeconds)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainJoinInfo != null) __obj.updateDynamic("DomainJoinInfo")(DomainJoinInfo)
    if (!js.isUndefined(EnableDefaultInternetAccess)) __obj.updateDynamic("EnableDefaultInternetAccess")(EnableDefaultInternetAccess)
    if (FleetErrors != null) __obj.updateDynamic("FleetErrors")(FleetErrors)
    if (FleetType != null) __obj.updateDynamic("FleetType")(FleetType.asInstanceOf[js.Any])
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (!js.isUndefined(MaxUserDurationInSeconds)) __obj.updateDynamic("MaxUserDurationInSeconds")(MaxUserDurationInSeconds)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[Fleet]
  }
}

