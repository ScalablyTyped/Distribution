package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationTarget extends StObject {
  
  /**
    * The ID of the Capacity Reservation in which to run the instance.
    */
  var CapacityReservationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CapacityReservationId] = js.undefined
  
  /**
    * The ARN of the Capacity Reservation resource group in which to run the instance.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[String] = js.undefined
}
object CapacityReservationTarget {
  
  inline def apply(): CapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationTarget]
  }
  
  extension [Self <: CapacityReservationTarget](x: Self) {
    
    inline def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    inline def setCapacityReservationResourceGroupArn(value: String): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
  }
}
