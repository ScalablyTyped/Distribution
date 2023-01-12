package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameResult extends StObject {
  
  /**
    * The details of the game.
    */
  var Game: js.UndefOr[GameDetails] = js.undefined
}
object UpdateGameResult {
  
  inline def apply(): UpdateGameResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGameResult] (val x: Self) extends AnyVal {
    
    inline def setGame(value: GameDetails): Self = StObject.set(x, "Game", value.asInstanceOf[js.Any])
    
    inline def setGameUndefined: Self = StObject.set(x, "Game", js.undefined)
  }
}
