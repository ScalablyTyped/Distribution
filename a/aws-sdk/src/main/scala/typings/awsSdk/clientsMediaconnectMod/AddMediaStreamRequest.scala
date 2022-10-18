package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMediaStreamRequest extends StObject {
  
  /**
    * The attributes that you want to assign to the new media stream.
    */
  var Attributes: js.UndefOr[MediaStreamAttributesRequest] = js.undefined
  
  /**
    * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to 90000. If the media stream type is audio, set this value to either 48000 or 96000.
    */
  var ClockRate: js.UndefOr[integer] = js.undefined
  
  /**
    * A description that can help you quickly identify what your media stream is used for.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * A unique identifier for the media stream.
    */
  var MediaStreamId: integer
  
  /**
    * A name that helps you distinguish one media stream from another.
    */
  var MediaStreamName: string
  
  /**
    * The type of media stream.
    */
  var MediaStreamType: typings.awsSdk.clientsMediaconnectMod.MediaStreamType
  
  /**
    * The resolution of the video.
    */
  var VideoFormat: js.UndefOr[string] = js.undefined
}
object AddMediaStreamRequest {
  
  inline def apply(MediaStreamId: integer, MediaStreamName: string, MediaStreamType: MediaStreamType): AddMediaStreamRequest = {
    val __obj = js.Dynamic.literal(MediaStreamId = MediaStreamId.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any], MediaStreamType = MediaStreamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMediaStreamRequest]
  }
  
  extension [Self <: AddMediaStreamRequest](x: Self) {
    
    inline def setAttributes(value: MediaStreamAttributesRequest): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setClockRate(value: integer): Self = StObject.set(x, "ClockRate", value.asInstanceOf[js.Any])
    
    inline def setClockRateUndefined: Self = StObject.set(x, "ClockRate", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMediaStreamId(value: integer): Self = StObject.set(x, "MediaStreamId", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamType(value: MediaStreamType): Self = StObject.set(x, "MediaStreamType", value.asInstanceOf[js.Any])
    
    inline def setVideoFormat(value: string): Self = StObject.set(x, "VideoFormat", value.asInstanceOf[js.Any])
    
    inline def setVideoFormatUndefined: Self = StObject.set(x, "VideoFormat", js.undefined)
  }
}
