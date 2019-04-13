package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateMemberAccountRequest extends js.Object {
  /**
    * The ID of the member account that you want to remove from Amazon Macie.
    */
  var memberAccountId: AWSAccountId
}

object DisassociateMemberAccountRequest {
  @scala.inline
  def apply(memberAccountId: AWSAccountId): DisassociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId)
  
    __obj.asInstanceOf[DisassociateMemberAccountRequest]
  }
}

