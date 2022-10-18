package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriPathRouteInput extends StObject {
  
  /**
    * If set to ACTIVE, traffic is forwarded to this route’s service after the route is created. 
    */
  var ActivationState: RouteActivationState
  
  /**
    * Indicates whether to match all subpaths of the given source path. If this value is false, requests must match the source path exactly before they are forwarded to this route's service. 
    */
  var IncludeChildPaths: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests using that method are forwarded to this route’s service. 
    */
  var Methods: js.UndefOr[HttpMethods] = js.undefined
  
  /**
    * The path to use to match traffic. Paths must start with / and are relative to the base of the application.
    */
  var SourcePath: UriPath
}
object UriPathRouteInput {
  
  inline def apply(ActivationState: RouteActivationState, SourcePath: UriPath): UriPathRouteInput = {
    val __obj = js.Dynamic.literal(ActivationState = ActivationState.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriPathRouteInput]
  }
  
  extension [Self <: UriPathRouteInput](x: Self) {
    
    inline def setActivationState(value: RouteActivationState): Self = StObject.set(x, "ActivationState", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildPaths(value: Boolean): Self = StObject.set(x, "IncludeChildPaths", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildPathsUndefined: Self = StObject.set(x, "IncludeChildPaths", js.undefined)
    
    inline def setMethods(value: HttpMethods): Self = StObject.set(x, "Methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "Methods", js.undefined)
    
    inline def setMethodsVarargs(value: HttpMethod*): Self = StObject.set(x, "Methods", js.Array(value*))
    
    inline def setSourcePath(value: UriPath): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
  }
}
