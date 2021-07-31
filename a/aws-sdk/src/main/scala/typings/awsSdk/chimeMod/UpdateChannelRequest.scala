package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The metadata of the channel.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
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
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, Mode: ChannelMode, Name: NonEmptyResourceName): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestMutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
