package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplaysRequest extends StObject {
  
  /**
    * The ARN of the archive from which the events are replayed.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of replays to retrieve.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * A name prefix to filter the replays returned. Only replays with name that match the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ReplayName] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
  
  /**
    * The state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.undefined
}
object ListReplaysRequest {
  
  inline def apply(): ListReplaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplaysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReplaysRequest] (val x: Self) extends AnyVal {
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: ReplayName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
