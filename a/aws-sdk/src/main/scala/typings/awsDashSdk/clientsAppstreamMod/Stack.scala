package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints. 
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of the stack.
    */
  var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.native
  /**
    * The ARN of the stack.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Arn] = js.native
  /**
    * The time the stack was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
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
  var Name: String = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.RedirectURL] = js.native
  /**
    * The errors for the stack.
    */
  var StackErrors: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.StackErrors] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object Stack {
  @scala.inline
  def apply(
    Name: String,
    AccessEndpoints: AccessEndpointList = null,
    ApplicationSettings: ApplicationSettingsResponse = null,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisplayName: String = null,
    EmbedHostDomains: EmbedHostDomains = null,
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StackErrors: StackErrors = null,
    StorageConnectors: StorageConnectorList = null,
    UserSettings: UserSettingList = null
  ): Stack = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AccessEndpoints != null) __obj.updateDynamic("AccessEndpoints")(AccessEndpoints.asInstanceOf[js.Any])
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmbedHostDomains != null) __obj.updateDynamic("EmbedHostDomains")(EmbedHostDomains.asInstanceOf[js.Any])
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL.asInstanceOf[js.Any])
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL.asInstanceOf[js.Any])
    if (StackErrors != null) __obj.updateDynamic("StackErrors")(StackErrors.asInstanceOf[js.Any])
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors.asInstanceOf[js.Any])
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
}

