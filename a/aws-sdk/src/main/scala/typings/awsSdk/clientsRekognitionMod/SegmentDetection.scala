package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDetection extends StObject {
  
  /**
    *  The duration of a video segment, expressed in frames. 
    */
  var DurationFrames: js.UndefOr[ULong] = js.undefined
  
  /**
    * The duration of the detected segment in milliseconds. 
    */
  var DurationMillis: js.UndefOr[ULong] = js.undefined
  
  /**
    * The duration of the timecode for the detected segment in SMPTE format.
    */
  var DurationSMPTE: js.UndefOr[Timecode] = js.undefined
  
  /**
    *  The frame number at the end of a video segment, using a frame index that starts with 0. 
    */
  var EndFrameNumber: js.UndefOr[ULong] = js.undefined
  
  /**
    * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment. EndTimecode is in HH:MM:SS:fr format (and ;fr for drop frame-rates).
    */
  var EndTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined
  
  /**
    * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
    */
  var EndTimestampMillis: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If the segment is a shot detection, contains information about the shot detection.
    */
  var ShotSegment: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ShotSegment] = js.undefined
  
  /**
    *  The frame number of the start of a video segment, using a frame index that starts with 0. 
    */
  var StartFrameNumber: js.UndefOr[ULong] = js.undefined
  
  /**
    * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment. StartTimecode is in HH:MM:SS:fr format (and ;fr for drop frame-rates). 
    */
  var StartTimecodeSMPTE: js.UndefOr[Timecode] = js.undefined
  
  /**
    * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down. For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100 millis.
    */
  var StartTimestampMillis: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * If the segment is a technical cue, contains information about the technical cue.
    */
  var TechnicalCueSegment: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TechnicalCueSegment] = js.undefined
  
  /**
    * The type of the segment. Valid values are TECHNICAL_CUE and SHOT.
    */
  var Type: js.UndefOr[SegmentType] = js.undefined
}
object SegmentDetection {
  
  inline def apply(): SegmentDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDetection]
  }
  
  extension [Self <: SegmentDetection](x: Self) {
    
    inline def setDurationFrames(value: ULong): Self = StObject.set(x, "DurationFrames", value.asInstanceOf[js.Any])
    
    inline def setDurationFramesUndefined: Self = StObject.set(x, "DurationFrames", js.undefined)
    
    inline def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setDurationSMPTE(value: Timecode): Self = StObject.set(x, "DurationSMPTE", value.asInstanceOf[js.Any])
    
    inline def setDurationSMPTEUndefined: Self = StObject.set(x, "DurationSMPTE", js.undefined)
    
    inline def setEndFrameNumber(value: ULong): Self = StObject.set(x, "EndFrameNumber", value.asInstanceOf[js.Any])
    
    inline def setEndFrameNumberUndefined: Self = StObject.set(x, "EndFrameNumber", js.undefined)
    
    inline def setEndTimecodeSMPTE(value: Timecode): Self = StObject.set(x, "EndTimecodeSMPTE", value.asInstanceOf[js.Any])
    
    inline def setEndTimecodeSMPTEUndefined: Self = StObject.set(x, "EndTimecodeSMPTE", js.undefined)
    
    inline def setEndTimestampMillis(value: Timestamp): Self = StObject.set(x, "EndTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampMillisUndefined: Self = StObject.set(x, "EndTimestampMillis", js.undefined)
    
    inline def setShotSegment(value: ShotSegment): Self = StObject.set(x, "ShotSegment", value.asInstanceOf[js.Any])
    
    inline def setShotSegmentUndefined: Self = StObject.set(x, "ShotSegment", js.undefined)
    
    inline def setStartFrameNumber(value: ULong): Self = StObject.set(x, "StartFrameNumber", value.asInstanceOf[js.Any])
    
    inline def setStartFrameNumberUndefined: Self = StObject.set(x, "StartFrameNumber", js.undefined)
    
    inline def setStartTimecodeSMPTE(value: Timecode): Self = StObject.set(x, "StartTimecodeSMPTE", value.asInstanceOf[js.Any])
    
    inline def setStartTimecodeSMPTEUndefined: Self = StObject.set(x, "StartTimecodeSMPTE", js.undefined)
    
    inline def setStartTimestampMillis(value: Timestamp): Self = StObject.set(x, "StartTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampMillisUndefined: Self = StObject.set(x, "StartTimestampMillis", js.undefined)
    
    inline def setTechnicalCueSegment(value: TechnicalCueSegment): Self = StObject.set(x, "TechnicalCueSegment", value.asInstanceOf[js.Any])
    
    inline def setTechnicalCueSegmentUndefined: Self = StObject.set(x, "TechnicalCueSegment", js.undefined)
    
    inline def setType(value: SegmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
