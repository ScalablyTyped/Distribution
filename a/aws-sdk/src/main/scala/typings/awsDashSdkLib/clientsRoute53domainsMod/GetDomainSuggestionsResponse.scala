package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainSuggestionsResponse extends js.Object {
  /**
    * A list of possible domain names. If you specified true for OnlyAvailable in the request, the list contains only domains that are available for registration.
    */
  var SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.undefined
}

object GetDomainSuggestionsResponse {
  @scala.inline
  def apply(SuggestionsList: DomainSuggestionsList = null): GetDomainSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    if (SuggestionsList != null) __obj.updateDynamic("SuggestionsList")(SuggestionsList)
    __obj.asInstanceOf[GetDomainSuggestionsResponse]
  }
}

