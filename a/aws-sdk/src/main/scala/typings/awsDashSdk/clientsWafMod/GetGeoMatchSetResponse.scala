package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGeoMatchSetResponse extends js.Object {
  /**
    * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
    */
  var GeoMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.GeoMatchSet] = js.undefined
}

object GetGeoMatchSetResponse {
  @scala.inline
  def apply(GeoMatchSet: GeoMatchSet = null): GetGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (GeoMatchSet != null) __obj.updateDynamic("GeoMatchSet")(GeoMatchSet)
    __obj.asInstanceOf[GetGeoMatchSetResponse]
  }
}

