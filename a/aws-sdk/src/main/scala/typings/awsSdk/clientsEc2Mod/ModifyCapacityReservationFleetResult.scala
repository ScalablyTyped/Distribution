package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCapacityReservationFleetResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifyCapacityReservationFleetResult {
  
  inline def apply(): ModifyCapacityReservationFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCapacityReservationFleetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyCapacityReservationFleetResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
