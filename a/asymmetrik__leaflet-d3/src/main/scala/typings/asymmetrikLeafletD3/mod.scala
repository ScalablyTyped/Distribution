package typings.asymmetrikLeafletD3

import typings.asymmetrikLeafletD3.mod.internal.ObjectFn
import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HexbinHoverHandler extends StObject {
    
    def mouseout(hexLayer: HexbinLayer_, data: js.Any): Unit
    
    def mouseover(hexLayer: HexbinLayer_, data: js.Any): Unit
  }
  object HexbinHoverHandler {
    
    inline def apply(mouseout: (HexbinLayer_, js.Any) => Unit, mouseover: (HexbinLayer_, js.Any) => Unit): HexbinHoverHandler = {
      val __obj = js.Dynamic.literal(mouseout = js.Any.fromFunction2(mouseout), mouseover = js.Any.fromFunction2(mouseover))
      __obj.asInstanceOf[HexbinHoverHandler]
    }
    
    @JSImport("leaflet", "HexbinHoverHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compound(v: CompoundOptions): CompoundHoverHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("compound")(v.asInstanceOf[js.Any]).asInstanceOf[CompoundHoverHandler]
    
    inline def none(): NoneHoverHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[NoneHoverHandler]
    
    inline def resizeFill(): ResizeFillHoverHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeFill")().asInstanceOf[ResizeFillHoverHandler]
    
    inline def resizeScale(v: ResizeScaleOptions): ResizeScaleHoverHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeScale")(v.asInstanceOf[js.Any]).asInstanceOf[ResizeScaleHoverHandler]
    
    inline def tooltip(v: TooltipOptions): TooltipHoverHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(v.asInstanceOf[js.Any]).asInstanceOf[TooltipHoverHandler]
    
    type CompoundHoverHandler = HexbinHoverHandler
    
    trait CompoundOptions extends StObject {
      
      var handlers: js.Array[HexbinHoverHandler]
    }
    object CompoundOptions {
      
      inline def apply(handlers: js.Array[HexbinHoverHandler]): CompoundOptions = {
        val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
        __obj.asInstanceOf[CompoundOptions]
      }
      
      extension [Self <: CompoundOptions](x: Self) {
        
        inline def setHandlers(value: js.Array[HexbinHoverHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
        
        inline def setHandlersVarargs(value: HexbinHoverHandler*): Self = StObject.set(x, "handlers", js.Array(value :_*))
      }
    }
    
    extension [Self <: HexbinHoverHandler](x: Self) {
      
      inline def setMouseout(value: (HexbinLayer_, js.Any) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
      
      inline def setMouseover(value: (HexbinLayer_, js.Any) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    }
    
    type NoneHoverHandler = HexbinHoverHandler
    
    type ResizeFillHoverHandler = HexbinHoverHandler
    
    type ResizeScaleHoverHandler = HexbinHoverHandler
    
    trait ResizeScaleOptions extends StObject {
      
      var radiusScale: Double
    }
    object ResizeScaleOptions {
      
      inline def apply(radiusScale: Double): ResizeScaleOptions = {
        val __obj = js.Dynamic.literal(radiusScale = radiusScale.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResizeScaleOptions]
      }
      
      extension [Self <: ResizeScaleOptions](x: Self) {
        
        inline def setRadiusScale(value: Double): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
      }
    }
    
    type TooltipHoverHandler = HexbinHoverHandler
    
    trait TooltipOptions extends StObject {
      
      def tooltipContent(d: js.Any): String
    }
    object TooltipOptions {
      
      inline def apply(tooltipContent: js.Any => String): TooltipOptions = {
        val __obj = js.Dynamic.literal(tooltipContent = js.Any.fromFunction1(tooltipContent))
        __obj.asInstanceOf[TooltipOptions]
      }
      
      extension [Self <: TooltipOptions](x: Self) {
        
        inline def setTooltipContent(value: js.Any => String): Self = StObject.set(x, "tooltipContent", js.Any.fromFunction1(value))
      }
    }
  }
  
  inline def hexbinLayer(config: js.UndefOr[HexbinLayerConfig]): HexbinLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hexbinLayer")(config.asInstanceOf[js.Any]).asInstanceOf[HexbinLayer_]
  
  inline def pingLayer(config: js.UndefOr[PingLayerConfig]): PingLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pingLayer")(config.asInstanceOf[js.Any]).asInstanceOf[PingLayer_]
  
  trait HexbinLayerConfig extends StObject {
    
    var colorRange: js.UndefOr[js.Array[String]] = js.undefined
    
    var colorScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var radiusRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var radiusScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object HexbinLayerConfig {
    
    inline def apply(): HexbinLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HexbinLayerConfig]
    }
    
    extension [Self <: HexbinLayerConfig](x: Self) {
      
      inline def setColorRange(value: js.Array[String]): Self = StObject.set(x, "colorRange", value.asInstanceOf[js.Any])
      
      inline def setColorRangeUndefined: Self = StObject.set(x, "colorRange", js.undefined)
      
      inline def setColorRangeVarargs(value: String*): Self = StObject.set(x, "colorRange", js.Array(value :_*))
      
      inline def setColorScaleExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "colorScaleExtent", value.asInstanceOf[js.Any])
      
      inline def setColorScaleExtentUndefined: Self = StObject.set(x, "colorScaleExtent", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
      
      inline def setRadiusRangeUndefined: Self = StObject.set(x, "radiusRange", js.undefined)
      
      inline def setRadiusScaleExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "radiusScaleExtent", value.asInstanceOf[js.Any])
      
      inline def setRadiusScaleExtentUndefined: Self = StObject.set(x, "radiusScaleExtent", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  /*
  	 * Hexbins
  	 */
  @js.native
  trait HexbinLayer_ extends Layer {
    
    def colorRange(): js.Array[String] = js.native
    def colorRange(v: js.Array[String]): this.type = js.native
    
    def colorScale(): js.Any = js.native
    def colorScale(v: js.Any): this.type = js.native
    
    def colorScaleExtent(): js.Tuple2[Double, Double] = js.native
    def colorScaleExtent(v: js.Tuple2[Double, Double]): this.type = js.native
    
    def colorValue(): ObjectFn[Double] = js.native
    def colorValue(v: ObjectFn[Double]): this.type = js.native
    
    def data(): js.Array[js.Any] = js.native
    def data(v: js.Array[js.Any]): this.type = js.native
    
    def dispatch(): js.Any = js.native
    
    def duration(): Double = js.native
    def duration(v: Double): this.type = js.native
    
    def fill(): ObjectFn[String] = js.native
    def fill(v: ObjectFn[String]): this.type = js.native
    
    def getLatLngs(): js.Array[js.Any] = js.native
    
    def hoverHandler(): HexbinHoverHandler = js.native
    def hoverHandler(v: HexbinHoverHandler): this.type = js.native
    
    def lat(): ObjectFn[Double] = js.native
    def lat(v: ObjectFn[Double]): this.type = js.native
    
    def lng(): ObjectFn[Double] = js.native
    def lng(v: ObjectFn[Double]): this.type = js.native
    
    def opacity(): Double = js.native
    def opacity(v: Double): this.type = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    
    def radiusRange(): js.Array[Double] = js.native
    def radiusRange(v: js.Array[Double]): this.type = js.native
    
    def radiusScale(): js.Any = js.native
    def radiusScale(v: js.Any): this.type = js.native
    
    def radiusScaleExtent(): js.Tuple2[Double, Double] = js.native
    def radiusScaleExtent(v: js.Tuple2[Double, Double]): this.type = js.native
    
    def radiusValue(): ObjectFn[Double] = js.native
    def radiusValue(v: ObjectFn[Double]): this.type = js.native
    
    def redraw(): Unit = js.native
    
    def toGeoJSON(): js.Array[js.Any] = js.native
  }
  
  trait PingLayerConfig extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var fps: js.UndefOr[Double] = js.undefined
    
    var opacityRange: js.UndefOr[js.Array[Double]] = js.undefined
    
    var radiusRange: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PingLayerConfig {
    
    inline def apply(): PingLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PingLayerConfig]
    }
    
    extension [Self <: PingLayerConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setOpacityRange(value: js.Array[Double]): Self = StObject.set(x, "opacityRange", value.asInstanceOf[js.Any])
      
      inline def setOpacityRangeUndefined: Self = StObject.set(x, "opacityRange", js.undefined)
      
      inline def setOpacityRangeVarargs(value: Double*): Self = StObject.set(x, "opacityRange", js.Array(value :_*))
      
      inline def setRadiusRange(value: js.Array[Double]): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
      
      inline def setRadiusRangeUndefined: Self = StObject.set(x, "radiusRange", js.undefined)
      
      inline def setRadiusRangeVarargs(value: Double*): Self = StObject.set(x, "radiusRange", js.Array(value :_*))
    }
  }
  
  /*
  	 * Pings
  	 */
  @js.native
  trait PingLayer_ extends Layer {
    
    def data(): js.Array[js.Any] = js.native
    
    def duration(): Double = js.native
    def duration(v: Double): this.type = js.native
    
    def fps(): Double = js.native
    def fps(v: Double): this.type = js.native
    
    def getActualFps(): Double = js.native
    
    def lat(): ObjectFn[Double] = js.native
    def lat(v: ObjectFn[Double]): this.type = js.native
    
    def lng(): ObjectFn[Double] = js.native
    def lng(v: ObjectFn[Double]): this.type = js.native
    
    def opacityRange(): js.Array[Double] = js.native
    def opacityRange(v: js.Array[Double]): this.type = js.native
    
    def opacityScale(): js.Any = js.native
    def opacityScale(v: js.Any): this.type = js.native
    
    def ping(data: js.Any): this.type = js.native
    def ping(data: js.Any, cssClass: String): this.type = js.native
    
    def radiusRange(): js.Array[Double] = js.native
    def radiusRange(v: js.Array[Double]): this.type = js.native
    
    def radiusScale(): js.Any = js.native
    def radiusScale(v: js.Any): this.type = js.native
    
    def radiusScaleFactor(): Double = js.native
    def radiusScaleFactor(v: Double): this.type = js.native
  }
  
  object internal {
    
    type DoubleObjectContextCallback = js.Function3[/* d */ js.Any, /* t */ js.Any, /* th */ js.Any, Unit]
    
    type ObjectCallback = ObjectFn[Unit]
    
    type ObjectContextCallback = js.Function2[/* d */ js.Any, /* t */ js.Any, Unit]
    
    type ObjectFn[T] = js.Function1[/* d */ js.Any, T]
    
    type ObjectIndexFn[T] = js.Function2[/* d */ js.Any, /* i */ Double, T]
    
    type SimpleCallback = SimpleFn[Unit]
    
    type SimpleFn[T] = js.Function0[T]
    
    type UnionCallback = SimpleCallback | ObjectCallback | ObjectContextCallback | DoubleObjectContextCallback
    
    type UnionFn[T] = SimpleFn[T] | ObjectFn[T] | ObjectIndexFn[T]
  }
}
