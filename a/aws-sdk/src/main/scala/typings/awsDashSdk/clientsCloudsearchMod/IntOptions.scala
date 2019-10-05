package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
    */
  var DefaultValue: js.UndefOr[Long] = js.undefined
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

object IntOptions {
  @scala.inline
  def apply(
    DefaultValue: Int | scala.Double = null,
    FacetEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SortEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SourceField: FieldName = null
  ): IntOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled)
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled)
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled)
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled)
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField)
    __obj.asInstanceOf[IntOptions]
  }
}

