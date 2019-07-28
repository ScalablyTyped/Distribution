package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetRequest extends js.Object {
  /**
    * The fleet attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[FleetAttributes] = js.undefined
  /**
    * The desired capacity for the fleet.
    */
  var ComputeCapacity: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ComputeCapacity] = js.undefined
  /**
    * Deletes the VPC association for the specified fleet.
    */
  var DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Description] = js.undefined
  /**
    * The amount of time that a streaming session remains active after users disconnect. If users try to reconnect to the streaming session after a disconnection or network interruption within this time interval, they are connected to their previous session. Otherwise, they are connected to a new session with a new streaming instance.  Specify a value between 60 and 360000.
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DisplayName] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DomainJoinInfo] = js.undefined
  /**
    * Enables or disables default internet access for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the DisconnectTimeoutInSeconds time interval begins. Users are notified before they are disconnected due to inactivity. If users try to reconnect to the streaming session before the time interval specified in DisconnectTimeoutInSeconds elapses, they are connected to their previous session. Users are considered idle when they stop providing keyboard or mouse input during their streaming session. File uploads and downloads, audio in, audio out, and pixels changing do not qualify as user activity. If users continue to be idle after the time interval in IdleDisconnectTimeoutInSeconds elapses, they are disconnected.  To prevent users from being disconnected due to inactivity, specify a value of 0. Otherwise, specify a value between 60 and 3600. The default value is 0.  If you enable this feature, we recommend that you specify a value that corresponds exactly to a whole number of minutes (for example, 60, 120, and 180). If you don't do this, the value is rounded to the nearest minute. For example, if you specify a value of 70, users are disconnected after 1 minute of inactivity. If you specify a value that is at the midpoint between two different minutes, the value is rounded up. For example, if you specify a value of 90, users are disconnected after 2 minutes of inactivity.  
    */
  var IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The ARN of the public, private, or shared image to use.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the image used to create the fleet.
    */
  var ImageName: js.UndefOr[String] = js.undefined
  /**
    * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The maximum amount of time that a streaming session can remain active, in seconds. If users are still connected to a streaming instance five minutes before this limit is reached, they are prompted to save any open documents before being disconnected. After this time elapses, the instance is terminated and replaced by a new instance. Specify a value between 600 and 360000.
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * A unique name for the fleet.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.VpcConfig] = js.undefined
}

object UpdateFleetRequest {
  @scala.inline
  def apply(
    AttributesToDelete: FleetAttributes = null,
    ComputeCapacity: ComputeCapacity = null,
    DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined,
    Description: Description = null,
    DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined,
    DisplayName: DisplayName = null,
    DomainJoinInfo: DomainJoinInfo = null,
    EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
    IdleDisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined,
    ImageArn: Arn = null,
    ImageName: String = null,
    InstanceType: String = null,
    MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined,
    Name: String = null,
    VpcConfig: VpcConfig = null
  ): UpdateFleetRequest = {
    val __obj = js.Dynamic.literal()
    if (AttributesToDelete != null) __obj.updateDynamic("AttributesToDelete")(AttributesToDelete)
    if (ComputeCapacity != null) __obj.updateDynamic("ComputeCapacity")(ComputeCapacity)
    if (!js.isUndefined(DeleteVpcConfig)) __obj.updateDynamic("DeleteVpcConfig")(DeleteVpcConfig)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisconnectTimeoutInSeconds)) __obj.updateDynamic("DisconnectTimeoutInSeconds")(DisconnectTimeoutInSeconds)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (DomainJoinInfo != null) __obj.updateDynamic("DomainJoinInfo")(DomainJoinInfo)
    if (!js.isUndefined(EnableDefaultInternetAccess)) __obj.updateDynamic("EnableDefaultInternetAccess")(EnableDefaultInternetAccess)
    if (!js.isUndefined(IdleDisconnectTimeoutInSeconds)) __obj.updateDynamic("IdleDisconnectTimeoutInSeconds")(IdleDisconnectTimeoutInSeconds)
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (!js.isUndefined(MaxUserDurationInSeconds)) __obj.updateDynamic("MaxUserDurationInSeconds")(MaxUserDurationInSeconds)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[UpdateFleetRequest]
  }
}

