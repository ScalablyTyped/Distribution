package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary to return information about. The name is case-sensitive.
    */
  var VocabularyName: awsDashSdkLib.clientsTranscribeserviceMod.VocabularyName
}

object GetVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName)
  
    __obj.asInstanceOf[GetVocabularyRequest]
  }
}

