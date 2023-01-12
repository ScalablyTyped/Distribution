package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStream extends StObject {
  
  /**
    * Attributes that are related to the media stream.
    */
  var Attributes: js.UndefOr[MediaStreamAttributes] = js.undefined
  
  /**
    * The sample rate for the stream. This value is measured in Hz.
    */
  var ClockRate: js.UndefOr[integer] = js.undefined
  
  /**
    * A description that can help you quickly identify what your media stream is used for.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the receiver.
    */
  var Fmt: integer
  
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
object MediaStream {
  
  inline def apply(Fmt: integer, MediaStreamId: integer, MediaStreamName: string, MediaStreamType: MediaStreamType): MediaStream = {
    val __obj = js.Dynamic.literal(Fmt = Fmt.asInstanceOf[js.Any], MediaStreamId = MediaStreamId.asInstanceOf[js.Any], MediaStreamName = MediaStreamName.asInstanceOf[js.Any], MediaStreamType = MediaStreamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStream] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: MediaStreamAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setClockRate(value: integer): Self = StObject.set(x, "ClockRate", value.asInstanceOf[js.Any])
    
    inline def setClockRateUndefined: Self = StObject.set(x, "ClockRate", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFmt(value: integer): Self = StObject.set(x, "Fmt", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamId(value: integer): Self = StObject.set(x, "MediaStreamId", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamType(value: MediaStreamType): Self = StObject.set(x, "MediaStreamType", value.asInstanceOf[js.Any])
    
    inline def setVideoFormat(value: string): Self = StObject.set(x, "VideoFormat", value.asInstanceOf[js.Any])
    
    inline def setVideoFormatUndefined: Self = StObject.set(x, "VideoFormat", js.undefined)
  }
}
