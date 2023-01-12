package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRemediationExceptionsResponse extends StObject {
  
  /**
    * Returns a list of failed remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedRemediationExceptionBatches] = js.undefined
}
object PutRemediationExceptionsResponse {
  
  inline def apply(): PutRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRemediationExceptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedBatches(value: FailedRemediationExceptionBatches): Self = StObject.set(x, "FailedBatches", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchesUndefined: Self = StObject.set(x, "FailedBatches", js.undefined)
    
    inline def setFailedBatchesVarargs(value: FailedRemediationExceptionBatch*): Self = StObject.set(x, "FailedBatches", js.Array(value*))
  }
}
