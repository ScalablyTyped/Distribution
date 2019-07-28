package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateTextResponse extends js.Object {
  /**
    * The names of the custom terminologies applied to the input text by Amazon Translate for the translated text response.
    */
  var AppliedTerminologies: js.UndefOr[AppliedTerminologyList] = js.undefined
  /**
    * The language code for the language of the source text. 
    */
  var SourceLanguageCode: LanguageCodeString
  /**
    * The language code for the language of the target text. 
    */
  var TargetLanguageCode: LanguageCodeString
  /**
    * The the translated text. The maximum length of this text is 5kb.
    */
  var TranslatedText: String
}

object TranslateTextResponse {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    TranslatedText: String,
    AppliedTerminologies: AppliedTerminologyList = null
  ): TranslateTextResponse = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode, TargetLanguageCode = TargetLanguageCode, TranslatedText = TranslatedText)
    if (AppliedTerminologies != null) __obj.updateDynamic("AppliedTerminologies")(AppliedTerminologies)
    __obj.asInstanceOf[TranslateTextResponse]
  }
}

