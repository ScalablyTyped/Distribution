package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedProperties extends StObject {
  
  /**
    * The detected duration of the input file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The detected file size of the input file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * The detected frame rate of the input file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.undefined
  
  /**
    * The detected height of the input file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The detected width of the input file, in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.undefined
}
object DetectedProperties {
  
  inline def apply(): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProperties]
  }
  
  extension [Self <: DetectedProperties](x: Self) {
    
    inline def setDurationMillis(value: NullableLong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setFileSize(value: NullableLong): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "FileSize", js.undefined)
    
    inline def setFrameRate(value: FloatString): Self = StObject.set(x, "FrameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "FrameRate", js.undefined)
    
    inline def setHeight(value: NullableInteger): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setWidth(value: NullableInteger): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
