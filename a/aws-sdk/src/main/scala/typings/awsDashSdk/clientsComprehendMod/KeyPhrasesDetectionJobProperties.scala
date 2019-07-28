package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPhrasesDetectionJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  /**
    * The time that the key phrases detection job completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The input data configuration that you supplied when you created the key phrases detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.InputDataConfig] = js.undefined
  /**
    * The identifier assigned to the key phrases detection job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobId] = js.undefined
  /**
    * The name that you assigned the key phrases detection job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobName] = js.undefined
  /**
    * The current status of the key phrases detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.JobStatus] = js.undefined
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.LanguageCode] = js.undefined
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  /**
    * The output data configuration that you supplied when you created the key phrases detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.OutputDataConfig] = js.undefined
  /**
    * The time that the key phrases detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your key phrases detection job. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.VpcConfig] = js.undefined
}

object KeyPhrasesDetectionJobProperties {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn = null,
    EndTime: Timestamp = null,
    InputDataConfig: InputDataConfig = null,
    JobId: JobId = null,
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    LanguageCode: LanguageCode = null,
    Message: AnyLengthString = null,
    OutputDataConfig: OutputDataConfig = null,
    SubmitTime: Timestamp = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): KeyPhrasesDetectionJobProperties = {
    val __obj = js.Dynamic.literal()
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[KeyPhrasesDetectionJobProperties]
  }
}

