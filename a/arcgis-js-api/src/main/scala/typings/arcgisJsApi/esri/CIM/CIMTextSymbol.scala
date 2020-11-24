package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMTextSymbol
  extends CIMSymbolBase
     with CIMSymbolType {
  
  /**
    * The amount of rotation applied to the text symbol, measured in degrees, around the geometry.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The amount of rotation of the text symbol around the X axis, measured in degrees, around the geometry. This type of rotation is also referred to as tilt. It is applied in 3D.
    */
  var angleX: js.UndefOr[Double] = js.native
  
  /**
    * The amount of rotation of the text symbol around the Y axis, measured in degrees, around the geometry. This type of rotation is also referred to as roll. It is applied in 3D.
    */
  var angleY: js.UndefOr[Double] = js.native
  
  /**
    * The billboard mode of the text symbol.
    */
  var billboardMode3D: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
  ] = js.native
  
  /**
    * The direction in which multi-line text is stacked.
    */
  var blockProgression: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockProgression * / any */ String
  ] = js.native
  
  /**
    * The callout or background of the text with optional leader lines.
    */
  var callout: js.UndefOr[CIMCalloutType] = js.native
  
  /**
    * A value indicating whether to draw the text in a fashion compatible with ArcMap.
    */
  var compatibilityMode: js.UndefOr[Boolean] = js.native
  
  /**
    * The ISO code for the base country of the text.
    */
  var countryISO: js.UndefOr[String] = js.native
  
  /**
    * The depth of the glyph when drawn in 3D. This is an extrusion of the characters of the text in the Z axis.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether fonts that are drawn as rasters at some scales to draw as vectors instead.
    */
  var drawGlyphsAsGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether soft hyphens should be drawn. Soft hyphens are invisible markers that indicate where a hyphenated break is allowed within the text. They are only drawn if there is word wrapping at the end of a line.
    */
  var drawSoftHyphen: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the baseline of the text geometry should be expanded in the same manner as the existing geometry if the text extends beyond the baseline.
    */
  var extrapolateBaselines: js.UndefOr[Boolean] = js.native
  
  /**
    * The angle (in degrees from vertical) at which point rotated text is flipped (mirrored) in place.
    */
  var flipAngle: js.UndefOr[Double] = js.native
  
  /**
    * Whether the text is drawn as subscript or superscript.
    */
  var fontEffects: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEffects * / any */ String
  ] = js.native
  
  /**
    * The font encoding.
    */
  var fontEncoding: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEncoding * / any */ String
  ] = js.native
  
  /**
    * The font family name of the font. e.g. Comic Sans.
    */
  var fontFamilyName: js.UndefOr[String] = js.native
  
  /**
    * The style name for the font family. e.g. Regular, Bold, or Italic.
    */
  var fontStyleName: js.UndefOr[String] = js.native
  
  /**
    * The type of font that the font family/style name reference.
    */
  var fontType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
  ] = js.native
  
  /**
    * An additional rotation that is applied to the individual glyphs contained in the text. This is applied to the individual glyphs whereas Angle, AngleX and AngleY are affect how the entire text string is oriented.
    */
  var glyphRotation: js.UndefOr[Double] = js.native
  
  /**
    * The size of the halo that extends beyond the symbol shape.
    */
  var haloSize: js.UndefOr[Double] = js.native
  
  /**
    * The polygon symbol that is used to draw the halo for a text symbol.
    */
  var haloSymbol: js.UndefOr[CIMPolygonSymbol] = js.native
  
  /**
    * The size of the text in points.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * If hinting from the font is used for text rendering. Hinting is information included with most fonts to effectively fit the vector glyphs of the font into the raster grid onto which they are displayed.
    */
  var hinting: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphHinting * / any */ String
  ] = js.native
  
  /**
    * The alignment type used to align the text to the geometry horizontally. Affects which side of a point geometry the point text is drawn or which end of a line it is drawn close to. Commonly used to define how stacked text appears.
    */
  var horizontalAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment * / any */ String
  ] = js.native
  
  /**
    * How many points to indent the text back from the end of the baseline.
    */
  var indentAfter: js.UndefOr[Double] = js.native
  
  /**
    * How many points to indent the text from the beginning of the baseline.
    */
  var indentBefore: js.UndefOr[Double] = js.native
  
  /**
    * How many points to indent the text from the beginning of the baseline for the first line only.
    */
  var indentFirstLine: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the text is drawn with metric kerning, which adjusts the spacing between individual letter forms.
    */
  var kerning: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the ISO code for the base language of the text.
    */
  var languageISO: js.UndefOr[String] = js.native
  
  /**
    * The additional spacing that is added to each glyph beyond what is defined by its character box in the font. Value indicates the percentage of a glyph's width. Also known as tracking.
    */
  var letterSpacing: js.UndefOr[Double] = js.native
  
  /**
    * The width that is added to each glyph beyond what is defined by its character box in its font. This is a percentage of the original glyph.
    */
  var letterWidth: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether text is to be drawn with ligatures, which occur when two or more letters or portions of letters are joined to form a single glyph.
    */
  var ligatures: js.UndefOr[Boolean] = js.native
  
  /**
    * The spacing between lines of text. This is also known as leading or line spacing.
    */
  var lineGap: js.UndefOr[Double] = js.native
  
  /**
    * The type of line gap that is applied.
    */
  var lineGapType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineGapType * / any */ String
  ] = js.native
  
  /**
    * The X offset.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The Y offset.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * The Z offset.
    */
  var offsetZ: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether or not the symbol should overprint in press printing.
    */
  var overprint: js.UndefOr[Boolean] = js.native
  
  /**
    * The color of the shadow that is defined for the text symbol. The shadow is drawn as an offset copy of the text.
    */
  var shadowColor: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The shadow offset from the text symbol in the horizontal direction. If X and Y are zero, no shadow is drawn.
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * The shadow offset from the text symbol in the vertical direction. If X and Y are zero, no shadow is drawn.
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the text should be drawn as Small Capitals, where lower case text is converted to small caps and upper case text is left as upper case.
    */
  var smallCaps: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether to draw the text with a strike through it.
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  
  /**
    * The polygon symbol that is used to draw the glyphs of the text.
    */
  var symbol: js.UndefOr[CIMPolygonSymbol] = js.native
  
  /**
    * The collection of properties that are applied to the text symbol only in a 3D context.
    */
  var symbol3DProperties: js.UndefOr[CIM3DSymbolProperties] = js.native
  
  /**
    * The letter case used to draw the text.
    */
  var textCase: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCase * / any */ String
  ] = js.native
  
  /**
    * The base text direction to draw the text.
    */
  var textDirection: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextReadingDirection * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMTextSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol = js.native
  
  /**
    * A value indicating whether to draw the text with an underline.
    */
  var underline: js.UndefOr[Boolean] = js.native
  
  /**
    * The vertical alignment of the text.
    */
  var verticalAlignment: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment * / any */ String
  ] = js.native
  
  /**
    * The orientation for the non-vertical text in a vertical layout. For example, an English fragment in a Japanese text.
    */
  var verticalGlyphOrientation: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalGlyphOrientation * / any */ String
  ] = js.native
  
  /**
    * The additional spacing that is added to between the words of the text string. 100% indicates that regular spacing is used.
    */
  var wordSpacing: js.UndefOr[Double] = js.native
}
object CIMTextSymbol {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol): CIMTextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMTextSymbol]
  }
  
  @scala.inline
  implicit class CIMTextSymbolOps[Self <: CIMTextSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMTextSymbol): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAngleX(value: Double): Self = this.set("angleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleX: Self = this.set("angleX", js.undefined)
    
    @scala.inline
    def setAngleY(value: Double): Self = this.set("angleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleY: Self = this.set("angleY", js.undefined)
    
    @scala.inline
    def setBillboardMode3D(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BillboardMode * / any */ String
    ): Self = this.set("billboardMode3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillboardMode3D: Self = this.set("billboardMode3D", js.undefined)
    
    @scala.inline
    def setBlockProgression(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockProgression * / any */ String
    ): Self = this.set("blockProgression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockProgression: Self = this.set("blockProgression", js.undefined)
    
    @scala.inline
    def setCallout(value: CIMCalloutType): Self = this.set("callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    
    @scala.inline
    def setCompatibilityMode(value: Boolean): Self = this.set("compatibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibilityMode: Self = this.set("compatibilityMode", js.undefined)
    
    @scala.inline
    def setCountryISO(value: String): Self = this.set("countryISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryISO: Self = this.set("countryISO", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = this.set("depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth3D: Self = this.set("depth3D", js.undefined)
    
    @scala.inline
    def setDrawGlyphsAsGeometry(value: Boolean): Self = this.set("drawGlyphsAsGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawGlyphsAsGeometry: Self = this.set("drawGlyphsAsGeometry", js.undefined)
    
    @scala.inline
    def setDrawSoftHyphen(value: Boolean): Self = this.set("drawSoftHyphen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawSoftHyphen: Self = this.set("drawSoftHyphen", js.undefined)
    
    @scala.inline
    def setExtrapolateBaselines(value: Boolean): Self = this.set("extrapolateBaselines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrapolateBaselines: Self = this.set("extrapolateBaselines", js.undefined)
    
    @scala.inline
    def setFlipAngle(value: Double): Self = this.set("flipAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipAngle: Self = this.set("flipAngle", js.undefined)
    
    @scala.inline
    def setFontEffects(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEffects * / any */ String
    ): Self = this.set("fontEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontEffects: Self = this.set("fontEffects", js.undefined)
    
    @scala.inline
    def setFontEncoding(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontEncoding * / any */ String
    ): Self = this.set("fontEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontEncoding: Self = this.set("fontEncoding", js.undefined)
    
    @scala.inline
    def setFontFamilyName(value: String): Self = this.set("fontFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamilyName: Self = this.set("fontFamilyName", js.undefined)
    
    @scala.inline
    def setFontStyleName(value: String): Self = this.set("fontStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyleName: Self = this.set("fontStyleName", js.undefined)
    
    @scala.inline
    def setFontType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
    ): Self = this.set("fontType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontType: Self = this.set("fontType", js.undefined)
    
    @scala.inline
    def setGlyphRotation(value: Double): Self = this.set("glyphRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphRotation: Self = this.set("glyphRotation", js.undefined)
    
    @scala.inline
    def setHaloSize(value: Double): Self = this.set("haloSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaloSize: Self = this.set("haloSize", js.undefined)
    
    @scala.inline
    def setHaloSymbol(value: CIMPolygonSymbol): Self = this.set("haloSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaloSymbol: Self = this.set("haloSymbol", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHinting(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphHinting * / any */ String
    ): Self = this.set("hinting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHinting: Self = this.set("hinting", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment * / any */ String
    ): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIndentAfter(value: Double): Self = this.set("indentAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentAfter: Self = this.set("indentAfter", js.undefined)
    
    @scala.inline
    def setIndentBefore(value: Double): Self = this.set("indentBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentBefore: Self = this.set("indentBefore", js.undefined)
    
    @scala.inline
    def setIndentFirstLine(value: Double): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    
    @scala.inline
    def setKerning(value: Boolean): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setLanguageISO(value: String): Self = this.set("languageISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageISO: Self = this.set("languageISO", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLetterWidth(value: Double): Self = this.set("letterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterWidth: Self = this.set("letterWidth", js.undefined)
    
    @scala.inline
    def setLigatures(value: Boolean): Self = this.set("ligatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLigatures: Self = this.set("ligatures", js.undefined)
    
    @scala.inline
    def setLineGap(value: Double): Self = this.set("lineGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineGap: Self = this.set("lineGap", js.undefined)
    
    @scala.inline
    def setLineGapType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineGapType * / any */ String
    ): Self = this.set("lineGapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineGapType: Self = this.set("lineGapType", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setOffsetZ(value: Double): Self = this.set("offsetZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetZ: Self = this.set("offsetZ", js.undefined)
    
    @scala.inline
    def setOverprint(value: Boolean): Self = this.set("overprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverprint: Self = this.set("overprint", js.undefined)
    
    @scala.inline
    def setShadowColorVarargs(value: Double*): Self = this.set("shadowColor", js.Array(value :_*))
    
    @scala.inline
    def setShadowColor(value: js.Array[Double]): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setSmallCaps(value: Boolean): Self = this.set("smallCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallCaps: Self = this.set("smallCaps", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMPolygonSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setSymbol3DProperties(value: CIM3DSymbolProperties): Self = this.set("symbol3DProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol3DProperties: Self = this.set("symbol3DProperties", js.undefined)
    
    @scala.inline
    def setTextCase(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCase * / any */ String
    ): Self = this.set("textCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextCase: Self = this.set("textCase", js.undefined)
    
    @scala.inline
    def setTextDirection(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextReadingDirection * / any */ String
    ): Self = this.set("textDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDirection: Self = this.set("textDirection", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment * / any */ String
    ): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setVerticalGlyphOrientation(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalGlyphOrientation * / any */ String
    ): Self = this.set("verticalGlyphOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalGlyphOrientation: Self = this.set("verticalGlyphOrientation", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
  }
}
