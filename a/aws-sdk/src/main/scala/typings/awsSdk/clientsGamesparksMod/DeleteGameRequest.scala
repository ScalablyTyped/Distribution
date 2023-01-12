package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGameRequest extends StObject {
  
  /**
    * The name of the game to delete.
    */
  var GameName: typings.awsSdk.clientsGamesparksMod.GameName
}
object DeleteGameRequest {
  
  inline def apply(GameName: GameName): DeleteGameRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGameRequest] (val x: Self) extends AnyVal {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
  }
}
