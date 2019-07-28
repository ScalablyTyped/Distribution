package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentClassifierRequest extends js.Object {
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
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
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.
    */
  var LanguageCode: typings.awsDashSdk.clientsComprehendMod.LanguageCode
  /**
    * Enables the addition of output results configuration parameters for custom classifier jobs.
    */
  var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined
  /**
    * Tags to be associated with the document classifier being created. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your custom classifier. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.VpcConfig] = js.undefined
}

object CreateDocumentClassifierRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    DocumentClassifierName: ComprehendArnName,
    InputDataConfig: DocumentClassifierInputDataConfig,
    LanguageCode: LanguageCode,
    ClientRequestToken: ClientRequestTokenString = null,
    OutputDataConfig: DocumentClassifierOutputDataConfig = null,
    Tags: TagList = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): CreateDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn, DocumentClassifierName = DocumentClassifierName, InputDataConfig = InputDataConfig, LanguageCode = LanguageCode.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[CreateDocumentClassifierRequest]
  }
}

