package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContactRequest extends js.Object {
  /**
    * The ARN of the contact to delete.
    */
  var ContactArn: Arn
}

object DeleteContactRequest {
  @scala.inline
  def apply(ContactArn: Arn): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn)
  
    __obj.asInstanceOf[DeleteContactRequest]
  }
}

