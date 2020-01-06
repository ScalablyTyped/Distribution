package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardEmbedUrlRequest extends js.Object {
  /**
    * The ID for the AWS account that contains the dashboard that you're embedding.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The authentication method that the user uses to sign in.
    */
  var IdentityType: typings.awsDashSdk.clientsQuicksightMod.IdentityType = js.native
  /**
    * Remove the reset button on the embedded dashboard. The default is FALSE, which enables the reset button.
    */
  var ResetDisabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * How many minutes the session is valid. The session lifetime must be 15-600 minutes.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.SessionLifetimeInMinutes] = js.native
  /**
    * Remove the undo/redo button on the embedded dashboard. The default is FALSE, which enables the undo/redo button.
    */
  var UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * The Amazon QuickSight user's Amazon Resource Name (ARN), for use with QUICKSIGHT identity type. You can use this for any Amazon QuickSight users in your account (readers, authors, or admins) authenticated as one of the following:   Active Directory (AD) users or group members   Invited nonfederated users   IAM users and IAM role-based sessions authenticated through Federated Single Sign-On using SAML, OpenID Connect, or IAM federation.  
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object GetDashboardEmbedUrlRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    IdentityType: IdentityType,
    ResetDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    SessionLifetimeInMinutes: Int | scala.Double = null,
    UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    UserArn: Arn = null
  ): GetDashboardEmbedUrlRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(ResetDisabled)) __obj.updateDynamic("ResetDisabled")(ResetDisabled.asInstanceOf[js.Any])
    if (SessionLifetimeInMinutes != null) __obj.updateDynamic("SessionLifetimeInMinutes")(SessionLifetimeInMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(UndoRedoDisabled)) __obj.updateDynamic("UndoRedoDisabled")(UndoRedoDisabled.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
  }
}

