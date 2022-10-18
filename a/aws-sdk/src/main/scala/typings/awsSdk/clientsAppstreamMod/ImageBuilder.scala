package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBuilder extends StObject {
  
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  
  /**
    * The version of the AppStream 2.0 agent that is currently being used by the image builder. 
    */
  var AppstreamAgentVersion: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AppstreamAgentVersion] = js.undefined
  
  /**
    * The ARN for the image builder.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Arn] = js.undefined
  
  /**
    * The time stamp when the image builder was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typings.awsSdk.clientsAppstreamMod.DomainJoinInfo] = js.undefined
  
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the appstream_machine_role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the image from which this builder was created.
    */
  var ImageArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The image builder errors.
    */
  var ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined
  
  /**
    * The instance type for the image builder. The following instance types are available:   stream.standard.small   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.memory.z1d.large   stream.memory.z1d.xlarge   stream.memory.z1d.2xlarge   stream.memory.z1d.3xlarge   stream.memory.z1d.6xlarge   stream.memory.z1d.12xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics.g4dn.xlarge   stream.graphics.g4dn.2xlarge   stream.graphics.g4dn.4xlarge   stream.graphics.g4dn.8xlarge   stream.graphics.g4dn.12xlarge   stream.graphics.g4dn.16xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the image builder.
    */
  var Name: String
  
  var NetworkAccessConfiguration: js.UndefOr[typings.awsSdk.clientsAppstreamMod.NetworkAccessConfiguration] = js.undefined
  
  /**
    * The operating system platform of the image builder.
    */
  var Platform: js.UndefOr[PlatformType] = js.undefined
  
  /**
    * The state of the image builder.
    */
  var State: js.UndefOr[ImageBuilderState] = js.undefined
  
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined
  
  /**
    * The VPC configuration of the image builder.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsAppstreamMod.VpcConfig] = js.undefined
}
object ImageBuilder {
  
  inline def apply(Name: String): ImageBuilder = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBuilder]
  }
  
  extension [Self <: ImageBuilder](x: Self) {
    
    inline def setAccessEndpoints(value: AccessEndpointList): Self = StObject.set(x, "AccessEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAccessEndpointsUndefined: Self = StObject.set(x, "AccessEndpoints", js.undefined)
    
    inline def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = StObject.set(x, "AccessEndpoints", js.Array(value*))
    
    inline def setAppstreamAgentVersion(value: AppstreamAgentVersion): Self = StObject.set(x, "AppstreamAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAppstreamAgentVersionUndefined: Self = StObject.set(x, "AppstreamAgentVersion", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDomainJoinInfo(value: DomainJoinInfo): Self = StObject.set(x, "DomainJoinInfo", value.asInstanceOf[js.Any])
    
    inline def setDomainJoinInfoUndefined: Self = StObject.set(x, "DomainJoinInfo", js.undefined)
    
    inline def setEnableDefaultInternetAccess(value: BooleanObject): Self = StObject.set(x, "EnableDefaultInternetAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultInternetAccessUndefined: Self = StObject.set(x, "EnableDefaultInternetAccess", js.undefined)
    
    inline def setIamRoleArn(value: Arn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setImageArn(value: Arn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageArnUndefined: Self = StObject.set(x, "ImageArn", js.undefined)
    
    inline def setImageBuilderErrors(value: ResourceErrors): Self = StObject.set(x, "ImageBuilderErrors", value.asInstanceOf[js.Any])
    
    inline def setImageBuilderErrorsUndefined: Self = StObject.set(x, "ImageBuilderErrors", js.undefined)
    
    inline def setImageBuilderErrorsVarargs(value: ResourceError*): Self = StObject.set(x, "ImageBuilderErrors", js.Array(value*))
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = StObject.set(x, "NetworkAccessConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessConfigurationUndefined: Self = StObject.set(x, "NetworkAccessConfiguration", js.undefined)
    
    inline def setPlatform(value: PlatformType): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setState(value: ImageBuilderState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: ImageBuilderStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
