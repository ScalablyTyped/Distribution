package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerInput extends StObject {
  
  /**
    * A unique identifier for the game server group where the game server is running.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server information to be retrieved.
    */
  var GameServerId: typings.awsSdk.clientsGameliftMod.GameServerId
}
object DescribeGameServerInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): DescribeGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGameServerInput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
  }
}
