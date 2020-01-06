package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypedLinkFacetAttributesResponse extends js.Object {
  /**
    * An ordered set of attributes associate with the typed link.
    */
  var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object ListTypedLinkFacetAttributesResponse {
  @scala.inline
  def apply(Attributes: TypedLinkAttributeDefinitionList = null, NextToken: NextToken = null): ListTypedLinkFacetAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypedLinkFacetAttributesResponse]
  }
}

