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
  def apply(): CreateContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactResponse]
  }
  @scala.inline
  implicit class CreateContactResponseOps[Self <: CreateContactResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContactArn(value: Arn): Self = this.set("ContactArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactArn: Self = this.set("ContactArn", js.undefined)
  }
  
}

