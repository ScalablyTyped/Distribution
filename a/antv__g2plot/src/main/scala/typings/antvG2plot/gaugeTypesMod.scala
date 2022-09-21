package typings.antvG2plot

import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import typings.antvG2plot.animationMod.Animation
import typings.antvG2plot.annotationMod.Annotation
import typings.antvG2plot.anon.PERCENT_
import typings.antvG2plot.anon.StepRatio
import typings.antvG2plot.anon.`1`
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.attrMod.PatternAttr
import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.axisMod.Axis
import typings.antvG2plot.interactionMod.Interaction
import typings.antvG2plot.metaMod.Meta
import typings.antvG2plot.scrollbarMod.Scrollbar
import typings.antvG2plot.sliderMod.Slider
import typings.antvG2plot.stateMod.State
import typings.antvG2plot.statisticMod.Statistic
import typings.antvG2plot.tooltipMod.Tooltip
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesLabelMod.Label
import typings.antvG2plot.utilsPatternMod.PatternOption
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeTypesMod {
  
  trait GaugeCustomInfo extends StObject {
    
    /**
      * @title 仪表盘 meter 类型的相关配置
      */
    val meter: js.UndefOr[StepRatio] = js.undefined
  }
  object GaugeCustomInfo {
    
    inline def apply(): GaugeCustomInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GaugeCustomInfo]
    }
    
    extension [Self <: GaugeCustomInfo](x: Self) {
      
      inline def setMeter(value: StepRatio): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMeterUndefined: Self = StObject.set(x, "meter", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@antv/g2plot.@antv/g2plot/lib/types.Options, 'data' | 'legend' | 'xAxis' | 'yAxis' | 'xField' | 'yField' | 'color'> */
  trait GaugeOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 坐标轴配置
      */
    val axis: js.UndefOr[Axis] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @title 弧度结束
      */
    val endAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 仪表盘样式
      */
    val gaugeStyle: js.UndefOr[StyleAttr] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 指针的配置
      */
    val indicator: js.UndefOr[`false` | Indicator] = js.undefined
    
    /**
      * @title 内弧度
      * @description 范围0 ~ 1
      */
    val innerRadius: js.UndefOr[Double] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    /**
      * @title 仪表盘配置
      * @description 当仪表盘类型 = 'meter' 生效
      */
    val meter: js.UndefOr[StepRatio] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    /**
      * @title 指标的比例
      * @description 范围0 ~ 1
      */
    val percent: Double
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 外弧度
      * @description 范围0 ~ 1
      */
    val radius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 辅助的 range 组件
      */
    val range: js.UndefOr[Range] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    var slider: js.UndefOr[Slider] = js.undefined
    
    /**
      * @title 弧度起始
      */
    val startAngle: js.UndefOr[Double] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * @title 统计文本
      */
    val statistic: js.UndefOr[Statistic] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /**
      * @title meter gauge 相关配置
      */
    /**
      * @title 仪表盘类型
      * @description 可选项: 'meter', default 为空
      */
    val `type`: js.UndefOr[String] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GaugeOptions {
    
    inline def apply(percent: Double): GaugeOptions = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeOptions]
    }
    
    extension [Self <: GaugeOptions](x: Self) {
      
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
      
      inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setGaugeStyle(value: StyleAttr): Self = StObject.set(x, "gaugeStyle", value.asInstanceOf[js.Any])
      
      inline def setGaugeStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "gaugeStyle", js.Any.fromFunction1(value))
      
      inline def setGaugeStyleUndefined: Self = StObject.set(x, "gaugeStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndicator(value: `false` | Indicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
      
      inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
      
      inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
      
      inline def setLocalRefreshUndefined: Self = StObject.set(x, "localRefresh", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMeter(value: StepRatio): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
      
      inline def setMeterUndefined: Self = StObject.set(x, "meter", js.undefined)
      
      inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatistic(value: Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type GaugeRangeData = js.Array[PERCENT_]
  
  trait Indicator extends StObject {
    
    /**
      * @title 圆环
      * @description 只允许静态的 object
      */
    val pin: js.UndefOr[`1`] = js.undefined
    
    /**
      * @title 指针
      * @description 只允许静态的 object
      */
    val pointer: js.UndefOr[`1`] = js.undefined
    
    /**
      * @title 自定义指针 shape
      * @default 'gauge-indicator'
      */
    val shape: js.UndefOr[String] = js.undefined
  }
  object Indicator {
    
    inline def apply(): Indicator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indicator]
    }
    
    extension [Self <: Indicator](x: Self) {
      
      inline def setPin(value: `1`): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      inline def setPointer(value: `1`): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    /**
      * @title 辅助刻度的颜色配置
      */
    val color: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * @title 辅助的刻度值
      * @description 0 ~ 1 的数字
      */
    val ticks: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * @title 仪表盘辅助背景的宽度
      */
    val width: js.UndefOr[Double] = js.undefined
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
