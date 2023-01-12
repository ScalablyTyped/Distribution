package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentationPartRequest extends StObject {
  
  /**
    * The location of the targeted API entity of the to-be-created documentation part.
    */
  var location: DocumentationPartLocation
  
  /**
    * The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
    */
  var properties: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object CreateDocumentationPartRequest {
  
  inline def apply(location: DocumentationPartLocation, properties: String, restApiId: String): CreateDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentationPartRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDocumentationPartRequest] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: DocumentationPartLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: String): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
