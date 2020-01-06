package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileResponse extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CreationTime] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DomainId] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.native
  /**
    * The homa Amazon Elastic File System (EFS) Uid.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.native
  /**
    * The SSO user identifier.
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SingleSignOnUserIdentifier] = js.native
  /**
    * The SSO user value.
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserProfileArn] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserProfileName] = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserSettings] = js.native
}

object DescribeUserProfileResponse {
  @scala.inline
  def apply(
    CreationTime: CreationTime = null,
    DomainId: DomainId = null,
    FailureReason: FailureReason = null,
    HomeEfsFileSystemUid: EfsUid = null,
    LastModifiedTime: LastModifiedTime = null,
    SingleSignOnUserIdentifier: SingleSignOnUserIdentifier = null,
    SingleSignOnUserValue: String256 = null,
    Status: UserProfileStatus = null,
    UserProfileArn: UserProfileArn = null,
    UserProfileName: UserProfileName = null,
    UserSettings: UserSettings = null
  ): DescribeUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HomeEfsFileSystemUid != null) __obj.updateDynamic("HomeEfsFileSystemUid")(HomeEfsFileSystemUid.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (SingleSignOnUserIdentifier != null) __obj.updateDynamic("SingleSignOnUserIdentifier")(SingleSignOnUserIdentifier.asInstanceOf[js.Any])
    if (SingleSignOnUserValue != null) __obj.updateDynamic("SingleSignOnUserValue")(SingleSignOnUserValue.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserProfileArn != null) __obj.updateDynamic("UserProfileArn")(UserProfileArn.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileResponse]
  }
}

