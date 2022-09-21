package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceRequest extends StObject {
  
  /**
    * The parent resource's identifier.
    */
  var parentId: String
  
  /**
    * The last path segment for this resource.
    */
  var pathPart: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object CreateResourceRequest {
  
  inline def apply(parentId: String, pathPart: String, restApiId: String): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceRequest]
  }
  
  extension [Self <: CreateResourceRequest](x: Self) {
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setPathPart(value: String): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
