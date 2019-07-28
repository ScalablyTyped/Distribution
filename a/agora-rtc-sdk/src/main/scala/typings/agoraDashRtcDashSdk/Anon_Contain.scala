package typings.agoraDashRtcDashSdk

import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.contain
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contain extends js.Object {
  /**
    * Video display mode:
    *
    * - `"cover"`: Uniformly scale the video until it fills the visible boundaries (cropped).
    * One dimension of the video may have clipped contents. Refer to the `cover` option of `object-fit` in CSS.
    *
    * - `"contain"`: Uniformly scale the video until one of its dimension fits the boundary (zoomed to fit).
    * Areas that are not filled due to the disparity in the aspect ratio will be filled with black. Refer to the `contain` option of `object-fit` in CSS.
    *
    * For local streams, by default the cover mode is used for video playing and the contain mode is used for screen sharing; for remote streams, by default the cover mode is used.
    */
  var fit: js.UndefOr[cover | contain] = js.undefined
  /**
    * Sets whether to mute the playing stream.
    *
    * The `muted` flag can be used as a workaround for the browser's autoplay policy.
    *
    * On Chrome 70+ and Safari, a video stream with sound does not play until triggered by a user gesture.
    * If you want to play the video anyway without a user gesture, you can set the `muted` flag to true, so that the video is automatically played without sound.
    *
    * For more information, see [Autoplay Policy Changes](https://developers.google.com/web/updates/2017/09/autoplay-policy-changes).
    */
  var muted: js.UndefOr[Boolean] = js.undefined
}

object Anon_Contain {
  @scala.inline
  def apply(fit: cover | contain = null, muted: js.UndefOr[Boolean] = js.undefined): Anon_Contain = {
    val __obj = js.Dynamic.literal()
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    __obj.asInstanceOf[Anon_Contain]
  }
}

