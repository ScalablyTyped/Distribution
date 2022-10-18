package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelBanRequest extends StObject {
  
  /**
    * The ARN of the channel from which the user is banned.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ARN of the member being banned.
    */
  var MemberArn: ChimeArn
}
object DescribeChannelBanRequest {
  
  inline def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): DescribeChannelBanRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelBanRequest]
  }
  
  extension [Self <: DescribeChannelBanRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
