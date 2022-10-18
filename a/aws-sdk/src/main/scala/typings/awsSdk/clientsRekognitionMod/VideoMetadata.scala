package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMetadata extends StObject {
  
  /**
    * Type of compression used in the analyzed video. 
    */
  var Codec: js.UndefOr[String] = js.undefined
  
  /**
    *  A description of the range of luminance values in a video, either LIMITED (16 to 235) or FULL (0 to 255). 
    */
  var ColorRange: js.UndefOr[VideoColorRange] = js.undefined
  
  /**
    * Length of the video in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    * Format of the analyzed video. Possible values are MP4, MOV and AVI. 
    */
  var Format: js.UndefOr[String] = js.undefined
  
  /**
    * Vertical pixel dimension of the video.
    */
  var FrameHeight: js.UndefOr[ULong] = js.undefined
  
  /**
    * Number of frames per second in the video.
    */
  var FrameRate: js.UndefOr[Float] = js.undefined
  
  /**
    * Horizontal pixel dimension of the video.
    */
  var FrameWidth: js.UndefOr[ULong] = js.undefined
}
object VideoMetadata {
  
  inline def apply(): VideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoMetadata]
  }
  
  extension [Self <: VideoMetadata](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setColorRange(value: VideoColorRange): Self = StObject.set(x, "ColorRange", value.asInstanceOf[js.Any])
    
    inline def setColorRangeUndefined: Self = StObject.set(x, "ColorRange", js.undefined)
    
    inline def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setFrameHeight(value: ULong): Self = StObject.set(x, "FrameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameHeightUndefined: Self = StObject.set(x, "FrameHeight", js.undefined)
    
    inline def setFrameRate(value: Float): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    inline def setFrameWidth(value: ULong): Self = StObject.set(x, "FrameWidth", value.asInstanceOf[js.Any])
    
    inline def setFrameWidthUndefined: Self = StObject.set(x, "FrameWidth", js.undefined)
  }
}
