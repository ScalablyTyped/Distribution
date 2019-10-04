package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComprehendMedicalAsyncJobProperties extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  /**
    * The time that the detection job completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time that job metadata is deleted from the server. Output files in your S3 bucket will not be deleted. After the metadata is deleted, the job will no longer appear in the results of the ListEntitiesDetectionV2Job or the ListPHIDetectionJobs operation.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The input data configuration that you supplied when you created the detection job.
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.InputDataConfig] = js.undefined
  /**
    * The identifier assigned to the detection job.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobId] = js.undefined
  /**
    * The name that you assigned to the detection job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobName] = js.undefined
  /**
    * The current status of the detection job. If the status is FAILED, the Message field shows the reason for the failure.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobStatus] = js.undefined
  /**
    * The AWS Key Management Service key, if any, used to encrypt the output files. 
    */
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.KMSKey] = js.undefined
  /**
    * The language code of the input documents.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.LanguageCode] = js.undefined
  /**
    * The path to the file that describes the results of a batch job.
    */
  var ManifestFilePath: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.ManifestFilePath] = js.undefined
  /**
    * A description of the status of a job.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.ModelVersion] = js.undefined
  /**
    * The output data configuration that you supplied when you created the detection job.
    */
  var OutputDataConfig: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.OutputDataConfig] = js.undefined
  /**
    * The time that the detection job was submitted for processing.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
}

object ComprehendMedicalAsyncJobProperties {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn = null,
    EndTime: Timestamp = null,
    ExpirationTime: Timestamp = null,
    InputDataConfig: InputDataConfig = null,
    JobId: JobId = null,
    JobName: JobName = null,
    JobStatus: JobStatus = null,
    KMSKey: KMSKey = null,
    LanguageCode: LanguageCode = null,
    ManifestFilePath: ManifestFilePath = null,
    Message: AnyLengthString = null,
    ModelVersion: ModelVersion = null,
    OutputDataConfig: OutputDataConfig = null,
    SubmitTime: Timestamp = null
  ): ComprehendMedicalAsyncJobProperties = {
    val __obj = js.Dynamic.literal()
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (ManifestFilePath != null) __obj.updateDynamic("ManifestFilePath")(ManifestFilePath)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime)
    __obj.asInstanceOf[ComprehendMedicalAsyncJobProperties]
  }
}

