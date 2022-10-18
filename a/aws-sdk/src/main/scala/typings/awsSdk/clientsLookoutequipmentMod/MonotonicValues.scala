package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonotonicValues extends StObject {
  
  /**
    *  Indicates the monotonicity of values. Can be INCREASING, DECREASING, or STATIC. 
    */
  var Monotonicity: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.Monotonicity] = js.undefined
  
  /**
    *  Indicates whether there is a potential data issue related to having monotonic values. 
    */
  var Status: StatisticalIssueStatus
}
object MonotonicValues {
  
  inline def apply(Status: StatisticalIssueStatus): MonotonicValues = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonotonicValues]
  }
  
  extension [Self <: MonotonicValues](x: Self) {
    
    inline def setMonotonicity(value: Monotonicity): Self = StObject.set(x, "Monotonicity", value.asInstanceOf[js.Any])
    
    inline def setMonotonicityUndefined: Self = StObject.set(x, "Monotonicity", js.undefined)
    
    inline def setStatus(value: StatisticalIssueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
