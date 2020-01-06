package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.DkimAttributes] = js.native
  /**
    * The feedback forwarding configuration for the identity. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  var FeedbackForwardingStatus: js.UndefOr[Enabled] = js.native
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.IdentityType] = js.native
  /**
    * An object that contains information about the Mail-From attributes for the email identity.
    */
  var MailFromAttributes: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.MailFromAttributes] = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}

object GetEmailIdentityResponse {
  @scala.inline
  def apply(
    DkimAttributes: DkimAttributes = null,
    FeedbackForwardingStatus: js.UndefOr[Boolean] = js.undefined,
    IdentityType: IdentityType = null,
    MailFromAttributes: MailFromAttributes = null,
    Tags: TagList = null,
    VerifiedForSendingStatus: js.UndefOr[Boolean] = js.undefined
  ): GetEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (DkimAttributes != null) __obj.updateDynamic("DkimAttributes")(DkimAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(FeedbackForwardingStatus)) __obj.updateDynamic("FeedbackForwardingStatus")(FeedbackForwardingStatus.asInstanceOf[js.Any])
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (MailFromAttributes != null) __obj.updateDynamic("MailFromAttributes")(MailFromAttributes.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(VerifiedForSendingStatus)) __obj.updateDynamic("VerifiedForSendingStatus")(VerifiedForSendingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityResponse]
  }
}

