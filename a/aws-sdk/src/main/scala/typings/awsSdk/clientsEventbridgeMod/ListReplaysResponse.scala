package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplaysResponse extends StObject {
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
  
  /**
    * An array of Replay objects that contain information about the replay.
    */
  var Replays: js.UndefOr[ReplayList] = js.undefined
}
object ListReplaysResponse {
  
  inline def apply(): ListReplaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplaysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReplaysResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReplays(value: ReplayList): Self = StObject.set(x, "Replays", value.asInstanceOf[js.Any])
    
    inline def setReplaysUndefined: Self = StObject.set(x, "Replays", js.undefined)
    
    inline def setReplaysVarargs(value: Replay*): Self = StObject.set(x, "Replays", js.Array(value*))
  }
}
