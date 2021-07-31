package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembershipSummary extends StObject {
  
  /**
    * A member's summary data.
    */
  var Member: js.UndefOr[Identity] = js.undefined
}
object ChannelMembershipSummary {
  
  @scala.inline
  def apply(): ChannelMembershipSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipSummary]
  }
  
  @scala.inline
  implicit class ChannelMembershipSummaryMutableBuilder[Self <: ChannelMembershipSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
