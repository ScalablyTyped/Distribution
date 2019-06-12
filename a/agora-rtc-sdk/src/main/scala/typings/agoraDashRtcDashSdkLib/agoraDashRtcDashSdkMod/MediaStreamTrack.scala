package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media Stream Track
  *
  * This interface represents a single media track within a stream, for example an audio track or a video track.
  *
  * See [MediaStreamTrack](https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamTrack) for details.
  *
  */
trait MediaStreamTrack extends js.Object {
  var kind: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.audio | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.video
}

object MediaStreamTrack {
  @scala.inline
  def apply(
    kind: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.audio | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.video
  ): MediaStreamTrack = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaStreamTrack]
  }
}

