package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentClassifierRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * The name of the document classifier.
    */
  var DocumentClassifierName: ComprehendArnName
  
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: DocumentClassifierInputDataConfig
  
  /**
    * The language of the input documents. You can specify any of the languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.clientsComprehendMod.LanguageCode
  
  /**
    * Indicates the mode in which the classifier will be trained. The classifier can be trained in multi-class mode, which identifies one and only one class for each document, or multi-label mode, which identifies one or more labels for each document. In multi-label mode, multiple labels for an individual document are separated by a delimiter. The default delimiter between labels is a pipe (|).
    */
  var Mode: js.UndefOr[DocumentClassifierMode] = js.undefined
  
  /**
    * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The resource-based policy to attach to your custom document classifier model. You can use this policy to allow another Amazon Web Services account to import your custom model. Provide your policy as a JSON body that you enter as a UTF-8 encoded string without line breaks. To provide valid JSON, enclose the attribute names and values in double quotes. If the JSON body is also enclosed in double quotes, then you must escape the double quotes that are inside the policy:  "{\"attribute\": \"value\", \"attribute\": [\"value\"]}"  To avoid escaping quotes, you can use single quotes to enclose the policy and double quotes to enclose the JSON names and values:  '{"attribute": "value", "attribute": ["value"]}' 
    */
  var ModelPolicy: js.UndefOr[Policy] = js.undefined
  
  /**
    * Specifies the location for the output files from a custom classifier job. This parameter is required for a request that creates a native classifier model.
    */
  var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined
  
  /**
    * Tags to associate with the document classifier. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The version name given to the newly created classifier. Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be unique among all models with the same classifier name in the Amazon Web Services account/Amazon Web Services Region.
    */
  var VersionName: js.UndefOr[typings.awsSdk.clientsComprehendMod.VersionName] = js.undefined
  
  /**
    * ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your custom classifier. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.VpcConfig] = js.undefined
}
object CreateDocumentClassifierRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    DocumentClassifierName: ComprehendArnName,
    InputDataConfig: DocumentClassifierInputDataConfig,
    LanguageCode: LanguageCode
  ): CreateDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DocumentClassifierName = DocumentClassifierName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentClassifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDocumentClassifierRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierName(value: ComprehendArnName): Self = StObject.set(x, "DocumentClassifierName", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: DocumentClassifierInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setMode(value: DocumentClassifierMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setModelKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "ModelKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setModelKmsKeyIdUndefined: Self = StObject.set(x, "ModelKmsKeyId", js.undefined)
    
    inline def setModelPolicy(value: Policy): Self = StObject.set(x, "ModelPolicy", value.asInstanceOf[js.Any])
    
    inline def setModelPolicyUndefined: Self = StObject.set(x, "ModelPolicy", js.undefined)
    
    inline def setOutputDataConfig(value: DocumentClassifierOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
