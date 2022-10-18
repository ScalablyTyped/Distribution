package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationResponse extends StObject {
  
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Operation] = js.undefined
}
object GetOperationResponse {
  
  inline def apply(): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationResponse]
  }
  
  extension [Self <: GetOperationResponse](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
  }
}
