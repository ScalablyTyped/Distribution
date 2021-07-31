package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelBan extends StObject {
  
  /**
    * The ARN of the channel from which a member is being banned.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The parameter of the action.
    */
  var CreatedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The time at which the ban was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The member being banned from the channel.
    */
  var Member: js.UndefOr[Identity] = js.undefined
}
object ChannelBan {
  
  @scala.inline
  def apply(): ChannelBan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBan]
  }
  
  @scala.inline
  implicit class ChannelBanMutableBuilder[Self <: ChannelBan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: Identity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
