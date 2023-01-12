package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the deleted game server group resource, with status updated to DELETE_SCHEDULED. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerGroup] = js.undefined
}
object DeleteGameServerGroupOutput {
  
  inline def apply(): DeleteGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGameServerGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
