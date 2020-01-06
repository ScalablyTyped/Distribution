package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ApplicationSettings] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Description] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DisplayName] = js.native
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
    */
  var EmbedHostDomains: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.EmbedHostDomains] = js.native
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.FeedbackURL] = js.native
  /**
    * The name of the stack.
    */
  var Name: typings.awsDashSdk.clientsAppstreamMod.Name = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.RedirectURL] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Tags] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object CreateStackRequest {
  @scala.inline
  def apply(
    Name: Name,
    AccessEndpoints: AccessEndpointList = null,
    ApplicationSettings: ApplicationSettings = null,
    Description: Description = null,
    DisplayName: DisplayName = null,
    EmbedHostDomains: EmbedHostDomains = null,
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StorageConnectors: StorageConnectorList = null,
    Tags: Tags = null,
    UserSettings: UserSettingList = null
  ): CreateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints.asInstanceOf[js.Any])
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmbedHostDomains != null) __obj.updateDynamic("EmbedHostDomains")(EmbedHostDomains.asInstanceOf[js.Any])
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL.asInstanceOf[js.Any])
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL.asInstanceOf[js.Any])
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackRequest]
  }
}

