package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactRequest extends js.Object {
  /**
    * The ARN of the contact for which to request details.
    */
  var ContactArn: Arn = js.native
}

object GetContactRequest {
  @scala.inline
  def apply(ContactArn: Arn): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetContactRequest]
  }
}

