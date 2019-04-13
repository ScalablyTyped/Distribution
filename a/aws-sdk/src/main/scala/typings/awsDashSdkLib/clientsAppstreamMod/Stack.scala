package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  /**
    * The persistent application settings for users of the stack.
    */
  var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined
  /**
    * The ARN of the stack.
    */
  var Arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time the stack was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[String] = js.undefined
  /**
    * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined
  /**
    * The name of the stack.
    */
  var Name: String
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[RedirectURL] = js.undefined
  /**
    * The errors for the stack.
    */
  var StackErrors: js.UndefOr[StackErrors] = js.undefined
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.undefined
}

object Stack {
  @scala.inline
  def apply(
    Name: String,
    ApplicationSettings: ApplicationSettingsResponse = null,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Description: String = null,
    DisplayName: String = null,
    FeedbackURL: FeedbackURL = null,
    RedirectURL: RedirectURL = null,
    StackErrors: StackErrors = null,
    StorageConnectors: StorageConnectorList = null,
    UserSettings: UserSettingList = null
  ): Stack = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ApplicationSettings != null) __obj.updateDynamic("ApplicationSettings")(ApplicationSettings)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (FeedbackURL != null) __obj.updateDynamic("FeedbackURL")(FeedbackURL)
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL)
    if (StackErrors != null) __obj.updateDynamic("StackErrors")(StackErrors)
    if (StorageConnectors != null) __obj.updateDynamic("StorageConnectors")(StorageConnectors)
    if (UserSettings != null) __obj.updateDynamic("UserSettings")(UserSettings)
    __obj.asInstanceOf[Stack]
  }
}

