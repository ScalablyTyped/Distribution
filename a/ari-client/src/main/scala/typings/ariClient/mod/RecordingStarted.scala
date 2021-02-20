package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingStarted extends Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording = js.native
}
object RecordingStarted {
  
  @scala.inline
  def apply(application: String, recording: LiveRecording, timestamp: Date, `type`: String): RecordingStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingStarted]
  }
  
  @scala.inline
  implicit class RecordingStartedMutableBuilder[Self <: RecordingStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
