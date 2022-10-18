package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameSessionQueueOutput extends StObject {
  
  /**
    * An object that describes the newly updated game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameSessionQueue] = js.undefined
}
object UpdateGameSessionQueueOutput {
  
  inline def apply(): UpdateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionQueueOutput]
  }
  
  extension [Self <: UpdateGameSessionQueueOutput](x: Self) {
    
    inline def setGameSessionQueue(value: GameSessionQueue): Self = StObject.set(x, "GameSessionQueue", value.asInstanceOf[js.Any])
    
    inline def setGameSessionQueueUndefined: Self = StObject.set(x, "GameSessionQueue", js.undefined)
  }
}
