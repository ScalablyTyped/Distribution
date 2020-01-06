package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyResponse extends js.Object {
  /**
    * The S3 location where the vocabulary is stored. Use this URI to get the contents of the vocabulary. The URI is available for a limited time.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  /**
    * If the VocabularyState field is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.FailureReason] = js.native
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was last modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the vocabulary to return.
    */
  var VocabularyName: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary.
    */
  var VocabularyState: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyState] = js.native
}

object GetVocabularyResponse {
  @scala.inline
  def apply(
    DownloadUri: Uri = null,
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    LastModifiedTime: DateTime = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): GetVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (DownloadUri != null) __obj.updateDynamic("DownloadUri")(DownloadUri.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyResponse]
  }
}

