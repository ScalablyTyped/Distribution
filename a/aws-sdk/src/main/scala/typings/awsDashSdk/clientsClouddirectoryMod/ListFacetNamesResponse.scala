package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFacetNamesResponse extends js.Object {
  /**
    * The names of facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[FacetNameList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object ListFacetNamesResponse {
  @scala.inline
  def apply(FacetNames: FacetNameList = null, NextToken: NextToken = null): ListFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (FacetNames != null) __obj.updateDynamic("FacetNames")(FacetNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFacetNamesResponse]
  }
}

