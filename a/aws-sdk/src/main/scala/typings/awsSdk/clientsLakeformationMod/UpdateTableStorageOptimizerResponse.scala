package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableStorageOptimizerResponse extends StObject {
  
  /**
    * A response indicating the success of failure of the operation.
    */
  var Result: js.UndefOr[typings.awsSdk.clientsLakeformationMod.Result] = js.undefined
}
object UpdateTableStorageOptimizerResponse {
  
  inline def apply(): UpdateTableStorageOptimizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableStorageOptimizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableStorageOptimizerResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Result): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
