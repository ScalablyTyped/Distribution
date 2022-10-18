package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUserMembershipSummary extends StObject {
  
  /**
    * The time at which a message was last read.
    */
  var ReadMarkerTimestamp: js.UndefOr[js.Date] = js.undefined
  
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
  
  extension [Self <: AppInstanceUserMembershipSummary](x: Self) {
    
    inline def setReadMarkerTimestamp(value: js.Date): Self = StObject.set(x, "ReadMarkerTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadMarkerTimestampUndefined: Self = StObject.set(x, "ReadMarkerTimestamp", js.undefined)
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
