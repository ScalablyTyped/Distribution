package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCapacityReservationResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object CancelCapacityReservationResult {
  
  inline def apply(): CancelCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelCapacityReservationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelCapacityReservationResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
