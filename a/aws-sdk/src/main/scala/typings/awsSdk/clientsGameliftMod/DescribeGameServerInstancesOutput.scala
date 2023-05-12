package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerInstancesOutput extends StObject {
  
  /**
    * The collection of requested game server instances.
    */
  var GameServerInstances: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServerInstances] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeGameServerInstancesOutput {
  
  inline def apply(): DescribeGameServerInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerInstancesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGameServerInstancesOutput] (val x: Self) extends AnyVal {
    
    inline def setGameServerInstances(value: GameServerInstances): Self = StObject.set(x, "GameServerInstances", value.asInstanceOf[js.Any])
    
    inline def setGameServerInstancesUndefined: Self = StObject.set(x, "GameServerInstances", js.undefined)
    
    inline def setGameServerInstancesVarargs(value: GameServerInstance*): Self = StObject.set(x, "GameServerInstances", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
