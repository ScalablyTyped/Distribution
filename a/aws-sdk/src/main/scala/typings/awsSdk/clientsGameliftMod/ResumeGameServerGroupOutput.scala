package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the resumed activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerGroup] = js.undefined
}
object ResumeGameServerGroupOutput {
  
  inline def apply(): ResumeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeGameServerGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
