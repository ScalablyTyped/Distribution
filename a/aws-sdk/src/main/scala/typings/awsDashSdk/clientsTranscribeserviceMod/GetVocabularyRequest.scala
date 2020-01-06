package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary to return information about. The name is case-sensitive.
    */
  var VocabularyName: typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName = js.native
}

object GetVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVocabularyRequest]
  }
}

