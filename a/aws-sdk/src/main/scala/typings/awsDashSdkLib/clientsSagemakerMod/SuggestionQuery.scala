package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionQuery extends js.Object {
  /**
    * A type of SuggestionQuery. Defines a property name hint. Only property names that match the specified hint are included in the response.
    */
  var PropertyNameQuery: js.UndefOr[PropertyNameQuery] = js.undefined
}

object SuggestionQuery {
  @scala.inline
  def apply(PropertyNameQuery: PropertyNameQuery = null): SuggestionQuery = {
    val __obj = js.Dynamic.literal()
    if (PropertyNameQuery != null) __obj.updateDynamic("PropertyNameQuery")(PropertyNameQuery)
    __obj.asInstanceOf[SuggestionQuery]
  }
}

