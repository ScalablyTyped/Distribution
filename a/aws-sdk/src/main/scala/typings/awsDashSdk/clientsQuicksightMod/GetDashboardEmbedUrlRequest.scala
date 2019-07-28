package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDashboardEmbedUrlRequest extends js.Object {
  /**
    * AWS account ID that contains the dashboard you are embedding.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The ID for the dashboard, also added to IAM policy
    */
  var DashboardId: String
  /**
    * The authentication method the user uses to sign in (IAM only).
    */
  var IdentityType: typings.awsDashSdk.clientsQuicksightMod.IdentityType
  /**
    * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
    */
  var ResetDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.SessionLifetimeInMinutes] = js.undefined
  /**
    * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
    */
  var UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Amazon QuickSight user's ARN, for use with QUICKSIGHT identity type. You can use this for any of the following:   Amazon QuickSight users in your account (readers, authors, or admins)   AD users   Invited non-federated users   Federated IAM users   Federated IAM role-based sessions  
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}

object GetDashboardEmbedUrlRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: String,
    IdentityType: IdentityType,
    ResetDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
    UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    UserArn: Arn = null
  ): GetDashboardEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, DashboardId = DashboardId, IdentityType = IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetDisabled)) __obj.updateDynamic("ResetDisabled")(ResetDisabled)
    if (!js.isUndefined(SessionLifetimeInMinutes)) __obj.updateDynamic("SessionLifetimeInMinutes")(SessionLifetimeInMinutes)
    if (!js.isUndefined(UndoRedoDisabled)) __obj.updateDynamic("UndoRedoDisabled")(UndoRedoDisabled)
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
  }
}

