package typings.antvGLite.anon

import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.`small-caps`
import typings.antvGLite.antvGLiteStrings.all
import typings.antvGLite.antvGLiteStrings.alphabetic
import typings.antvGLite.antvGLiteStrings.auto
import typings.antvGLite.antvGLiteStrings.bold
import typings.antvGLite.antvGLiteStrings.bolder
import typings.antvGLite.antvGLiteStrings.both
import typings.antvGLite.antvGLiteStrings.bottom
import typings.antvGLite.antvGLiteStrings.center
import typings.antvGLite.antvGLiteStrings.end
import typings.antvGLite.antvGLiteStrings.fill
import typings.antvGLite.antvGLiteStrings.hanging
import typings.antvGLite.antvGLiteStrings.hidden
import typings.antvGLite.antvGLiteStrings.ideographic
import typings.antvGLite.antvGLiteStrings.inner
import typings.antvGLite.antvGLiteStrings.italic
import typings.antvGLite.antvGLiteStrings.left
import typings.antvGLite.antvGLiteStrings.lighter
import typings.antvGLite.antvGLiteStrings.middle
import typings.antvGLite.antvGLiteStrings.none
import typings.antvGLite.antvGLiteStrings.normal
import typings.antvGLite.antvGLiteStrings.oblique
import typings.antvGLite.antvGLiteStrings.outer
import typings.antvGLite.antvGLiteStrings.painted
import typings.antvGLite.antvGLiteStrings.right
import typings.antvGLite.antvGLiteStrings.start
import typings.antvGLite.antvGLiteStrings.stroke
import typings.antvGLite.antvGLiteStrings.top
import typings.antvGLite.antvGLiteStrings.visible
import typings.antvGLite.antvGLiteStrings.visiblefill
import typings.antvGLite.antvGLiteStrings.visiblepainted
import typings.antvGLite.antvGLiteStrings.visiblestroke
import typings.antvGLite.distCssMod.CSSGradientValue
import typings.antvGLite.distCssMod.CSSRGB
import typings.antvGLite.distCssMod.CSSUnitValue
import typings.antvGLite.distCssParserColorMod.Pattern
import typings.antvGLite.distCssParserFilterMod.ParsedFilterStyleProperty
import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distServicesTextServiceMod.TextMetrics
import typings.antvGLite.distTypesMod.Cursor
import typings.antvGLite.distTypesMod.TextOverflow
import typings.antvGLite.distTypesMod.TextTransform
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-lite.@antv/g-lite/dist/display-objects/Text.ParsedTextStyleProps> */
trait PartialParsedTextStylePro extends StObject {
  
  var anchor: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var clipPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
  
  var clipPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
  
  var cursor: js.UndefOr[Cursor] = js.undefined
  
  var defX: js.UndefOr[Double] = js.undefined
  
  var defY: js.UndefOr[Double] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var droppable: js.UndefOr[Boolean] = js.undefined
  
  var dx: js.UndefOr[Double] = js.undefined
  
  var dy: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[js.Array[ParsedFilterStyleProperty]] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
  
  var fontVariant: js.UndefOr[normal | `small-caps` | String] = js.undefined
  
  var fontWeight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.undefined
  
  var hitArea: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
  
  var increasedLineWidthForHitTesting: js.UndefOr[Double] = js.undefined
  
  var isOverflowing: js.UndefOr[Boolean] = js.undefined
  
  var leading: js.UndefOr[Double] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  
  var lineDash: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var metrics: js.UndefOr[TextMetrics] = js.undefined
  
  var miterLimit: js.UndefOr[Double] = js.undefined
  
  var offsetDistance: js.UndefOr[Double] = js.undefined
  
  var offsetPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
  
  var offsetPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pointerEvents: js.UndefOr[
    none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
  ] = js.undefined
  
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  var shadowColor: js.UndefOr[CSSRGB] = js.undefined
  
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  var shadowType: js.UndefOr[inner | outer | both] = js.undefined
  
  var stroke: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern] = js.undefined
  
  var strokeDasharray: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
  
  var strokeDashoffset: js.UndefOr[Double] = js.undefined
  
  var strokeLinecap: js.UndefOr[CanvasLineCap] = js.undefined
  
  var strokeLinejoin: js.UndefOr[CanvasLineJoin] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeWidth: js.UndefOr[String | Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textAlign: js.UndefOr[start | center | end | left | right] = js.undefined
  
  var textBaseline: js.UndefOr[top | hanging | middle | alphabetic | ideographic | bottom] = js.undefined
  
  var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  
  var textTransform: js.UndefOr[TextTransform | _empty] = js.undefined
  
  var transform: js.UndefOr[js.Array[ParsedTransform]] = js.undefined
  
  var transformOrigin: js.UndefOr[js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]] = js.undefined
  
  var visibility: js.UndefOr[visible | hidden | CSSGlobalKeywords] = js.undefined
  
  var wordWrap: js.UndefOr[Boolean] = js.undefined
  
  var wordWrapWidth: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PartialParsedTextStylePro {
  
  inline def apply(): PartialParsedTextStylePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParsedTextStylePro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialParsedTextStylePro] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClipPath(value: DisplayObject[Any, Any]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathNull: Self = StObject.set(x, "clipPath", null)
    
    inline def setClipPathTargets(value: js.Array[DisplayObject[Any, Any]]): Self = StObject.set(x, "clipPathTargets", value.asInstanceOf[js.Any])
    
    inline def setClipPathTargetsUndefined: Self = StObject.set(x, "clipPathTargets", js.undefined)
    
    inline def setClipPathTargetsVarargs(value: (DisplayObject[Any, Any])*): Self = StObject.set(x, "clipPathTargets", js.Array(value*))
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDefX(value: Double): Self = StObject.set(x, "defX", value.asInstanceOf[js.Any])
    
    inline def setDefXUndefined: Self = StObject.set(x, "defX", js.undefined)
    
    inline def setDefY(value: Double): Self = StObject.set(x, "defY", value.asInstanceOf[js.Any])
    
    inline def setDefYUndefined: Self = StObject.set(x, "defY", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
    
    inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFill(value: CSSRGB | js.Array[CSSGradientValue] | Pattern): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: CSSGradientValue*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setFilter(value: js.Array[ParsedFilterStyleProperty]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: ParsedFilterStyleProperty*): Self = StObject.set(x, "filter", js.Array(value*))
    
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
    
    inline def setHitArea(value: DisplayObject[Any, Any]): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
    
    inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
    
    inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
    
    inline def setIncreasedLineWidthForHitTesting(value: Double): Self = StObject.set(x, "increasedLineWidthForHitTesting", value.asInstanceOf[js.Any])
    
    inline def setIncreasedLineWidthForHitTestingUndefined: Self = StObject.set(x, "increasedLineWidthForHitTesting", js.undefined)
    
    inline def setIsOverflowing(value: Boolean): Self = StObject.set(x, "isOverflowing", value.asInstanceOf[js.Any])
    
    inline def setIsOverflowingUndefined: Self = StObject.set(x, "isOverflowing", js.undefined)
    
    inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineDash(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
    
    inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setMetrics(value: TextMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    inline def setOffsetDistance(value: Double): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
    
    inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
    
    inline def setOffsetPath(value: DisplayObject[Any, Any]): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
    
    inline def setOffsetPathNull: Self = StObject.set(x, "offsetPath", null)
    
    inline def setOffsetPathTargets(value: js.Array[DisplayObject[Any, Any]]): Self = StObject.set(x, "offsetPathTargets", value.asInstanceOf[js.Any])
    
    inline def setOffsetPathTargetsUndefined: Self = StObject.set(x, "offsetPathTargets", js.undefined)
    
    inline def setOffsetPathTargetsVarargs(value: (DisplayObject[Any, Any])*): Self = StObject.set(x, "offsetPathTargets", js.Array(value*))
    
    inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPointerEvents(
      value: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
    ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: CSSRGB): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setShadowType(value: inner | outer | both): Self = StObject.set(x, "shadowType", value.asInstanceOf[js.Any])
    
    inline def setShadowTypeUndefined: Self = StObject.set(x, "shadowType", js.undefined)
    
    inline def setStroke(value: CSSRGB | js.Array[CSSGradientValue] | Pattern): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: String | (js.Array[String | Double])): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDasharrayVarargs(value: (String | Double)*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
    
    inline def setStrokeDashoffset(value: Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    inline def setStrokeLinecap(value: CanvasLineCap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    inline def setStrokeLinejoin(value: CanvasLineJoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: CSSGradientValue*): Self = StObject.set(x, "stroke", js.Array(value*))
    
    inline def setStrokeWidth(value: String | Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: start | center | end | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextBaseline(value: top | hanging | middle | alphabetic | ideographic | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    inline def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextTransform(value: TextTransform | _empty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTransform(value: js.Array[ParsedTransform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformOrigin(value: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: ParsedTransform*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setVisibility(value: visible | hidden | CSSGlobalKeywords): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    inline def setWordWrapWidth(value: Double): Self = StObject.set(x, "wordWrapWidth", value.asInstanceOf[js.Any])
    
    inline def setWordWrapWidthUndefined: Self = StObject.set(x, "wordWrapWidth", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
