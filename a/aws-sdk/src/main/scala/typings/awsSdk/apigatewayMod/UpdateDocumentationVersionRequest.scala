package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentationVersionRequest extends StObject {
  
  /**
    * [Required] The version identifier of the to-be-updated documentation version.
    */
  var documentationVersion: String = js.native
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi..
    */
  var restApiId: String = js.native
}
object UpdateDocumentationVersionRequest {
  
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): UpdateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentationVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateDocumentationVersionRequestMutableBuilder[Self <: UpdateDocumentationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentationVersion(value: String): Self = StObject.set(x, "documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
