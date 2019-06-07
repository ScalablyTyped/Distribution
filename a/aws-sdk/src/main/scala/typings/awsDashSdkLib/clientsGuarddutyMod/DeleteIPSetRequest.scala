package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIPSetRequest extends js.Object {
  /**
    * The unique ID of the detector the ipSet is associated with.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
  /**
    * The unique ID of the ipSet you want to delete.
    */
  var IpSetId: String
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, IpSetId = IpSetId)
  
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
}

