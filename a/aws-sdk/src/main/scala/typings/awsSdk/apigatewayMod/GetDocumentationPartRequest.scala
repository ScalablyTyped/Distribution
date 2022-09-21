package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentationPartRequest extends StObject {
  
  /**
    * The string identifier of the associated RestApi.
    */
  var documentationPartId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetDocumentationPartRequest {
  
  inline def apply(documentationPartId: String, restApiId: String): GetDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartRequest]
  }
  
  extension [Self <: GetDocumentationPartRequest](x: Self) {
    
    inline def setDocumentationPartId(value: String): Self = StObject.set(x, "documentationPartId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
