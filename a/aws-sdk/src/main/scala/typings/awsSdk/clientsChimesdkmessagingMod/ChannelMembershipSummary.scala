package typings.awsSdk.clientsChimesdkmessagingMod

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
  
  inline def apply(): ChannelMembershipSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipSummary]
  }
  
  extension [Self <: ChannelMembershipSummary](x: Self) {
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
