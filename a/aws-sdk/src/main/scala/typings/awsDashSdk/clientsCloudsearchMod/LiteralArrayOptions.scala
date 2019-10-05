package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralArrayOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[FieldValue] = js.undefined
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
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
}

object LiteralArrayOptions {
  @scala.inline
  def apply(
    DefaultValue: FieldValue = null,
    FacetEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SourceFields: FieldNameCommaList = null
  ): LiteralArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled)
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled)
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled)
    if (SourceFields != null) __obj.updateDynamic("SourceFields")(SourceFields)
    __obj.asInstanceOf[LiteralArrayOptions]
  }
}

