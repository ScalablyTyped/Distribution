package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserArn of the user that makes the API call.
    */
  var ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The metadata for the update request.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The mode of the update request.
    */
  var Mode: ChannelMode
  
  /**
    * The name of the channel.
    */
  var Name: NonEmptyResourceName
}
object UpdateChannelRequest {
  
  inline def apply(ChannelArn: ChimeArn, Mode: ChannelMode, Name: NonEmptyResourceName): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  extension [Self <: UpdateChannelRequest](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setChimeBearerUndefined: Self = StObject.set(x, "ChimeBearer", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
