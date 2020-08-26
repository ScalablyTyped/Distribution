package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaPlacement extends js.Object {
  /**
    * The audio fallback URL.
    */
  var AudioFallbackUrl: js.UndefOr[UriType] = js.native
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
  def apply(): MediaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlacement]
  }
  @scala.inline
  implicit class MediaPlacementOps[Self <: MediaPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioFallbackUrl(value: UriType): Self = this.set("AudioFallbackUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioFallbackUrl: Self = this.set("AudioFallbackUrl", js.undefined)
    @scala.inline
    def setAudioHostUrl(value: UriType): Self = this.set("AudioHostUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioHostUrl: Self = this.set("AudioHostUrl", js.undefined)
    @scala.inline
    def setScreenDataUrl(value: UriType): Self = this.set("ScreenDataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenDataUrl: Self = this.set("ScreenDataUrl", js.undefined)
    @scala.inline
    def setScreenSharingUrl(value: UriType): Self = this.set("ScreenSharingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenSharingUrl: Self = this.set("ScreenSharingUrl", js.undefined)
    @scala.inline
    def setScreenViewingUrl(value: UriType): Self = this.set("ScreenViewingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenViewingUrl: Self = this.set("ScreenViewingUrl", js.undefined)
    @scala.inline
    def setSignalingUrl(value: UriType): Self = this.set("SignalingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignalingUrl: Self = this.set("SignalingUrl", js.undefined)
    @scala.inline
    def setTurnControlUrl(value: UriType): Self = this.set("TurnControlUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnControlUrl: Self = this.set("TurnControlUrl", js.undefined)
  }
  
}

