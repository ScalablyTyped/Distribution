package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  /**
    * A set of values, expressed in milliseconds, that indicates the amount of latency that a player experiences when connected to @aws; Regions. If this property is present, FlexMatch considers placing the match only in Regions for which latency is reported.  If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the ticket is not matchable. 
    */
  var LatencyInMs: js.UndefOr[LatencyMap] = js.undefined
  
  /**
    * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must match the playerAttributes used in a matchmaking rule set. Example: "PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}.
    */
  var PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined
  
  /**
    * A unique identifier for a player
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
    */
  var Team: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object Player {
  
  inline def apply(): Player = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setLatencyInMs(value: LatencyMap): Self = StObject.set(x, "LatencyInMs", value.asInstanceOf[js.Any])
    
    inline def setLatencyInMsUndefined: Self = StObject.set(x, "LatencyInMs", js.undefined)
    
    inline def setPlayerAttributes(value: PlayerAttributeMap): Self = StObject.set(x, "PlayerAttributes", value.asInstanceOf[js.Any])
    
    inline def setPlayerAttributesUndefined: Self = StObject.set(x, "PlayerAttributes", js.undefined)
    
    inline def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    inline def setTeam(value: NonZeroAndMaxString): Self = StObject.set(x, "Team", value.asInstanceOf[js.Any])
    
    inline def setTeamUndefined: Self = StObject.set(x, "Team", js.undefined)
  }
}
