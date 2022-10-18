package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackStackOutput extends StObject {
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackId] = js.undefined
}
object RollbackStackOutput {
  
  inline def apply(): RollbackStackOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackStackOutput]
  }
  
  extension [Self <: RollbackStackOutput](x: Self) {
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
