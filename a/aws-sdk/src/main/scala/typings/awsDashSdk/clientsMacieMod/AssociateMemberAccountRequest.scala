package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateMemberAccountRequest extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  var memberAccountId: AWSAccountId = js.native
}

object AssociateMemberAccountRequest {
  @scala.inline
  def apply(memberAccountId: AWSAccountId): AssociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateMemberAccountRequest]
  }
}

