package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContactRequest extends js.Object {
  /**
    * The ARN of the contact to delete.
    */
  var ContactArn: Arn = js.native
}

object DeleteContactRequest {
  @scala.inline
  def apply(ContactArn: Arn): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactRequest]
  }
}

