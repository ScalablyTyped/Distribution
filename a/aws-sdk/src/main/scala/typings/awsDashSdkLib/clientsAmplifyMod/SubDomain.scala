package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomain extends js.Object {
  /**
    *  DNS record for the Subdomain. 
    */
  var dnsRecord: DNSRecord
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSetting: SubDomainSetting
  /**
    *  Verified status of the Subdomain 
    */
  var verified: Verified
}

object SubDomain {
  @scala.inline
  def apply(dnsRecord: DNSRecord, subDomainSetting: SubDomainSetting, verified: Verified): SubDomain = {
    val __obj = js.Dynamic.literal(dnsRecord = dnsRecord, subDomainSetting = subDomainSetting, verified = verified)
  
    __obj.asInstanceOf[SubDomain]
  }
}

