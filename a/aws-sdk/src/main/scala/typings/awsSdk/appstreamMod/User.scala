package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The ARN of the user.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The date and time the user was created in the user pool.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies whether the user in the user pool is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The status of the user in the user pool. The status can be one of the following:   UNCONFIRMED – The user is created but not confirmed.   CONFIRMED – The user is confirmed.   ARCHIVED – The user is no longer active.   COMPROMISED – The user is disabled because of a potential security threat.   UNKNOWN – The user status is not known.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.native
}

object User {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType): User = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setFirstName(value: UserAttributeValue): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    @scala.inline
    def setLastName(value: UserAttributeValue): Self = this.set("LastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserName(value: Username): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

