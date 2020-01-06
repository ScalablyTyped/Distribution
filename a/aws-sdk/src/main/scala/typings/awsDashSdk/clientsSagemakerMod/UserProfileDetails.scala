package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileDetails extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainId] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserProfileName] = js.native
}

object UserProfileDetails {
  @scala.inline
  def apply(
    CreationTime: CreationTime = null,
    DomainId: DomainId = null,
    LastModifiedTime: LastModifiedTime = null,
    Status: UserProfileStatus = null,
    UserProfileName: UserProfileName = null
  ): UserProfileDetails = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfileDetails]
  }
}

