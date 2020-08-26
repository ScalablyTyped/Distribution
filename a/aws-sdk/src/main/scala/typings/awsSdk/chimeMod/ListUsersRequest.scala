package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Optional. The user email address used to filter results. Maximum 1.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.native
}

object ListUsersRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
  @scala.inline
  implicit class ListUsersRequestOps[Self <: ListUsersRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ProfileServiceMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserEmail(value: EmailAddress): Self = this.set("UserEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmail: Self = this.set("UserEmail", js.undefined)
    @scala.inline
    def setUserType(value: UserType): Self = this.set("UserType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserType: Self = this.set("UserType", js.undefined)
  }
  
}

