package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactResponse extends js.Object {
  /**
    * The details of the requested contact.
    */
  var Contact: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Contact] = js.native
}

object GetContactResponse {
  @scala.inline
  def apply(): GetContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactResponse]
  }
  @scala.inline
  implicit class GetContactResponseOps[Self <: GetContactResponse] (val x: Self) extends AnyVal {
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
    def setContact(value: Contact): Self = this.set("Contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("Contact", js.undefined)
  }
  
}

