package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteResponse extends StObject {
  
  /**
    * The ID of the application that the route belongs to.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the route.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A timestamp that indicates when the route was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the route to delete.
    */
  var RouteId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteId] = js.undefined
  
  /**
    * The ID of the service that the route belongs to.
    */
  var ServiceId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ServiceId] = js.undefined
  
  /**
    * The current state of the route. 
    */
  var State: js.UndefOr[RouteState] = js.undefined
}
object DeleteRouteResponse {
  
  inline def apply(): DeleteRouteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRouteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRouteResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setRouteId(value: RouteId): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "RouteId", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
