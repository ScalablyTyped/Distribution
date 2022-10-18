package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackSetOutput extends StObject {
  
  /**
    * The unique ID for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object UpdateStackSetOutput {
  
  inline def apply(): UpdateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackSetOutput]
  }
  
  extension [Self <: UpdateStackSetOutput](x: Self) {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
