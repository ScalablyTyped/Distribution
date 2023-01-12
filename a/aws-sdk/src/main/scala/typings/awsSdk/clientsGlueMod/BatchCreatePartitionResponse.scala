package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreatePartitionResponse extends StObject {
  
  /**
    * The errors encountered when trying to create the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.undefined
}
object BatchCreatePartitionResponse {
  
  inline def apply(): BatchCreatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePartitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreatePartitionResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: PartitionErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: PartitionError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
