package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackStarted extends Event {
  /**
    * Playback control object.
    */
  var playback: Playback = js.native
}

object PlaybackStarted {
  @scala.inline
  def apply(application: String, playback: Playback, timestamp: Date, `type`: String): PlaybackStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStarted]
  }
  @scala.inline
  implicit class PlaybackStartedOps[Self <: PlaybackStarted] (val x: Self) extends AnyVal {
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
    def setPlayback(value: Playback): Self = this.set("playback", value.asInstanceOf[js.Any])
  }
  
}

