package typings.antvG2plot.anon

import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2.paddingCalMod.PaddingCalCtor
import typings.antvG2.viewMod.View
import typings.antvG2plot.animationMod.Animation
import typings.antvG2plot.annotationMod.Annotation
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.attrMod.ColorAttr
import typings.antvG2plot.attrMod.PatternAttr
import typings.antvG2plot.axisMod.Axis
import typings.antvG2plot.baseMod.MappingOptions
import typings.antvG2plot.interactionMod.Interaction
import typings.antvG2plot.metaMod.Meta
import typings.antvG2plot.scrollbarMod.Scrollbar
import typings.antvG2plot.sliderMod.Slider
import typings.antvG2plot.tooltipMod.Tooltip
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.utilsPatternMod.PatternOption
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@antv/g2plot.@antv/g2plot/lib/adaptor/geometries.LineGeometryOptions> */
trait RequiredLineGeometryOptio extends StObject {
  
  var animation: Animation
  
  var annotations: js.Array[Annotation]
  
  var appendPadding: js.Array[Double] | Double
  
  var args: Any
  
  var autoFit: Boolean
  
  var color: ColorAttr
  
  var colorField: String
  
  var connectNulls: Boolean
  
  var customInfo: Any
  
  var data: js.Array[Record[String, Any]]
  
  var defaultInteractions: js.Array[String]
  
  var height: Double
  
  var interactions: js.Array[Interaction]
  
  var label: typings.antvG2plot.typesLabelMod.Label
  
  var legend: typings.antvG2plot.typesLegendMod.Legend
  
  var limitInPlot: Boolean
  
  var line: MappingOptions
  
  var localRefresh: Boolean
  
  var locale: String
  
  var mapping: MappingOptions
  
  var meta: Record[String, Meta]
  
  var padding: js.Array[Double] | Double | auto
  
  var pattern: PatternAttr
  
  var pixelRatio: Double
  
  var rawFields: js.Array[String]
  
  var renderer: svg | canvas
  
  var scrollbar: Scrollbar
  
  var seriesField: String
  
  var shapeField: String
  
  var sizeField: String
  
  var slider: Slider
  
  var smooth: Boolean
  
  var state: typings.antvG2plot.stateMod.State
  
  var stepType: String
  
  var styleField: String
  
  var supportCSSTransform: Boolean
  
  var syncViewPadding: Boolean | SyncViewPaddingFn
  
  var theme: String | js.Object
  
  var tooltip: Tooltip
  
  var tooltipFields: js.Array[String] | `false`
  
  var `type`: String
  
  var useDeferredLabel: Boolean | Double
  
  var width: Double
  
  var xAxis: Axis
  
  var xField: String
  
  var yAxis: Axis
  
  var yField: String
}
object RequiredLineGeometryOptio {
  
  inline def apply(
    animation: Animation,
    annotations: js.Array[Annotation],
    appendPadding: js.Array[Double] | Double,
    args: Any,
    autoFit: Boolean,
    color: ColorAttr,
    colorField: String,
    connectNulls: Boolean,
    customInfo: Any,
    data: js.Array[Record[String, Any]],
    defaultInteractions: js.Array[String],
    height: Double,
    interactions: js.Array[Interaction],
    label: typings.antvG2plot.typesLabelMod.Label,
    legend: typings.antvG2plot.typesLegendMod.Legend,
    limitInPlot: Boolean,
    line: MappingOptions,
    localRefresh: Boolean,
    locale: String,
    mapping: MappingOptions,
    meta: Record[String, Meta],
    padding: js.Array[Double] | Double | auto,
    pattern: PatternAttr,
    pixelRatio: Double,
    rawFields: js.Array[String],
    renderer: svg | canvas,
    scrollbar: Scrollbar,
    seriesField: String,
    shapeField: String,
    sizeField: String,
    slider: Slider,
    smooth: Boolean,
    state: typings.antvG2plot.stateMod.State,
    stepType: String,
    styleField: String,
    supportCSSTransform: Boolean,
    syncViewPadding: Boolean | SyncViewPaddingFn,
    theme: String | js.Object,
    tooltip: Tooltip,
    tooltipFields: js.Array[String] | `false`,
    `type`: String,
    useDeferredLabel: Boolean | Double,
    width: Double,
    xAxis: Axis,
    xField: String,
    yAxis: Axis,
    yField: String
  ): RequiredLineGeometryOptio = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], appendPadding = appendPadding.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], autoFit = autoFit.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], connectNulls = connectNulls.asInstanceOf[js.Any], customInfo = customInfo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultInteractions = defaultInteractions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], limitInPlot = limitInPlot.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], localRefresh = localRefresh.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], rawFields = rawFields.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], seriesField = seriesField.asInstanceOf[js.Any], shapeField = shapeField.asInstanceOf[js.Any], sizeField = sizeField.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stepType = stepType.asInstanceOf[js.Any], styleField = styleField.asInstanceOf[js.Any], supportCSSTransform = supportCSSTransform.asInstanceOf[js.Any], syncViewPadding = syncViewPadding.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipFields = tooltipFields.asInstanceOf[js.Any], useDeferredLabel = useDeferredLabel.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLineGeometryOptio]
  }
  
  extension [Self <: RequiredLineGeometryOptio](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
    
    inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
    
    inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
    
    inline def setCustomInfo(value: Any): Self = StObject.set(x, "customInfo", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
    
    inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
    
    inline def setLabel(value: typings.antvG2plot.typesLabelMod.Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: typings.antvG2plot.typesLegendMod.Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
    
    inline def setLine(value: MappingOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLocalRefresh(value: Boolean): Self = StObject.set(x, "localRefresh", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: MappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: js.Array[Double] | Double | auto): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
    
    inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
    
    inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
    
    inline def setShapeField(value: String): Self = StObject.set(x, "shapeField", value.asInstanceOf[js.Any])
    
    inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setState(value: typings.antvG2plot.stateMod.State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStepType(value: String): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
    
    inline def setStyleField(value: String): Self = StObject.set(x, "styleField", value.asInstanceOf[js.Any])
    
    inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
    
    inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipFields(value: js.Array[String] | `false`): Self = StObject.set(x, "tooltipFields", value.asInstanceOf[js.Any])
    
    inline def setTooltipFieldsVarargs(value: String*): Self = StObject.set(x, "tooltipFields", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Axis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: Axis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
  }
}
