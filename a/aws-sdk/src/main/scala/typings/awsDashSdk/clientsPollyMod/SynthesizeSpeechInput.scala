package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typings.awsDashSdk.clientsPollyMod.Engine] = js.native
  /**
    * Optional language code for the Synthesize Speech request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LanguageCode] = js.native
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. For information about storing lexicons, see PutLexicon.
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.native
  /**
    *  The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json.  When pcm is used, the content returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format. 
    */
  var OutputFormat: typings.awsDashSdk.clientsPollyMod.OutputFormat = js.native
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typings.awsDashSdk.clientsPollyMod.SampleRate] = js.native
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.native
  /**
    *  Input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
    */
  var Text: typings.awsDashSdk.clientsPollyMod.Text = js.native
  /**
    *  Specifies whether the input text is plain text or SSML. The default value is plain text. For more information, see Using SSML.
    */
  var TextType: js.UndefOr[typings.awsDashSdk.clientsPollyMod.TextType] = js.native
  /**
    *  Voice ID to use for the synthesis. You can get a list of available voice IDs by calling the DescribeVoices operation. 
    */
  var VoiceId: typings.awsDashSdk.clientsPollyMod.VoiceId = js.native
}

object SynthesizeSpeechInput {
  @scala.inline
  def apply(
    OutputFormat: OutputFormat,
    Text: Text,
    VoiceId: VoiceId,
    Engine: Engine = null,
    LanguageCode: LanguageCode = null,
    LexiconNames: LexiconNameList = null,
    SampleRate: SampleRate = null,
    SpeechMarkTypes: SpeechMarkTypeList = null,
    TextType: TextType = null
  ): SynthesizeSpeechInput = {
    val __obj = js.Dynamic.literal(OutputFormat = OutputFormat.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], VoiceId = VoiceId.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LexiconNames != null) __obj.updateDynamic("LexiconNames")(LexiconNames.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    if (SpeechMarkTypes != null) __obj.updateDynamic("SpeechMarkTypes")(SpeechMarkTypes.asInstanceOf[js.Any])
    if (TextType != null) __obj.updateDynamic("TextType")(TextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechInput]
  }
}

