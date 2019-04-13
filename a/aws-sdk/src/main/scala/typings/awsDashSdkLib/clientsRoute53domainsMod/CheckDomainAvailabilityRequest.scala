package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckDomainAvailabilityRequest extends js.Object {
  /**
    * The name of the domain that you want to get availability for. Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-). Internationalized Domain Names are not supported.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
  /**
    * Reserved for future use.
    */
  var IdnLangCode: js.UndefOr[LangCode] = js.undefined
}

object CheckDomainAvailabilityRequest {
  @scala.inline
  def apply(DomainName: DomainName, IdnLangCode: LangCode = null): CheckDomainAvailabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (IdnLangCode != null) __obj.updateDynamic("IdnLangCode")(IdnLangCode)
    __obj.asInstanceOf[CheckDomainAvailabilityRequest]
  }
}

