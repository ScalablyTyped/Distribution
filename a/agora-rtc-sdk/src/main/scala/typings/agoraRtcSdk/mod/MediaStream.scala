package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media Stream
  *
  * The `MediaStream` interface represents a stream of media content.
  *
  * A stream consists of several tracks such as video or audio tracks. Each track is specified as an instance of [[MediaStreamTrack]].
  *
  * See [MediaStream](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream) for details.
  */
@js.native
trait MediaStream extends js.Object {
  /**
    * (Read-only) A Boolean value that returns `true` if the stream is active, or `false` otherwise.
    *
    * See [active](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/active) for details.
    */
  var active: Boolean = js.native
  /**
    * (Read-only) A [`DOMString`](https://developer.mozilla.org/en-US/docs/Web/API/DOMString) containing 36 characters denoting a universally unique identifier (UUID) for the object.
    *
    * See [MediaStream.id](https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/id) for details.
    */
  var id: String = js.native
}

object MediaStream {
  @scala.inline
  def apply(active: Boolean, id: String): MediaStream = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStream]
  }
  @scala.inline
  implicit class MediaStreamOps[Self <: MediaStream] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

