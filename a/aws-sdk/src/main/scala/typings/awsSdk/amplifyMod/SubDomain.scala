package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SubDomainOps[Self <: SubDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDnsRecord(value: DNSRecord): Self = this.set("dnsRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainSetting(value: SubDomainSetting): Self = this.set("subDomainSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Verified): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
}
