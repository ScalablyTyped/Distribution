package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetPortSettingsOutput extends StObject {
  
  /**
    * A unique identifier for the fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
}
object UpdateFleetPortSettingsOutput {
  
  inline def apply(): UpdateFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
  }
  
  extension [Self <: UpdateFleetPortSettingsOutput](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
