package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentationPartsRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The status of the API documentation parts to retrieve. Valid values are DOCUMENTED for retrieving DocumentationPart resources with content and UNDOCUMENTED for DocumentationPart resources without content.
    */
  var locationStatus: js.UndefOr[LocationStatusType] = js.undefined
  
  /**
    * The name of API entities of the to-be-retrieved documentation parts.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The path of API entities of the to-be-retrieved documentation parts.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The type of API entities of the to-be-retrieved documentation parts. 
    */
  var `type`: js.UndefOr[DocumentationPartType] = js.undefined
}
object GetDocumentationPartsRequest {
  
  inline def apply(restApiId: String): GetDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartsRequest]
  }
  
  extension [Self <: GetDocumentationPartsRequest](x: Self) {
    
    inline def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocationStatus(value: LocationStatusType): Self = StObject.set(x, "locationStatus", value.asInstanceOf[js.Any])
    
    inline def setLocationStatusUndefined: Self = StObject.set(x, "locationStatus", js.undefined)
    
    inline def setNameQuery(value: String): Self = StObject.set(x, "nameQuery", value.asInstanceOf[js.Any])
    
    inline def setNameQueryUndefined: Self = StObject.set(x, "nameQuery", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setType(value: DocumentationPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
