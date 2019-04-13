package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResendContactReachabilityEmailRequest extends js.Object {
  /**
    * The name of the domain for which you want Amazon Route 53 to resend a confirmation email to the registrant contact.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
}

object ResendContactReachabilityEmailRequest {
  @scala.inline
  def apply(domainName: DomainName = null): ResendContactReachabilityEmailRequest = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    __obj.asInstanceOf[ResendContactReachabilityEmailRequest]
  }
}

