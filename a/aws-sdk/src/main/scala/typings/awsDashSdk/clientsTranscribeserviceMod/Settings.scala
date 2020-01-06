package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * Instructs Amazon Transcribe to process each audio channel separately and then merge the transcription output of each channel into a single transcription.  Amazon Transcribe also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of the item including the confidence that Amazon Transcribe has in the transcription. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ChannelIdentification: js.UndefOr[Boolean] = js.native
  /**
    * The number of alternative transcriptions that the service should return. If you specify the MaxAlternatives field, you must set the ShowAlternatives field to true.
    */
  var MaxAlternatives: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.MaxAlternatives] = js.native
  /**
    * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers will be identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
    */
  var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.native
  /**
    * Determines whether the transcription contains alternative transcriptions. If you set the ShowAlternatives field to true, you must also set the maximum number of alternatives to return in the MaxAlternatives field.
    */
  var ShowAlternatives: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recognition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ShowSpeakerLabels: js.UndefOr[Boolean] = js.native
  /**
    * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as placeholder text. Set to remove to remove filtered text from the transcript without using placeholder text.
    */
  var VocabularyFilterMethod: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyFilterMethod] = js.native
  /**
    * The name of the vocabulary filter to use when transcribing the audio. The filter that you specify must have the same language code as the transcription job.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyFilterName] = js.native
  /**
    * The name of a vocabulary to use when processing the transcription job.
    */
  var VocabularyName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName] = js.native
}

object Settings {
  @scala.inline
  def apply(
    ChannelIdentification: js.UndefOr[scala.Boolean] = js.undefined,
    MaxAlternatives: Int | Double = null,
    MaxSpeakerLabels: Int | Double = null,
    ShowAlternatives: js.UndefOr[scala.Boolean] = js.undefined,
    ShowSpeakerLabels: js.UndefOr[scala.Boolean] = js.undefined,
    VocabularyFilterMethod: VocabularyFilterMethod = null,
    VocabularyFilterName: VocabularyFilterName = null,
    VocabularyName: VocabularyName = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChannelIdentification)) __obj.updateDynamic("ChannelIdentification")(ChannelIdentification.asInstanceOf[js.Any])
    if (MaxAlternatives != null) __obj.updateDynamic("MaxAlternatives")(MaxAlternatives.asInstanceOf[js.Any])
    if (MaxSpeakerLabels != null) __obj.updateDynamic("MaxSpeakerLabels")(MaxSpeakerLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowAlternatives)) __obj.updateDynamic("ShowAlternatives")(ShowAlternatives.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowSpeakerLabels)) __obj.updateDynamic("ShowSpeakerLabels")(ShowSpeakerLabels.asInstanceOf[js.Any])
    if (VocabularyFilterMethod != null) __obj.updateDynamic("VocabularyFilterMethod")(VocabularyFilterMethod.asInstanceOf[js.Any])
    if (VocabularyFilterName != null) __obj.updateDynamic("VocabularyFilterName")(VocabularyFilterName.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

