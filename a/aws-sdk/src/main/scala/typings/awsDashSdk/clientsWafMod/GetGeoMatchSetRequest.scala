package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGeoMatchSetRequest extends js.Object {
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to get. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
}

object GetGeoMatchSetRequest {
  @scala.inline
  def apply(GeoMatchSetId: ResourceId): GetGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId)
  
    __obj.asInstanceOf[GetGeoMatchSetRequest]
  }
}

