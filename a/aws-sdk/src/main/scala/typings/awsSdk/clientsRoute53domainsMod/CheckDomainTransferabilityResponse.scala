package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckDomainTransferabilityResponse extends StObject {
  
  /**
    * A complex type that contains information about whether the specified domain can be transferred to Route 53.
    */
  var Transferability: DomainTransferability
}
object CheckDomainTransferabilityResponse {
  
  inline def apply(Transferability: DomainTransferability): CheckDomainTransferabilityResponse = {
    val __obj = js.Dynamic.literal(Transferability = Transferability.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainTransferabilityResponse]
  }
  
  extension [Self <: CheckDomainTransferabilityResponse](x: Self) {
    
    inline def setTransferability(value: DomainTransferability): Self = StObject.set(x, "Transferability", value.asInstanceOf[js.Any])
  }
}
