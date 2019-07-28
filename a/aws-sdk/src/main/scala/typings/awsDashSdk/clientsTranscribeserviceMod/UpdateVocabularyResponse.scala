package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVocabularyResponse extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  /**
    * The date and time that the vocabulary was updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the vocabulary that was updated.
    */
  var VocabularyName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName] = js.undefined
  /**
    * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyState] = js.undefined
}

object UpdateVocabularyResponse {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): UpdateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName)
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyResponse]
  }
}

