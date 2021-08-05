package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelBanRequest extends StObject {
  
  /**
    * The ARN of the ban request.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the member being banned.
    */
  var MemberArn: ChimeArn
}
object CreateChannelBanRequest {
  
  inline def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): CreateChannelBanRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelBanRequest]
  }
  
  extension [Self <: CreateChannelBanRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
