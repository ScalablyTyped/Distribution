package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGameSessionPlacementOutput extends StObject {
  
  /**
    * Object that describes the newly created game session placement. This object includes all the information provided in the request, as well as start/end time stamps and placement status. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameSessionPlacement] = js.undefined
}
object StartGameSessionPlacementOutput {
  
  inline def apply(): StartGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartGameSessionPlacementOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    
    inline def setGameSessionPlacement(value: GameSessionPlacement): Self = StObject.set(x, "GameSessionPlacement", value.asInstanceOf[js.Any])
    
    inline def setGameSessionPlacementUndefined: Self = StObject.set(x, "GameSessionPlacement", js.undefined)
  }
}
