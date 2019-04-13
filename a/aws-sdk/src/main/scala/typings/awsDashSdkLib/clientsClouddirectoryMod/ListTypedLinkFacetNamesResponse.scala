package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypedLinkFacetNamesResponse extends js.Object {
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListTypedLinkFacetNamesResponse {
  @scala.inline
  def apply(FacetNames: TypedLinkNameList = null, NextToken: NextToken = null): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (FacetNames != null) __obj.updateDynamic("FacetNames")(FacetNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
}

