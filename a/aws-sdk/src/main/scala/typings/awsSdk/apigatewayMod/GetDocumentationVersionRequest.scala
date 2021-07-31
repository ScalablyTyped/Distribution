package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentationVersionRequest extends StObject {
  
  /**
    * [Required] The version identifier of the to-be-retrieved documentation snapshot.
    */
  var documentationVersion: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object GetDocumentationVersionRequest {
  
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): GetDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationVersionRequest]
  }
  
  @scala.inline
  implicit class GetDocumentationVersionRequestMutableBuilder[Self <: GetDocumentationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
