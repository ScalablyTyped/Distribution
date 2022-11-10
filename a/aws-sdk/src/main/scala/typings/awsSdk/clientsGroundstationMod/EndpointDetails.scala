package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDetails extends StObject {
  
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.undefined
  
  /**
    * Endpoint security details including a list of subnets, a list of security groups and a role to connect streams to instances.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.undefined
}
object EndpointDetails {
  
  inline def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  extension [Self <: EndpointDetails](x: Self) {
    
    inline def setEndpoint(value: DataflowEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    inline def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
  }
}
