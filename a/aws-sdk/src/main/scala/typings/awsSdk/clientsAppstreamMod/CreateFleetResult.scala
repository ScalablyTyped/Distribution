package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetResult extends StObject {
  
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Fleet] = js.undefined
}
object CreateFleetResult {
  
  inline def apply(): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResult]
  }
  
  extension [Self <: CreateFleetResult](x: Self) {
    
    inline def setFleet(value: Fleet): Self = StObject.set(x, "Fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "Fleet", js.undefined)
  }
}
