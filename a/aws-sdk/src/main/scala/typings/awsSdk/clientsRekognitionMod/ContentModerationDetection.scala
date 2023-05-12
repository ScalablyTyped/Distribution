package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentModerationDetection extends StObject {
  
  /**
    *  The time duration of a segment in milliseconds, I.e. time elapsed from StartTimestampMillis to EndTimestampMillis. 
    */
  var DurationMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    *  The time in milliseconds defining the end of the timeline segment containing a continuously detected moderation label. 
    */
  var EndTimestampMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    * The content moderation label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ModerationLabel] = js.undefined
  
  /**
    * The time in milliseconds defining the start of the timeline segment containing a continuously detected moderation label.
    */
  var StartTimestampMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    * Time, in milliseconds from the beginning of the video, that the content moderation label was detected. Note that Timestamp is not guaranteed to be accurate to the individual frame where the moderated content first appears.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object ContentModerationDetection {
  
  inline def apply(): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentModerationDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentModerationDetection] (val x: Self) extends AnyVal {
    
    inline def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setEndTimestampMillis(value: ULong): Self = StObject.set(x, "EndTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampMillisUndefined: Self = StObject.set(x, "EndTimestampMillis", js.undefined)
    
    inline def setModerationLabel(value: ModerationLabel): Self = StObject.set(x, "ModerationLabel", value.asInstanceOf[js.Any])
    
    inline def setModerationLabelUndefined: Self = StObject.set(x, "ModerationLabel", js.undefined)
    
    inline def setStartTimestampMillis(value: ULong): Self = StObject.set(x, "StartTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampMillisUndefined: Self = StObject.set(x, "StartTimestampMillis", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
