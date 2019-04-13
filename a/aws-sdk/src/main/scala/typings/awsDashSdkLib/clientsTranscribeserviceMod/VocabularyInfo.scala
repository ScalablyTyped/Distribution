package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VocabularyInfo extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[VocabularyName] = js.undefined
  /**
    * The processing state of the vocabulary. If the state is READY you can use the vocabulary in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[VocabularyState] = js.undefined
}

object VocabularyInfo {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): VocabularyInfo = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName)
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VocabularyInfo]
  }
}

