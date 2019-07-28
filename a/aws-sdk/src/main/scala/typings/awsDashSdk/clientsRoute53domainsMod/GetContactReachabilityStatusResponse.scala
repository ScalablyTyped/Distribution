package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContactReachabilityStatusResponse extends js.Object {
  /**
    * The domain name for which you requested the reachability status.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  /**
    * Whether the registrant contact has responded. Values include the following:  PENDING  We sent the confirmation email and haven't received a response yet.  DONE  We sent the email and got confirmation from the registrant contact.  EXPIRED  The time limit expired before the registrant contact responded.  
    */
  var status: js.UndefOr[ReachabilityStatus] = js.undefined
}

object GetContactReachabilityStatusResponse {
  @scala.inline
  def apply(domainName: DomainName = null, status: ReachabilityStatus = null): GetContactReachabilityStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactReachabilityStatusResponse]
  }
}

