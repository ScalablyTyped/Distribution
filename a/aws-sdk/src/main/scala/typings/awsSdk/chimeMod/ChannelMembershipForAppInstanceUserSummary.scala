package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembershipForAppInstanceUserSummary extends StObject {
  
  var AppInstanceUserMembershipSummary: js.UndefOr[typings.awsSdk.chimeMod.AppInstanceUserMembershipSummary] = js.undefined
  
  var ChannelSummary: js.UndefOr[typings.awsSdk.chimeMod.ChannelSummary] = js.undefined
}
object ChannelMembershipForAppInstanceUserSummary {
  
  inline def apply(): ChannelMembershipForAppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipForAppInstanceUserSummary]
  }
  
  extension [Self <: ChannelMembershipForAppInstanceUserSummary](x: Self) {
    
    inline def setAppInstanceUserMembershipSummary(value: AppInstanceUserMembershipSummary): Self = StObject.set(x, "AppInstanceUserMembershipSummary", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserMembershipSummaryUndefined: Self = StObject.set(x, "AppInstanceUserMembershipSummary", js.undefined)
    
    inline def setChannelSummary(value: ChannelSummary): Self = StObject.set(x, "ChannelSummary", value.asInstanceOf[js.Any])
    
    inline def setChannelSummaryUndefined: Self = StObject.set(x, "ChannelSummary", js.undefined)
  }
}
