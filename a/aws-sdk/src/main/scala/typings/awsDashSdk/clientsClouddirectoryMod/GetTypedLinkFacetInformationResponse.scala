package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTypedLinkFacetInformationResponse extends js.Object {
  /**
    * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
    */
  var IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.native
}

object GetTypedLinkFacetInformationResponse {
  @scala.inline
  def apply(IdentityAttributeOrder: AttributeNameList = null): GetTypedLinkFacetInformationResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityAttributeOrder != null) __obj.updateDynamic("IdentityAttributeOrder")(IdentityAttributeOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTypedLinkFacetInformationResponse]
  }
}

