package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMatchmakingInput extends StObject {
  
  /**
    * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same Region as this request. You can use either the configuration name or ARN value.
    */
  var ConfigurationName: MatchmakingConfigurationName
  
  /**
    * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
    */
  var Players: PlayerList
  
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}
object StartMatchmakingInput {
  
  inline def apply(ConfigurationName: MatchmakingConfigurationName, Players: PlayerList): StartMatchmakingInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchmakingInput]
  }
  
  extension [Self <: StartMatchmakingInput](x: Self) {
    
    inline def setConfigurationName(value: MatchmakingConfigurationName): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setPlayers(value: PlayerList): Self = StObject.set(x, "Players", value.asInstanceOf[js.Any])
    
    inline def setPlayersVarargs(value: Player*): Self = StObject.set(x, "Players", js.Array(value*))
    
    inline def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
    
    inline def setTicketIdUndefined: Self = StObject.set(x, "TicketId", js.undefined)
  }
}
