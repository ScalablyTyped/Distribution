package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Instructs Amazon Transcribe to process each audio channel separately and then merge the transcription output of each channel into a single transcription.  Amazon Transcribe also produces a transcription of each item detected on an audio channel, including the start time and end time of the item and alternative transcriptions of the item including the confidence that Amazon Transcribe has in the transcription. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ChannelIdentification: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of speakers to identify in the input audio. If there are more speakers in the audio than this number, multiple speakers will be identified as a single speaker. If you specify the MaxSpeakerLabels field, you must set the ShowSpeakerLabels field to true.
    */
  var MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined
  /**
    * Determines whether the transcription job uses speaker recognition to identify different speakers in the input audio. Speaker recognition labels individual speakers in the audio file. If you set the ShowSpeakerLabels field to true, you must also set the maximum number of speaker labels MaxSpeakerLabels field. You can't set both ShowSpeakerLabels and ChannelIdentification in the same request. If you set both, your request returns a BadRequestException.
    */
  var ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a vocabulary to use when processing the transcription job.
    */
  var VocabularyName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    ChannelIdentification: js.UndefOr[Boolean] = js.undefined,
    MaxSpeakerLabels: js.UndefOr[MaxSpeakers] = js.undefined,
    ShowSpeakerLabels: js.UndefOr[Boolean] = js.undefined,
    VocabularyName: VocabularyName = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ChannelIdentification)) __obj.updateDynamic("ChannelIdentification")(ChannelIdentification)
    if (!js.isUndefined(MaxSpeakerLabels)) __obj.updateDynamic("MaxSpeakerLabels")(MaxSpeakerLabels)
    if (!js.isUndefined(ShowSpeakerLabels)) __obj.updateDynamic("ShowSpeakerLabels")(ShowSpeakerLabels)
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName)
    __obj.asInstanceOf[Settings]
  }
}

