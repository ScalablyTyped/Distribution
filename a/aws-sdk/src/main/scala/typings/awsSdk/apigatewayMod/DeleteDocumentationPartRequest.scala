package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentationPartRequest extends StObject {
  
  /**
    * [Required] The identifier of the to-be-deleted documentation part.
    */
  var documentationPartId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteDocumentationPartRequest {
  
  inline def apply(documentationPartId: String, restApiId: String): DeleteDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentationPartRequest]
  }
  
  extension [Self <: DeleteDocumentationPartRequest](x: Self) {
    
    inline def setDocumentationPartId(value: String): Self = StObject.set(x, "documentationPartId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
