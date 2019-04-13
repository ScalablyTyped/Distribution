package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVocabularyResponse extends js.Object {
  /**
    * If the VocabularyState field is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * The date and time that the vocabulary was created.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
  /**
    * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
}

object CreateVocabularyResponse {
  @scala.inline
  def apply(
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): CreateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName)
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyResponse]
  }
}

