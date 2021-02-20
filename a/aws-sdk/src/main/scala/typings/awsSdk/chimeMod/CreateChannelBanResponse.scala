package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelBanResponse extends StObject {
  
  /**
    * The ARN of the response to the ban request.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The ChannelArn and BannedIdentity of the member in the ban response.
    */
  var Member: js.UndefOr[Identity] = js.native
}
object CreateChannelBanResponse {
  
  @scala.inline
  def apply(): CreateChannelBanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelBanResponse]
  }
  
  @scala.inline
  implicit class CreateChannelBanResponseMutableBuilder[Self <: CreateChannelBanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
