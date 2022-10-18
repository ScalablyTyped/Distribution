package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeletePartitionResponse extends StObject {
  
  /**
    * The errors encountered when trying to delete the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.undefined
}
object BatchDeletePartitionResponse {
  
  inline def apply(): BatchDeletePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePartitionResponse]
  }
  
  extension [Self <: BatchDeletePartitionResponse](x: Self) {
    
    inline def setErrors(value: PartitionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartitionError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
