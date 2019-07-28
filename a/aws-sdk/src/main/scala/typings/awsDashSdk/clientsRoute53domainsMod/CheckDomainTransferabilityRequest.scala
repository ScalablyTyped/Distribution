package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckDomainTransferabilityRequest extends js.Object {
  /**
    * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code that you got from the current registrar for the domain.
    */
  var AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
  /**
    * The name of the domain that you want to transfer to Amazon Route 53. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object CheckDomainTransferabilityRequest {
  @scala.inline
  def apply(DomainName: DomainName, AuthCode: DomainAuthCode = null): CheckDomainTransferabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (AuthCode != null) __obj.updateDynamic("AuthCode")(AuthCode)
    __obj.asInstanceOf[CheckDomainTransferabilityRequest]
  }
}

