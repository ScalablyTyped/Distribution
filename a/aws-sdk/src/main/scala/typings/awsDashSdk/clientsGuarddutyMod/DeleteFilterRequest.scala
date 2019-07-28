package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilterRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * The name of the filter you want to delete.
    */
  var FilterName: String
}

object DeleteFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FilterName = FilterName)
  
    __obj.asInstanceOf[DeleteFilterRequest]
  }
}

