package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TechnicalCueSegment extends StObject {
  
  /**
    * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
    */
  var Confidence: js.UndefOr[SegmentConfidence] = js.undefined
  
  /**
    * The type of the technical cue.
    */
  var Type: js.UndefOr[TechnicalCueType] = js.undefined
}
object TechnicalCueSegment {
  
  inline def apply(): TechnicalCueSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnicalCueSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TechnicalCueSegment] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: SegmentConfidence): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setType(value: TechnicalCueType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
