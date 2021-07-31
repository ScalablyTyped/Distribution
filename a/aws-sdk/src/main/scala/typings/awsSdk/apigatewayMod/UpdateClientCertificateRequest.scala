package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClientCertificateRequest extends StObject {
  
  /**
    * [Required] The identifier of the ClientCertificate resource to be updated.
    */
  var clientCertificateId: String
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}
object UpdateClientCertificateRequest {
  
  @scala.inline
  def apply(clientCertificateId: String): UpdateClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClientCertificateRequest]
  }
  
  @scala.inline
  implicit class UpdateClientCertificateRequestMutableBuilder[Self <: UpdateClientCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
  }
}
