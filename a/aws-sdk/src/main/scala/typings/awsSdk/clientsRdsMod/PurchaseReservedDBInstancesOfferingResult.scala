package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedDBInstancesOfferingResult extends StObject {
  
  var ReservedDBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.ReservedDBInstance] = js.undefined
}
object PurchaseReservedDBInstancesOfferingResult {
  
  inline def apply(): PurchaseReservedDBInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseReservedDBInstancesOfferingResult] (val x: Self) extends AnyVal {
    
    inline def setReservedDBInstance(value: ReservedDBInstance): Self = StObject.set(x, "ReservedDBInstance", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstanceUndefined: Self = StObject.set(x, "ReservedDBInstance", js.undefined)
  }
}
