package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberConfiguration extends StObject {
  
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration
  
  /**
    * The Amazon Resource Name (ARN) of the customer managed key in Key Management Service (KMS) to use for encryption at rest in the member. This parameter is inherited by any nodes that this member creates. For more information, see Encryption at Rest in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide. Use one of the following options to specify this parameter:    Undefined or empty string - By default, use an KMS key that is owned and managed by Amazon Web Services on your behalf.    A valid symmetric customer managed KMS key - Use the specified KMS key in your account that you create, own, and manage. Amazon Managed Blockchain doesn't support asymmetric keys. For more information, see Using symmetric and asymmetric keys in the Key Management Service Developer Guide. The following is an example of a KMS key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab   
    */
  var KmsKeyArn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network.
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined
  
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString
  
  /**
    * Tags assigned to the member. Tags consist of a key and optional value. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide. When specifying tags during creation, you can specify multiple key-value pairs in a single request, with an overall maximum of 50 tags added to each resource.
    */
  var Tags: js.UndefOr[InputTagMap] = js.undefined
}
object MemberConfiguration {
  
  inline def apply(FrameworkConfiguration: MemberFrameworkConfiguration, Name: NetworkMemberNameString): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberConfiguration]
  }
  
  extension [Self <: MemberConfiguration](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFrameworkConfiguration(value: MemberFrameworkConfiguration): Self = StObject.set(x, "FrameworkConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: ArnString): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setName(value: NetworkMemberNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
