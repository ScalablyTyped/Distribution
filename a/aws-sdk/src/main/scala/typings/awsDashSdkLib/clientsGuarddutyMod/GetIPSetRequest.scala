package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetRequest extends js.Object {
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to retrieve.
    */
  var DetectorId: __string
  /**
    * The unique ID that specifies the IPSet that you want to describe.
    */
  var IpSetId: __string
}

object GetIPSetRequest {
  @scala.inline
  def apply(DetectorId: __string, IpSetId: __string): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, IpSetId = IpSetId)
  
    __obj.asInstanceOf[GetIPSetRequest]
  }
}

