package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCapacityReservationInput extends StObject {
  
  /**
    * The name of the capacity reservation.
    */
  var Name: CapacityReservationName
  
  /**
    * The new number of requested data processing units.
    */
  var TargetDpus: TargetDpusInteger
}
object UpdateCapacityReservationInput {
  
  inline def apply(Name: CapacityReservationName, TargetDpus: TargetDpusInteger): UpdateCapacityReservationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TargetDpus = TargetDpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCapacityReservationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCapacityReservationInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: CapacityReservationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTargetDpus(value: TargetDpusInteger): Self = StObject.set(x, "TargetDpus", value.asInstanceOf[js.Any])
  }
}
