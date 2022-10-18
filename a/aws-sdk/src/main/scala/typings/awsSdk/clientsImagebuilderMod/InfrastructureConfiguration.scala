package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfrastructureConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance metadata option settings for the infrastructure configuration.
    */
  var instanceMetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined
  
  /**
    * The instance profile of the infrastructure configuration.
    */
  var instanceProfileName: js.UndefOr[InstanceProfileNameType] = js.undefined
  
  /**
    * The instance types of the infrastructure configuration.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.undefined
  
  /**
    * The Amazon EC2 key pair of the infrastructure configuration.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The logging configuration of the infrastructure configuration.
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The name of the infrastructure configuration.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The tags attached to the resource created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.undefined
  
  /**
    * The security group IDs of the infrastructure configuration.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the SNS topic to which we send image build event notifications.  EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys from other accounts. The key that is used to encrypt the SNS topic must reside in the account that the Image Builder service runs under. 
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The subnet ID of the infrastructure configuration.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tags of the infrastructure configuration.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The terminate instance on failure configuration of the infrastructure configuration.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.undefined
}
object InfrastructureConfiguration {
  
  inline def apply(): InfrastructureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfiguration]
  }
  
  extension [Self <: InfrastructureConfiguration](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstanceMetadataOptions(value: InstanceMetadataOptions): Self = StObject.set(x, "instanceMetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataOptionsUndefined: Self = StObject.set(x, "instanceMetadataOptions", js.undefined)
    
    inline def setInstanceProfileName(value: InstanceProfileNameType): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileNameUndefined: Self = StObject.set(x, "instanceProfileName", js.undefined)
    
    inline def setInstanceTypes(value: InstanceTypeList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "instanceTypes", js.Array(value*))
    
    inline def setKeyPair(value: NonEmptyString): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceTags(value: ResourceTagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSnsTopicArn(value: NonEmptyString): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTerminateInstanceOnFailure(value: NullableBoolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    inline def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
  }
}
