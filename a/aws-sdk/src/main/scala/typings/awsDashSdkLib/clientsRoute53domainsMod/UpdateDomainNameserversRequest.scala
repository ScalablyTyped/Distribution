package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainNameserversRequest extends js.Object {
  /**
    * The name of the domain that you want to change name servers for.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
  /**
    * The authorization key for .fi domains
    */
  var FIAuthKey: js.UndefOr[FIAuthKey] = js.undefined
  /**
    * A list of new name servers for the domain.
    */
  var Nameservers: NameserverList
}

object UpdateDomainNameserversRequest {
  @scala.inline
  def apply(DomainName: DomainName, Nameservers: NameserverList, FIAuthKey: FIAuthKey = null): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, Nameservers = Nameservers)
    if (FIAuthKey != null) __obj.updateDynamic("FIAuthKey")(FIAuthKey)
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
}

