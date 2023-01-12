package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUserMembershipSummary extends StObject {
  
  /**
    * The time at which an AppInstanceUser last marked a channel as read.
    */
  var ReadMarkerTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the SubChannel that the AppInstanceUser is a member of.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.SubChannelId] = js.undefined
  
  /**
    * The type of ChannelMembership.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object AppInstanceUserMembershipSummary {
  
  inline def apply(): AppInstanceUserMembershipSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserMembershipSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceUserMembershipSummary] (val x: Self) extends AnyVal {
    
    inline def setReadMarkerTimestamp(value: js.Date): Self = StObject.set(x, "ReadMarkerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadMarkerTimestampUndefined: Self = StObject.set(x, "ReadMarkerTimestamp", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
