package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRouteMatch extends StObject {
  
  /**
    * The gateway route host name to be matched on.
    */
  var hostname: js.UndefOr[GatewayRouteHostnameMatch] = js.undefined
  
  /**
    * The gateway route metadata to be matched on.
    */
  var metadata: js.UndefOr[GrpcGatewayRouteMetadataList] = js.undefined
  
  /**
    * The port number to match from the request.
    */
  var port: js.UndefOr[ListenerPort] = js.undefined
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.undefined
}
object GrpcGatewayRouteMatch {
  
  inline def apply(): GrpcGatewayRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcGatewayRouteMatch]
  }
  
  extension [Self <: GrpcGatewayRouteMatch](x: Self) {
    
    inline def setHostname(value: GatewayRouteHostnameMatch): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setMetadata(value: GrpcGatewayRouteMetadataList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: GrpcGatewayRouteMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setPort(value: ListenerPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
