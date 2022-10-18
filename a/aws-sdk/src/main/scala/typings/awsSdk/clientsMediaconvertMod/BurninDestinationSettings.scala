package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BurninDestinationSettings extends StObject {
  
  /**
    * Specify the alignment of your captions. If no explicit x_position is provided, setting alignment to centered will placethe captions at the bottom center of the output. Similarly, setting a left alignment willalign captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates.
    */
  var Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined
  
  /**
    * Ignore this setting unless Style passthrough (StylePassthrough) is set to Enabled and Font color (FontColor) set to Black, Yellow, Red, Green, Blue, or Hex. Use Apply font color (ApplyFontColor) for additional font color controls. When you choose White text only (WHITE_TEXT_ONLY), or leave blank, your font color setting only applies to white text in your input captions. For example, if your font color setting is Yellow, and your input captions have red and white text, your output captions will have red and yellow text. When you choose ALL_TEXT, your font color setting applies to all of your output captions text.
    */
  var ApplyFontColor: js.UndefOr[BurninSubtitleApplyFontColor] = js.undefined
  
  /**
    * Specify the color of the rectangle behind the captions. Leave background color (BackgroundColor) blank and set Style passthrough (StylePassthrough) to enabled to use the background color data from your input captions, if present.
    */
  var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined
  
  /**
    * Specify the opacity of the background rectangle. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If Style passthrough (StylePassthrough) is set to enabled, leave blank to pass through the background style information in your input captions to your output captions. If Style passthrough is set to disabled, leave blank to use a value of 0 and remove all backgrounds from your output captions.
    */
  var BackgroundOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify the font that you want the service to use for your burn in captions when your input captions specify a font that MediaConvert doesn't support. When you set Fallback font (FallbackFont) to best match (BEST_MATCH), or leave blank, MediaConvert uses a supported font that most closely matches the font that your input captions specify. When there are multiple unsupported fonts in your input captions, MediaConvert matches each font with the supported font that matches best. When you explicitly choose a replacement font, MediaConvert uses that font to replace all unsupported fonts from your input.
    */
  var FallbackFont: js.UndefOr[BurninSubtitleFallbackFont] = js.undefined
  
  /**
    * Specify the color of the burned-in captions text. Leave Font color (FontColor) blank and set Style passthrough (StylePassthrough) to enabled to use the font color data from your input captions, if present.
    */
  var FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined
  
  /**
    * Specify the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
    */
  var FontOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify the Font resolution (FontResolution) in DPI (dots per inch).
    */
  var FontResolution: js.UndefOr[integerMin96Max600] = js.undefined
  
  /**
    * Set Font script (FontScript) to Automatically determined (AUTOMATIC), or leave blank, to automatically determine the font script in your input captions. Otherwise, set to Simplified Chinese (HANS) or Traditional Chinese (HANT) if your input font script uses Simplified or Traditional Chinese.
    */
  var FontScript: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.FontScript] = js.undefined
  
  /**
    * Specify the Font size (FontSize) in pixels. Must be a positive integer. Set to 0, or leave blank, for automatic font size.
    */
  var FontSize: js.UndefOr[integerMin0Max96] = js.undefined
  
  /**
    * Ignore this setting unless your Font color is set to Hex. Enter either six or eight hexidecimal digits, representing red, green, and blue, with two optional extra digits for alpha. For example a value of 1122AABB is a red value of 0x11, a green value of 0x22, a blue value of 0xAA, and an alpha value of 0xBB.
    */
  var HexFontColor: js.UndefOr[stringMin6Max8Pattern09aFAF609aFAF2] = js.undefined
  
  /**
    * Specify font outline color. Leave Outline color (OutlineColor) blank and set Style passthrough (StylePassthrough) to enabled to use the font outline color data from your input captions, if present.
    */
  var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined
  
  /**
    * Specify the Outline size (OutlineSize) of the caption text, in pixels. Leave Outline size blank and set Style passthrough (StylePassthrough) to enabled to use the outline size data from your input captions, if present.
    */
  var OutlineSize: js.UndefOr[integerMin0Max10] = js.undefined
  
  /**
    * Specify the color of the shadow cast by the captions. Leave Shadow color (ShadowColor) blank and set Style passthrough (StylePassthrough) to enabled to use the shadow color data from your input captions, if present.
    */
  var ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined
  
  /**
    * Specify the opacity of the shadow. Enter a value from 0 to 255, where 0 is transparent and 255 is opaque. If Style passthrough (StylePassthrough) is set to Enabled, leave Shadow opacity (ShadowOpacity) blank to pass through the shadow style information in your input captions to your output captions. If Style passthrough is set to disabled, leave blank to use a value of 0 and remove all shadows from your output captions.
    */
  var ShadowOpacity: js.UndefOr[integerMin0Max255] = js.undefined
  
  /**
    * Specify the horizontal offset of the shadow, relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left.
    */
  var ShadowXOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Specify the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. Leave Shadow y-offset (ShadowYOffset) blank and set Style passthrough (StylePassthrough) to enabled to use the shadow y-offset data from your input captions, if present.
    */
  var ShadowYOffset: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
  
  /**
    * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information from your input captions. MediaConvert uses default settings for any missing style and position information in your input captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position information from your input captions and use default settings: white text with black outlining, bottom-center positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to manually override any of the individual style and position settings.
    */
  var StylePassthrough: js.UndefOr[BurnInSubtitleStylePassthrough] = js.undefined
  
  /**
    * Specify whether the text spacing (TeletextSpacing) in your captions is set by the captions grid, or varies depending on letter width. Choose fixed grid (FIXED_GRID) to conform to the spacing specified in the captions file more accurately. Choose proportional (PROPORTIONAL) to make the text easier to read for closed captions.
    */
  var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined
  
  /**
    * Specify the horizontal position (XPosition) of the captions, relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter.
    */
  var XPosition: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify the vertical position (YPosition) of the captions, relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output.
    */
  var YPosition: js.UndefOr[integerMin0Max2147483647] = js.undefined
}
object BurninDestinationSettings {
  
  inline def apply(): BurninDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BurninDestinationSettings]
  }
  
  extension [Self <: BurninDestinationSettings](x: Self) {
    
    inline def setAlignment(value: BurninSubtitleAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "Alignment", js.undefined)
    
    inline def setApplyFontColor(value: BurninSubtitleApplyFontColor): Self = StObject.set(x, "ApplyFontColor", value.asInstanceOf[js.Any])
    
    inline def setApplyFontColorUndefined: Self = StObject.set(x, "ApplyFontColor", js.undefined)
    
    inline def setBackgroundColor(value: BurninSubtitleBackgroundColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBackgroundOpacity(value: integerMin0Max255): Self = StObject.set(x, "BackgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "BackgroundOpacity", js.undefined)
    
    inline def setFallbackFont(value: BurninSubtitleFallbackFont): Self = StObject.set(x, "FallbackFont", value.asInstanceOf[js.Any])
    
    inline def setFallbackFontUndefined: Self = StObject.set(x, "FallbackFont", js.undefined)
    
    inline def setFontColor(value: BurninSubtitleFontColor): Self = StObject.set(x, "FontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "FontColor", js.undefined)
    
    inline def setFontOpacity(value: integerMin0Max255): Self = StObject.set(x, "FontOpacity", value.asInstanceOf[js.Any])
    
    inline def setFontOpacityUndefined: Self = StObject.set(x, "FontOpacity", js.undefined)
    
    inline def setFontResolution(value: integerMin96Max600): Self = StObject.set(x, "FontResolution", value.asInstanceOf[js.Any])
    
    inline def setFontResolutionUndefined: Self = StObject.set(x, "FontResolution", js.undefined)
    
    inline def setFontScript(value: FontScript): Self = StObject.set(x, "FontScript", value.asInstanceOf[js.Any])
    
    inline def setFontScriptUndefined: Self = StObject.set(x, "FontScript", js.undefined)
    
    inline def setFontSize(value: integerMin0Max96): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "FontSize", js.undefined)
    
    inline def setHexFontColor(value: stringMin6Max8Pattern09aFAF609aFAF2): Self = StObject.set(x, "HexFontColor", value.asInstanceOf[js.Any])
    
    inline def setHexFontColorUndefined: Self = StObject.set(x, "HexFontColor", js.undefined)
    
    inline def setOutlineColor(value: BurninSubtitleOutlineColor): Self = StObject.set(x, "OutlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineColorUndefined: Self = StObject.set(x, "OutlineColor", js.undefined)
    
    inline def setOutlineSize(value: integerMin0Max10): Self = StObject.set(x, "OutlineSize", value.asInstanceOf[js.Any])
    
    inline def setOutlineSizeUndefined: Self = StObject.set(x, "OutlineSize", js.undefined)
    
    inline def setShadowColor(value: BurninSubtitleShadowColor): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "ShadowColor", js.undefined)
    
    inline def setShadowOpacity(value: integerMin0Max255): Self = StObject.set(x, "ShadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "ShadowOpacity", js.undefined)
    
    inline def setShadowXOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowXOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowXOffsetUndefined: Self = StObject.set(x, "ShadowXOffset", js.undefined)
    
    inline def setShadowYOffset(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "ShadowYOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowYOffsetUndefined: Self = StObject.set(x, "ShadowYOffset", js.undefined)
    
    inline def setStylePassthrough(value: BurnInSubtitleStylePassthrough): Self = StObject.set(x, "StylePassthrough", value.asInstanceOf[js.Any])
    
    inline def setStylePassthroughUndefined: Self = StObject.set(x, "StylePassthrough", js.undefined)
    
    inline def setTeletextSpacing(value: BurninSubtitleTeletextSpacing): Self = StObject.set(x, "TeletextSpacing", value.asInstanceOf[js.Any])
    
    inline def setTeletextSpacingUndefined: Self = StObject.set(x, "TeletextSpacing", js.undefined)
    
    inline def setXPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "XPosition", value.asInstanceOf[js.Any])
    
    inline def setXPositionUndefined: Self = StObject.set(x, "XPosition", js.undefined)
    
    inline def setYPosition(value: integerMin0Max2147483647): Self = StObject.set(x, "YPosition", value.asInstanceOf[js.Any])
    
    inline def setYPositionUndefined: Self = StObject.set(x, "YPosition", js.undefined)
  }
}
