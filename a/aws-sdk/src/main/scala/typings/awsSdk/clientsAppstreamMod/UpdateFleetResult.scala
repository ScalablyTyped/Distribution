package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetResult extends StObject {
  
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Fleet] = js.undefined
}
object UpdateFleetResult {
  
  inline def apply(): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFleetResult] (val x: Self) extends AnyVal {
    
    inline def setFleet(value: Fleet): Self = StObject.set(x, "Fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "Fleet", js.undefined)
  }
}
