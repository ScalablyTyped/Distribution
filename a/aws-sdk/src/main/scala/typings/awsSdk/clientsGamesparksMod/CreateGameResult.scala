package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameResult extends StObject {
  
  /**
    * Details about the game that was created.
    */
  var Game: js.UndefOr[GameDetails] = js.undefined
}
object CreateGameResult {
  
  inline def apply(): CreateGameResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGameResult] (val x: Self) extends AnyVal {
    
    inline def setGame(value: GameDetails): Self = StObject.set(x, "Game", value.asInstanceOf[js.Any])
    
    inline def setGameUndefined: Self = StObject.set(x, "Game", js.undefined)
  }
}
