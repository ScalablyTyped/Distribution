package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFilterRequest extends js.Object {
  /**
    * The unique ID that specifies the detector where you want to delete a filter.
    */
  var DetectorId: __string
  /**
    * The name of the filter.
    */
  var FilterName: __string
}

object DeleteFilterRequest {
  @scala.inline
  def apply(DetectorId: __string, FilterName: __string): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FilterName = FilterName)
  
    __obj.asInstanceOf[DeleteFilterRequest]
  }
}

