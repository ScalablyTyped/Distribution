package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFacetNamesResponse extends js.Object {
  /**
    * The names of facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[FacetNameList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object ListFacetNamesResponse {
  @scala.inline
  def apply(FacetNames: FacetNameList = null, NextToken: NextToken = null): ListFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (FacetNames != null) __obj.updateDynamic("FacetNames")(FacetNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacetNamesResponse]
  }
}

