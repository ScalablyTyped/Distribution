package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSearchSuggestionsRequest extends js.Object {
  /**
    * The name of the Amazon SageMaker resource to Search for. The only valid Resource value is TrainingJob.
    */
  var Resource: ResourceType
  /**
    * Limits the property names that are included in the response.
    */
  var SuggestionQuery: js.UndefOr[SuggestionQuery] = js.undefined
}

object GetSearchSuggestionsRequest {
  @scala.inline
  def apply(Resource: ResourceType, SuggestionQuery: SuggestionQuery = null): GetSearchSuggestionsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    if (SuggestionQuery != null) __obj.updateDynamic("SuggestionQuery")(SuggestionQuery)
    __obj.asInstanceOf[GetSearchSuggestionsRequest]
  }
}

