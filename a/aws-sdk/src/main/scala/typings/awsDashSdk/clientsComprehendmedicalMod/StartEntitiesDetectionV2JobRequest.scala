package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEntitiesDetectionV2JobRequest extends js.Object {
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend Medical generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend Medical read access to your input data. For more information, see  Role-Based Permissions Required for Asynchronous Operations.
    */
  var DataAccessRoleArn: IamRoleArn
  /**
    * Specifies the format and location of the input data for the job.
    */
  var InputDataConfig: typings.awsDashSdk.clientsComprehendmedicalMod.InputDataConfig
  /**
    * The identifier of the job.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.JobName] = js.undefined
  /**
    * An AWS Key Management Service key to encrypt your output files. If you do not specify a key, the files are written in plain text.
    */
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.KMSKey] = js.undefined
  /**
    * The language of the input documents. All documents must be in the same language.
    */
  var LanguageCode: typings.awsDashSdk.clientsComprehendmedicalMod.LanguageCode
  /**
    * Specifies where to send the output files.
    */
  var OutputDataConfig: typings.awsDashSdk.clientsComprehendmedicalMod.OutputDataConfig
}

object StartEntitiesDetectionV2JobRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig,
    ClientRequestToken: ClientRequestTokenString = null,
    JobName: JobName = null,
    KMSKey: KMSKey = null
  ): StartEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn, InputDataConfig = InputDataConfig, LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    __obj.asInstanceOf[StartEntitiesDetectionV2JobRequest]
  }
}

