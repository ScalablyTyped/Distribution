package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubDomain extends StObject {
  
  /**
    *  The DNS record for the subdomain. 
    */
  var dnsRecord: DNSRecord
  
  /**
    *  Describes the settings for the subdomain. 
    */
  var subDomainSetting: SubDomainSetting
  
  /**
    *  The verified status of the subdomain 
    */
  var verified: Verified
}
object SubDomain {
  
  inline def apply(dnsRecord: DNSRecord, subDomainSetting: SubDomainSetting, verified: Verified): SubDomain = {
    val __obj = js.Dynamic.literal(dnsRecord = dnsRecord.asInstanceOf[js.Any], subDomainSetting = subDomainSetting.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
  
  extension [Self <: SubDomain](x: Self) {
    
    inline def setDnsRecord(value: DNSRecord): Self = StObject.set(x, "dnsRecord", value.asInstanceOf[js.Any])
    
    inline def setSubDomainSetting(value: SubDomainSetting): Self = StObject.set(x, "subDomainSetting", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: Verified): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
