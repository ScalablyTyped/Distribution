package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the appstream_machine_role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
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
    * The instance type for the image builder. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.memory.z1d.large   stream.memory.z1d.xlarge   stream.memory.z1d.2xlarge   stream.memory.z1d.3xlarge   stream.memory.z1d.6xlarge   stream.memory.z1d.12xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics.g4dn.xlarge   stream.graphics.g4dn.2xlarge   stream.graphics.g4dn.4xlarge   stream.graphics.g4dn.8xlarge   stream.graphics.g4dn.12xlarge   stream.graphics.g4dn.16xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
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
  def apply(Name: String): ImageBuilder = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBuilder]
  }
  
  @scala.inline
  implicit class ImageBuilderOps[Self <: ImageBuilder] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
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
    def setImageBuilderErrorsVarargs(value: ResourceError*): Self = this.set("ImageBuilderErrors", js.Array(value :_*))
    
    @scala.inline
    def setImageBuilderErrors(value: ResourceErrors): Self = this.set("ImageBuilderErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageBuilderErrors: Self = this.set("ImageBuilderErrors", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = this.set("NetworkAccessConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAccessConfiguration: Self = this.set("NetworkAccessConfiguration", js.undefined)
    
    @scala.inline
    def setPlatform(value: PlatformType): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setState(value: ImageBuilderState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateChangeReason(value: ImageBuilderStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
