package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResendContactReachabilityEmailResponse extends js.Object {
  /**
    * The domain name for which you requested a confirmation email.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  /**
    * The email address for the registrant contact at the time that we sent the verification email.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  /**
    *  True if the email address for the registrant contact has already been verified, and false otherwise. If the email address has already been verified, we don't send another confirmation email.
    */
  var isAlreadyVerified: js.UndefOr[Boolean] = js.undefined
}

object ResendContactReachabilityEmailResponse {
  @scala.inline
  def apply(
    domainName: DomainName = null,
    emailAddress: Email = null,
    isAlreadyVerified: js.UndefOr[scala.Boolean] = js.undefined
  ): ResendContactReachabilityEmailResponse = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (!js.isUndefined(isAlreadyVerified)) __obj.updateDynamic("isAlreadyVerified")(isAlreadyVerified)
    __obj.asInstanceOf[ResendContactReachabilityEmailResponse]
  }
}

