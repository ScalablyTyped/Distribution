package typings.antvG2plot

import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.bottom
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.center
import typings.antvG2plot.antvG2plotStrings.left
import typings.antvG2plot.antvG2plotStrings.middle
import typings.antvG2plot.antvG2plotStrings.right
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.antvG2plotStrings.top
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesInteractionMod.Interaction
import typings.antvG2plot.libTypesLabelMod.Label
import typings.antvG2plot.libTypesLegendMod.Legend
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.antvG2plot.libTypesScrollbarMod.Scrollbar
import typings.antvG2plot.libTypesSliderMod.Slider
import typings.antvG2plot.libTypesStateMod.State
import typings.antvG2plot.libTypesTooltipMod.Tooltip
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCommonMod {
  
  type AnnotationPosition = typings.antvG2.libInterfaceMod.AnnotationPosition
  
  trait BBox extends StObject {
    
    val height: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object BBox {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): BBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Data = js.Array[Datum]
  
  type Datum = Record[String, Any]
  
  trait Options extends StObject {
    
    /**
      * @title 动画
      * @description 设置图表动画
      */
    val animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * @title 注解
      * @description 设置画布注解
      */
    val annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    /**
      * @title 画布宽度
      * @description 额外怎加的 padding 值
      */
    val appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    /**
      * @title 自适应
      * @description 画布是否自动适配容器大小，默认为 true
      */
    val autoFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 颜色色板
      * @description 设置颜色色板
      */
    val color: js.UndefOr[ColorAttr] = js.undefined
    
    /**
      * @title 数据
      * @description 设置画布具体的数据
      */
    val data: js.Array[Record[String, Any]]
    
    /**
      * @title 内置交互
      * @description 内置注册的交互
      * @deprecated false
      */
    val defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @title 画布高度
      */
    val height: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 交互
      * @description 设置画布交互行为
      */
    val interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /**
      * @title 数据标签
      * @description 设置数据标签
      */
    val label: js.UndefOr[Label] = js.undefined
    
    /**
      * @title 图例
      * @description 设置画布图例 legend 的配置项
      */
    val legend: js.UndefOr[Legend] = js.undefined
    
    /**
      * @title 是否裁剪
      * @description 是否对超出坐标系范围的 Geometry 进行剪切
      */
    val limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否启局部渲染
      * @description 是否开启局部渲染，默认为 true
      * @default true
      */
    val localRefresh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 国际化
      * @description 语言配置
      */
    val locale: js.UndefOr[String] = js.undefined
    
    /**
      * @title 数据字段元信息
      * @description 设置数据字段元信息
      */
    val meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    /**
      * @title 内填充
      * @description 画布的 padding 值，或者开启 'auto'
      */
    val padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    /**
      * @title pattern 配置
      * @description 设置图表 pattern
      */
    val pattern: js.UndefOr[PatternAttr] = js.undefined
    
    /**
      * @title 屏幕像素比
      * @description 默认为 window.devicePixelRatio
      */
    val pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 渲染引擎
      * @description 设置渲染引擎，'svg' | 'canvas'
      * @default "canvas"
      */
    val renderer: js.UndefOr[svg | canvas] = js.undefined
    
    /**
      * @title 滚动条
      * @description 设置画布缩略轴 scrollbar 的配置项
      */
    val scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    /**
      * @title 缩略轴
      * @description 设置缩略轴 slider 的配置项
      */
    val slider: js.UndefOr[Slider] = js.undefined
    
    /**
      * @title 图表状态
      * @description 设置画布配置 active，inactive，selected 三种状态的样式，也可在 Theme 主题中配置
      */
    val state: js.UndefOr[State] = js.undefined
    
    /**
      * @title 是否支持 CSS transform
      * @description 开启后图表的交互以及事件将在页面设置了 css transform 属性时生效，默认关闭。
      * @default false
      */
    val supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 额外填充
      * @description 是否同步子 view 的 padding
      */
    val syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    /**
      * @title 主题
      * @description G2 主题，字符串或者 theme object
      * @default "light"
      */
    val theme: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * @title tooltip 提示
      * @description 设置画布 tooltip 的配置项
      */
    val tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /**
      * @title 是否开启 label 延迟渲染
      * @description 开启后 label 渲染会在浏览器空闲时机执行。可制定具体 number 数值，来限定 timeout 时间 (建议开启时，指定 timeout 时间)
      * @default false
      */
    val useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * @title 画布宽度
      */
    val width: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 横坐标
      * @description 设置画布横坐标的配置项
      */
    val xAxis: js.UndefOr[Axis] = js.undefined
    
    /**
      * @title 纵坐标
      * @description 设置画布纵坐标的配置项
      */
    val yAxis: js.UndefOr[Axis] = js.undefined
  }
  object Options {
    
    inline def apply(data: js.Array[Record[String, Any]]): Options = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
      
      inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXAxis(value: Axis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      
      inline def setYAxis(value: Axis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    }
  }
  
  trait Point extends StObject {
    
    val x: Double
    
    val y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Tuple2[Double, Double]
  
  trait Region extends StObject {
    
    /**
      * @title 结束位置
      * @description the bottom-right corner of layer-range, range from 0 to 1, relative to parent layer's range
      */
    val end: Point
    
    /**
      * @title 开始位置
      * @description the top-left corner of layer-range, range from 0 to 1, relative to parent layer's range
      */
    val start: Point
  }
  object Region {
    
    inline def apply(end: Point, start: Point): Region = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type RegionPositionBaseOption = typings.antvG2.libInterfaceMod.RegionPositionBaseOption
  
  trait Size extends StObject {
    
    val height: Double
    
    val width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TextOption = typings.antvG2.libInterfaceMod.TextOption
  
  trait TextStyle extends StObject {
    
    /**
      * @title 字体系列
      */
    val fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * @title 文本大小
      */
    val fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 文本粗细
      */
    val fontWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 文本行高
      */
    val lineHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 文本对齐方式
      */
    val textAlign: js.UndefOr[center | left | right] = js.undefined
    
    /**
      * @title 文本基线
      */
    val textBaseline: js.UndefOr[middle | top | bottom] = js.undefined
  }
  object TextStyle {
    
    inline def apply(): TextStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: middle | top | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    }
  }
}
