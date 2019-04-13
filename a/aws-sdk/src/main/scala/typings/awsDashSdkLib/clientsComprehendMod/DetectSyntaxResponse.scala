package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectSyntaxResponse extends js.Object {
  /**
    * A collection of syntax tokens describing the text. For each token, the response provides the text, the token type, where the text begins and ends, and the level of confidence that Amazon Comprehend has that the token is correct. For a list of token types, see how-syntax.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
}

object DetectSyntaxResponse {
  @scala.inline
  def apply(SyntaxTokens: ListOfSyntaxTokens = null): DetectSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    if (SyntaxTokens != null) __obj.updateDynamic("SyntaxTokens")(SyntaxTokens)
    __obj.asInstanceOf[DetectSyntaxResponse]
  }
}

