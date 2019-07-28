package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWebACLRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * The WebACLId of the WebACL that you want to delete. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}

object DeleteWebACLRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, WebACLId: ResourceId): DeleteWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, WebACLId = WebACLId)
  
    __obj.asInstanceOf[DeleteWebACLRequest]
  }
}

