package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource with updated properties. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerGroup] = js.undefined
}
object UpdateGameServerGroupOutput {
  
  inline def apply(): UpdateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameServerGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
