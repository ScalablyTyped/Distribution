package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseScheduledInstancesResult extends StObject {
  
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.undefined
}
object PurchaseScheduledInstancesResult {
  
  inline def apply(): PurchaseScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseScheduledInstancesResult]
  }
  
  extension [Self <: PurchaseScheduledInstancesResult](x: Self) {
    
    inline def setScheduledInstanceSet(value: PurchasedScheduledInstanceSet): Self = StObject.set(x, "ScheduledInstanceSet", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceSetUndefined: Self = StObject.set(x, "ScheduledInstanceSet", js.undefined)
    
    inline def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = StObject.set(x, "ScheduledInstanceSet", js.Array(value*))
  }
}
