package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLexiconsOutput extends js.Object {
  /**
    * A list of lexicon names and attributes.
    */
  var Lexicons: js.UndefOr[LexiconDescriptionList] = js.undefined
  /**
    * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPollyMod.NextToken] = js.undefined
}

object ListLexiconsOutput {
  @scala.inline
  def apply(Lexicons: LexiconDescriptionList = null, NextToken: NextToken = null): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    if (Lexicons != null) __obj.updateDynamic("Lexicons")(Lexicons)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLexiconsOutput]
  }
}

