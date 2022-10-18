package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDNSAvailabilityMessage extends StObject {
  
  /**
    * The prefix used when this CNAME is reserved.
    */
  var CNAMEPrefix: DNSCnamePrefix
}
object CheckDNSAvailabilityMessage {
  
  inline def apply(CNAMEPrefix: DNSCnamePrefix): CheckDNSAvailabilityMessage = {
    val __obj = js.Dynamic.literal(CNAMEPrefix = CNAMEPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDNSAvailabilityMessage]
  }
  
  extension [Self <: CheckDNSAvailabilityMessage](x: Self) {
    
    inline def setCNAMEPrefix(value: DNSCnamePrefix): Self = StObject.set(x, "CNAMEPrefix", value.asInstanceOf[js.Any])
  }
}
