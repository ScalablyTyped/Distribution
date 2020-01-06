package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelector extends js.Object {
  /**
    * Specifies the color space of an input. This setting works in tandem with colorSpaceUsage and a video description's colorSpaceSettingsChoice to determine if any conversion will be performed.
    */
  var ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.native
  /**
    * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace field will be used. fallback means that when the input does include color space data, that data will be used, but when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is sometimes missing color space data, but when it does have color space data, that data is correct. force means to always use the value in colorSpace. Choose force if your input usually has no color space data or might have unreliable color space data.
    */
  var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.native
  /**
    * The video selector settings.
    */
  var SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.native
}

object VideoSelector {
  @scala.inline
  def apply(
    ColorSpace: VideoSelectorColorSpace = null,
    ColorSpaceUsage: VideoSelectorColorSpaceUsage = null,
    SelectorSettings: VideoSelectorSettings = null
  ): VideoSelector = {
    val __obj = js.Dynamic.literal()
    if (ColorSpace != null) __obj.updateDynamic("ColorSpace")(ColorSpace.asInstanceOf[js.Any])
    if (ColorSpaceUsage != null) __obj.updateDynamic("ColorSpaceUsage")(ColorSpaceUsage.asInstanceOf[js.Any])
    if (SelectorSettings != null) __obj.updateDynamic("SelectorSettings")(SelectorSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelector]
  }
}

