package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelBansResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information for each requested ban.
    */
  var ChannelBans: js.UndefOr[ChannelBanSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested bans are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelBansResponse {
  
  @scala.inline
  def apply(): ListChannelBansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelBansResponse]
  }
  
  @scala.inline
  implicit class ListChannelBansResponseMutableBuilder[Self <: ListChannelBansResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelBans(value: ChannelBanSummaryList): Self = StObject.set(x, "ChannelBans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelBansUndefined: Self = StObject.set(x, "ChannelBans", js.undefined)
    
    @scala.inline
    def setChannelBansVarargs(value: ChannelBanSummary*): Self = StObject.set(x, "ChannelBans", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
