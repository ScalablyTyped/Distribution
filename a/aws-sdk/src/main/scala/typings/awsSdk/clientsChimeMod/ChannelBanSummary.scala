package typings.awsSdk.clientsChimeMod

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
  
  inline def apply(): ChannelBanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBanSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelBanSummary] (val x: Self) extends AnyVal {
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
