package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomain extends js.Object {
  /**
    *  The DNS record for the subdomain. 
    */
  var dnsRecord: DNSRecord = js.native
  /**
    *  Describes the settings for the subdomain. 
    */
  var subDomainSetting: SubDomainSetting = js.native
  /**
    *  The verified status of the subdomain 
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

