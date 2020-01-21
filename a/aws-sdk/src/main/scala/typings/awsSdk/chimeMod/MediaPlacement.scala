package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPlacement extends js.Object {
  /**
    * The audio host URL.
    */
  var AudioHostUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen data URL.
    */
  var ScreenDataUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen sharing URL.
    */
  var ScreenSharingUrl: js.UndefOr[UriType] = js.native
  /**
    * The screen viewing URL.
    */
  var ScreenViewingUrl: js.UndefOr[UriType] = js.native
  /**
    * The signaling URL.
    */
  var SignalingUrl: js.UndefOr[UriType] = js.native
  /**
    * The turn control URL.
    */
  var TurnControlUrl: js.UndefOr[UriType] = js.native
}

object MediaPlacement {
  @scala.inline
  def apply(
    AudioHostUrl: UriType = null,
    ScreenDataUrl: UriType = null,
    ScreenSharingUrl: UriType = null,
    ScreenViewingUrl: UriType = null,
    SignalingUrl: UriType = null,
    TurnControlUrl: UriType = null
  ): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    if (AudioHostUrl != null) __obj.updateDynamic("AudioHostUrl")(AudioHostUrl.asInstanceOf[js.Any])
    if (ScreenDataUrl != null) __obj.updateDynamic("ScreenDataUrl")(ScreenDataUrl.asInstanceOf[js.Any])
    if (ScreenSharingUrl != null) __obj.updateDynamic("ScreenSharingUrl")(ScreenSharingUrl.asInstanceOf[js.Any])
    if (ScreenViewingUrl != null) __obj.updateDynamic("ScreenViewingUrl")(ScreenViewingUrl.asInstanceOf[js.Any])
    if (SignalingUrl != null) __obj.updateDynamic("SignalingUrl")(SignalingUrl.asInstanceOf[js.Any])
    if (TurnControlUrl != null) __obj.updateDynamic("TurnControlUrl")(TurnControlUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlacement]
  }
}

