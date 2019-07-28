package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChangeTokenStatusRequest extends js.Object {
  /**
    * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
}

object GetChangeTokenStatusRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken)
  
    __obj.asInstanceOf[GetChangeTokenStatusRequest]
  }
}

