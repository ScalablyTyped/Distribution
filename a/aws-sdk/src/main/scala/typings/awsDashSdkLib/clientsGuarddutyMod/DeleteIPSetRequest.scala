package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIPSetRequest extends js.Object {
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to delete.
    */
  var DetectorId: __string
  /**
    * The unique ID that specifies the IPSet that you want to delete.
    */
  var IpSetId: __string
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(DetectorId: __string, IpSetId: __string): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, IpSetId = IpSetId)
  
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
}

