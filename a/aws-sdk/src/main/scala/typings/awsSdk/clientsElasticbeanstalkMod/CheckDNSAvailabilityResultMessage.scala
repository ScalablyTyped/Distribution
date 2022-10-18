package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDNSAvailabilityResultMessage extends StObject {
  
  /**
    * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
    */
  var Available: js.UndefOr[CnameAvailability] = js.undefined
  
  /**
    * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
    */
  var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined
}
object CheckDNSAvailabilityResultMessage {
  
  inline def apply(): CheckDNSAvailabilityResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
  }
  
  extension [Self <: CheckDNSAvailabilityResultMessage](x: Self) {
    
    inline def setAvailable(value: CnameAvailability): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "Available", js.undefined)
    
    inline def setFullyQualifiedCNAME(value: DNSCname): Self = StObject.set(x, "FullyQualifiedCNAME", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedCNAMEUndefined: Self = StObject.set(x, "FullyQualifiedCNAME", js.undefined)
  }
}
