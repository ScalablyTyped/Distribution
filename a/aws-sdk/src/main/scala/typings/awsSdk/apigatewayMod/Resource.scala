package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The resource's identifier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource's identifier.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /**
    * The full path for this resource.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The last path segment for this resource.
    */
  var pathPart: js.UndefOr[String] = js.undefined
  
  /**
    * Gets an API resource's method of a given HTTP verb.
    */
  var resourceMethods: js.UndefOr[MapOfMethod] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathPart(value: String): Self = StObject.set(x, "pathPart", value.asInstanceOf[js.Any])
    
    inline def setPathPartUndefined: Self = StObject.set(x, "pathPart", js.undefined)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResourceMethods(value: MapOfMethod): Self = StObject.set(x, "resourceMethods", value.asInstanceOf[js.Any])
    
    inline def setResourceMethodsUndefined: Self = StObject.set(x, "resourceMethods", js.undefined)
  }
}
