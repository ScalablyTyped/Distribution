package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchGameSessionsOutput extends StObject {
  
  /**
    * A collection of objects containing game session properties for each session that matches the request.
    */
  var GameSessions: js.UndefOr[GameSessionList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object SearchGameSessionsOutput {
  
  inline def apply(): SearchGameSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchGameSessionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchGameSessionsOutput] (val x: Self) extends AnyVal {
    
    inline def setGameSessions(value: GameSessionList): Self = StObject.set(x, "GameSessions", value.asInstanceOf[js.Any])
    
    inline def setGameSessionsUndefined: Self = StObject.set(x, "GameSessions", js.undefined)
    
    inline def setGameSessionsVarargs(value: GameSession*): Self = StObject.set(x, "GameSessions", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
