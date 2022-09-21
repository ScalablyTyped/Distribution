package typings.antvGLite

import org.scalablytyped.runtime.StringDictionary
import typings.antvGLite.abstractRendererMod.IRenderer
import typings.antvGLite.antvGLiteStrings._empty
import typings.antvGLite.antvGLiteStrings.`2d`
import typings.antvGLite.antvGLiteStrings.all
import typings.antvGLite.antvGLiteStrings.auto
import typings.antvGLite.antvGLiteStrings.both
import typings.antvGLite.antvGLiteStrings.fill
import typings.antvGLite.antvGLiteStrings.hidden
import typings.antvGLite.antvGLiteStrings.inner
import typings.antvGLite.antvGLiteStrings.none
import typings.antvGLite.antvGLiteStrings.outer
import typings.antvGLite.antvGLiteStrings.painted
import typings.antvGLite.antvGLiteStrings.stroke
import typings.antvGLite.antvGLiteStrings.visible
import typings.antvGLite.antvGLiteStrings.visiblefill
import typings.antvGLite.antvGLiteStrings.visiblepainted
import typings.antvGLite.antvGLiteStrings.visiblestroke
import typings.antvGLite.antvGLiteStrings.webgl
import typings.antvGLite.antvGLiteStrings.webgl2
import typings.antvGLite.colorMod.Pattern
import typings.antvGLite.cssMod.CSSGradientValue
import typings.antvGLite.cssMod.CSSRGB
import typings.antvGLite.cssMod.CSSUnitValue
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.domInterfacesMod.IEventTarget
import typings.antvGLite.filterMod.ParsedFilterStyleProperty
import typings.antvGLite.parserTransformMod.ParsedTransform
import typings.antvGLite.styleValueRegistryMod.CSSGlobalKeywords
import typings.glMatrix.mod.vec2
import typings.glMatrix.mod.vec3
import typings.manaSyringe.mod.Syringe.DefinedToken
import typings.std.AddEventListenerOptions
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasRenderingContext2DSettings
import typings.std.Document
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FrameRequestCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WebGL2RenderingContext
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@antv/g-lite/dist/types", "AnimationTimelineToken")
  @js.native
  val AnimationTimelineToken: DefinedToken = js.native
  
  trait CanvasConfig
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * 画布背景色
      */
    var background: js.UndefOr[ColorType] = js.undefined
    
    var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    /**
      * support OffscreenCanvas
      */
    var canvas: js.UndefOr[CanvasLike] = js.undefined
    
    /**
      * document.getElementById(container);
      */
    var container: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * replace `new window.Image()`
      */
    var createImage: js.UndefOr[js.Function1[/* src */ String, HTMLImageElement]] = js.undefined
    
    /**
      * 画布的 cursor 样式
      */
    var cursor: js.UndefOr[Cursor] = js.undefined
    
    /**
      * window.devicePixelRatio
      */
    var devicePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * used in JSDOM
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * 画布高度
      */
    var height: js.UndefOr[Double] = js.undefined
    
    var isMouseEvent: js.UndefOr[
        js.Function1[/* event */ InteractivePointerEvent, /* is std.MouseEvent */ Boolean]
      ] = js.undefined
    
    var isTouchEvent: js.UndefOr[
        js.Function1[/* event */ InteractivePointerEvent, /* is std.TouchEvent */ Boolean]
      ] = js.undefined
    
    /**
      * used in text measurement & texture generation
      */
    var offscreenCanvas: js.UndefOr[CanvasLike] = js.undefined
    
    /**
      * Renderer
      */
    var renderer: IRenderer
    
    /**
      * rAF
      */
    var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.undefined
    
    /**
      * limits query
      */
    var supportsPointerEvents: js.UndefOr[Boolean] = js.undefined
    
    var supportsTouchEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 画布宽度
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object CanvasConfig {
    
    @JSImport("@antv/g-lite/dist/types", "CanvasConfig")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: CanvasConfig](x: Self) {
      
      inline def setBackground(value: ColorType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCancelAnimationFrame(value: /* id */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setCancelAnimationFrameUndefined: Self = StObject.set(x, "cancelAnimationFrame", js.undefined)
      
      inline def setCanvas(value: CanvasLike): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCreateImage(value: /* src */ String => HTMLImageElement): Self = StObject.set(x, "createImage", js.Any.fromFunction1(value))
      
      inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
      
      inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsMouseEvent(value: /* event */ InteractivePointerEvent => /* is std.MouseEvent */ Boolean): Self = StObject.set(x, "isMouseEvent", js.Any.fromFunction1(value))
      
      inline def setIsMouseEventUndefined: Self = StObject.set(x, "isMouseEvent", js.undefined)
      
      inline def setIsTouchEvent(value: /* event */ InteractivePointerEvent => /* is std.TouchEvent */ Boolean): Self = StObject.set(x, "isTouchEvent", js.Any.fromFunction1(value))
      
      inline def setIsTouchEventUndefined: Self = StObject.set(x, "isTouchEvent", js.undefined)
      
      inline def setOffscreenCanvas(value: CanvasLike): Self = StObject.set(x, "offscreenCanvas", value.asInstanceOf[js.Any])
      
      inline def setOffscreenCanvasUndefined: Self = StObject.set(x, "offscreenCanvas", js.undefined)
      
      inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      inline def setSupportsPointerEvents(value: Boolean): Self = StObject.set(x, "supportsPointerEvents", value.asInstanceOf[js.Any])
      
      inline def setSupportsPointerEventsUndefined: Self = StObject.set(x, "supportsPointerEvents", js.undefined)
      
      inline def setSupportsTouchEvents(value: Boolean): Self = StObject.set(x, "supportsTouchEvents", value.asInstanceOf[js.Any])
      
      inline def setSupportsTouchEventsUndefined: Self = StObject.set(x, "supportsTouchEvents", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @JSImport("@antv/g-lite/dist/types", "ParseEasingFunction")
  @js.native
  val ParseEasingFunction: DefinedToken = js.native
  
  @js.native
  sealed trait Shape extends StObject
  @JSImport("@antv/g-lite/dist/types", "Shape")
  @js.native
  object Shape extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Shape & String] = js.native
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with Shape
    /* "circle" */ val CIRCLE: typings.antvGLite.distTypesMod.Shape.CIRCLE & String = js.native
    
    @js.native
    sealed trait ELLIPSE
      extends StObject
         with Shape
    /* "ellipse" */ val ELLIPSE: typings.antvGLite.distTypesMod.Shape.ELLIPSE & String = js.native
    
    @js.native
    sealed trait GROUP
      extends StObject
         with Shape
    /* "g" */ val GROUP: typings.antvGLite.distTypesMod.Shape.GROUP & String = js.native
    
    @js.native
    sealed trait HTML
      extends StObject
         with Shape
    /* "html" */ val HTML: typings.antvGLite.distTypesMod.Shape.HTML & String = js.native
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with Shape
    /* "image" */ val IMAGE: typings.antvGLite.distTypesMod.Shape.IMAGE & String = js.native
    
    @js.native
    sealed trait LINE
      extends StObject
         with Shape
    /* "line" */ val LINE: typings.antvGLite.distTypesMod.Shape.LINE & String = js.native
    
    @js.native
    sealed trait MESH
      extends StObject
         with Shape
    /* "mesh" */ val MESH: typings.antvGLite.distTypesMod.Shape.MESH & String = js.native
    
    @js.native
    sealed trait PATH
      extends StObject
         with Shape
    /* "path" */ val PATH: typings.antvGLite.distTypesMod.Shape.PATH & String = js.native
    
    @js.native
    sealed trait POLYGON
      extends StObject
         with Shape
    /* "polygon" */ val POLYGON: typings.antvGLite.distTypesMod.Shape.POLYGON & String = js.native
    
    @js.native
    sealed trait POLYLINE
      extends StObject
         with Shape
    /* "polyline" */ val POLYLINE: typings.antvGLite.distTypesMod.Shape.POLYLINE & String = js.native
    
    @js.native
    sealed trait RECT
      extends StObject
         with Shape
    /* "rect" */ val RECT: typings.antvGLite.distTypesMod.Shape.RECT & String = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with Shape
    /* "text" */ val TEXT: typings.antvGLite.distTypesMod.Shape.TEXT & String = js.native
  }
  
  trait BaseStyleProps extends StObject {
    
    /**
      * how do we define the 'position' of a shape?
      * eg. the default anchor of a Rect is top-left, we can change it to its' center [0.5, 0.5].
      */
    var anchor: js.UndefOr[vec2 | vec3 | String] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      * clip path
      * @see https://developer.mozilla.org/zh-CN/docs/Web/CSS/clip-path
      */
    var clipPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    var clipPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
    
    /**
      * the cursor style when the target is active
      */
    var cursor: js.UndefOr[Cursor] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    /**
      * @see https://g-next.antv.vision/zh/docs/plugins/dragndrop#drag
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see https://g-next.antv.vision/zh/docs/plugins/dragndrop#drop
      */
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    /** 填充颜色 */
    var fill: js.UndefOr[ColorType | Pattern] = js.undefined
    
    /** 填充透明度 */
    var fillOpacity: js.UndefOr[Double | String] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/filter
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * 交互区域
      */
    var hitArea: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    /**
      * increased line width when hitting test
      */
    var increasedLineWidthForHitTesting: js.UndefOr[String | Double] = js.undefined
    
    /**
      * alias of strokeLinecap
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap
      */
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * alias of strokeDasharray
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/getLineDash
      */
    var lineDash: js.UndefOr[Double | String | (js.Array[String | Double])] = js.undefined
    
    /**
      * alias of strokeDashoffset
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset
      */
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * alias of strokeLinejoin
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin
      */
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * alias if strokeWidth
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineWidth
      */
    var lineWidth: js.UndefOr[String | Double] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/miterLimit
      */
    var miterLimit: js.UndefOr[Double | String] = js.undefined
    
    var offsetDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * offset path
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Motion_Path
      */
    var offsetPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    var offsetPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
    
    /** 整体透明度 */
    var opacity: js.UndefOr[Double | String] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/CSS/pointer-events
      */
    var pointerEvents: js.UndefOr[
        none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
      ] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowBlur
      */
    var shadowBlur: js.UndefOr[Double] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowColor
      */
    var shadowColor: js.UndefOr[ColorType] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX
      */
    var shadowOffsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY
      */
    var shadowOffsetY: js.UndefOr[Double] = js.undefined
    
    var shadowType: js.UndefOr[inner | outer | both] = js.undefined
    
    var stroke: js.UndefOr[ColorType | Pattern] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dasharray
      */
    var strokeDasharray: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dashoffset
      */
    var strokeDashoffset: js.UndefOr[Double] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linecap
      */
    var strokeLinecap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-linejoin
      */
    var strokeLinejoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /** 描边透明度 */
    var strokeOpacity: js.UndefOr[Double | String] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-width
      */
    var strokeWidth: js.UndefOr[String | Double] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/CSS/text-transform
      */
    var textTransform: js.UndefOr[TextTransform | _empty] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/transform
      */
    var transform: js.UndefOr[String] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/transform-origin
      */
    var transformOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/visibility
      */
    var visibility: js.UndefOr[visible | hidden | CSSGlobalKeywords] = js.undefined
    
    /**
      * z-index in CSS
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object BaseStyleProps {
    
    inline def apply(): BaseStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseStyleProps]
    }
    
    extension [Self <: BaseStyleProps](x: Self) {
      
      inline def setAnchor(value: vec2 | vec3 | String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
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
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setFill(value: ColorType | Pattern): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillNull: Self = StObject.set(x, "fill", null)
      
      inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHitArea(value: DisplayObject[Any, Any]): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
      
      inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      inline def setIncreasedLineWidthForHitTesting(value: String | Double): Self = StObject.set(x, "increasedLineWidthForHitTesting", value.asInstanceOf[js.Any])
      
      inline def setIncreasedLineWidthForHitTestingUndefined: Self = StObject.set(x, "increasedLineWidthForHitTesting", js.undefined)
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: Double | String | (js.Array[String | Double])): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: (String | Double)*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: String | Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMiterLimit(value: Double | String): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setOffsetDistance(value: Double): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
      
      inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
      
      inline def setOffsetPath(value: DisplayObject[Any, Any]): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
      
      inline def setOffsetPathNull: Self = StObject.set(x, "offsetPath", null)
      
      inline def setOffsetPathTargets(value: js.Array[DisplayObject[Any, Any]]): Self = StObject.set(x, "offsetPathTargets", value.asInstanceOf[js.Any])
      
      inline def setOffsetPathTargetsUndefined: Self = StObject.set(x, "offsetPathTargets", js.undefined)
      
      inline def setOffsetPathTargetsVarargs(value: (DisplayObject[Any, Any])*): Self = StObject.set(x, "offsetPathTargets", js.Array(value*))
      
      inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
      
      inline def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerEvents(
        value: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
      ): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      inline def setShadowColor(value: ColorType): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorNull: Self = StObject.set(x, "shadowColor", null)
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      inline def setShadowType(value: inner | outer | both): Self = StObject.set(x, "shadowType", value.asInstanceOf[js.Any])
      
      inline def setShadowTypeUndefined: Self = StObject.set(x, "shadowType", js.undefined)
      
      inline def setStroke(value: ColorType | Pattern): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String | (js.Array[String | Double])): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDasharrayVarargs(value: (String | Double)*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
      
      inline def setStrokeDashoffset(value: Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: CanvasLineCap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: CanvasLineJoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
      
      inline def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: String | Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTextTransform(value: TextTransform | _empty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setVisibility(value: visible | hidden | CSSGlobalKeywords): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait CanvasLike
    extends StObject
       with IEventTarget {
    
    def addEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ]
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    var addEventListener_Original: (js.Function3[
        /* keyof std.HTMLElementEventMap */ /* type */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any, 
        /* listener */ js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[keyof std.HTMLElementEventMap] */ /* ev */ js.Any, 
          Any
        ], 
        /* options */ js.UndefOr[Boolean | AddEventListenerOptions], 
        Unit
      ]) & (js.Function3[
        /* type */ String, 
        /* listener */ EventListenerOrEventListenerObject, 
        /* options */ js.UndefOr[Boolean | AddEventListenerOptions], 
        Unit
      ]) = js.native
    
    @JSName("getContext")
    def getContext_2d(contextId: `2d`): CanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    def getContext_2d(contextId: `2d`, contextAttributes: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | Null = js.native
    @JSName("getContext")
    var getContext_Original: (js.Function2[
        `2d`, 
        /* contextAttributes */ js.UndefOr[CanvasRenderingContext2DSettings], 
        CanvasRenderingContext2D | Null
      ]) & (js.Function2[
        webgl, 
        /* contextAttributes */ js.UndefOr[WebGLContextAttributes], 
        WebGLRenderingContext | Null
      ]) & (js.Function2[
        webgl2, 
        /* contextAttributes */ js.UndefOr[WebGLContextAttributes], 
        WebGL2RenderingContext | Null
      ]) = js.native
    @JSName("getContext")
    def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2): WebGL2RenderingContext | Null = js.native
    @JSName("getContext")
    def getContext_webgl2(contextId: webgl2, contextAttributes: WebGLContextAttributes): WebGL2RenderingContext | Null = js.native
    
    var height: Double = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def removeEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ]
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any */](
      `type`: K,
      listener: js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[K] */ /* ev */ js.Any, 
          Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    var removeEventListener_Original: (js.Function3[
        /* keyof std.HTMLElementEventMap */ /* type */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ Any, 
        /* listener */ js.ThisFunction1[
          /* this */ HTMLCanvasElement, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementEventMap[keyof std.HTMLElementEventMap] */ /* ev */ js.Any, 
          Any
        ], 
        /* options */ js.UndefOr[Boolean | EventListenerOptions], 
        Unit
      ]) & (js.Function3[
        /* type */ String, 
        /* listener */ EventListenerOrEventListenerObject, 
        /* options */ js.UndefOr[Boolean | EventListenerOptions], 
        Unit
      ]) = js.native
    
    var width: Double = js.native
  }
  
  type ColorType = String | Null
  
  type CombinedNumber = ComninedValue[Double]
  
  type ComninedValue[T] = T | js.Array[T] | (js.Tuple2[T, T]) | (js.Tuple3[T, T, T]) | Tuple4[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.auto
    - typings.antvGLite.antvGLiteStrings.default
    - typings.antvGLite.antvGLiteStrings.none
    - typings.antvGLite.antvGLiteStrings.`context-menu`
    - typings.antvGLite.antvGLiteStrings.help
    - typings.antvGLite.antvGLiteStrings.pointer
    - typings.antvGLite.antvGLiteStrings.progress
    - typings.antvGLite.antvGLiteStrings.wait
    - typings.antvGLite.antvGLiteStrings.cell
    - typings.antvGLite.antvGLiteStrings.crosshair
    - typings.antvGLite.antvGLiteStrings.text
    - typings.antvGLite.antvGLiteStrings.`vertical-text`
    - typings.antvGLite.antvGLiteStrings.alias
    - typings.antvGLite.antvGLiteStrings.copy
    - typings.antvGLite.antvGLiteStrings.move
    - typings.antvGLite.antvGLiteStrings.`no-drop`
    - typings.antvGLite.antvGLiteStrings.`not-allowed`
    - typings.antvGLite.antvGLiteStrings.grab
    - typings.antvGLite.antvGLiteStrings.grabbing
    - typings.antvGLite.antvGLiteStrings.`all-scroll`
    - typings.antvGLite.antvGLiteStrings.`col-resize`
    - typings.antvGLite.antvGLiteStrings.`row-resize`
    - typings.antvGLite.antvGLiteStrings.`n-resize`
    - typings.antvGLite.antvGLiteStrings.`e-resize`
    - typings.antvGLite.antvGLiteStrings.`s-resize`
    - typings.antvGLite.antvGLiteStrings.`w-resize`
    - typings.antvGLite.antvGLiteStrings.`ne-resize`
    - typings.antvGLite.antvGLiteStrings.`nw-resize`
    - typings.antvGLite.antvGLiteStrings.`se-resize`
    - typings.antvGLite.antvGLiteStrings.`sw-resize`
    - typings.antvGLite.antvGLiteStrings.`ew-resize`
    - typings.antvGLite.antvGLiteStrings.`ns-resize`
    - typings.antvGLite.antvGLiteStrings.`nesw-resize`
    - typings.antvGLite.antvGLiteStrings.`nwse-resize`
    - typings.antvGLite.antvGLiteStrings.`zoom-in`
    - typings.antvGLite.antvGLiteStrings.`zoom-out`
  */
  trait Cursor extends StObject
  object Cursor {
    
    inline def default: typings.antvGLite.antvGLiteStrings.default = "default".asInstanceOf[typings.antvGLite.antvGLiteStrings.default]
    
    inline def alias: typings.antvGLite.antvGLiteStrings.alias = "alias".asInstanceOf[typings.antvGLite.antvGLiteStrings.alias]
    
    inline def `all-scroll`: typings.antvGLite.antvGLiteStrings.`all-scroll` = "all-scroll".asInstanceOf[typings.antvGLite.antvGLiteStrings.`all-scroll`]
    
    inline def auto: typings.antvGLite.antvGLiteStrings.auto = "auto".asInstanceOf[typings.antvGLite.antvGLiteStrings.auto]
    
    inline def cell: typings.antvGLite.antvGLiteStrings.cell = "cell".asInstanceOf[typings.antvGLite.antvGLiteStrings.cell]
    
    inline def `col-resize`: typings.antvGLite.antvGLiteStrings.`col-resize` = "col-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`col-resize`]
    
    inline def `context-menu`: typings.antvGLite.antvGLiteStrings.`context-menu` = "context-menu".asInstanceOf[typings.antvGLite.antvGLiteStrings.`context-menu`]
    
    inline def copy: typings.antvGLite.antvGLiteStrings.copy = "copy".asInstanceOf[typings.antvGLite.antvGLiteStrings.copy]
    
    inline def crosshair: typings.antvGLite.antvGLiteStrings.crosshair = "crosshair".asInstanceOf[typings.antvGLite.antvGLiteStrings.crosshair]
    
    inline def `e-resize`: typings.antvGLite.antvGLiteStrings.`e-resize` = "e-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`e-resize`]
    
    inline def `ew-resize`: typings.antvGLite.antvGLiteStrings.`ew-resize` = "ew-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`ew-resize`]
    
    inline def grab: typings.antvGLite.antvGLiteStrings.grab = "grab".asInstanceOf[typings.antvGLite.antvGLiteStrings.grab]
    
    inline def grabbing: typings.antvGLite.antvGLiteStrings.grabbing = "grabbing".asInstanceOf[typings.antvGLite.antvGLiteStrings.grabbing]
    
    inline def help: typings.antvGLite.antvGLiteStrings.help = "help".asInstanceOf[typings.antvGLite.antvGLiteStrings.help]
    
    inline def move: typings.antvGLite.antvGLiteStrings.move = "move".asInstanceOf[typings.antvGLite.antvGLiteStrings.move]
    
    inline def `n-resize`: typings.antvGLite.antvGLiteStrings.`n-resize` = "n-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`n-resize`]
    
    inline def `ne-resize`: typings.antvGLite.antvGLiteStrings.`ne-resize` = "ne-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`ne-resize`]
    
    inline def `nesw-resize`: typings.antvGLite.antvGLiteStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`nesw-resize`]
    
    inline def `no-drop`: typings.antvGLite.antvGLiteStrings.`no-drop` = "no-drop".asInstanceOf[typings.antvGLite.antvGLiteStrings.`no-drop`]
    
    inline def none: typings.antvGLite.antvGLiteStrings.none = "none".asInstanceOf[typings.antvGLite.antvGLiteStrings.none]
    
    inline def `not-allowed`: typings.antvGLite.antvGLiteStrings.`not-allowed` = "not-allowed".asInstanceOf[typings.antvGLite.antvGLiteStrings.`not-allowed`]
    
    inline def `ns-resize`: typings.antvGLite.antvGLiteStrings.`ns-resize` = "ns-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`ns-resize`]
    
    inline def `nw-resize`: typings.antvGLite.antvGLiteStrings.`nw-resize` = "nw-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`nw-resize`]
    
    inline def `nwse-resize`: typings.antvGLite.antvGLiteStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`nwse-resize`]
    
    inline def pointer: typings.antvGLite.antvGLiteStrings.pointer = "pointer".asInstanceOf[typings.antvGLite.antvGLiteStrings.pointer]
    
    inline def progress: typings.antvGLite.antvGLiteStrings.progress = "progress".asInstanceOf[typings.antvGLite.antvGLiteStrings.progress]
    
    inline def `row-resize`: typings.antvGLite.antvGLiteStrings.`row-resize` = "row-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`row-resize`]
    
    inline def `s-resize`: typings.antvGLite.antvGLiteStrings.`s-resize` = "s-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`s-resize`]
    
    inline def `se-resize`: typings.antvGLite.antvGLiteStrings.`se-resize` = "se-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`se-resize`]
    
    inline def `sw-resize`: typings.antvGLite.antvGLiteStrings.`sw-resize` = "sw-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`sw-resize`]
    
    inline def text: typings.antvGLite.antvGLiteStrings.text = "text".asInstanceOf[typings.antvGLite.antvGLiteStrings.text]
    
    inline def `vertical-text`: typings.antvGLite.antvGLiteStrings.`vertical-text` = "vertical-text".asInstanceOf[typings.antvGLite.antvGLiteStrings.`vertical-text`]
    
    inline def `w-resize`: typings.antvGLite.antvGLiteStrings.`w-resize` = "w-resize".asInstanceOf[typings.antvGLite.antvGLiteStrings.`w-resize`]
    
    inline def `zoom-in`: typings.antvGLite.antvGLiteStrings.`zoom-in` = "zoom-in".asInstanceOf[typings.antvGLite.antvGLiteStrings.`zoom-in`]
    
    inline def `zoom-out`: typings.antvGLite.antvGLiteStrings.`zoom-out` = "zoom-out".asInstanceOf[typings.antvGLite.antvGLiteStrings.`zoom-out`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteNumbers.`0`
    - typings.antvGLite.antvGLiteNumbers.`1`
    - typings.antvGLite.antvGLiteNumbers.`2`
    - typings.antvGLite.antvGLiteNumbers.`3`
    - typings.antvGLite.antvGLiteNumbers.`4`
    - typings.antvGLite.antvGLiteNumbers.`5`
    - typings.antvGLite.antvGLiteNumbers.`6`
    - typings.antvGLite.antvGLiteNumbers.`7`
    - typings.antvGLite.antvGLiteNumbers.`8`
    - typings.antvGLite.antvGLiteNumbers.`9`
  */
  trait Digit extends StObject
  object Digit {
    
    inline def `0`: typings.antvGLite.antvGLiteNumbers.`0` = 0.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`0`]
    
    inline def `1`: typings.antvGLite.antvGLiteNumbers.`1` = 1.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`1`]
    
    inline def `2`: typings.antvGLite.antvGLiteNumbers.`2` = 2.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`2`]
    
    inline def `3`: typings.antvGLite.antvGLiteNumbers.`3` = 3.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`3`]
    
    inline def `4`: typings.antvGLite.antvGLiteNumbers.`4` = 4.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`4`]
    
    inline def `5`: typings.antvGLite.antvGLiteNumbers.`5` = 5.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`5`]
    
    inline def `6`: typings.antvGLite.antvGLiteNumbers.`6` = 6.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`6`]
    
    inline def `7`: typings.antvGLite.antvGLiteNumbers.`7` = 7.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`7`]
    
    inline def `8`: typings.antvGLite.antvGLiteNumbers.`8` = 8.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`8`]
    
    inline def `9`: typings.antvGLite.antvGLiteNumbers.`9` = 9.asInstanceOf[typings.antvGLite.antvGLiteNumbers.`9`]
  }
  
  trait EventPosition extends StObject {
    
    var clientX: Double
    
    var clientY: Double
    
    var viewportX: Double
    
    var viewportY: Double
    
    var x: Double
    
    var y: Double
  }
  object EventPosition {
    
    inline def apply(clientX: Double, clientY: Double, viewportX: Double, viewportY: Double, x: Double, y: Double): EventPosition = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], viewportX = viewportX.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPosition]
    }
    
    extension [Self <: EventPosition](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setViewportX(value: Double): Self = StObject.set(x, "viewportX", value.asInstanceOf[js.Any])
      
      inline def setViewportY(value: Double): Self = StObject.set(x, "viewportY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type InteractivePointerEvent = PointerEvent | TouchEvent | MouseEvent | WheelEvent
  
  type Length = Double
  
  type LengthOrPercentage = Length | Percentage
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.distTypesMod.Length
    - typings.antvGLite.distTypesMod.Percentage
    - typings.antvGLite.antvGLiteStrings.auto
  */
  type LengthOrPercentageOrAuto = _LengthOrPercentageOrAuto | Length
  
  /* Inlined parent std.Omit<@antv/g-lite.@antv/g-lite/dist/types.BaseStyleProps, 'anchor' | 'fill' | 'stroke' | 'lineWidth' | 'increasedLineWidthForHitTesting' | 'lineDash' | 'path' | 'points' | 'shadowColor' | 'transform' | 'transformOrigin' | 'miterLimit' | 'filter' | 'opacity' | 'fillOpacity' | 'strokeOpacity'> */
  trait ParsedBaseStyleProps extends StObject {
    
    var anchor: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var clipPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    var clipPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
    
    var cursor: js.UndefOr[Cursor] = js.undefined
    
    /**
      * x according to definition, eg. Line's x1/x2, Polyline's points
      */
    var defX: js.UndefOr[Double] = js.undefined
    
    var defY: js.UndefOr[Double] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Array[ParsedFilterStyleProperty]] = js.undefined
    
    var hitArea: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    var increasedLineWidthForHitTesting: js.UndefOr[Double] = js.undefined
    
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    var lineDash: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var offsetDistance: js.UndefOr[Double] = js.undefined
    
    var offsetPath: js.UndefOr[(DisplayObject[Any, Any]) | Null] = js.undefined
    
    var offsetPathTargets: js.UndefOr[js.Array[DisplayObject[Any, Any]]] = js.undefined
    
    /**
      * offset relative to initial definition
      */
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
    
    var textTransform: js.UndefOr[TextTransform | _empty] = js.undefined
    
    var transform: js.Array[ParsedTransform]
    
    var transformOrigin: js.UndefOr[js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]] = js.undefined
    
    var visibility: js.UndefOr[visible | hidden | CSSGlobalKeywords] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ParsedBaseStyleProps {
    
    inline def apply(transform: js.Array[ParsedTransform]): ParsedBaseStyleProps = {
      val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedBaseStyleProps]
    }
    
    extension [Self <: ParsedBaseStyleProps](x: Self) {
      
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
      
      inline def setFill(value: CSSRGB | js.Array[CSSGradientValue] | Pattern): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: CSSGradientValue*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setFilter(value: js.Array[ParsedFilterStyleProperty]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: ParsedFilterStyleProperty*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setHitArea(value: DisplayObject[Any, Any]): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
      
      inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      inline def setIncreasedLineWidthForHitTesting(value: Double): Self = StObject.set(x, "increasedLineWidthForHitTesting", value.asInstanceOf[js.Any])
      
      inline def setIncreasedLineWidthForHitTestingUndefined: Self = StObject.set(x, "increasedLineWidthForHitTesting", js.undefined)
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
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
      
      inline def setTextTransform(value: TextTransform | _empty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTransform(value: js.Array[ParsedTransform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformOrigin(value: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformVarargs(value: ParsedTransform*): Self = StObject.set(x, "transform", js.Array(value*))
      
      inline def setVisibility(value: visible | hidden | CSSGlobalKeywords): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.$LeftcurlybracketDigitRightcurlybracketPercentsign
    - typings.antvGLite.antvGLiteStrings.DollarLeftcurlybracketDigitRightcurlybracketDollarLeftcurlybracketDigitRightcurlybracketPercentsign
  */
  trait Percentage
    extends StObject
       with _LengthOrPercentageOrAuto
  object Percentage {
    
    inline def $LeftcurlybracketDigitRightcurlybracketPercentsign: typings.antvGLite.antvGLiteStrings.$LeftcurlybracketDigitRightcurlybracketPercentsign = "${Digit}%".asInstanceOf[typings.antvGLite.antvGLiteStrings.$LeftcurlybracketDigitRightcurlybracketPercentsign]
    
    inline def DollarLeftcurlybracketDigitRightcurlybracketDollarLeftcurlybracketDigitRightcurlybracketPercentsign: typings.antvGLite.antvGLiteStrings.DollarLeftcurlybracketDigitRightcurlybracketDollarLeftcurlybracketDigitRightcurlybracketPercentsign = "${Digit}${Digit}%".asInstanceOf[typings.antvGLite.antvGLiteStrings.DollarLeftcurlybracketDigitRightcurlybracketDollarLeftcurlybracketDigitRightcurlybracketPercentsign]
  }
  
  trait RendererConfig extends StObject {
    
    /**
      * enable auto rendering
      */
    var enableAutoRendering: Boolean
    
    /**
      * enable culling
      */
    var enableCulling: Boolean
    
    /**
      * enable dirty check for displayobject
      */
    var enableDirtyCheck: Boolean
    
    /**
      * enable dirty rectangle rendering
      */
    var enableDirtyRectangleRendering: Boolean
    
    /**
      * enable debugging dirty rectangle, Canvas will trigger CanvasEvent.DIRTY_RECTANGLE
      */
    var enableDirtyRectangleRenderingDebug: Boolean
  }
  object RendererConfig {
    
    inline def apply(
      enableAutoRendering: Boolean,
      enableCulling: Boolean,
      enableDirtyCheck: Boolean,
      enableDirtyRectangleRendering: Boolean,
      enableDirtyRectangleRenderingDebug: Boolean
    ): RendererConfig = {
      val __obj = js.Dynamic.literal(enableAutoRendering = enableAutoRendering.asInstanceOf[js.Any], enableCulling = enableCulling.asInstanceOf[js.Any], enableDirtyCheck = enableDirtyCheck.asInstanceOf[js.Any], enableDirtyRectangleRendering = enableDirtyRectangleRendering.asInstanceOf[js.Any], enableDirtyRectangleRenderingDebug = enableDirtyRectangleRenderingDebug.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererConfig]
    }
    
    extension [Self <: RendererConfig](x: Self) {
      
      inline def setEnableAutoRendering(value: Boolean): Self = StObject.set(x, "enableAutoRendering", value.asInstanceOf[js.Any])
      
      inline def setEnableCulling(value: Boolean): Self = StObject.set(x, "enableCulling", value.asInstanceOf[js.Any])
      
      inline def setEnableDirtyCheck(value: Boolean): Self = StObject.set(x, "enableDirtyCheck", value.asInstanceOf[js.Any])
      
      inline def setEnableDirtyRectangleRendering(value: Boolean): Self = StObject.set(x, "enableDirtyRectangleRendering", value.asInstanceOf[js.Any])
      
      inline def setEnableDirtyRectangleRenderingDebug(value: Boolean): Self = StObject.set(x, "enableDirtyRectangleRenderingDebug", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.clip
    - typings.antvGLite.antvGLiteStrings.ellipsis
    - java.lang.String
  */
  type TextOverflow = _TextOverflow | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.capitalize
    - typings.antvGLite.antvGLiteStrings.uppercase
    - typings.antvGLite.antvGLiteStrings.lowercase
    - typings.antvGLite.antvGLiteStrings.none
  */
  trait TextTransform extends StObject
  object TextTransform {
    
    inline def capitalize: typings.antvGLite.antvGLiteStrings.capitalize = "capitalize".asInstanceOf[typings.antvGLite.antvGLiteStrings.capitalize]
    
    inline def lowercase: typings.antvGLite.antvGLiteStrings.lowercase = "lowercase".asInstanceOf[typings.antvGLite.antvGLiteStrings.lowercase]
    
    inline def none: typings.antvGLite.antvGLiteStrings.none = "none".asInstanceOf[typings.antvGLite.antvGLiteStrings.none]
    
    inline def uppercase: typings.antvGLite.antvGLiteStrings.uppercase = "uppercase".asInstanceOf[typings.antvGLite.antvGLiteStrings.uppercase]
  }
  
  type Tuple3[T] = js.Tuple3[T, T, T]
  
  type Tuple3Number = Tuple3[Double]
  
  type Tuple4[T] = js.Tuple4[T, T, T, T]
  
  type Tuple4Number = Tuple4[Double]
  
  type TypeEasingFunction = js.Function3[
    /* t */ Double, 
    /* params */ js.UndefOr[js.Array[String | Double]], 
    /* duration */ js.UndefOr[Double], 
    Double
  ]
  
  trait _LengthOrPercentageOrAuto extends StObject
  
  trait _TextOverflow extends StObject
}
