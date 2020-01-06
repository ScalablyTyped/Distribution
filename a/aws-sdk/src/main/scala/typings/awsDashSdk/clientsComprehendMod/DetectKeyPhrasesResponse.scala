package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectKeyPhrasesResponse extends js.Object {
  /**
    * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the detection. 
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object DetectKeyPhrasesResponse {
  @scala.inline
  def apply(KeyPhrases: ListOfKeyPhrases = null): DetectKeyPhrasesResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyPhrases != null) __obj.updateDynamic("KeyPhrases")(KeyPhrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectKeyPhrasesResponse]
  }
}

