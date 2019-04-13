package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGeoLocationResponse extends js.Object {
  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified geolocation code.
    */
  var GeoLocationDetails: awsDashSdkLib.clientsRoute53Mod.GeoLocationDetails
}

object GetGeoLocationResponse {
  @scala.inline
  def apply(GeoLocationDetails: GeoLocationDetails): GetGeoLocationResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetails = GeoLocationDetails)
  
    __obj.asInstanceOf[GetGeoLocationResponse]
  }
}

