package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportStacksToStackSetOutput extends StObject {
  
  /**
    * The unique identifier for the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object ImportStacksToStackSetOutput {
  
  inline def apply(): ImportStacksToStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportStacksToStackSetOutput]
  }
  
  extension [Self <: ImportStacksToStackSetOutput](x: Self) {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
