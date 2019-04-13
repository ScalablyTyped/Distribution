package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendCustomVerificationEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendCustomVerificationEmail operation.
    */
  var MessageId: js.UndefOr[MessageId] = js.undefined
}

object SendCustomVerificationEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId = null): SendCustomVerificationEmailResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    __obj.asInstanceOf[SendCustomVerificationEmailResponse]
  }
}

