package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSummary extends StObject {
  
  /**
    * The unique identifier of the application. 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ApplicationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the route. 
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
    * The unique identifier of the environment. 
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.EnvironmentId] = js.undefined
  
  /**
    * Any error associated with the route resource. 
    */
  var Error: js.UndefOr[ErrorResponse] = js.undefined
  
  /**
    * Indicates whether to match all subpaths of the given source path. If this value is false, requests must match the source path exactly before they are forwarded to this route's service.
    */
  var IncludeChildPaths: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A timestamp that indicates when the route was last updated. 
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests using that method are forwarded to this route’s service. 
    */
  var Methods: js.UndefOr[HttpMethods] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the route owner.
    */
  var OwnerAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A mapping of Amazon API Gateway path resources to resource IDs. 
    */
  var PathResourceToId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.PathResourceToId] = js.undefined
  
  /**
    * The unique identifier of the route. 
    */
  var RouteId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteId] = js.undefined
  
  /**
    * The route type of the route. 
    */
  var RouteType: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteType] = js.undefined
  
  /**
    * The unique identifier of the service. 
    */
  var ServiceId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ServiceId] = js.undefined
  
  /**
    * The path to use to match traffic. Paths must start with / and are relative to the base of the application.
    */
  var SourcePath: js.UndefOr[UriPath] = js.undefined
  
  /**
    * The current state of the route. 
    */
  var State: js.UndefOr[RouteState] = js.undefined
  
  /**
    * The tags assigned to the route. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object RouteSummary {
  
  inline def apply(): RouteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedByAccountId(value: AccountId): Self = StObject.set(x, "CreatedByAccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedByAccountIdUndefined: Self = StObject.set(x, "CreatedByAccountId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setError(value: ErrorResponse): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setIncludeChildPaths(value: Boolean): Self = StObject.set(x, "IncludeChildPaths", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildPathsUndefined: Self = StObject.set(x, "IncludeChildPaths", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setMethods(value: HttpMethods): Self = StObject.set(x, "Methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "Methods", js.undefined)
    
    inline def setMethodsVarargs(value: HttpMethod*): Self = StObject.set(x, "Methods", js.Array(value*))
    
    inline def setOwnerAccountId(value: AccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setPathResourceToId(value: PathResourceToId): Self = StObject.set(x, "PathResourceToId", value.asInstanceOf[js.Any])
    
    inline def setPathResourceToIdUndefined: Self = StObject.set(x, "PathResourceToId", js.undefined)
    
    inline def setRouteId(value: RouteId): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "RouteId", js.undefined)
    
    inline def setRouteType(value: RouteType): Self = StObject.set(x, "RouteType", value.asInstanceOf[js.Any])
    
    inline def setRouteTypeUndefined: Self = StObject.set(x, "RouteType", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    inline def setSourcePath(value: UriPath): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
    
    inline def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
