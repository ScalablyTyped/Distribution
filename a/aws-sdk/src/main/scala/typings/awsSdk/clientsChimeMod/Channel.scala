package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The AppInstanceUser who created the channel.
    */
  var CreatedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The time at which the AppInstanceUser created the channel.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a member sent the last message in the channel.
    */
  var LastMessageTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a channel was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The channel's metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The mode of the channel.
    */
  var Mode: js.UndefOr[ChannelMode] = js.undefined
  
  /**
    * The name of the channel.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.undefined
  
  /**
    * The channel's privacy setting.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
}
object Channel {
  
  inline def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setCreatedBy(value: Identity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastMessageTimestamp(value: js.Date): Self = StObject.set(x, "LastMessageTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastMessageTimestampUndefined: Self = StObject.set(x, "LastMessageTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPrivacy(value: ChannelPrivacy): Self = StObject.set(x, "Privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "Privacy", js.undefined)
  }
}
