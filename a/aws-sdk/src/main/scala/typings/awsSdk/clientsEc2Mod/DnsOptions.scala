package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsOptions extends StObject {
  
  /**
    * The DNS records created for the endpoint.
    */
  var DnsRecordIpType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DnsRecordIpType] = js.undefined
}
object DnsOptions {
  
  inline def apply(): DnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsOptions]
  }
  
  extension [Self <: DnsOptions](x: Self) {
    
    inline def setDnsRecordIpType(value: DnsRecordIpType): Self = StObject.set(x, "DnsRecordIpType", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordIpTypeUndefined: Self = StObject.set(x, "DnsRecordIpType", js.undefined)
  }
}
