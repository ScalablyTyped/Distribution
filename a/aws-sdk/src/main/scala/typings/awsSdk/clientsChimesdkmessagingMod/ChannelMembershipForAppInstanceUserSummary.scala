package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembershipForAppInstanceUserSummary extends StObject {
  
  /**
    * Returns the channel membership data for an AppInstance.
    */
  var AppInstanceUserMembershipSummary: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.AppInstanceUserMembershipSummary] = js.undefined
  
  /**
    * Returns the channel data for an AppInstance.
    */
  var ChannelSummary: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.ChannelSummary] = js.undefined
}
object ChannelMembershipForAppInstanceUserSummary {
  
  inline def apply(): ChannelMembershipForAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipForAppInstanceUserSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMembershipForAppInstanceUserSummary] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserMembershipSummary(value: AppInstanceUserMembershipSummary): Self = StObject.set(x, "AppInstanceUserMembershipSummary", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserMembershipSummaryUndefined: Self = StObject.set(x, "AppInstanceUserMembershipSummary", js.undefined)
    
    inline def setChannelSummary(value: ChannelSummary): Self = StObject.set(x, "ChannelSummary", value.asInstanceOf[js.Any])
    
    inline def setChannelSummaryUndefined: Self = StObject.set(x, "ChannelSummary", js.undefined)
  }
}
