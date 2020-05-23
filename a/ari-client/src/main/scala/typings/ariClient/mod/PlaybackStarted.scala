package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackStarted extends Event {
  /* Properties */
  var playback: Playback
}

object PlaybackStarted {
  @scala.inline
  def apply(
    application: String,
    playback: Playback,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): PlaybackStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], playback = playback.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStarted]
  }
}

