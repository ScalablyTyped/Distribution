package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityMailFromDomainRequest extends js.Object {
  /**
    * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. If you choose UseDefaultValue, Amazon SES will use amazonses.com (or a subdomain of that) as the MAIL FROM domain. If you choose RejectMessage, Amazon SES will return a MailFromDomainNotVerified error and not send the email. The action specified in BehaviorOnMXFailure is taken when the custom MAIL FROM domain setup is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMXFailure: js.UndefOr[typings.awsDashSdk.clientsSesMod.BehaviorOnMXFailure] = js.native
  /**
    * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
    */
  var Identity: typings.awsDashSdk.clientsSesMod.Identity = js.native
  /**
    * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination of email feedback forwarding (for more information, see the Amazon SES Developer Guide), and 3) not be used to receive emails. A value of null disables the custom MAIL FROM setting for the identity.
    */
  var MailFromDomain: js.UndefOr[MailFromDomainName] = js.native
}

object SetIdentityMailFromDomainRequest {
  @scala.inline
  def apply(
    Identity: Identity,
    BehaviorOnMXFailure: BehaviorOnMXFailure = null,
    MailFromDomain: MailFromDomainName = null
  ): SetIdentityMailFromDomainRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any])
    if (BehaviorOnMXFailure != null) __obj.updateDynamic("BehaviorOnMXFailure")(BehaviorOnMXFailure.asInstanceOf[js.Any])
    if (MailFromDomain != null) __obj.updateDynamic("MailFromDomain")(MailFromDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityMailFromDomainRequest]
  }
}

