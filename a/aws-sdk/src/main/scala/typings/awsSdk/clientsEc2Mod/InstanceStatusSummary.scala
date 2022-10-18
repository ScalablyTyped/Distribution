package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStatusSummary extends StObject {
  
  /**
    * The system instance health or application instance health.
    */
  var Details: js.UndefOr[InstanceStatusDetailsList] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[SummaryStatus] = js.undefined
}
object InstanceStatusSummary {
  
  inline def apply(): InstanceStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusSummary]
  }
  
  extension [Self <: InstanceStatusSummary](x: Self) {
    
    inline def setDetails(value: InstanceStatusDetailsList): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setDetailsVarargs(value: InstanceStatusDetails*): Self = StObject.set(x, "Details", js.Array(value*))
    
    inline def setStatus(value: SummaryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
