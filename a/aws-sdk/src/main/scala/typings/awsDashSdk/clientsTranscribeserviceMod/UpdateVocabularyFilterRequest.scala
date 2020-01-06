package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVocabularyFilterRequest extends js.Object {
  /**
    * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. The specified file must be less than 50 KB of UTF-8 characters. If you provide the location of a list of words in the VocabularyFilterFileUri parameter, you can't use the Words parameter.
    */
  var VocabularyFilterFileUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the vocabulary filter to update.
    */
  var VocabularyFilterName: typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyFilterName = js.native
  /**
    * The words to use in the vocabulary filter. Only use characters from the character set defined for custom vocabularies. For a list of character sets, see Character Sets for Custom Vocabularies. If you provide a list of words in the Words parameter, you can't use the VocabularyFilterFileUri parameter.
    */
  var Words: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.Words] = js.native
}

object UpdateVocabularyFilterRequest {
  @scala.inline
  def apply(
    VocabularyFilterName: VocabularyFilterName,
    VocabularyFilterFileUri: Uri = null,
    Words: Words = null
  ): UpdateVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    if (VocabularyFilterFileUri != null) __obj.updateDynamic("VocabularyFilterFileUri")(VocabularyFilterFileUri.asInstanceOf[js.Any])
    if (Words != null) __obj.updateDynamic("Words")(Words.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyFilterRequest]
  }
}

