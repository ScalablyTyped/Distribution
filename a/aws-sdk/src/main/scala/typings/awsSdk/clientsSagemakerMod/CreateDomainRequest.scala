package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.    PublicInternetOnly - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows direct internet access    VpcOnly - All Studio traffic is through the specified VPC and subnets  
    */
  var AppNetworkAccessType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppNetworkAccessType] = js.undefined
  
  /**
    * The entity that creates and manages the required security groups for inter-app communication in VPCOnly mode. Required when CreateDomain.AppNetworkAccessType is VPCOnly and DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn is provided. If setting up the domain for use with RStudio, this value must be set to Service.
    */
  var AppSecurityGroupManagement: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppSecurityGroupManagement] = js.undefined
  
  /**
    * The mode of authentication that members use to access the domain.
    */
  var AuthMode: typings.awsSdk.clientsSagemakerMod.AuthMode
  
  /**
    * The default settings used to create a space.
    */
  var DefaultSpaceSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DefaultSpaceSettings] = js.undefined
  
  /**
    * The default settings to use to create a user profile when UserSettings isn't specified in the call to the CreateUserProfile API.  SecurityGroups is aggregated when specified in both calls. For all other settings in UserSettings, the values specified in CreateUserProfile take precedence over those specified in CreateDomain.
    */
  var DefaultUserSettings: UserSettings
  
  /**
    * A name for the domain.
    */
  var DomainName: typings.awsSdk.clientsSagemakerMod.DomainName
  
  /**
    * A collection of Domain settings.
    */
  var DomainSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainSettings] = js.undefined
  
  /**
    * Use KmsKeyId.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * SageMaker uses Amazon Web Services KMS to encrypt the EFS volume attached to the domain with an Amazon Web Services managed key by default. For more control, specify a customer managed key.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The VPC subnets that Studio uses for communication.
    */
  var SubnetIds: Subnets
  
  /**
    * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags are searchable using the Search API. Tags that you specify for the Domain are also added to all Apps that the Domain launches.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
    */
  var VpcId: typings.awsSdk.clientsSagemakerMod.VpcId
}
object CreateDomainRequest {
  
  inline def apply(
    AuthMode: AuthMode,
    DefaultUserSettings: UserSettings,
    DomainName: DomainName,
    SubnetIds: Subnets,
    VpcId: VpcId
  ): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultUserSettings = DefaultUserSettings.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setAppNetworkAccessType(value: AppNetworkAccessType): Self = StObject.set(x, "AppNetworkAccessType", value.asInstanceOf[js.Any])
    
    inline def setAppNetworkAccessTypeUndefined: Self = StObject.set(x, "AppNetworkAccessType", js.undefined)
    
    inline def setAppSecurityGroupManagement(value: AppSecurityGroupManagement): Self = StObject.set(x, "AppSecurityGroupManagement", value.asInstanceOf[js.Any])
    
    inline def setAppSecurityGroupManagementUndefined: Self = StObject.set(x, "AppSecurityGroupManagement", js.undefined)
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpaceSettings(value: DefaultSpaceSettings): Self = StObject.set(x, "DefaultSpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpaceSettingsUndefined: Self = StObject.set(x, "DefaultSpaceSettings", js.undefined)
    
    inline def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainSettings(value: DomainSettings): Self = StObject.set(x, "DomainSettings", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsUndefined: Self = StObject.set(x, "DomainSettings", js.undefined)
    
    inline def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemKmsKeyIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSubnetIds(value: Subnets): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
