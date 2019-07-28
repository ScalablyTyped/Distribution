package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIPSetResponse extends js.Object {
  /**
    * The ID of the IPSet resource.
    */
  var IpSetId: String
}

object CreateIPSetResponse {
  @scala.inline
  def apply(IpSetId: String): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal(IpSetId = IpSetId)
  
    __obj.asInstanceOf[CreateIPSetResponse]
  }
}

