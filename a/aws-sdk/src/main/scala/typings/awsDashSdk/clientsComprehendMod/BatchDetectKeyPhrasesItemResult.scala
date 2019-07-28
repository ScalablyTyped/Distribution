package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectKeyPhrasesItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  /**
    * One or more KeyPhrase objects, one for each key phrase detected in the document.
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
}

object BatchDetectKeyPhrasesItemResult {
  @scala.inline
  def apply(Index: js.UndefOr[Integer] = js.undefined, KeyPhrases: ListOfKeyPhrases = null): BatchDetectKeyPhrasesItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    if (KeyPhrases != null) __obj.updateDynamic("KeyPhrases")(KeyPhrases)
    __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
  }
}

