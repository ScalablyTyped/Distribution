package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterGameServerInput extends StObject {
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server to deregister.
    */
  var GameServerId: typings.awsSdk.clientsGameliftMod.GameServerId
}
object DeregisterGameServerInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): DeregisterGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterGameServerInput]
  }
  
  extension [Self <: DeregisterGameServerInput](x: Self) {
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
  }
}
