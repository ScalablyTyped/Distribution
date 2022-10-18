package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteRequest extends StObject {
  
  /**
    *  If set to ACTIVE, traffic is forwarded to this route’s service after the route is updated. 
    */
  var ActivationState: RouteActivationState
  
  /**
    *  The ID of the application within which the route is being updated. 
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    *  The ID of the environment in which the route is being updated. 
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    *  The unique identifier of the route to update. 
    */
  var RouteIdentifier: RouteId
}
object UpdateRouteRequest {
  
  inline def apply(
    ActivationState: RouteActivationState,
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    RouteIdentifier: RouteId
  ): UpdateRouteRequest = {
    val __obj = js.Dynamic.literal(ActivationState = ActivationState.asInstanceOf[js.Any], ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], RouteIdentifier = RouteIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteRequest]
  }
  
  extension [Self <: UpdateRouteRequest](x: Self) {
    
    inline def setActivationState(value: RouteActivationState): Self = StObject.set(x, "ActivationState", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouteIdentifier(value: RouteId): Self = StObject.set(x, "RouteIdentifier", value.asInstanceOf[js.Any])
  }
}
