package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingFailed
  extends StObject
     with Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording
}
object RecordingFailed {
  
  inline def apply(application: String, recording: LiveRecording, timestamp: js.Date, `type`: String): RecordingFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingFailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingFailed] (val x: Self) extends AnyVal {
    
    inline def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
