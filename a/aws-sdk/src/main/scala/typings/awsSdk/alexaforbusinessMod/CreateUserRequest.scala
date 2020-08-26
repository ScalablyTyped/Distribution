package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The email address for the user.
    */
  var Email: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Email] = js.native
  /**
    * The first name for the user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.native
  /**
    * The last name for the user.
    */
  var LastName: js.UndefOr[userLastName] = js.native
  /**
    * The tags for the user.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ARN for the user.
    */
  var UserId: userUserId = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(UserId: userUserId): CreateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
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
    def setUserId(value: userUserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setFirstName(value: userFirstName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    @scala.inline
    def setLastName(value: userLastName): Self = this.set("LastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

