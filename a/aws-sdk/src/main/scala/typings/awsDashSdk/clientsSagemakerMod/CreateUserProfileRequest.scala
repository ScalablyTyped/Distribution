package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileRequest extends js.Object {
  /**
    * The ID of the associated Domain.
    */
  var DomainId: typings.awsDashSdk.clientsSagemakerMod.DomainId = js.native
  /**
    * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SingleSignOnUserIdentifier] = js.native
  /**
    * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A name for the UserProfile.
    */
  var UserProfileName: typings.awsDashSdk.clientsSagemakerMod.UserProfileName = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.UserSettings] = js.native
}

object CreateUserProfileRequest {
  @scala.inline
  def apply(
    DomainId: DomainId,
    UserProfileName: UserProfileName,
    SingleSignOnUserIdentifier: SingleSignOnUserIdentifier = null,
    SingleSignOnUserValue: String256 = null,
    Tags: TagList = null,
    UserSettings: UserSettings = null
  ): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    if (SingleSignOnUserIdentifier != null) __obj.updateDynamic("SingleSignOnUserIdentifier")(SingleSignOnUserIdentifier.asInstanceOf[js.Any])
    if (SingleSignOnUserValue != null) __obj.updateDynamic("SingleSignOnUserValue")(SingleSignOnUserValue.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
}

