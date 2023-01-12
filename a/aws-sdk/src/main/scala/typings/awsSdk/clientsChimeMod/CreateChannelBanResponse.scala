package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelBanResponse extends StObject {
  
  /**
    * The ARN of the response to the ban request.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ChannelArn and BannedIdentity of the member in the ban response.
    */
  var Member: js.UndefOr[Identity] = js.undefined
}
object CreateChannelBanResponse {
  
  inline def apply(): CreateChannelBanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelBanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelBanResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
