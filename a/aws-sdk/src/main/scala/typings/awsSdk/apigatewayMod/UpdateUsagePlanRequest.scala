package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUsagePlanRequest extends StObject {
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * [Required] The Id of the to-be-updated usage plan.
    */
  var usagePlanId: String
}
object UpdateUsagePlanRequest {
  
  @scala.inline
  def apply(usagePlanId: String): UpdateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsagePlanRequest]
  }
  
  @scala.inline
  implicit class UpdateUsagePlanRequestMutableBuilder[Self <: UpdateUsagePlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
