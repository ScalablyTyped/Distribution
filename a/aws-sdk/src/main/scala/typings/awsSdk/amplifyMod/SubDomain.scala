package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubDomain extends StObject {
  
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
  implicit class SubDomainMutableBuilder[Self <: SubDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsRecord(value: DNSRecord): Self = StObject.set(x, "dnsRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainSetting(value: SubDomainSetting): Self = StObject.set(x, "subDomainSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified(value: Verified): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
