package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContactResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var ContactArn: js.UndefOr[Arn] = js.native
}

object CreateContactResponse {
  @scala.inline
  def apply(ContactArn: Arn = null): CreateContactResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactArn != null) __obj.updateDynamic("ContactArn")(ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactResponse]
  }
}

