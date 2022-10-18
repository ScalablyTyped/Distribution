package typings.antvComponent

import typings.antvComponent.anon.PartialSliderCfg
import typings.antvComponent.anon.Width
import typings.antvComponent.libInterfacesMod.ISlider
import typings.antvComponent.libSliderHandlerMod.IStyle
import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.libInterfacesMod.IGroup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderSliderMod {
  
  @JSImport("@antv/component/lib/slider/slider", JSImport.Default)
  @js.native
  open class default () extends Slider
  
  @JSImport("@antv/component/lib/slider/slider", "Slider")
  @js.native
  open class Slider ()
    extends typings.antvComponent.libAbstractGroupComponentMod.default[SliderCfg]
       with ISlider {
    
    /**
      * 调整 text 的位置，自动躲避
      * 根据位置，调整返回新的位置
      * @param range
      */
    /* private */ var _dodgeText: Any = js.native
    
    /**
      * 调整 offsetRange，因为一些范围的限制
      * @param offsetRange
      */
    /* private */ var adjustOffsetRange: Any = js.native
    
    /* private */ var bindEvents: Any = js.native
    
    @JSName("cfg")
    var cfg_Slider: SliderCfg = js.native
    
    /* private */ var currentTarget: Any = js.native
    
    def draw(): Unit = js.native
    
    /* private */ var getContainerDOM: Any = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): Any & (Record[String, js.Array[EventType]]) = js.native
    
    /* private */ var maxHandler: Any = js.native
    
    /* private */ var minHandler: Any = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    override def off(): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    override def off(eventName: String): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /* private */ var onMouseDown: Any = js.native
    
    /* private */ var onMouseMove: Any = js.native
    
    /* private */ var onMouseUp: Any = js.native
    
    /* private */ var prevX: Any = js.native
    
    /* private */ var prevY: Any = js.native
    
    /* private */ var trend: Any = js.native
    
    def update(cfg: PartialSliderCfg): Unit = js.native
    
    /* private */ var updateStartEnd: Any = js.native
    
    /* private */ var updateUI: Any = js.native
  }
  
  /**
    * slider handler style 设置
    */
  type HandlerStyle = js.UndefOr[IStyle] & Width
  
  trait SliderCfg
    extends StObject
       with GroupComponentCfg {
    
    val backgroundStyle: js.UndefOr[Any] = js.undefined
    
    val end: js.UndefOr[Double] = js.undefined
    
    val foregroundStyle: js.UndefOr[Any] = js.undefined
    
    val handlerStyle: js.UndefOr[HandlerStyle] = js.undefined
    
    val height: Double
    
    val maxLimit: js.UndefOr[Double] = js.undefined
    
    val maxText: js.UndefOr[String] = js.undefined
    
    val minLimit: js.UndefOr[Double] = js.undefined
    
    val minText: js.UndefOr[String] = js.undefined
    
    val start: js.UndefOr[Double] = js.undefined
    
    val textStyle: js.UndefOr[Any] = js.undefined
    
    val trendCfg: js.UndefOr[TrendCfg] = js.undefined
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object SliderCfg {
    
    inline def apply(container: IGroup, height: Double, width: Double, x: Double, y: Double): SliderCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderCfg]
    }
    
    extension [Self <: SliderCfg](x: Self) {
      
      inline def setBackgroundStyle(value: Any): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setForegroundStyle(value: Any): Self = StObject.set(x, "foregroundStyle", value.asInstanceOf[js.Any])
      
      inline def setForegroundStyleUndefined: Self = StObject.set(x, "foregroundStyle", js.undefined)
      
      inline def setHandlerStyle(value: HandlerStyle): Self = StObject.set(x, "handlerStyle", value.asInstanceOf[js.Any])
      
      inline def setHandlerStyleUndefined: Self = StObject.set(x, "handlerStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      inline def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      inline def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
      
      inline def setMaxTextUndefined: Self = StObject.set(x, "maxText", js.undefined)
      
      inline def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      inline def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      inline def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
      
      inline def setMinTextUndefined: Self = StObject.set(x, "minText", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTextStyle(value: Any): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTrendCfg(value: TrendCfg): Self = StObject.set(x, "trendCfg", value.asInstanceOf[js.Any])
      
      inline def setTrendCfgUndefined: Self = StObject.set(x, "trendCfg", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrendCfg extends StObject {
    
    val areaStyle: js.UndefOr[js.Object] = js.undefined
    
    val backgroundStyle: js.UndefOr[js.Object] = js.undefined
    
    val data: js.Array[Double]
    
    val isArea: js.UndefOr[Boolean] = js.undefined
    
    val lineStyle: js.UndefOr[js.Object] = js.undefined
    
    val smooth: js.UndefOr[Boolean] = js.undefined
  }
  object TrendCfg {
    
    inline def apply(data: js.Array[Double]): TrendCfg = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendCfg]
    }
    
    extension [Self <: TrendCfg](x: Self) {
      
      inline def setAreaStyle(value: js.Object): Self = StObject.set(x, "areaStyle", value.asInstanceOf[js.Any])
      
      inline def setAreaStyleUndefined: Self = StObject.set(x, "areaStyle", js.undefined)
      
      inline def setBackgroundStyle(value: js.Object): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIsArea(value: Boolean): Self = StObject.set(x, "isArea", value.asInstanceOf[js.Any])
      
      inline def setIsAreaUndefined: Self = StObject.set(x, "isArea", js.undefined)
      
      inline def setLineStyle(value: js.Object): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
