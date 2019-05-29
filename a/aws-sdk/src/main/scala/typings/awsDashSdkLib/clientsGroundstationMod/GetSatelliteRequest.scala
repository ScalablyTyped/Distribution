package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSatelliteRequest extends js.Object {
  /**
    * UUID of a satellite.
    */
  var satelliteId: String
}

object GetSatelliteRequest {
  @scala.inline
  def apply(satelliteId: String): GetSatelliteRequest = {
    val __obj = js.Dynamic.literal(satelliteId = satelliteId)
  
    __obj.asInstanceOf[GetSatelliteRequest]
  }
}

