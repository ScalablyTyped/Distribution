package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelModeratorsResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The information about and names of each moderator.
    */
  var ChannelModerators: js.UndefOr[ChannelModeratorSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested moderators are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.undefined
}
object ListChannelModeratorsResponse {
  
  inline def apply(): ListChannelModeratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelModeratorsResponse]
  }
  
  extension [Self <: ListChannelModeratorsResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setChannelModerators(value: ChannelModeratorSummaryList): Self = StObject.set(x, "ChannelModerators", value.asInstanceOf[js.Any])
    
    inline def setChannelModeratorsUndefined: Self = StObject.set(x, "ChannelModerators", js.undefined)
    
    inline def setChannelModeratorsVarargs(value: ChannelModeratorSummary*): Self = StObject.set(x, "ChannelModerators", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
