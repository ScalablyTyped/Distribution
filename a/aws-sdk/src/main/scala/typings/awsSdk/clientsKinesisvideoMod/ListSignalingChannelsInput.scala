package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSignalingChannelsInput extends StObject {
  
  /**
    * Optional: Returns only the channels that satisfy a specific condition.
    */
  var ChannelNameCondition: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ChannelNameCondition] = js.undefined
  
  /**
    * The maximum number of channels to return in the response. The default is 500.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined
  
  /**
    * If you specify this parameter, when the result of a ListSignalingChannels operation is truncated, the call returns the NextToken in the response. To get another batch of channels, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
}
object ListSignalingChannelsInput {
  
  inline def apply(): ListSignalingChannelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSignalingChannelsInput] (val x: Self) extends AnyVal {
    
    inline def setChannelNameCondition(value: ChannelNameCondition): Self = StObject.set(x, "ChannelNameCondition", value.asInstanceOf[js.Any])
    
    inline def setChannelNameConditionUndefined: Self = StObject.set(x, "ChannelNameCondition", js.undefined)
    
    inline def setMaxResults(value: ListStreamsInputLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
