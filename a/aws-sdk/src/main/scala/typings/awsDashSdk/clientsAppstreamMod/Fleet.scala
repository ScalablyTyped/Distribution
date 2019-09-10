package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fleet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the fleet.
    */
  var Arn: typings.awsDashSdk.clientsAppstreamMod.Arn
  /**
    * The capacity status for the fleet.
    */
  var ComputeCapacityStatus: typings.awsDashSdk.clientsAppstreamMod.ComputeCapacityStatus
  /**
    * The time the fleet was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The amount of time that a streaming session remains active after users disconnect. If they try to reconnect to the streaming session after a disconnection or network interruption within this time interval, they are connected to their previous session. Otherwise, they are connected to a new session with a new streaming instance. Specify a value between 60 and 360000.
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DomainJoinInfo] = js.undefined
  /**
    * Indicates whether default internet access is enabled for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The fleet errors.
    */
  var FleetErrors: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.FleetErrors] = js.undefined
  /**
    * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
    */
  var FleetType: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.FleetType] = js.undefined
  /**
    * The ARN of the IAM role that is applied to the fleet. To assume a role, the fleet instance calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.undefined
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the DisconnectTimeoutInSeconds time interval begins. Users are notified before they are disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval specified in DisconnectTimeoutInSeconds elapses, they are connected to their previous session. Users are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be idle after the time interval in IdleDisconnectTimeoutInSeconds elapses, they are disconnected. To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value between 60 and 3600. The default value is 0.  If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of inactivity.  
    */
  var IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
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
    * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance.  Specify a value between 600 and 360000.
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
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.VpcConfig] = js.undefined
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
    IamRoleArn: Arn = null,
    IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined,
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
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (!js.isUndefined(IdleDisconnectTimeoutInSeconds)) __obj.updateDynamic("IdleDisconnectTimeoutInSeconds")(IdleDisconnectTimeoutInSeconds)
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (!js.isUndefined(MaxUserDurationInSeconds)) __obj.updateDynamic("MaxUserDurationInSeconds")(MaxUserDurationInSeconds)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[Fleet]
  }
}

