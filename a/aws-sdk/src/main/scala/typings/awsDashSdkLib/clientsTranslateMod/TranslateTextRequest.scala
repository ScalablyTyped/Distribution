package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateTextRequest extends js.Object {
  /**
    * The language code for the language of the source text. The language must be a language supported by Amazon Translate.  To have Amazon Translate determine the source language of your text, you can specify auto in the SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon Comprehend to determine the source language.
    */
  var SourceLanguageCode: LanguageCodeString
  /**
    * The language code requested for the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCode: LanguageCodeString
  /**
    * The TerminologyNames list that is taken as input to the TranslateText request. This has a minimum length of 0 and a maximum length of 1.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
  /**
    * The text to translate. The text string can be a maximum of 5,000 bytes long. Depending on your character set, this may be fewer than 5,000 characters.
    */
  var Text: BoundedLengthString
}

object TranslateTextRequest {
  @scala.inline
  def apply(
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCode: LanguageCodeString,
    Text: BoundedLengthString,
    TerminologyNames: ResourceNameList = null
  ): TranslateTextRequest = {
    val __obj = js.Dynamic.literal(SourceLanguageCode = SourceLanguageCode, TargetLanguageCode = TargetLanguageCode, Text = Text)
    if (TerminologyNames != null) __obj.updateDynamic("TerminologyNames")(TerminologyNames)
    __obj.asInstanceOf[TranslateTextRequest]
  }
}

