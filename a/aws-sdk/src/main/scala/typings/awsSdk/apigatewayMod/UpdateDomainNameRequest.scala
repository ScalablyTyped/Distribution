package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainNameRequest extends StObject {
  
  /**
    * [Required] The name of the DomainName resource to be changed.
    */
  var domainName: String
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}
object UpdateDomainNameRequest {
  
  @scala.inline
  def apply(domainName: String): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainNameRequestMutableBuilder[Self <: UpdateDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
  }
}
