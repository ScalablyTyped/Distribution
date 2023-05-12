package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationInput extends StObject {
  
  /**
    * The name of the capacity reservation to cancel.
    */
  var Name: CapacityReservationName
}
object CancelCapacityReservationInput {
  
  inline def apply(Name: CapacityReservationName): CancelCapacityReservationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCapacityReservationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelCapacityReservationInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: CapacityReservationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
