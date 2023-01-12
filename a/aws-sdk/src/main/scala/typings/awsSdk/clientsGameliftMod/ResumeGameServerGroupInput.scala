package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeGameServerGroupInput extends StObject {
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * The activity to resume for this game server group.
    */
  var ResumeActions: GameServerGroupActions
}
object ResumeGameServerGroupInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn, ResumeActions: GameServerGroupActions): ResumeGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], ResumeActions = ResumeActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeGameServerGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeGameServerGroupInput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setResumeActions(value: GameServerGroupActions): Self = StObject.set(x, "ResumeActions", value.asInstanceOf[js.Any])
    
    inline def setResumeActionsVarargs(value: GameServerGroupAction*): Self = StObject.set(x, "ResumeActions", js.Array(value*))
  }
}
