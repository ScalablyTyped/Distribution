package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbSubDestinationSettings extends StObject {
  
  /**
    * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined
  
  /**
    * Ignore this setting unless Style Passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies to white text in your input captions. For example, if your font color setting is Yellow, and your input captions have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions text.
    */
  var ApplyFontColor: js.UndefOr[DvbSubtitleApplyFontColor] = js.undefined
  
  /**
    * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if present.
    */
  var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined
  
  /**
    * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background style information in your input captions to your output captions. If Style passthrough is set to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude the DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the DDS but not include display window data. In this case, MediaConvert writes that information to the page composition segment (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based on the values that you specify in related job settings. For video resolutions that are 576 pixels or smaller in height, MediaConvert doesn't include the DDS, regardless of the value you choose for DDS handling (ddsHandling). In this case, it doesn't write the display window data to the PCS either. Related settings: Use the settings DDS x-coordinate (ddsXCoordinate) and DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left corner of the display window and the top left corner of the video frame. All burn-in and DVB-Sub font settings must match.
    */
  var DdsHandling: js.UndefOr[DvbddsHandling] = js.undefined
  
  /**
    * Use this setting, along with DDS y-coordinate (ddsYCoordinate), to specify the upper left corner of the display definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the left side of the frame and the left side of the DDS display window. Keep the default value, 0, to have MediaConvert automatically choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
    */
  var DdsXCoordinate: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Use this setting, along with DDS x-coordinate (ddsXCoordinate), to specify the upper left corner of the display definition segment (DDS) display window. With this setting, specify the distance, in pixels, between the top of the frame and the top of the DDS display window. Keep the default value, 0, to have MediaConvert automatically choose this offset. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). MediaConvert uses these values to determine whether to write page position data to the DDS or to the page composition segment (PCS). All burn-in and DVB-Sub font settings must match.
    */
  var DdsYCoordinate: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify the font that you want the service to use for your burn in captions when your input captions specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
    */
  var FallbackFont: js.UndefOr[DvbSubSubtitleFallbackFont] = js.undefined
  
  /**
    * Specify the color of the captions text. Leave Font color (FontColor) blank and set Style passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if present. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined
  
  /**
    * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
  Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify the Font resolution (FontResolution) in DPI (dots per inch).
  Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.undefined
  
  /**
    * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var FontScript: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.FontScript] = js.undefined
  
  /**
    * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic font size. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var FontSize: js.UndefOr[integerMin0Max96] = js.undefined
  
  /**
    * Specify the height, in pixels, of this set of DVB-Sub captions. The default value is 576 pixels. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in and DVB-Sub font settings must match.
    */
  var Height: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits, representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
    */
  var HexFontColor: js.UndefOr[stringMin6Max8Pattern09aFAF609aFAF2] = js.undefined
  
  /**
    * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough) to enabled to use the font outline color data from your input captions, if present. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined
  
  /**
    * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.undefined
  
  /**
    * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined
  
  /**
    * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass through the shadow style information in your input captions to your output captions. If Style passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output captions. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var ShadowXOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var ShadowYOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information from your input captions. MediaConvert uses default settings for any missing style and position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position information from your input captions and use default settings: white text with black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to manually override any of the individual style and position settings.
    */
  var StylePassthrough: js.UndefOr[DvbSubtitleStylePassthrough] = js.undefined
  
  /**
    * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
    */
  var SubtitlingType: js.UndefOr[DvbSubtitlingType] = js.undefined
  
  /**
    * Specify whether the Text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined
  
  /**
    * Specify the width, in pixels, of this set of DVB-Sub captions. The default value is 720 pixels. Related setting: When you use this setting, you must set DDS handling (ddsHandling) to a value other than None (NONE). All burn-in and DVB-Sub font settings must match.
    */
  var Width: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify the horizontal position (XPosition) of the captions, relative to the left side of the outputin pixels. A value of 10 would result in the captions starting 10 pixels from the left ofthe output. If no explicit x_position is provided, the horizontal caption position will bedetermined by the alignment parameter. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var XPosition: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. Within your job settings, all of your DVB-Sub settings must be identical.
    */
  var YPosition: js.UndefOr[integerMin0Max2147483647] = js.undefined
}
object DvbSubDestinationSettings {
  
  inline def apply(): DvbSubDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubDestinationSettings]
  }
  
  extension [Self <: DvbSubDestinationSettings](x: Self) {
    
    inline def setAlignment(value: DvbSubtitleAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "Alignment", js.undefined)
    
    inline def setApplyFontColor(value: DvbSubtitleApplyFontColor): Self = StObject.set(x, "ApplyFontColor", value.asInstanceOf[js.Any])
    
    inline def setApplyFontColorUndefined: Self = StObject.set(x, "ApplyFontColor", js.undefined)
    
    inline def setBackgroundColor(value: DvbSubtitleBackgroundColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBackgroundOpacity(value: integerMin0Max255): Self = StObject.set(x, "BackgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "BackgroundOpacity", js.undefined)
    
    inline def setDdsHandling(value: DvbddsHandling): Self = StObject.set(x, "DdsHandling", value.asInstanceOf[js.Any])
    
    inline def setDdsHandlingUndefined: Self = StObject.set(x, "DdsHandling", js.undefined)
    
    inline def setDdsXCoordinate(value: integerMin0Max2147483647): Self = StObject.set(x, "DdsXCoordinate", value.asInstanceOf[js.Any])
    
    inline def setDdsXCoordinateUndefined: Self = StObject.set(x, "DdsXCoordinate", js.undefined)
    
    inline def setDdsYCoordinate(value: integerMin0Max2147483647): Self = StObject.set(x, "DdsYCoordinate", value.asInstanceOf[js.Any])
    
    inline def setDdsYCoordinateUndefined: Self = StObject.set(x, "DdsYCoordinate", js.undefined)
    
    inline def setFallbackFont(value: DvbSubSubtitleFallbackFont): Self = StObject.set(x, "FallbackFont", value.asInstanceOf[js.Any])
    
    inline def setFallbackFontUndefined: Self = StObject.set(x, "FallbackFont", js.undefined)
    
    inline def setFontColor(value: DvbSubtitleFontColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "FontColor", js.undefined)
    
    inline def setFontOpacity(value: integerMin0Max255): Self = StObject.set(x, "FontOpacity", value.asInstanceOf[js.Any])
    
    inline def setFontOpacityUndefined: Self = StObject.set(x, "FontOpacity", js.undefined)
    
    inline def setFontResolution(value: integerMin96Max600): Self = StObject.set(x, "FontResolution", value.asInstanceOf[js.Any])
    
    inline def setFontResolutionUndefined: Self = StObject.set(x, "FontResolution", js.undefined)
    
    inline def setFontScript(value: FontScript): Self = StObject.set(x, "FontScript", value.asInstanceOf[js.Any])
    
    inline def setFontScriptUndefined: Self = StObject.set(x, "FontScript", js.undefined)
    
    inline def setFontSize(value: integerMin0Max96): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    inline def setHeight(value: integerMin1Max2147483647): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setHexFontColor(value: stringMin6Max8Pattern09aFAF609aFAF2): Self = StObject.set(x, "HexFontColor", value.asInstanceOf[js.Any])
    
    inline def setHexFontColorUndefined: Self = StObject.set(x, "HexFontColor", js.undefined)
    
    inline def setOutlineColor(value: DvbSubtitleOutlineColor): Self = StObject.set(x, "OutlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "OutlineColor", js.undefined)
    
    inline def setOutlineSize(value: integerMin0Max10): Self = StObject.set(x, "OutlineSize", value.asInstanceOf[js.Any])
    
    inline def setOutlineSizeUndefined: Self = StObject.set(x, "OutlineSize", js.undefined)
    
    inline def setShadowColor(value: DvbSubtitleShadowColor): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "ShadowColor", js.undefined)
    
    inline def setShadowOpacity(value: integerMin0Max255): Self = StObject.set(x, "ShadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "ShadowOpacity", js.undefined)
    
    inline def setShadowXOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowXOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowXOffsetUndefined: Self = StObject.set(x, "ShadowXOffset", js.undefined)
    
    inline def setShadowYOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowYOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowYOffsetUndefined: Self = StObject.set(x, "ShadowYOffset", js.undefined)
    
    inline def setStylePassthrough(value: DvbSubtitleStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    inline def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
    
    inline def setSubtitlingType(value: DvbSubtitlingType): Self = StObject.set(x, "SubtitlingType", value.asInstanceOf[js.Any])
    
    inline def setSubtitlingTypeUndefined: Self = StObject.set(x, "SubtitlingType", js.undefined)
    
    inline def setTeletextSpacing(value: DvbSubtitleTeletextSpacing): Self = StObject.set(x, "TeletextSpacing", value.asInstanceOf[js.Any])
    
    inline def setTeletextSpacingUndefined: Self = StObject.set(x, "TeletextSpacing", js.undefined)
    
    inline def setWidth(value: integerMin1Max2147483647): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
    
    inline def setXPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "XPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionUndefined: Self = StObject.set(x, "XPosition", js.undefined)
    
    inline def setYPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "YPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionUndefined: Self = StObject.set(x, "YPosition", js.undefined)
  }
}
