package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFilterRequest extends js.Object {
  /**
    * The detector ID that specifies the GuardDuty service where you want to list the details of the specified filter.
    */
  var DetectorId: __string
  /**
    * The name of the filter whose details you want to get.
    */
  var FilterName: __string
}

object GetFilterRequest {
  @scala.inline
  def apply(DetectorId: __string, FilterName: __string): GetFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FilterName = FilterName)
  
    __obj.asInstanceOf[GetFilterRequest]
  }
}

