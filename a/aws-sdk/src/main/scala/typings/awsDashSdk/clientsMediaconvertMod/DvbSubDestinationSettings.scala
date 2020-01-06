package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubDestinationSettings extends js.Object {
  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[DvbSubtitleAlignment] = js.native
  /**
    * Specifies the color of the rectangle behind the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.native
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.native
  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[DvbSubtitleFontColor] = js.native
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[__integerMin0Max255] = js.native
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[__integerMin96Max600] = js.native
  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset. This is used to help determine the appropriate font for rendering DVB-Sub captions.
    */
  var FontScript: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.FontScript] = js.native
  /**
    * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[__integerMin0Max96] = js.native
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.native
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[__integerMin0Max10] = js.native
  /**
    * Specifies the color of the shadow cast by the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.native
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.native
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.native
  /**
    * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
    */
  var SubtitlingType: js.UndefOr[DvbSubtitlingType] = js.native
  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.native
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[__integerMin0Max2147483647] = js.native
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[__integerMin0Max2147483647] = js.native
}

object DvbSubDestinationSettings {
  @scala.inline
  def apply(
    Alignment: DvbSubtitleAlignment = null,
    BackgroundColor: DvbSubtitleBackgroundColor = null,
    BackgroundOpacity: Int | Double = null,
    FontColor: DvbSubtitleFontColor = null,
    FontOpacity: Int | Double = null,
    FontResolution: Int | Double = null,
    FontScript: FontScript = null,
    FontSize: Int | Double = null,
    OutlineColor: DvbSubtitleOutlineColor = null,
    OutlineSize: Int | Double = null,
    ShadowColor: DvbSubtitleShadowColor = null,
    ShadowOpacity: Int | Double = null,
    ShadowXOffset: Int | Double = null,
    ShadowYOffset: Int | Double = null,
    SubtitlingType: DvbSubtitlingType = null,
    TeletextSpacing: DvbSubtitleTeletextSpacing = null,
    XPosition: Int | Double = null,
    YPosition: Int | Double = null
  ): DvbSubDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Alignment != null) __obj.updateDynamic("Alignment")(Alignment.asInstanceOf[js.Any])
    if (BackgroundColor != null) __obj.updateDynamic("BackgroundColor")(BackgroundColor.asInstanceOf[js.Any])
    if (BackgroundOpacity != null) __obj.updateDynamic("BackgroundOpacity")(BackgroundOpacity.asInstanceOf[js.Any])
    if (FontColor != null) __obj.updateDynamic("FontColor")(FontColor.asInstanceOf[js.Any])
    if (FontOpacity != null) __obj.updateDynamic("FontOpacity")(FontOpacity.asInstanceOf[js.Any])
    if (FontResolution != null) __obj.updateDynamic("FontResolution")(FontResolution.asInstanceOf[js.Any])
    if (FontScript != null) __obj.updateDynamic("FontScript")(FontScript.asInstanceOf[js.Any])
    if (FontSize != null) __obj.updateDynamic("FontSize")(FontSize.asInstanceOf[js.Any])
    if (OutlineColor != null) __obj.updateDynamic("OutlineColor")(OutlineColor.asInstanceOf[js.Any])
    if (OutlineSize != null) __obj.updateDynamic("OutlineSize")(OutlineSize.asInstanceOf[js.Any])
    if (ShadowColor != null) __obj.updateDynamic("ShadowColor")(ShadowColor.asInstanceOf[js.Any])
    if (ShadowOpacity != null) __obj.updateDynamic("ShadowOpacity")(ShadowOpacity.asInstanceOf[js.Any])
    if (ShadowXOffset != null) __obj.updateDynamic("ShadowXOffset")(ShadowXOffset.asInstanceOf[js.Any])
    if (ShadowYOffset != null) __obj.updateDynamic("ShadowYOffset")(ShadowYOffset.asInstanceOf[js.Any])
    if (SubtitlingType != null) __obj.updateDynamic("SubtitlingType")(SubtitlingType.asInstanceOf[js.Any])
    if (TeletextSpacing != null) __obj.updateDynamic("TeletextSpacing")(TeletextSpacing.asInstanceOf[js.Any])
    if (XPosition != null) __obj.updateDynamic("XPosition")(XPosition.asInstanceOf[js.Any])
    if (YPosition != null) __obj.updateDynamic("YPosition")(YPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSubDestinationSettings]
  }
}

