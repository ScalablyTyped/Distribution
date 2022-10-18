package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimGameServerInput extends StObject {
  
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on game servers using ListGameServers or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerData] = js.undefined
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value. If you are not specifying a game server to claim, this value identifies where you want GameLift FleetIQ to look for an available game server to claim. 
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift FleetIQ searches for an available game server in the specified game server group.
    */
  var GameServerId: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerId] = js.undefined
}
object ClaimGameServerInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn): ClaimGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimGameServerInput]
  }
  
  extension [Self <: ClaimGameServerInput](x: Self) {
    
    inline def setGameServerData(value: GameServerData): Self = StObject.set(x, "GameServerData", value.asInstanceOf[js.Any])
    
    inline def setGameServerDataUndefined: Self = StObject.set(x, "GameServerData", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
    
    inline def setGameServerIdUndefined: Self = StObject.set(x, "GameServerId", js.undefined)
  }
}
