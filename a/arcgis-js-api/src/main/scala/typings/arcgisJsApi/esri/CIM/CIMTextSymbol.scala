package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMTextSymbol
  extends StObject
     with CIMSymbolBase
     with CIMSymbolType {
  
  /**
    * The amount of rotation applied to the text symbol, measured in degrees, around the geometry.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of rotation of the text symbol around the X axis, measured in degrees, around the geometry. This type of rotation is also referred to as tilt. It is applied in 3D.
    */
  var angleX: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of rotation of the text symbol around the Y axis, measured in degrees, around the geometry. This type of rotation is also referred to as roll. It is applied in 3D.
    */
  var angleY: js.UndefOr[Double] = js.undefined
  
  /**
    * The billboard mode of the text symbol.
    */
  var billboardMode3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
  ] = js.undefined
  
  /**
    * The direction in which multi-line text is stacked.
    */
  var blockProgression: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockProgression * / any */ String
  ] = js.undefined
  
  /**
    * The callout or background of the text with optional leader lines.
    */
  var callout: js.UndefOr[CIMCalloutType] = js.undefined
  
  /**
    * A value indicating whether to draw the text in a fashion compatible with ArcMap.
    */
  var compatibilityMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ISO code for the base country of the text.
    */
  var countryISO: js.UndefOr[String] = js.undefined
  
  /**
    * The depth of the glyph when drawn in 3D. This is an extrusion of the characters of the text in the Z axis.
    */
  var depth3D: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether fonts that are drawn as rasters at some scales to draw as vectors instead.
    */
  var drawGlyphsAsGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether soft hyphens should be drawn. Soft hyphens are invisible markers that indicate where a hyphenated break is allowed within the text. They are only drawn if there is word wrapping at the end of a line.
    */
  var drawSoftHyphen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether the baseline of the text geometry should be expanded in the same manner as the existing geometry if the text extends beyond the baseline.
    */
  var extrapolateBaselines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The angle (in degrees from vertical) at which point rotated text is flipped (mirrored) in place.
    */
  var flipAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the text is drawn as subscript or superscript.
    */
  var fontEffects: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEffects * / any */ String
  ] = js.undefined
  
  /**
    * The font encoding.
    */
  var fontEncoding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEncoding * / any */ String
  ] = js.undefined
  
  /**
    * The font family name of the font. e.g. Comic Sans.
    */
  var fontFamilyName: js.UndefOr[String] = js.undefined
  
  /**
    * The style name for the font family. e.g. Regular, Bold, or Italic.
    */
  var fontStyleName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of font that the font family/style name reference.
    */
  var fontType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
  ] = js.undefined
  
  /**
    * An additional rotation that is applied to the individual glyphs contained in the text. This is applied to the individual glyphs whereas Angle, AngleX and AngleY are affect how the entire text string is oriented.
    */
  var glyphRotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The size of the halo that extends beyond the symbol shape.
    */
  var haloSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The polygon symbol that is used to draw the halo for a text symbol.
    */
  var haloSymbol: js.UndefOr[CIMPolygonSymbol] = js.undefined
  
  /**
    * The size of the text in points.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * If hinting from the font is used for text rendering. Hinting is information included with most fonts to effectively fit the vector glyphs of the font into the raster grid onto which they are displayed.
    */
  var hinting: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphHinting * / any */ String
  ] = js.undefined
  
  /**
    * The alignment type used to align the text to the geometry horizontally. Affects which side of a point geometry the point text is drawn or which end of a line it is drawn close to. Commonly used to define how stacked text appears.
    */
  var horizontalAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment * / any */ String
  ] = js.undefined
  
  /**
    * How many points to indent the text back from the end of the baseline.
    */
  var indentAfter: js.UndefOr[Double] = js.undefined
  
  /**
    * How many points to indent the text from the beginning of the baseline.
    */
  var indentBefore: js.UndefOr[Double] = js.undefined
  
  /**
    * How many points to indent the text from the beginning of the baseline for the first line only.
    */
  var indentFirstLine: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether the text is drawn with metric kerning, which adjusts the spacing between individual letter forms.
    */
  var kerning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the ISO code for the base language of the text.
    */
  var languageISO: js.UndefOr[String] = js.undefined
  
  /**
    * The additional spacing that is added to each glyph beyond what is defined by its character box in the font. Value indicates the percentage of a glyph's width. Also known as tracking.
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * The width that is added to each glyph beyond what is defined by its character box in its font. This is a percentage of the original glyph.
    */
  var letterWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether text is to be drawn with ligatures, which occur when two or more letters or portions of letters are joined to form a single glyph.
    */
  var ligatures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The spacing between lines of text. This is also known as leading or line spacing.
    */
  var lineGap: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of line gap that is applied.
    */
  var lineGapType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineGapType * / any */ String
  ] = js.undefined
  
  /**
    * The X offset.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y offset.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The Z offset.
    */
  var offsetZ: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether or not the symbol should overprint in press printing.
    */
  var overprint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the shadow that is defined for the text symbol. The shadow is drawn as an offset copy of the text.
    */
  var shadowColor: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The shadow offset from the text symbol in the horizontal direction. If X and Y are zero, no shadow is drawn.
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The shadow offset from the text symbol in the vertical direction. If X and Y are zero, no shadow is drawn.
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * A value indicating whether the text should be drawn as Small Capitals, where lower case text is converted to small caps and upper case text is left as upper case.
    */
  var smallCaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value indicating whether to draw the text with a strike through it.
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The polygon symbol that is used to draw the glyphs of the text.
    */
  var symbol: js.UndefOr[CIMPolygonSymbol] = js.undefined
  
  /**
    * The collection of properties that are applied to the text symbol only in a 3D context.
    */
  var symbol3DProperties: js.UndefOr[CIM3DSymbolProperties] = js.undefined
  
  /**
    * The letter case used to draw the text.
    */
  var textCase: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCase * / any */ String
  ] = js.undefined
  
  /**
    * The base text direction to draw the text.
    */
  var textDirection: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextReadingDirection * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMTextSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol
  
  /**
    * A value indicating whether to draw the text with an underline.
    */
  var underline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The vertical alignment of the text.
    */
  var verticalAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment * / any */ String
  ] = js.undefined
  
  /**
    * The orientation for the non-vertical text in a vertical layout. For example, an English fragment in a Japanese text.
    */
  var verticalGlyphOrientation: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalGlyphOrientation * / any */ String
  ] = js.undefined
  
  /**
    * The additional spacing that is added to between the words of the text string. 100% indicates that regular spacing is used.
    */
  var wordSpacing: js.UndefOr[Double] = js.undefined
}
object CIMTextSymbol {
  
  inline def apply(): CIMTextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMTextSymbol")
    __obj.asInstanceOf[CIMTextSymbol]
  }
  
  extension [Self <: CIMTextSymbol](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAngleX(value: Double): Self = StObject.set(x, "angleX", value.asInstanceOf[js.Any])
    
    inline def setAngleXUndefined: Self = StObject.set(x, "angleX", js.undefined)
    
    inline def setAngleY(value: Double): Self = StObject.set(x, "angleY", value.asInstanceOf[js.Any])
    
    inline def setAngleYUndefined: Self = StObject.set(x, "angleY", js.undefined)
    
    inline def setBillboardMode3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
    ): Self = StObject.set(x, "billboardMode3D", value.asInstanceOf[js.Any])
    
    inline def setBillboardMode3DUndefined: Self = StObject.set(x, "billboardMode3D", js.undefined)
    
    inline def setBlockProgression(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockProgression * / any */ String
    ): Self = StObject.set(x, "blockProgression", value.asInstanceOf[js.Any])
    
    inline def setBlockProgressionUndefined: Self = StObject.set(x, "blockProgression", js.undefined)
    
    inline def setCallout(value: CIMCalloutType): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setCompatibilityMode(value: Boolean): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
    
    inline def setCountryISO(value: String): Self = StObject.set(x, "countryISO", value.asInstanceOf[js.Any])
    
    inline def setCountryISOUndefined: Self = StObject.set(x, "countryISO", js.undefined)
    
    inline def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
    
    inline def setDepth3DUndefined: Self = StObject.set(x, "depth3D", js.undefined)
    
    inline def setDrawGlyphsAsGeometry(value: Boolean): Self = StObject.set(x, "drawGlyphsAsGeometry", value.asInstanceOf[js.Any])
    
    inline def setDrawGlyphsAsGeometryUndefined: Self = StObject.set(x, "drawGlyphsAsGeometry", js.undefined)
    
    inline def setDrawSoftHyphen(value: Boolean): Self = StObject.set(x, "drawSoftHyphen", value.asInstanceOf[js.Any])
    
    inline def setDrawSoftHyphenUndefined: Self = StObject.set(x, "drawSoftHyphen", js.undefined)
    
    inline def setExtrapolateBaselines(value: Boolean): Self = StObject.set(x, "extrapolateBaselines", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateBaselinesUndefined: Self = StObject.set(x, "extrapolateBaselines", js.undefined)
    
    inline def setFlipAngle(value: Double): Self = StObject.set(x, "flipAngle", value.asInstanceOf[js.Any])
    
    inline def setFlipAngleUndefined: Self = StObject.set(x, "flipAngle", js.undefined)
    
    inline def setFontEffects(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEffects * / any */ String
    ): Self = StObject.set(x, "fontEffects", value.asInstanceOf[js.Any])
    
    inline def setFontEffectsUndefined: Self = StObject.set(x, "fontEffects", js.undefined)
    
    inline def setFontEncoding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEncoding * / any */ String
    ): Self = StObject.set(x, "fontEncoding", value.asInstanceOf[js.Any])
    
    inline def setFontEncodingUndefined: Self = StObject.set(x, "fontEncoding", js.undefined)
    
    inline def setFontFamilyName(value: String): Self = StObject.set(x, "fontFamilyName", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyNameUndefined: Self = StObject.set(x, "fontFamilyName", js.undefined)
    
    inline def setFontStyleName(value: String): Self = StObject.set(x, "fontStyleName", value.asInstanceOf[js.Any])
    
    inline def setFontStyleNameUndefined: Self = StObject.set(x, "fontStyleName", js.undefined)
    
    inline def setFontType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
    ): Self = StObject.set(x, "fontType", value.asInstanceOf[js.Any])
    
    inline def setFontTypeUndefined: Self = StObject.set(x, "fontType", js.undefined)
    
    inline def setGlyphRotation(value: Double): Self = StObject.set(x, "glyphRotation", value.asInstanceOf[js.Any])
    
    inline def setGlyphRotationUndefined: Self = StObject.set(x, "glyphRotation", js.undefined)
    
    inline def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    inline def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    inline def setHaloSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "haloSymbol", value.asInstanceOf[js.Any])
    
    inline def setHaloSymbolUndefined: Self = StObject.set(x, "haloSymbol", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHinting(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphHinting * / any */ String
    ): Self = StObject.set(x, "hinting", value.asInstanceOf[js.Any])
    
    inline def setHintingUndefined: Self = StObject.set(x, "hinting", js.undefined)
    
    inline def setHorizontalAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment * / any */ String
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setIndentAfter(value: Double): Self = StObject.set(x, "indentAfter", value.asInstanceOf[js.Any])
    
    inline def setIndentAfterUndefined: Self = StObject.set(x, "indentAfter", js.undefined)
    
    inline def setIndentBefore(value: Double): Self = StObject.set(x, "indentBefore", value.asInstanceOf[js.Any])
    
    inline def setIndentBeforeUndefined: Self = StObject.set(x, "indentBefore", js.undefined)
    
    inline def setIndentFirstLine(value: Double): Self = StObject.set(x, "indentFirstLine", value.asInstanceOf[js.Any])
    
    inline def setIndentFirstLineUndefined: Self = StObject.set(x, "indentFirstLine", js.undefined)
    
    inline def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setLanguageISO(value: String): Self = StObject.set(x, "languageISO", value.asInstanceOf[js.Any])
    
    inline def setLanguageISOUndefined: Self = StObject.set(x, "languageISO", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterWidth(value: Double): Self = StObject.set(x, "letterWidth", value.asInstanceOf[js.Any])
    
    inline def setLetterWidthUndefined: Self = StObject.set(x, "letterWidth", js.undefined)
    
    inline def setLigatures(value: Boolean): Self = StObject.set(x, "ligatures", value.asInstanceOf[js.Any])
    
    inline def setLigaturesUndefined: Self = StObject.set(x, "ligatures", js.undefined)
    
    inline def setLineGap(value: Double): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
    
    inline def setLineGapType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineGapType * / any */ String
    ): Self = StObject.set(x, "lineGapType", value.asInstanceOf[js.Any])
    
    inline def setLineGapTypeUndefined: Self = StObject.set(x, "lineGapType", js.undefined)
    
    inline def setLineGapUndefined: Self = StObject.set(x, "lineGap", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOffsetZ(value: Double): Self = StObject.set(x, "offsetZ", value.asInstanceOf[js.Any])
    
    inline def setOffsetZUndefined: Self = StObject.set(x, "offsetZ", js.undefined)
    
    inline def setOverprint(value: Boolean): Self = StObject.set(x, "overprint", value.asInstanceOf[js.Any])
    
    inline def setOverprintUndefined: Self = StObject.set(x, "overprint", js.undefined)
    
    inline def setShadowColor(value: js.Array[Double]): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowColorVarargs(value: Double*): Self = StObject.set(x, "shadowColor", js.Array(value :_*))
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setSmallCaps(value: Boolean): Self = StObject.set(x, "smallCaps", value.asInstanceOf[js.Any])
    
    inline def setSmallCapsUndefined: Self = StObject.set(x, "smallCaps", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol3DProperties(value: CIM3DSymbolProperties): Self = StObject.set(x, "symbol3DProperties", value.asInstanceOf[js.Any])
    
    inline def setSymbol3DPropertiesUndefined: Self = StObject.set(x, "symbol3DProperties", js.undefined)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTextCase(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCase * / any */ String
    ): Self = StObject.set(x, "textCase", value.asInstanceOf[js.Any])
    
    inline def setTextCaseUndefined: Self = StObject.set(x, "textCase", js.undefined)
    
    inline def setTextDirection(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextReadingDirection * / any */ String
    ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setVerticalAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment * / any */ String
    ): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setVerticalGlyphOrientation(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalGlyphOrientation * / any */ String
    ): Self = StObject.set(x, "verticalGlyphOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalGlyphOrientationUndefined: Self = StObject.set(x, "verticalGlyphOrientation", js.undefined)
    
    inline def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
