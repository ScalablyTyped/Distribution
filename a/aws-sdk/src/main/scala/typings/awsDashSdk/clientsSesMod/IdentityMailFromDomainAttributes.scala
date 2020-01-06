package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityMailFromDomainAttributes extends js.Object {
  /**
    * The action that Amazon SES takes if it cannot successfully read the required MX record when you send an email. A value of UseDefaultValue indicates that if Amazon SES cannot read the required MX record, it uses amazonses.com (or a subdomain of that) as the MAIL FROM domain. A value of RejectMessage indicates that if Amazon SES cannot read the required MX record, Amazon SES returns a MailFromDomainNotVerified error and does not send the email. The custom MAIL FROM setup states that result in this behavior are Pending, Failed, and TemporaryFailure.
    */
  var BehaviorOnMXFailure: typings.awsDashSdk.clientsSesMod.BehaviorOnMXFailure = js.native
  /**
    * The custom MAIL FROM domain that the identity is configured to use.
    */
  var MailFromDomain: MailFromDomainName = js.native
  /**
    * The state that indicates whether Amazon SES has successfully read the MX record required for custom MAIL FROM domain setup. If the state is Success, Amazon SES uses the specified custom MAIL FROM domain when the verified identity sends an email. All other states indicate that Amazon SES takes the action described by BehaviorOnMXFailure.
    */
  var MailFromDomainStatus: CustomMailFromStatus = js.native
}

object IdentityMailFromDomainAttributes {
  @scala.inline
  def apply(
    BehaviorOnMXFailure: BehaviorOnMXFailure,
    MailFromDomain: MailFromDomainName,
    MailFromDomainStatus: CustomMailFromStatus
  ): IdentityMailFromDomainAttributes = {
    val __obj = js.Dynamic.literal(BehaviorOnMXFailure = BehaviorOnMXFailure.asInstanceOf[js.Any], MailFromDomain = MailFromDomain.asInstanceOf[js.Any], MailFromDomainStatus = MailFromDomainStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityMailFromDomainAttributes]
  }
}

