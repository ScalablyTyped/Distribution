package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContactReachabilityStatusRequest extends js.Object {
  /**
    * The name of the domain for which you want to know whether the registrant contact has confirmed that the email address is valid.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
}

object GetContactReachabilityStatusRequest {
  @scala.inline
  def apply(domainName: DomainName = null): GetContactReachabilityStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    __obj.asInstanceOf[GetContactReachabilityStatusRequest]
  }
}

