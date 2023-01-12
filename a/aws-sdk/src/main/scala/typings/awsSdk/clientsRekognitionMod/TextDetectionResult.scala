package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDetectionResult extends StObject {
  
  /**
    * Details about text detected in a video.
    */
  var TextDetection: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TextDetection] = js.undefined
  
  /**
    * The time, in milliseconds from the start of the video, that the text was detected. Note that Timestamp is not guaranteed to be accurate to the individual frame where the text first appears.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object TextDetectionResult {
  
  inline def apply(): TextDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDetectionResult] (val x: Self) extends AnyVal {
    
    inline def setTextDetection(value: TextDetection): Self = StObject.set(x, "TextDetection", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionUndefined: Self = StObject.set(x, "TextDetection", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
