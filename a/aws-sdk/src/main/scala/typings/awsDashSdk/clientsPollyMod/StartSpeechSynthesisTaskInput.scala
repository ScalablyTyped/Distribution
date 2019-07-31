package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSpeechSynthesisTaskInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typings.awsDashSdk.clientsPollyMod.Engine] = js.undefined
  /**
    * Optional language code for the Speech Synthesis request. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LanguageCode] = js.undefined
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: typings.awsDashSdk.clientsPollyMod.OutputFormat
  /**
    * Amazon S3 bucket name to which the output file will be saved.
    */
  var OutputS3BucketName: typings.awsDashSdk.clientsPollyMod.OutputS3BucketName
  /**
    * The Amazon S3 key prefix for the output speech file.
    */
  var OutputS3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsPollyMod.OutputS3KeyPrefix] = js.undefined
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typings.awsDashSdk.clientsPollyMod.SampleRate] = js.undefined
  /**
    * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
    */
  var SnsTopicArn: js.UndefOr[typings.awsDashSdk.clientsPollyMod.SnsTopicArn] = js.undefined
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
  /**
    * The input text to synthesize. If you specify ssml as the TextType, follow the SSML format for the input text. 
    */
  var Text: typings.awsDashSdk.clientsPollyMod.Text
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[typings.awsDashSdk.clientsPollyMod.TextType] = js.undefined
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: typings.awsDashSdk.clientsPollyMod.VoiceId
}

object StartSpeechSynthesisTaskInput {
  @scala.inline
  def apply(
    OutputFormat: OutputFormat,
    OutputS3BucketName: OutputS3BucketName,
    Text: Text,
    VoiceId: VoiceId,
    Engine: Engine = null,
    LanguageCode: LanguageCode = null,
    LexiconNames: LexiconNameList = null,
    OutputS3KeyPrefix: OutputS3KeyPrefix = null,
    SampleRate: SampleRate = null,
    SnsTopicArn: SnsTopicArn = null,
    SpeechMarkTypes: SpeechMarkTypeList = null,
    TextType: TextType = null
  ): StartSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(OutputFormat = OutputFormat.asInstanceOf[js.Any], OutputS3BucketName = OutputS3BucketName, Text = Text, VoiceId = VoiceId.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LexiconNames != null) __obj.updateDynamic("LexiconNames")(LexiconNames)
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix)
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    if (SpeechMarkTypes != null) __obj.updateDynamic("SpeechMarkTypes")(SpeechMarkTypes)
    if (TextType != null) __obj.updateDynamic("TextType")(TextType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeechSynthesisTaskInput]
  }
}

