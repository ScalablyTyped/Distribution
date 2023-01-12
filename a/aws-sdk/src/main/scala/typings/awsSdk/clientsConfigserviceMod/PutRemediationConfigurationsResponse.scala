package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRemediationConfigurationsResponse extends StObject {
  
  /**
    * Returns a list of failed remediation batch objects.
    */
  var FailedBatches: js.UndefOr[FailedRemediationBatches] = js.undefined
}
object PutRemediationConfigurationsResponse {
  
  inline def apply(): PutRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRemediationConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedBatches(value: FailedRemediationBatches): Self = StObject.set(x, "FailedBatches", value.asInstanceOf[js.Any])
    
    inline def setFailedBatchesUndefined: Self = StObject.set(x, "FailedBatches", js.undefined)
    
    inline def setFailedBatchesVarargs(value: FailedRemediationBatch*): Self = StObject.set(x, "FailedBatches", js.Array(value*))
  }
}
