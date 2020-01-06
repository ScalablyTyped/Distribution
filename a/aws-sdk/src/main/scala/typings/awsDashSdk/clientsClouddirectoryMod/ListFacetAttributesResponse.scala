package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFacetAttributesResponse extends js.Object {
  /**
    * The attributes attached to the facet.
    */
  var Attributes: js.UndefOr[FacetAttributeList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object ListFacetAttributesResponse {
  @scala.inline
  def apply(Attributes: FacetAttributeList = null, NextToken: NextToken = null): ListFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFacetAttributesResponse]
  }
}

