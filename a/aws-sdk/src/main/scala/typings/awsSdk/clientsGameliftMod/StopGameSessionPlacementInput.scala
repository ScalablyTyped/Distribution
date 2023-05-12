package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopGameSessionPlacementInput extends StObject {
  
  /**
    * A unique identifier for a game session placement to stop.
    */
  var PlacementId: IdStringModel
}
object StopGameSessionPlacementInput {
  
  inline def apply(PlacementId: IdStringModel): StopGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopGameSessionPlacementInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopGameSessionPlacementInput] (val x: Self) extends AnyVal {
    
    inline def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
  }
}
