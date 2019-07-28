package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectSyntaxItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  /**
    * The syntax tokens for the words in the document, one token for each word.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
}

object BatchDetectSyntaxItemResult {
  @scala.inline
  def apply(Index: js.UndefOr[Integer] = js.undefined, SyntaxTokens: ListOfSyntaxTokens = null): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    if (SyntaxTokens != null) __obj.updateDynamic("SyntaxTokens")(SyntaxTokens)
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
}

