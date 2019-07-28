package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbSubDestinationSettings extends js.Object {
  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined
  /**
    * Specifies the color of the rectangle behind the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.
  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset. This is used to help determine the appropriate font for rendering DVB-Sub captions.
    */
  var FontScript: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.FontScript] = js.undefined
  /**
    * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[__integerMin0Max96] = js.undefined
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
  /**
    * Specifies the color of the shadow cast by the captions.
  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
}

object DvbSubDestinationSettings {
  @scala.inline
  def apply(
    Alignment: DvbSubtitleAlignment = null,
    BackgroundColor: DvbSubtitleBackgroundColor = null,
    BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
    FontColor: DvbSubtitleFontColor = null,
    FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
    FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
    FontScript: FontScript = null,
    FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
    OutlineColor: DvbSubtitleOutlineColor = null,
    OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
    ShadowColor: DvbSubtitleShadowColor = null,
    ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
    ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
    ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
    TeletextSpacing: DvbSubtitleTeletextSpacing = null,
    XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  ): DvbSubDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Alignment != null) __obj.updateDynamic("Alignment")(Alignment.asInstanceOf[js.Any])
    if (BackgroundColor != null) __obj.updateDynamic("BackgroundColor")(BackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(BackgroundOpacity)) __obj.updateDynamic("BackgroundOpacity")(BackgroundOpacity)
    if (FontColor != null) __obj.updateDynamic("FontColor")(FontColor.asInstanceOf[js.Any])
    if (!js.isUndefined(FontOpacity)) __obj.updateDynamic("FontOpacity")(FontOpacity)
    if (!js.isUndefined(FontResolution)) __obj.updateDynamic("FontResolution")(FontResolution)
    if (FontScript != null) __obj.updateDynamic("FontScript")(FontScript.asInstanceOf[js.Any])
    if (!js.isUndefined(FontSize)) __obj.updateDynamic("FontSize")(FontSize)
    if (OutlineColor != null) __obj.updateDynamic("OutlineColor")(OutlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(OutlineSize)) __obj.updateDynamic("OutlineSize")(OutlineSize)
    if (ShadowColor != null) __obj.updateDynamic("ShadowColor")(ShadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(ShadowOpacity)) __obj.updateDynamic("ShadowOpacity")(ShadowOpacity)
    if (!js.isUndefined(ShadowXOffset)) __obj.updateDynamic("ShadowXOffset")(ShadowXOffset)
    if (!js.isUndefined(ShadowYOffset)) __obj.updateDynamic("ShadowYOffset")(ShadowYOffset)
    if (TeletextSpacing != null) __obj.updateDynamic("TeletextSpacing")(TeletextSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(XPosition)) __obj.updateDynamic("XPosition")(XPosition)
    if (!js.isUndefined(YPosition)) __obj.updateDynamic("YPosition")(YPosition)
    __obj.asInstanceOf[DvbSubDestinationSettings]
  }
}

