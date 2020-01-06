package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  /**
    * Determines whether the field is returned in the query response. The default is true.
    */
  var Displayable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is false .
    */
  var Facetable: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is true for string fields and false for number and date fields.
    */
  var Searchable: js.UndefOr[Boolean] = js.native
}

object Search {
  @scala.inline
  def apply(
    Displayable: js.UndefOr[scala.Boolean] = js.undefined,
    Facetable: js.UndefOr[scala.Boolean] = js.undefined,
    Searchable: js.UndefOr[scala.Boolean] = js.undefined
  ): Search = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Displayable)) __obj.updateDynamic("Displayable")(Displayable.asInstanceOf[js.Any])
    if (!js.isUndefined(Facetable)) __obj.updateDynamic("Facetable")(Facetable.asInstanceOf[js.Any])
    if (!js.isUndefined(Searchable)) __obj.updateDynamic("Searchable")(Searchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
}

