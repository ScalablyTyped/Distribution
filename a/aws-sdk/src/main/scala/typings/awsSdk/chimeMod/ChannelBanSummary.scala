package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelBanSummary extends StObject {
  
  /**
    * The member being banned from a channel.
    */
  var Member: js.UndefOr[Identity] = js.undefined
}
object ChannelBanSummary {
  
  @scala.inline
  def apply(): ChannelBanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBanSummary]
  }
  
  @scala.inline
  implicit class ChannelBanSummaryMutableBuilder[Self <: ChannelBanSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
