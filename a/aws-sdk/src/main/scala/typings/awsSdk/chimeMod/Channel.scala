package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The administrator who created the channel.
    */
  var CreatedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The time at which the administrator created the channel.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which a member sent the last message in a session.
    */
  var LastMessageTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which a channel was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The metadata of the channel.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
  /**
    * The mode of the channel.
    */
  var Mode: js.UndefOr[ChannelMode] = js.undefined
  
  /**
    * The name of the channel.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.undefined
  
  /**
    * The channel's privacy setting, PUBLIC or HIDDEN.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
}
object Channel {
  
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setLastMessageTimestamp(value: Timestamp): Self = StObject.set(x, "LastMessageTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageTimestampUndefined: Self = StObject.set(x, "LastMessageTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPrivacy(value: ChannelPrivacy): Self = StObject.set(x, "Privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyUndefined: Self = StObject.set(x, "Privacy", js.undefined)
  }
}
