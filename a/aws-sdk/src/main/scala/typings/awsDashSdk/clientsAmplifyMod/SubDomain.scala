package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomain extends js.Object {
  /**
    *  DNS record for the Subdomain. 
    */
  var dnsRecord: DNSRecord = js.native
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSetting: SubDomainSetting = js.native
  /**
    *  Verified status of the Subdomain 
    */
  var verified: Verified = js.native
}

object SubDomain {
  @scala.inline
  def apply(dnsRecord: DNSRecord, subDomainSetting: SubDomainSetting, verified: Verified): SubDomain = {
    val __obj = js.Dynamic.literal(dnsRecord = dnsRecord.asInstanceOf[js.Any], subDomainSetting = subDomainSetting.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubDomain]
  }
}

