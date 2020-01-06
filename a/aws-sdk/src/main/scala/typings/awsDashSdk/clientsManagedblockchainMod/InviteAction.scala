package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAction extends js.Object {
  /**
    * The AWS account ID to invite.
    */
  var Principal: PrincipalString = js.native
}

object InviteAction {
  @scala.inline
  def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InviteAction]
  }
}

