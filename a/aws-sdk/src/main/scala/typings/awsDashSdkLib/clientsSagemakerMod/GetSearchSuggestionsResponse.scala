package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSearchSuggestionsResponse extends js.Object {
  /**
    * A list of property names for a Resource that match a SuggestionQuery.
    */
  var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.undefined
}

object GetSearchSuggestionsResponse {
  @scala.inline
  def apply(PropertyNameSuggestions: PropertyNameSuggestionList = null): GetSearchSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    if (PropertyNameSuggestions != null) __obj.updateDynamic("PropertyNameSuggestions")(PropertyNameSuggestions)
    __obj.asInstanceOf[GetSearchSuggestionsResponse]
  }
}

