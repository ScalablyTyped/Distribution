package typings.antvG2.libInterfaceMod

import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@antv/g2.@antv/g2/lib/interface.ViewCfg, 'parent' | 'canvas' | 'foregroundGroup' | 'middleGroup' | 'backgroundGroup' | 'region'> */
trait ChartCfg extends StObject {
  
  var appendPadding: js.UndefOr[ViewAppendPadding] = js.undefined
  
  /**
    * @title 否自适应容器宽高
    * @description
    * 图表是否自适应容器宽高，默认为 false，用户需要手动设置 width 和 height。当 `autoFit: true` 时，
    * 会自动取图表容器的宽高，如果用户设置了 height，那么会以用户设置的 height 为准。
    * @default false
    */
  val autoFit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 指定 chart 绘制的 DOM，可以传入 DOM id，也可以直接传入 dom 实例。
    */
  val container: String | HTMLElement
  
  /**
    * @title 配置图表默认交互，仅支持字符串形式。
    */
  val defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @title 图表高度。
    */
  val height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var limitInPlot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否开启局部刷新
    * @default true
    */
  val localRefresh: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[Options] = js.undefined
  
  var padding: js.UndefOr[ViewPadding] = js.undefined
  
  /**
    * @title 像素比
    * @description 设置设备像素比，默认取浏览器的值 `window.devicePixelRatio`。
    */
  val pixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 渲染引擎
    * @default "canvas"
    */
  val renderer: js.UndefOr[Renderer] = js.undefined
  
  /**
    * @title 是否支持 CSS transform
    * @description 开启后图表的交互以及事件将在页面设置了 css transform 属性时生效，默认关闭。
    * @default false
    */
  val supportCSSTransform: js.UndefOr[Boolean] = js.undefined
  
  var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
  
  var theme: js.UndefOr[LooseObject | String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 图表宽度。
    */
  val width: js.UndefOr[Double] = js.undefined
}
object ChartCfg {
  
  inline def apply(container: String | HTMLElement): ChartCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCfg]
  }
  
  extension [Self <: ChartCfg](x: Self) {
    
    inline def setAppendPadding(value: ViewAppendPadding): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
    
    inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
    
    inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
    
    inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
    
    inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
    
    inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
    
    inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
    
    inline def setTheme(value: LooseObject | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
