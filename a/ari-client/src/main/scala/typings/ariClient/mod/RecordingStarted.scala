package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingStarted
  extends StObject
     with Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording
}
object RecordingStarted {
  
  inline def apply(application: String, recording: LiveRecording, timestamp: Date, `type`: String): RecordingStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingStarted]
  }
  
  extension [Self <: RecordingStarted](x: Self) {
    
    inline def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
