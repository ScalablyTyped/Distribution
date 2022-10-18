package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentModerationDetection extends StObject {
  
  /**
    * The content moderation label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ModerationLabel] = js.undefined
  
  /**
    * Time, in milliseconds from the beginning of the video, that the content moderation label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object ContentModerationDetection {
  
  inline def apply(): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentModerationDetection]
  }
  
  extension [Self <: ContentModerationDetection](x: Self) {
    
    inline def setModerationLabel(value: ModerationLabel): Self = StObject.set(x, "ModerationLabel", value.asInstanceOf[js.Any])
    
    inline def setModerationLabelUndefined: Self = StObject.set(x, "ModerationLabel", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
