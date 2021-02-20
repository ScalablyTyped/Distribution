package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentationVersionRequest extends StObject {
  
  /**
    * [Required] The version identifier of a to-be-deleted documentation snapshot.
    */
  var documentationVersion: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object DeleteDocumentationVersionRequest {
  
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): DeleteDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentationVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteDocumentationVersionRequestMutableBuilder[Self <: DeleteDocumentationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
