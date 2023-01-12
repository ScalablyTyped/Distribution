package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetAttributesOutput extends StObject {
  
  /**
    * A unique identifier for the fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
}
object UpdateFleetAttributesOutput {
  
  inline def apply(): UpdateFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetAttributesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFleetAttributesOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
