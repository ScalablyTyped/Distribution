package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserData extends js.Object {
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Email] = js.native
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.EnrollmentId] = js.native
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.EnrollmentStatus] = js.native
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[user_FirstName] = js.native
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[user_LastName] = js.native
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object UserData {
  @scala.inline
  def apply(
    Email: Email = null,
    EnrollmentId: EnrollmentId = null,
    EnrollmentStatus: EnrollmentStatus = null,
    FirstName: user_FirstName = null,
    LastName: user_LastName = null,
    UserArn: Arn = null
  ): UserData = {
    val __obj = js.Dynamic.literal()
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnrollmentId != null) __obj.updateDynamic("EnrollmentId")(EnrollmentId.asInstanceOf[js.Any])
    if (EnrollmentStatus != null) __obj.updateDynamic("EnrollmentStatus")(EnrollmentStatus.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

