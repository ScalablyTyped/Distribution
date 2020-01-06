package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGeoMatchSetRequest extends js.Object {
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to get. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId = js.native
}

object GetGeoMatchSetRequest {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId): GetGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGeoMatchSetRequest]
  }
}

