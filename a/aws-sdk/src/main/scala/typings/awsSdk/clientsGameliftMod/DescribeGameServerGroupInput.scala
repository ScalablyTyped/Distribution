package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerGroupInput extends StObject {
  
  /**
    * A unique identifier for the game server group. Use either the name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
}
object DescribeGameServerGroupInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn): DescribeGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGameServerGroupInput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
  }
}
