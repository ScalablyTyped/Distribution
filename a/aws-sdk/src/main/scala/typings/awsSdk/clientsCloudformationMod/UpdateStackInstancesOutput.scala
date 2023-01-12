package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStackInstancesOutput extends StObject {
  
  /**
    * The unique identifier for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object UpdateStackInstancesOutput {
  
  inline def apply(): UpdateStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackInstancesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStackInstancesOutput] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
