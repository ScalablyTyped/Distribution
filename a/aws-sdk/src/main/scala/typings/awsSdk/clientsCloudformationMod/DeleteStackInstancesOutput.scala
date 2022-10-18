package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackInstancesOutput extends StObject {
  
  /**
    * The unique identifier for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object DeleteStackInstancesOutput {
  
  inline def apply(): DeleteStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStackInstancesOutput]
  }
  
  extension [Self <: DeleteStackInstancesOutput](x: Self) {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
