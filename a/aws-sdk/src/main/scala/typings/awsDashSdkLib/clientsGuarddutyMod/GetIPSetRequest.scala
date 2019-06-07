package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetRequest extends js.Object {
  /**
    * The unique ID of the detector the ipSet is associated with.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
  /**
    * The unique ID of the ipSet you want to get.
    */
  var IpSetId: String
}

object GetIPSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, IpSetId = IpSetId)
  
    __obj.asInstanceOf[GetIPSetRequest]
  }
}

