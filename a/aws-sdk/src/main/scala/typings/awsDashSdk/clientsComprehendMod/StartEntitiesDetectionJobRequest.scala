package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEntitiesDetectionJobRequest extends js.Object {
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend read access to your input data. For more information, see https://docs.aws.amazon.com/comprehend/latest/dg/access-control-managing-permissions.html#auth-role-permissions.
    */
  var DataAccessRoleArn: IamRoleArn
  /**
    * The Amazon Resource Name (ARN) that identifies the specific entity recognizer to be used by the StartEntitiesDetectionJob. This ARN is optional and is only used for a custom entity recognition job.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EntityRecognizerArn] = js.undefined
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsDashSdk.clientsComprehendMod.InputDataConfig
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobName] = js.undefined
  /**
    * The language of the input documents. All documents must be in the same language. You can specify any of the languages supported by Amazon Comprehend: English ("en"), Spanish ("es"), French ("fr"), German ("de"), Italian ("it"), or Portuguese ("pt"). If custom entities recognition is used, this parameter is ignored and the language used for training the model is used instead.
    */
  var LanguageCode: typings.awsDashSdk.clientsComprehendMod.LanguageCode
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsDashSdk.clientsComprehendMod.OutputDataConfig
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your entity detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.VpcConfig] = js.undefined
}

object StartEntitiesDetectionJobRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig,
    ClientRequestToken: ClientRequestTokenString = null,
    EntityRecognizerArn: EntityRecognizerArn = null,
    JobName: JobName = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): StartEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn, InputDataConfig = InputDataConfig, LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (EntityRecognizerArn != null) __obj.updateDynamic("EntityRecognizerArn")(EntityRecognizerArn)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[StartEntitiesDetectionJobRequest]
  }
}

