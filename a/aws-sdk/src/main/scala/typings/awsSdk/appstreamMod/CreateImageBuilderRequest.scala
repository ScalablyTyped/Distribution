package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.native
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.native
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the AppStream_Machine_Role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the public, private, or shared image to use.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image used to create the image builder.
    */
  var ImageName: js.UndefOr[String] = js.native
  /**
    * The instance type to use when launching the image builder. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: String = js.native
  /**
    * A unique name for the image builder.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
  /**
    * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.appstreamMod.Tags] = js.native
  /**
    * The VPC configuration for the image builder. You can specify only one subnet.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.appstreamMod.VpcConfig] = js.native
}

object CreateImageBuilderRequest {
  @scala.inline
  def apply(InstanceType: String, Name: Name): CreateImageBuilderRequest = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderRequest]
  }
  @scala.inline
  implicit class CreateImageBuilderRequestOps[Self <: CreateImageBuilderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = this.set("AccessEndpoints", js.Array(value :_*))
    @scala.inline
    def setAccessEndpoints(value: AccessEndpointList): Self = this.set("AccessEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessEndpoints: Self = this.set("AccessEndpoints", js.undefined)
    @scala.inline
    def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = this.set("AppstreamAgentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppstreamAgentVersion: Self = this.set("AppstreamAgentVersion", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setDomainJoinInfo(value: DomainJoinInfo): Self = this.set("DomainJoinInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainJoinInfo: Self = this.set("DomainJoinInfo", js.undefined)
    @scala.inline
    def setEnableDefaultInternetAccess(value: BooleanObject): Self = this.set("EnableDefaultInternetAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDefaultInternetAccess: Self = this.set("EnableDefaultInternetAccess", js.undefined)
    @scala.inline
    def setIamRoleArn(value: Arn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setImageArn(value: Arn): Self = this.set("ImageArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageArn: Self = this.set("ImageArn", js.undefined)
    @scala.inline
    def setImageName(value: String): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageName: Self = this.set("ImageName", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

