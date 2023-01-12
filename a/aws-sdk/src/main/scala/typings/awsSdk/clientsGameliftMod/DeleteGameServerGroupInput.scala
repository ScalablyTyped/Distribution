package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGameServerGroupInput extends StObject {
  
  /**
    * The type of delete to perform. Options include the following:    SAFE_DELETE – (default) Terminates the game server group and Amazon EC2 Auto Scaling group only when it has no game servers that are in UTILIZED status.    FORCE_DELETE – Terminates the game server group, including all active game servers regardless of their utilization status, and the Amazon EC2 Auto Scaling group.     RETAIN – Does a safe delete of the game server group but retains the Amazon EC2 Auto Scaling group as is.  
    */
  var DeleteOption: js.UndefOr[GameServerGroupDeleteOption] = js.undefined
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
}
object DeleteGameServerGroupInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn): DeleteGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameServerGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGameServerGroupInput] (val x: Self) extends AnyVal {
    
    inline def setDeleteOption(value: GameServerGroupDeleteOption): Self = StObject.set(x, "DeleteOption", value.asInstanceOf[js.Any])
    
    inline def setDeleteOptionUndefined: Self = StObject.set(x, "DeleteOption", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
  }
}
