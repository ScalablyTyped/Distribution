package typings
package awsDashSdkLib.clientsAppstreamMod

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
  var ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined
  /**
    * Deletes the VPC association for the specified fleet.
    */
  var DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The time after disconnection when a session is considered to have ended, in seconds. If a user who was disconnected reconnects within this time interval, the user is connected to their previous session. Specify a value between 60 and 360000. By default, the value is 900 seconds (15 minutes).
    */
  var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
  /**
    * Enables or disables default internet access for the fleet.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
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
    * The maximum time that a streaming session can run, in seconds. Specify a value between 600 and 360000. By default, the value is 900 seconds (15 minutes).
    */
  var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * A unique name for the fleet.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The VPC configuration for the fleet.
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
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
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (!js.isUndefined(MaxUserDurationInSeconds)) __obj.updateDynamic("MaxUserDurationInSeconds")(MaxUserDurationInSeconds)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[UpdateFleetRequest]
  }
}

