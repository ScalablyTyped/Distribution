package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameRequest extends StObject {
  
  /**
    * The description of the game.
    */
  var Description: js.UndefOr[GameDescription] = js.undefined
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
}
object UpdateGameRequest {
  
  inline def apply(GameName: GameName): UpdateGameRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameRequest]
  }
  
  extension [Self <: UpdateGameRequest](x: Self) {
    
    inline def setDescription(value: GameDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
  }
}
