package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountRequest extends StObject {
  
  /**
    * For more information about supported patch operations, see Patch Operations.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}
object UpdateAccountRequest {
  
  inline def apply(): UpdateAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountRequest]
  }
  
  extension [Self <: UpdateAccountRequest](x: Self) {
    
    inline def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    inline def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    inline def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value*))
  }
}
