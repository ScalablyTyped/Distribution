package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentationVersionRequest extends StObject {
  
  /**
    * The version identifier of the to-be-retrieved documentation snapshot.
    */
  var documentationVersion: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetDocumentationVersionRequest {
  
  inline def apply(documentationVersion: String, restApiId: String): GetDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationVersionRequest]
  }
  
  extension [Self <: GetDocumentationVersionRequest](x: Self) {
    
    inline def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
