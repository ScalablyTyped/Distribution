package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDocumentClassificationJobRequest extends js.Object {
  /**
    * A unique identifier for the request. If you do not set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: IamRoleArn
  /**
    * The Amazon Resource Name (ARN) of the document classifier to use to process the job.
    */
  var DocumentClassifierArn: typings.awsDashSdk.clientsComprehendMod.DocumentClassifierArn
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsDashSdk.clientsComprehendMod.InputDataConfig
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobName] = js.undefined
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsDashSdk.clientsComprehendMod.OutputDataConfig
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your document classification job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.VpcConfig] = js.undefined
}

object StartDocumentClassificationJobRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    DocumentClassifierArn: DocumentClassifierArn,
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    ClientRequestToken: ClientRequestTokenString = null,
    JobName: JobName = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): StartDocumentClassificationJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn, DocumentClassifierArn = DocumentClassifierArn, InputDataConfig = InputDataConfig, OutputDataConfig = OutputDataConfig)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[StartDocumentClassificationJobRequest]
  }
}

