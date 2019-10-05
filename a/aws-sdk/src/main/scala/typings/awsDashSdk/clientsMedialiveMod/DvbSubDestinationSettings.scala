package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvbSubDestinationSettings extends js.Object {
  /**
    * If no explicit xPosition or yPosition is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Selecting "smart" justification will left-justify live subtitles and center-justify pre-recorded subtitles.  This option is not valid for source captions that are STL or 608/embedded.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var Alignment: js.UndefOr[DvbSubDestinationAlignment] = js.undefined
  /**
    * Specifies the color of the rectangle behind the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundColor: js.UndefOr[DvbSubDestinationBackgroundColor] = js.undefined
  /**
    * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * External font file used for caption burn-in. File extension must be 'ttf' or 'tte'.  Although the user can select output fonts for many different types of input captions, embedded, STL and teletext sources use a strict grid system. Using external fonts with these caption sources could cause unexpected display of proportional fonts.  All burn-in and DVB-Sub font settings must match.
    */
  var Font: js.UndefOr[InputLocation] = js.undefined
  /**
    * Specifies the color of the burned-in captions.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var FontColor: js.UndefOr[DvbSubDestinationFontColor] = js.undefined
  /**
    * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.  All burn-in and DVB-Sub font settings must match.
    */
  var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Font resolution in DPI (dots per inch); default is 96 dpi.  All burn-in and DVB-Sub font settings must match.
    */
  var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
  /**
    * When set to auto fontSize will scale depending on the size of the output.  Giving a positive integer will specify the exact font size in points.  All burn-in and DVB-Sub font settings must match.
    */
  var FontSize: js.UndefOr[__string] = js.undefined
  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineColor: js.UndefOr[DvbSubDestinationOutlineColor] = js.undefined
  /**
    * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
  /**
    * Specifies the color of the shadow cast by the captions.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowColor: js.UndefOr[DvbSubDestinationShadowColor] = js.undefined
  /**
    * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent).  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
  /**
    * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowXOffset: js.UndefOr[__integer] = js.undefined
  /**
    * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text.  All burn-in and DVB-Sub font settings must match.
    */
  var ShadowYOffset: js.UndefOr[__integer] = js.undefined
  /**
    * Controls whether a fixed grid size will be used to generate the output subtitles bitmap. Only applicable for Teletext inputs and DVB-Sub/Burn-in outputs.
    */
  var TeletextGridControl: js.UndefOr[DvbSubDestinationTeletextGridControl] = js.undefined
  /**
    * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit xPosition is provided, the horizontal caption position will be determined by the alignment parameter.  This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var XPosition: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit yPosition is provided, the caption will be positioned towards the bottom of the output.  This option is not valid for source captions that are STL, 608/embedded or teletext.  These source settings are already pre-defined by the caption stream.  All burn-in and DVB-Sub font settings must match.
    */
  var YPosition: js.UndefOr[__integerMin0] = js.undefined
}

object DvbSubDestinationSettings {
  @scala.inline
  def apply(
    Alignment: DvbSubDestinationAlignment = null,
    BackgroundColor: DvbSubDestinationBackgroundColor = null,
    BackgroundOpacity: Int | Double = null,
    Font: InputLocation = null,
    FontColor: DvbSubDestinationFontColor = null,
    FontOpacity: Int | Double = null,
    FontResolution: Int | Double = null,
    FontSize: __string = null,
    OutlineColor: DvbSubDestinationOutlineColor = null,
    OutlineSize: Int | Double = null,
    ShadowColor: DvbSubDestinationShadowColor = null,
    ShadowOpacity: Int | Double = null,
    ShadowXOffset: Int | Double = null,
    ShadowYOffset: Int | Double = null,
    TeletextGridControl: DvbSubDestinationTeletextGridControl = null,
    XPosition: Int | Double = null,
    YPosition: Int | Double = null
  ): DvbSubDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Alignment != null) __obj.updateDynamic("Alignment")(Alignment.asInstanceOf[js.Any])
    if (BackgroundColor != null) __obj.updateDynamic("BackgroundColor")(BackgroundColor.asInstanceOf[js.Any])
    if (BackgroundOpacity != null) __obj.updateDynamic("BackgroundOpacity")(BackgroundOpacity.asInstanceOf[js.Any])
    if (Font != null) __obj.updateDynamic("Font")(Font)
    if (FontColor != null) __obj.updateDynamic("FontColor")(FontColor.asInstanceOf[js.Any])
    if (FontOpacity != null) __obj.updateDynamic("FontOpacity")(FontOpacity.asInstanceOf[js.Any])
    if (FontResolution != null) __obj.updateDynamic("FontResolution")(FontResolution.asInstanceOf[js.Any])
    if (FontSize != null) __obj.updateDynamic("FontSize")(FontSize)
    if (OutlineColor != null) __obj.updateDynamic("OutlineColor")(OutlineColor.asInstanceOf[js.Any])
    if (OutlineSize != null) __obj.updateDynamic("OutlineSize")(OutlineSize.asInstanceOf[js.Any])
    if (ShadowColor != null) __obj.updateDynamic("ShadowColor")(ShadowColor.asInstanceOf[js.Any])
    if (ShadowOpacity != null) __obj.updateDynamic("ShadowOpacity")(ShadowOpacity.asInstanceOf[js.Any])
    if (ShadowXOffset != null) __obj.updateDynamic("ShadowXOffset")(ShadowXOffset.asInstanceOf[js.Any])
    if (ShadowYOffset != null) __obj.updateDynamic("ShadowYOffset")(ShadowYOffset.asInstanceOf[js.Any])
    if (TeletextGridControl != null) __obj.updateDynamic("TeletextGridControl")(TeletextGridControl.asInstanceOf[js.Any])
    if (XPosition != null) __obj.updateDynamic("XPosition")(XPosition.asInstanceOf[js.Any])
    if (YPosition != null) __obj.updateDynamic("YPosition")(YPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSubDestinationSettings]
  }
}

