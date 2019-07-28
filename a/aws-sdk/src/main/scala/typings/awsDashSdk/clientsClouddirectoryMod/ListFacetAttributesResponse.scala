package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFacetAttributesResponse extends js.Object {
  /**
    * The attributes attached to the facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object ListFacetAttributesResponse {
  @scala.inline
  def apply(Attributes: FacetAttributeList = null, NextToken: NextToken = null): ListFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacetAttributesResponse]
  }
}

