package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectKeyPhrasesItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more KeyPhrase objects, one for each key phrase detected in the document.
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object BatchDetectKeyPhrasesItemResult {
  @scala.inline
  def apply(Index: Int | scala.Double = null, KeyPhrases: ListOfKeyPhrases = null): BatchDetectKeyPhrasesItemResult = {
    val __obj = js.Dynamic.literal()
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    if (KeyPhrases != null) __obj.updateDynamic("KeyPhrases")(KeyPhrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
  }
}

