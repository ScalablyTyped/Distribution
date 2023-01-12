package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAvailabilityZoneGroupResult extends StObject {
  
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifyAvailabilityZoneGroupResult {
  
  inline def apply(): ModifyAvailabilityZoneGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyAvailabilityZoneGroupResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
