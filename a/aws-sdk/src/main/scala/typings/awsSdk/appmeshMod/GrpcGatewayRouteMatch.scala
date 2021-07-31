package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRouteMatch extends StObject {
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[ServiceName] = js.undefined
}
object GrpcGatewayRouteMatch {
  
  @scala.inline
  def apply(): GrpcGatewayRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcGatewayRouteMatch]
  }
  
  @scala.inline
  implicit class GrpcGatewayRouteMatchMutableBuilder[Self <: GrpcGatewayRouteMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
