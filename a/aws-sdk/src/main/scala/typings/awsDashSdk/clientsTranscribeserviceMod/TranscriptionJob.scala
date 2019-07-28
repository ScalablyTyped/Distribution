package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscriptionJob extends js.Object {
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field can contain one of the following values:    Unsupported media format - The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format - The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure that the two values match.    Invalid sample rate for audio file - The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate - The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large - The size of your audio file is larger than Amazon Transcribe can process. For more information, see Limits in the Amazon Transcribe Developer Guide.    Invalid number of channels: number of channels too large - Your audio contains more channels than Amazon Transcribe is configured to process. To request additional channels, see Amazon Transcribe Limits in the Amazon Web Services General Reference.  
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  /**
    * An object that describes the input media for the transcription job.
    */
  var Media: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.Media] = js.undefined
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.MediaFormat] = js.undefined
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. 
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.MediaSampleRateHertz] = js.undefined
  /**
    * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing the transcription job.
    */
  var Settings: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.Settings] = js.undefined
  /**
    * An object that describes the output of the transcription job.
    */
  var Transcript: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.Transcript] = js.undefined
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobName] = js.undefined
  /**
    * The status of the transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobStatus] = js.undefined
}

object TranscriptionJob {
  @scala.inline
  def apply(
    CompletionTime: DateTime = null,
    CreationTime: DateTime = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    Media: Media = null,
    MediaFormat: MediaFormat = null,
    MediaSampleRateHertz: js.UndefOr[MediaSampleRateHertz] = js.undefined,
    Settings: Settings = null,
    Transcript: Transcript = null,
    TranscriptionJobName: TranscriptionJobName = null,
    TranscriptionJobStatus: TranscriptionJobStatus = null
  ): TranscriptionJob = {
    val __obj = js.Dynamic.literal()
    if (CompletionTime != null) __obj.updateDynamic("CompletionTime")(CompletionTime)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Media != null) __obj.updateDynamic("Media")(Media)
    if (MediaFormat != null) __obj.updateDynamic("MediaFormat")(MediaFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(MediaSampleRateHertz)) __obj.updateDynamic("MediaSampleRateHertz")(MediaSampleRateHertz)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    if (Transcript != null) __obj.updateDynamic("Transcript")(Transcript)
    if (TranscriptionJobName != null) __obj.updateDynamic("TranscriptionJobName")(TranscriptionJobName)
    if (TranscriptionJobStatus != null) __obj.updateDynamic("TranscriptionJobStatus")(TranscriptionJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscriptionJob]
  }
}

