package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteFeaturedResultsSetResponse extends StObject {
  
  /**
    * The list of errors for the featured results set IDs, explaining why they couldn't be removed from the index.
    */
  var Errors: BatchDeleteFeaturedResultsSetErrors
}
object BatchDeleteFeaturedResultsSetResponse {
  
  inline def apply(Errors: BatchDeleteFeaturedResultsSetErrors): BatchDeleteFeaturedResultsSetResponse = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteFeaturedResultsSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteFeaturedResultsSetResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchDeleteFeaturedResultsSetErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchDeleteFeaturedResultsSetError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
