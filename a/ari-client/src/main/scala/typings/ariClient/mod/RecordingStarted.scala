package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class RecordingStartedOps[Self <: RecordingStarted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecording(value: LiveRecording): Self = this.set("recording", value.asInstanceOf[js.Any])
  }
  
}

