package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingFinished
  extends StObject
     with Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording
}
object RecordingFinished {
  
  inline def apply(application: String, recording: LiveRecording, timestamp: js.Date, `type`: String): RecordingFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingFinished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingFinished] (val x: Self) extends AnyVal {
    
    inline def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
