package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectAttributes extends js.Object {
  /**
    * Used to filter the list of object attributes that are associated with a certain facet.
    */
  var FacetFilter: js.UndefOr[SchemaFacet] = js.undefined
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Reference of the object whose attributes need to be listed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchListObjectAttributes {
  @scala.inline
  def apply(
    ObjectReference: ObjectReference,
    FacetFilter: SchemaFacet = null,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): BatchListObjectAttributes = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
    if (FacetFilter != null) __obj.updateDynamic("FacetFilter")(FacetFilter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectAttributes]
  }
}

