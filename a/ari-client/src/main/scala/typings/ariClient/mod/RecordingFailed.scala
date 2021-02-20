package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingFailed extends Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording = js.native
}
object RecordingFailed {
  
  @scala.inline
  def apply(application: String, recording: LiveRecording, timestamp: Date, `type`: String): RecordingFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingFailed]
  }
  
  @scala.inline
  implicit class RecordingFailedMutableBuilder[Self <: RecordingFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
