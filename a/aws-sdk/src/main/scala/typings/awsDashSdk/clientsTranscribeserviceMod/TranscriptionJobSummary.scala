package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscriptionJobSummary extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  /**
    * Indicates the location of the output of the transcription job. If the value is CUSTOMER_BUCKET then the location is the S3 bucket specified in the outputBucketName field when the transcription job was started with the StartTranscriptionJob operation. If the value is SERVICE_BUCKET then the output is stored by Amazon Transcribe and can be retrieved using the URI in the GetTranscriptionJob response's TranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.OutputLocationType] = js.undefined
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobName] = js.undefined
  /**
    * The status of the transcription job. When the status is COMPLETED, use the GetTranscriptionJob operation to get the results of the transcription.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobStatus] = js.undefined
}

object TranscriptionJobSummary {
  @scala.inline
  def apply(
    CompletionTime: DateTime = null,
    CreationTime: DateTime = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    OutputLocationType: OutputLocationType = null,
    TranscriptionJobName: TranscriptionJobName = null,
    TranscriptionJobStatus: TranscriptionJobStatus = null
  ): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (OutputLocationType != null) __obj.updateDynamic("OutputLocationType")(OutputLocationType.asInstanceOf[js.Any])
    if (TranscriptionJobName != null) __obj.updateDynamic("TranscriptionJobName")(TranscriptionJobName)
    if (TranscriptionJobStatus != null) __obj.updateDynamic("TranscriptionJobStatus")(TranscriptionJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
}

