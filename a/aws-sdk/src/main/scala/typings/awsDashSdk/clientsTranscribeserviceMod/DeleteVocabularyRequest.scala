package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary to delete. 
    */
  var VocabularyName: typings.awsDashSdk.clientsTranscribeserviceMod.VocabularyName
}

object DeleteVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): DeleteVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName)
  
    __obj.asInstanceOf[DeleteVocabularyRequest]
  }
}

