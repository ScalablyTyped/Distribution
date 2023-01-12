package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteResponse extends StObject {
  
  /**
    * The ID of the application in which the route is created.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the route. The format for this ARN is arn:aws:refactor-spaces:region:account-id:resource-type/resource-id . For more information about ARNs, see  Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the route creator.
    */
  var CreatedByAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A timestamp that indicates when the route is created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp that indicates when the route was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the route owner.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The unique identifier of the route.
    */
  var RouteId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteId] = js.undefined
  
  /**
    * The route type of the route.
    */
  var RouteType: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteType] = js.undefined
  
  /**
    * The ID of service in which the route is created. Traffic that matches this route is forwarded to this service.
    */
  var ServiceId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ServiceId] = js.undefined
  
  /**
    * The current state of the route. Activation state only allows ACTIVE or INACTIVE as user inputs. FAILED is a route state that is system generated.
    */
  var State: js.UndefOr[RouteState] = js.undefined
  
  /**
    * The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Configuration for the URI path route type. 
    */
  var UriPathRoute: js.UndefOr[UriPathRouteInput] = js.undefined
}
object CreateRouteResponse {
  
  inline def apply(): CreateRouteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRouteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRouteResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedByAccountId(value: AccountId): Self = StObject.set(x, "CreatedByAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedByAccountIdUndefined: Self = StObject.set(x, "CreatedByAccountId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setRouteId(value: RouteId): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "RouteId", js.undefined)
    
    inline def setRouteType(value: RouteType): Self = StObject.set(x, "RouteType", value.asInstanceOf[js.Any])
    
    inline def setRouteTypeUndefined: Self = StObject.set(x, "RouteType", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUriPathRoute(value: UriPathRouteInput): Self = StObject.set(x, "UriPathRoute", value.asInstanceOf[js.Any])
    
    inline def setUriPathRouteUndefined: Self = StObject.set(x, "UriPathRoute", js.undefined)
  }
}
