package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCapacityReservationOutput extends StObject {
  
  /**
    * The requested capacity reservation structure.
    */
  var CapacityReservation: typings.awsSdk.clientsAthenaMod.CapacityReservation
}
object GetCapacityReservationOutput {
  
  inline def apply(CapacityReservation: CapacityReservation): GetCapacityReservationOutput = {
    val __obj = js.Dynamic.literal(CapacityReservation = CapacityReservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityReservationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCapacityReservationOutput] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservation(value: CapacityReservation): Self = StObject.set(x, "CapacityReservation", value.asInstanceOf[js.Any])
  }
}
