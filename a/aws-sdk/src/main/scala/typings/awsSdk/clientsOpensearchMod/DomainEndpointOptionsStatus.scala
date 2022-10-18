package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEndpointOptionsStatus extends StObject {
  
  /**
    * Options to configure the endpoint for the domain.
    */
  var Options: DomainEndpointOptions
  
  /**
    * The status of the endpoint options for the domain. See OptionStatus for the status information that's included. 
    */
  var Status: OptionStatus
}
object DomainEndpointOptionsStatus {
  
  inline def apply(Options: DomainEndpointOptions, Status: OptionStatus): DomainEndpointOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEndpointOptionsStatus]
  }
  
  extension [Self <: DomainEndpointOptionsStatus](x: Self) {
    
    inline def setOptions(value: DomainEndpointOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
