package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelBansResponse extends js.Object {
  
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
  implicit class ListChannelBansResponseOps[Self <: ListChannelBansResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelBansVarargs(value: ChannelBanSummary*): Self = this.set("ChannelBans", js.Array(value :_*))
    
    @scala.inline
    def setChannelBans(value: ChannelBanSummaryList): Self = this.set("ChannelBans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelBans: Self = this.set("ChannelBans", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
