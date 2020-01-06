package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
  /**
    * The action that you want to take if the required MX record isn't found when you send an email. When you set this value to UseDefaultValue, the mail is sent using amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, the Amazon SES API v2 returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMxFailure: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.BehaviorOnMxFailure] = js.native
  /**
    * The verified email identity that you want to set up the custom MAIL FROM domain for.
    */
  var EmailIdentity: Identity = js.native
  /**
    *  The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the following criteria:   It has to be a subdomain of the verified identity.   It can't be used to receive email.   It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.  
    */
  var MailFromDomain: js.UndefOr[MailFromDomainName] = js.native
}

object PutEmailIdentityMailFromAttributesRequest {
  @scala.inline
  def apply(
    EmailIdentity: Identity,
    BehaviorOnMxFailure: BehaviorOnMxFailure = null,
    MailFromDomain: MailFromDomainName = null
  ): PutEmailIdentityMailFromAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    if (BehaviorOnMxFailure != null) __obj.updateDynamic("BehaviorOnMxFailure")(BehaviorOnMxFailure.asInstanceOf[js.Any])
    if (MailFromDomain != null) __obj.updateDynamic("MailFromDomain")(MailFromDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
  }
}

