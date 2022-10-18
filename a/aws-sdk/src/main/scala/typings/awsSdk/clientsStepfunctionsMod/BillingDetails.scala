package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingDetails extends StObject {
  
  /**
    * Billed duration of your workflow, in milliseconds.
    */
  var billedDurationInMilliseconds: js.UndefOr[BilledDuration] = js.undefined
  
  /**
    * Billed memory consumption of your workflow, in MB.
    */
  var billedMemoryUsedInMB: js.UndefOr[BilledMemoryUsed] = js.undefined
}
object BillingDetails {
  
  inline def apply(): BillingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDetails]
  }
  
  extension [Self <: BillingDetails](x: Self) {
    
    inline def setBilledDurationInMilliseconds(value: BilledDuration): Self = StObject.set(x, "billedDurationInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setBilledDurationInMillisecondsUndefined: Self = StObject.set(x, "billedDurationInMilliseconds", js.undefined)
    
    inline def setBilledMemoryUsedInMB(value: BilledMemoryUsed): Self = StObject.set(x, "billedMemoryUsedInMB", value.asInstanceOf[js.Any])
    
    inline def setBilledMemoryUsedInMBUndefined: Self = StObject.set(x, "billedMemoryUsedInMB", js.undefined)
  }
}
