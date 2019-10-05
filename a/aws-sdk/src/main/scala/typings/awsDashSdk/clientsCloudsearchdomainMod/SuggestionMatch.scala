package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionMatch extends js.Object {
  /**
    * The document ID of the suggested document.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The relevance score of a suggested match.
    */
  var score: js.UndefOr[Long] = js.undefined
  /**
    * The string that matches the query string specified in the SuggestRequest. 
    */
  var suggestion: js.UndefOr[String] = js.undefined
}

object SuggestionMatch {
  @scala.inline
  def apply(id: String = null, score: Int | scala.Double = null, suggestion: String = null): SuggestionMatch = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion)
    __obj.asInstanceOf[SuggestionMatch]
  }
}

