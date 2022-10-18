package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowMediaStreamRequest extends StObject {
  
  /**
    * The attributes that you want to assign to the media stream.
    */
  var Attributes: js.UndefOr[MediaStreamAttributesRequest] = js.undefined
  
  /**
    * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to 90000. If the media stream type is audio, set this value to either 48000 or 96000.
    */
  var ClockRate: js.UndefOr[integer] = js.undefined
  
  /**
    * Description
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var FlowArn: string
  
  /**
    * The name of the media stream that you want to update.
    */
  var MediaStreamName: string
  
  /**
    * The type of media stream.
    */
  var MediaStreamType: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.MediaStreamType] = js.undefined
  
  /**
    * The resolution of the video.
    */
  var VideoFormat: js.UndefOr[string] = js.undefined
}
object UpdateFlowMediaStreamRequest {
  
  inline def apply(FlowArn: string, MediaStreamName: string): UpdateFlowMediaStreamRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowMediaStreamRequest]
  }
  
  extension [Self <: UpdateFlowMediaStreamRequest](x: Self) {
    
    inline def setAttributes(value: MediaStreamAttributesRequest): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setClockRate(value: integer): Self = StObject.set(x, "ClockRate", value.asInstanceOf[js.Any])
    
    inline def setClockRateUndefined: Self = StObject.set(x, "ClockRate", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamType(value: MediaStreamType): Self = StObject.set(x, "MediaStreamType", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamTypeUndefined: Self = StObject.set(x, "MediaStreamType", js.undefined)
    
    inline def setVideoFormat(value: string): Self = StObject.set(x, "VideoFormat", value.asInstanceOf[js.Any])
    
    inline def setVideoFormatUndefined: Self = StObject.set(x, "VideoFormat", js.undefined)
  }
}
