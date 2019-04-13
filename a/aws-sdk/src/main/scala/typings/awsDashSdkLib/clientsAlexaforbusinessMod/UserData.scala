package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[Email] = js.undefined
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[EnrollmentStatus] = js.undefined
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[user_FirstName] = js.undefined
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[user_LastName] = js.undefined
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
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
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (EnrollmentId != null) __obj.updateDynamic("EnrollmentId")(EnrollmentId)
    if (EnrollmentStatus != null) __obj.updateDynamic("EnrollmentStatus")(EnrollmentStatus.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[UserData]
  }
}

