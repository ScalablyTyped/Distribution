package typings.antvG2plot.anon

import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesInteractionMod.Interaction
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.antvG2plot.libTypesScrollbarMod.Scrollbar
import typings.antvG2plot.libTypesSliderMod.Slider
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/ring-progress/types.RingProgressOptions> */
trait PartialRingProgressOption extends StObject {
  
  var animation: js.UndefOr[Animation] = js.undefined
  
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var autoFit: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[ColorAttr] = js.undefined
  
  var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
  
  var limitInPlot: js.UndefOr[Boolean] = js.undefined
  
  var localRefresh: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[Record[String, Meta]] = js.undefined
  
  var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
  
  var pattern: js.UndefOr[PatternAttr] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var progressStyle: js.UndefOr[StyleAttr] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[svg | canvas] = js.undefined
  
  var scrollbar: js.UndefOr[Scrollbar] = js.undefined
  
  var slider: js.UndefOr[Slider] = js.undefined
  
  var state: js.UndefOr[typings.antvG2plot.libTypesStateMod.State] = js.undefined
  
  var statistic: js.UndefOr[typings.antvG2plot.libTypesStatisticMod.Statistic] = js.undefined
  
  var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
  
  var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
  
  var theme: js.UndefOr[String | js.Object] = js.undefined
  
  var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAxis: js.UndefOr[Axis] = js.undefined
  
  var yAxis: js.UndefOr[Axis] = js.undefined
}
object PartialRingProgressOption {
  
  inline def apply(): PartialRingProgressOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRingProgressOption]
  }
  
  extension [Self <: PartialRingProgressOption](x: Self) {
    
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
    
    inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
    
    inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
    
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
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setProgressStyle(value: StyleAttr): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
    
    inline def setProgressStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "progressStyle", js.Any.fromFunction1(value))
    
    inline def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
    
    inline def setState(value: typings.antvG2plot.libTypesStateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatistic(value: typings.antvG2plot.libTypesStatisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
    
    inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
    
    inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
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
