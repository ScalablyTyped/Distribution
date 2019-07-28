package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackRequest extends js.Object {
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ApplicationSettings] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Description] = js.undefined
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DisplayName] = js.undefined
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.FeedbackURL] = js.undefined
  /**
    * The name of the stack.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.RedirectURL] = js.undefined
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  /**
    * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Tags] = js.undefined
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
}

object CreateStackRequest {
  @scala.inline
  def apply(
    Name: Name,
    ApplicationSettings: ApplicationSettings = null,
    Description: Description = null,
    DisplayName: DisplayName = null,
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StorageConnectors: StorageConnectorList = null,
    Tags: Tags = null,
    UserSettings: UserSettingList = null
  ): CreateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL)
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL)
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings)
    __obj.asInstanceOf[CreateStackRequest]
  }
}

