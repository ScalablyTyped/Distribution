package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTranscriptionJobRequest extends js.Object {
  /**
    * The language code for the language used in the input media file.
    */
  var LanguageCode: typings.awsDashSdk.clientsTranscribeserviceMod.LanguageCode
  /**
    * An object that describes the input media for a transcription job.
    */
  var Media: typings.awsDashSdk.clientsTranscribeserviceMod.Media
  /**
    * The format of the input media file.
    */
  var MediaFormat: typings.awsDashSdk.clientsTranscribeserviceMod.MediaFormat
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. 
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.MediaSampleRateHertz] = js.undefined
  /**
    * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcription in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket. You can't specify your own encryption key. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
    */
  var OutputBucketName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.OutputBucketName] = js.undefined
  /**
    * A Settings object that provides optional settings for a transcription job.
    */
  var Settings: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.Settings] = js.undefined
  /**
    * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account.
    */
  var TranscriptionJobName: typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobName
}

object StartTranscriptionJobRequest {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode,
    Media: Media,
    MediaFormat: MediaFormat,
    TranscriptionJobName: TranscriptionJobName,
    MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
    OutputBucketName: OutputBucketName = null,
    Settings: Settings = null
  ): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media, MediaFormat = MediaFormat.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName)
    if (!js.isUndefined(MediaSampleRateHertz)) __obj.updateDynamic("MediaSampleRateHertz")(MediaSampleRateHertz)
    if (OutputBucketName != null) __obj.updateDynamic("OutputBucketName")(OutputBucketName)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    __obj.asInstanceOf[StartTranscriptionJobRequest]
  }
}

