package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentationPartRequest extends StObject {
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var documentationPartId: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object GetDocumentationPartRequest {
  
  @scala.inline
  def apply(documentationPartId: String, restApiId: String): GetDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartRequest]
  }
  
  @scala.inline
  implicit class GetDocumentationPartRequestMutableBuilder[Self <: GetDocumentationPartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationPartId(value: String): Self = StObject.set(x, "documentationPartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
