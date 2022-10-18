package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the suspended activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerGroup] = js.undefined
}
object SuspendGameServerGroupOutput {
  
  inline def apply(): SuspendGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendGameServerGroupOutput]
  }
  
  extension [Self <: SuspendGameServerGroupOutput](x: Self) {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
