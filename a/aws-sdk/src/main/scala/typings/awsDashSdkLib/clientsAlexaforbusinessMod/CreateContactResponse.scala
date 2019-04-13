package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContactResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var ContactArn: js.UndefOr[Arn] = js.undefined
}

object CreateContactResponse {
  @scala.inline
  def apply(ContactArn: Arn = null): CreateContactResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactArn != null) __obj.updateDynamic("ContactArn")(ContactArn)
    __obj.asInstanceOf[CreateContactResponse]
  }
}

