package typings.antvGLite

import typings.antvGLite.antvGLiteStrings.`small-caps`
import typings.antvGLite.antvGLiteStrings.alphabetic
import typings.antvGLite.antvGLiteStrings.bold
import typings.antvGLite.antvGLiteStrings.bolder
import typings.antvGLite.antvGLiteStrings.bottom
import typings.antvGLite.antvGLiteStrings.center
import typings.antvGLite.antvGLiteStrings.end
import typings.antvGLite.antvGLiteStrings.hanging
import typings.antvGLite.antvGLiteStrings.ideographic
import typings.antvGLite.antvGLiteStrings.italic
import typings.antvGLite.antvGLiteStrings.left
import typings.antvGLite.antvGLiteStrings.lighter
import typings.antvGLite.antvGLiteStrings.middle
import typings.antvGLite.antvGLiteStrings.normal
import typings.antvGLite.antvGLiteStrings.oblique
import typings.antvGLite.antvGLiteStrings.right
import typings.antvGLite.antvGLiteStrings.start
import typings.antvGLite.antvGLiteStrings.top
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.distTypesMod.TextOverflow
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.mod.Rectangle
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.antvGLite.styleValueRegistryMod.CSSGlobalKeywords
import typings.antvGLite.textServiceMod.TextMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Text", "Text")
  @js.native
  /**
    * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement#constants
    */
  open class Text () extends DisplayObject[TextStyleProps, ParsedTextStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[TextStyleProps]) = this()
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement
      */
    def getComputedTextLength(): Double = js.native
    
    def getLineBoundingRects(): js.Array[Rectangle] = js.native
    
    def isOverflowing(): Boolean = js.native
  }
  
  trait ParsedTextStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
    
    var fontVariant: js.UndefOr[normal | `small-caps` | String] = js.undefined
    
    var fontWeight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.undefined
    
    var isOverflowing: js.UndefOr[Boolean] = js.undefined
    
    var leading: js.UndefOr[Double] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var metrics: js.UndefOr[TextMetrics] = js.undefined
    
    var text: String
    
    var textAlign: js.UndefOr[start | center | end | left | right] = js.undefined
    
    var textBaseline: js.UndefOr[top | hanging | middle | alphabetic | ideographic | bottom] = js.undefined
    
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
    
    var wordWrapWidth: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object ParsedTextStyleProps {
    
    inline def apply(text: String, transform: js.Array[ParsedTransform], x: Double, y: Double): ParsedTextStyleProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTextStyleProps]
    }
    
    extension [Self <: ParsedTextStyleProps](x: Self) {
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: normal | `small-caps` | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: normal | bold | bolder | lighter | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setIsOverflowing(value: Boolean): Self = StObject.set(x, "isOverflowing", value.asInstanceOf[js.Any])
      
      inline def setIsOverflowingUndefined: Self = StObject.set(x, "isOverflowing", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMetrics(value: TextMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: start | center | end | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: top | hanging | middle | alphabetic | ideographic | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
      
      inline def setWordWrapWidthUndefined: Self = StObject.set(x, "wordWrapWidth", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextStyleProps
    extends StObject
       with BaseStyleProps {
    
    /**
      * The dx attribute indicates a shift along the x-axis on the position of an element or its content.
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dx
      */
    var dx: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The dy attribute indicates a shift along the y-axis on the position of an element or its content.
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/dy
      */
    var dy: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The font-family property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-family
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * The font-size property sets the size of the font.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-size
      */
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The font-style property sets whether a font should be styled with a normal, italic, or oblique face from its font-family.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-style
      */
    var fontStyle: js.UndefOr[CSSGlobalKeywords | normal | italic | oblique] = js.undefined
    
    /**
      * The font-variant shorthand property allows you to set all the font variants for a font.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant
      */
    var fontVariant: js.UndefOr[CSSGlobalKeywords | normal | `small-caps` | String] = js.undefined
    
    /**
      * The font-weight property sets the weight (or boldness) of the font. The weights available depend on the font-family that is currently set.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight
      */
    var fontWeight: js.UndefOr[CSSGlobalKeywords | normal | bold | bolder | lighter | Double] = js.undefined
    
    /**
      * The white-space property sets how white space inside an element is handled.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/white-space
      */
    /**
      * There is no "CSS leading" property
      * @see https://css-tricks.com/how-to-tame-line-height-in-css/
      */
    var leading: js.UndefOr[Double] = js.undefined
    
    /**
      * It specifies the spacing between letters when drawing text.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/letterSpacing
      */
    var letterSpacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The line-height property sets the height of a line box.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/line-height
      */
    var lineHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Borrow from CanvasKit ParagraphStyle.
      */
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    /**
      * The text-align property sets the horizontal alignment of the inline-level content.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/text-align
      */
    var textAlign: js.UndefOr[CSSGlobalKeywords | start | center | end | left | right] = js.undefined
    
    /**
      * It specifies the current text baseline used when drawing text.
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/textBaseline
      */
    var textBaseline: js.UndefOr[CSSGlobalKeywords | top | hanging | middle | alphabetic | ideographic | bottom] = js.undefined
    
    /**
      * The text-overflow property sets how hidden overflow content is signaled to users.
      * It can be clipped, display an ellipsis ('…'), or display a custom string.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/text-overflow#values
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
    
    /**
      * The overflow-wrap CSS property applies to inline elements,
      * setting whether the browser should insert line breaks within an otherwise unbreakable string to prevent text from overflowing its line box.
      *
      * The overflow-wrap property acts in the same way as the non-standard property word-wrap.
      * The word-wrap property is now treated by browsers as an alias of the standard property.
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-wrap
      */
    var wordWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max width of overflowing box.
      */
    var wordWrapWidth: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object TextStyleProps {
    
    inline def apply(text: String): TextStyleProps = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextStyleProps]
    }
    
    extension [Self <: TextStyleProps](x: Self) {
      
      inline def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: CSSGlobalKeywords | normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: CSSGlobalKeywords | normal | `small-caps` | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: CSSGlobalKeywords | normal | bold | bolder | lighter | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double | String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: CSSGlobalKeywords | start | center | end | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: CSSGlobalKeywords | top | hanging | middle | alphabetic | ideographic | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
      
      inline def setWordWrapWidthUndefined: Self = StObject.set(x, "wordWrapWidth", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
