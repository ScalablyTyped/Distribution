package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServerGroupsOutput extends StObject {
  
  /**
    * The game server groups' game server groups.
    */
  var GameServerGroups: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerGroups] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListGameServerGroupsOutput {
  
  inline def apply(): ListGameServerGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerGroupsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGameServerGroupsOutput] (val x: Self) extends AnyVal {
    
    inline def setGameServerGroups(value: GameServerGroups): Self = StObject.set(x, "GameServerGroups", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupsUndefined: Self = StObject.set(x, "GameServerGroups", js.undefined)
    
    inline def setGameServerGroupsVarargs(value: GameServerGroup*): Self = StObject.set(x, "GameServerGroups", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
