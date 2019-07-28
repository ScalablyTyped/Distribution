package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestRequest extends js.Object {
  /**
    * Specifies the string for which you want to get suggestions.
    */
  var query: Query
  /**
    * Specifies the maximum number of suggestions to return. 
    */
  var size: js.UndefOr[SuggestionsSize] = js.undefined
  /**
    * Specifies the name of the suggester to use to find suggested matches.
    */
  var suggester: Suggester
}

object SuggestRequest {
  @scala.inline
  def apply(query: Query, suggester: Suggester, size: js.UndefOr[SuggestionsSize] = js.undefined): SuggestRequest = {
    val __obj = js.Dynamic.literal(query = query, suggester = suggester)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SuggestRequest]
  }
}

