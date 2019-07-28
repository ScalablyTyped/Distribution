package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFacetResponse extends js.Object {
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.Facet] = js.undefined
}

object GetFacetResponse {
  @scala.inline
  def apply(Facet: Facet = null): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    if (Facet != null) __obj.updateDynamic("Facet")(Facet)
    __obj.asInstanceOf[GetFacetResponse]
  }
}

