package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.undefined
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ApplicationSettings] = js.undefined
  /**
    * The stack attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined
  /**
    * Deletes the storage connectors currently enabled for the stack.
    */
  var DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Description] = js.undefined
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.DisplayName] = js.undefined
  /**
    * The URL that users are redirected to after they choose the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.FeedbackURL] = js.undefined
  /**
    * The name of the stack.
    */
  var Name: String
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.RedirectURL] = js.undefined
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
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
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StorageConnectors: StorageConnectorList = null,
    UserSettings: UserSettingList = null
  ): UpdateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints)
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings)
    if (AttributesToDelete != null) __obj.updateDynamic("AttributesToDelete")(AttributesToDelete)
    if (!js.isUndefined(DeleteStorageConnectors)) __obj.updateDynamic("DeleteStorageConnectors")(DeleteStorageConnectors)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL)
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL)
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors)
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings)
    __obj.asInstanceOf[UpdateStackRequest]
  }
}

