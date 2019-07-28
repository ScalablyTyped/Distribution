package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFilterRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * The name of the filter you want to get.
    */
  var FilterName: String
}

object GetFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): GetFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FilterName = FilterName)
  
    __obj.asInstanceOf[GetFilterRequest]
  }
}

