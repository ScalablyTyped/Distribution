package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCapacityReservationInput extends StObject {
  
  /**
    * The name of the capacity reservation.
    */
  var Name: CapacityReservationName
}
object GetCapacityReservationInput {
  
  inline def apply(Name: CapacityReservationName): GetCapacityReservationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityReservationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCapacityReservationInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: CapacityReservationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
