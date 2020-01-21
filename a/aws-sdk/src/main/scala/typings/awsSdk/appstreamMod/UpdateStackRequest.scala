package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsSdk.appstreamMod.ApplicationSettings] = js.native
  /**
    * The stack attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[StackAttributes] = js.native
  /**
    * Deletes the storage connectors currently enabled for the stack.
    */
  var DeleteStorageConnectors: js.UndefOr[Boolean] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsSdk.appstreamMod.Description] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.appstreamMod.DisplayName] = js.native
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
    */
  var EmbedHostDomains: js.UndefOr[typings.awsSdk.appstreamMod.EmbedHostDomains] = js.native
  /**
    * The URL that users are redirected to after they choose the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsSdk.appstreamMod.FeedbackURL] = js.native
  /**
    * The name of the stack.
    */
  var Name: String = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsSdk.appstreamMod.RedirectURL] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object UpdateStackRequest {
  @scala.inline
  def apply(
    Name: String,
    AccessEndpoints: AccessEndpointList = null,
    ApplicationSettings: ApplicationSettings = null,
    AttributesToDelete: StackAttributes = null,
    DeleteStorageConnectors: js.UndefOr[scala.Boolean] = js.undefined,
    Description: Description = null,
    DisplayName: DisplayName = null,
    EmbedHostDomains: EmbedHostDomains = null,
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StorageConnectors: StorageConnectorList = null,
    UserSettings: UserSettingList = null
  ): UpdateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints.asInstanceOf[js.Any])
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings.asInstanceOf[js.Any])
    if (AttributesToDelete != null) __obj.updateDynamic("AttributesToDelete")(AttributesToDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteStorageConnectors)) __obj.updateDynamic("DeleteStorageConnectors")(DeleteStorageConnectors.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmbedHostDomains != null) __obj.updateDynamic("EmbedHostDomains")(EmbedHostDomains.asInstanceOf[js.Any])
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL.asInstanceOf[js.Any])
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL.asInstanceOf[js.Any])
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackRequest]
  }
}

