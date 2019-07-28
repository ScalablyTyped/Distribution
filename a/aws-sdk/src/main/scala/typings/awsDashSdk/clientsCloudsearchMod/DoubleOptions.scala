package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
    */
  var DefaultValue: js.UndefOr[Double] = js.undefined
  /**
    * Whether facet information can be returned for the field.
    */
  var FacetEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the contents of the field are searchable.
    */
  var SearchEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the source field to map to the field. 
    */
  var SourceField: js.UndefOr[FieldName] = js.undefined
}

object DoubleOptions {
  @scala.inline
  def apply(
    DefaultValue: js.UndefOr[Double] = js.undefined,
    FacetEnabled: js.UndefOr[Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[Boolean] = js.undefined,
    SortEnabled: js.UndefOr[Boolean] = js.undefined,
    SourceField: FieldName = null
  ): DoubleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefaultValue)) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled)
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled)
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled)
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled)
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField)
    __obj.asInstanceOf[DoubleOptions]
  }
}

