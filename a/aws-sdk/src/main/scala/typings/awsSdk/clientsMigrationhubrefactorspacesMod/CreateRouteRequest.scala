package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteRequest extends StObject {
  
  /**
    * The ID of the application within which the route is being created.
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientToken] = js.undefined
  
  /**
    *  Configuration for the default route type. 
    */
  var DefaultRoute: js.UndefOr[DefaultRouteInput] = js.undefined
  
  /**
    * The ID of the environment in which the route is created.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The route type of the route. DEFAULT indicates that all traffic that does not match another route is forwarded to the default route. Applications must have a default route before any other routes can be created. URI_PATH indicates a route that is based on a URI path.
    */
  var RouteType: typings.awsSdk.clientsMigrationhubrefactorspacesMod.RouteType
  
  /**
    * The ID of the service in which the route is created. Traffic that matches this route is forwarded to this service.
    */
  var ServiceIdentifier: ServiceId
  
  /**
    * The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair.. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The configuration for the URI path route type. 
    */
  var UriPathRoute: js.UndefOr[UriPathRouteInput] = js.undefined
}
object CreateRouteRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EnvironmentIdentifier: EnvironmentId,
    RouteType: RouteType,
    ServiceIdentifier: ServiceId
  ): CreateRouteRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], RouteType = RouteType.asInstanceOf[js.Any], ServiceIdentifier = ServiceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRouteRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDefaultRoute(value: DefaultRouteInput): Self = StObject.set(x, "DefaultRoute", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteUndefined: Self = StObject.set(x, "DefaultRoute", js.undefined)
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouteType(value: RouteType): Self = StObject.set(x, "RouteType", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceId): Self = StObject.set(x, "ServiceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUriPathRoute(value: UriPathRouteInput): Self = StObject.set(x, "UriPathRoute", value.asInstanceOf[js.Any])
    
    inline def setUriPathRouteUndefined: Self = StObject.set(x, "UriPathRoute", js.undefined)
  }
}
