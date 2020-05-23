package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBuilder extends js.Object {
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The version of the AppStream 2.0 agent that is currently being used by the image builder. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The ARN for the image builder.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The time stamp when the image builder was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the AppStream_Machine_Role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the image from which this builder was created.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  /**
    * The image builder errors.
    */
  var ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.native
  /**
    * The instance type for the image builder. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
  var NetworkAccessConfiguration: js.UndefOr[typings.awsSdk.appstreamMod.NetworkAccessConfiguration] = js.native
  /**
    * The operating system platform of the image builder.
    */
  var Platform: js.UndefOr[PlatformType] = js.native
  /**
    * The state of the image builder.
    */
  var State: js.UndefOr[ImageBuilderState] = js.native
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.native
  /**
    * The VPC configuration of the image builder.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.appstreamMod.VpcConfig] = js.native
}

object ImageBuilder {
  @scala.inline
  def apply(
    Name: String,
    AccessEndpoints: AccessEndpointList = null,
    AppstreamAgentVersion: AppstreamAgentVersion = null,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisplayName: String = null,
    DomainJoinInfo: DomainJoinInfo = null,
    EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined,
    IamRoleArn: Arn = null,
    ImageArn: Arn = null,
    ImageBuilderErrors: ResourceErrors = null,
    InstanceType: String = null,
    NetworkAccessConfiguration: NetworkAccessConfiguration = null,
    Platform: PlatformType = null,
    State: ImageBuilderState = null,
    StateChangeReason: ImageBuilderStateChangeReason = null,
    VpcConfig: VpcConfig = null
  ): ImageBuilder = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints.asInstanceOf[js.Any])
    if (AppstreamAgentVersion != null) __obj.updateDynamic("AppstreamAgentVersion")(AppstreamAgentVersion.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (DomainJoinInfo != null) __obj.updateDynamic("DomainJoinInfo")(DomainJoinInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDefaultInternetAccess)) __obj.updateDynamic("EnableDefaultInternetAccess")(EnableDefaultInternetAccess.get.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (ImageArn != null) __obj.updateDynamic("ImageArn")(ImageArn.asInstanceOf[js.Any])
    if (ImageBuilderErrors != null) __obj.updateDynamic("ImageBuilderErrors")(ImageBuilderErrors.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (NetworkAccessConfiguration != null) __obj.updateDynamic("NetworkAccessConfiguration")(NetworkAccessConfiguration.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateChangeReason != null) __obj.updateDynamic("StateChangeReason")(StateChangeReason.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBuilder]
  }
}

