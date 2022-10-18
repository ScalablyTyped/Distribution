package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubChannelSummary extends StObject {
  
  /**
    * The number of members in a SubChannel.
    */
  var MembershipCount: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.MembershipCount] = js.undefined
  
  /**
    * The unique ID of a SubChannel.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
}
object SubChannelSummary {
  
  inline def apply(): SubChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubChannelSummary]
  }
  
  extension [Self <: SubChannelSummary](x: Self) {
    
    inline def setMembershipCount(value: MembershipCount): Self = StObject.set(x, "MembershipCount", value.asInstanceOf[js.Any])
    
    inline def setMembershipCountUndefined: Self = StObject.set(x, "MembershipCount", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
