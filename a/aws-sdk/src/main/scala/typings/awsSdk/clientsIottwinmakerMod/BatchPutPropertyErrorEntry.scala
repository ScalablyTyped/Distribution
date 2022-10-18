package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutPropertyErrorEntry extends StObject {
  
  /**
    * A list of objects that contain information about errors returned by the BatchPutProperty action.
    */
  var errors: Errors
}
object BatchPutPropertyErrorEntry {
  
  inline def apply(errors: Errors): BatchPutPropertyErrorEntry = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutPropertyErrorEntry]
  }
  
  extension [Self <: BatchPutPropertyErrorEntry](x: Self) {
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchPutPropertyError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
