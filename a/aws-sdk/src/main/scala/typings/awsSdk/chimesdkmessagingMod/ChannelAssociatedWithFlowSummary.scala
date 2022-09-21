package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelAssociatedWithFlowSummary extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The channel's metadata.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.Metadata] = js.undefined
  
  /**
    * The mode of the channel.
    */
  var Mode: js.UndefOr[ChannelMode] = js.undefined
  
  /**
    * The name of the channel flow.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.undefined
  
  /**
    * The channel's privacy setting.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
}
object ChannelAssociatedWithFlowSummary {
  
  inline def apply(): ChannelAssociatedWithFlowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelAssociatedWithFlowSummary]
  }
  
  extension [Self <: ChannelAssociatedWithFlowSummary](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
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
