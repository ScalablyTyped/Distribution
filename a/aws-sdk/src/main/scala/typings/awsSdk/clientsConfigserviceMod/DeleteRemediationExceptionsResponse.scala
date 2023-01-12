package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRemediationExceptionsResponse extends StObject {
  
  /**
    * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.undefined
}
object DeleteRemediationExceptionsResponse {
  
  inline def apply(): DeleteRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedBatches(value: FailedDeleteRemediationExceptionsBatches): Self = StObject.set(x, "FailedBatches", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchesUndefined: Self = StObject.set(x, "FailedBatches", js.undefined)
    
    inline def setFailedBatchesVarargs(value: FailedDeleteRemediationExceptionsBatch*): Self = StObject.set(x, "FailedBatches", js.Array(value*))
  }
}
