package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTechnicalCueDetectionFilter extends StObject {
  
  /**
    *  A filter that allows you to control the black frame detection by specifying the black levels and pixel coverage of black pixels in a frame. Videos can come from multiple sources, formats, and time periods, with different standards and varying noise levels for black frames that need to be accounted for. 
    */
  var BlackFrame: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BlackFrame] = js.undefined
  
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence level lower than this specified value. If you don't specify MinSegmentConfidence, GetSegmentDetection returns segments with confidence values greater than or equal to 50 percent.
    */
  var MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
}
object StartTechnicalCueDetectionFilter {
  
  inline def apply(): StartTechnicalCueDetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTechnicalCueDetectionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTechnicalCueDetectionFilter] (val x: Self) extends AnyVal {
    
    inline def setBlackFrame(value: BlackFrame): Self = StObject.set(x, "BlackFrame", value.asInstanceOf[js.Any])
    
    inline def setBlackFrameUndefined: Self = StObject.set(x, "BlackFrame", js.undefined)
    
    inline def setMinSegmentConfidence(value: SegmentConfidence): Self = StObject.set(x, "MinSegmentConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinSegmentConfidenceUndefined: Self = StObject.set(x, "MinSegmentConfidence", js.undefined)
  }
}
