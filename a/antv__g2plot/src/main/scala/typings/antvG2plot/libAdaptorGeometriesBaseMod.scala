package typings.antvG2plot

import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.anon.MappingFields
import typings.antvG2plot.anon.NameString
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.color
import typings.antvG2plot.antvG2plotStrings.shape
import typings.antvG2plot.antvG2plotStrings.size
import typings.antvG2plot.antvG2plotStrings.style
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAttrMod.ShapeAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.SizeAttr
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesAttrMod.TooltipAttr
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesCommonMod.Datum
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

object libAdaptorGeometriesBaseMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geometry[O /* <: GeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometry")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def getMappingField(o: GeometryOptions, field: color | shape | size | style): MappingFields = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingField")(o.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[MappingFields]
  
  inline def getMappingFunction(mappingFields: js.Array[String], func: js.Function1[/* datum */ Datum, Any]): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingFunction")(mappingFields.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  /* Inlined @antv/g2plot.@antv/g2plot/lib/adaptor/geometries/base.Geometry & std.Partial<@antv/g2plot.@antv/g2plot/lib/types.Options> */
  trait GeometryOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    /** geometry params */
    val args: js.UndefOr[Any] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorAttr] = js.undefined
    
    /** 分组字段 */
    val colorField: js.UndefOr[String] = js.undefined
    
    /** 自定义信息，一般在 registerShape 中使用 */
    val customInfo: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /** label 映射通道，因为历史原因导致实现略有区别 */
    val label: js.UndefOr[Label] = js.undefined
    
    var legend: js.UndefOr[Legend] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    /** 图形映射规则 */
    val mapping: js.UndefOr[MappingOptions] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /** 其他原始字段, 用于 mapping 回调参数 */
    val rawFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    /** shape 的映射字段 */
    val shapeField: js.UndefOr[String] = js.undefined
    
    /** size 映射字段 */
    val sizeField: js.UndefOr[String] = js.undefined
    
    var slider: js.UndefOr[Slider] = js.undefined
    
    /** 不同状态的样式 */
    val state: js.UndefOr[State] = js.undefined
    
    /** style 的映射字段 */
    val styleField: js.UndefOr[String] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    /** tooltip 的映射字段 */
    val tooltipFields: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /** geometry 类型, 'line' | 'interval' | 'point' | 'area' | 'polygon' */
    val `type`: js.UndefOr[String] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var xAxis: js.UndefOr[Axis] = js.undefined
    
    /** x 轴字段 */
    val xField: js.UndefOr[String] = js.undefined
    
    var yAxis: js.UndefOr[Axis] = js.undefined
    
    /** y 轴字段 */
    val yField: js.UndefOr[String] = js.undefined
  }
  object GeometryOptions {
    
    inline def apply(): GeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setCustomInfo(value: Any): Self = StObject.set(x, "customInfo", value.asInstanceOf[js.Any])
      
      inline def setCustomInfoUndefined: Self = StObject.set(x, "customInfo", js.undefined)
      
      inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
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
      
      inline def setMapping(value: MappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
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
      
      inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
      
      inline def setRawFieldsUndefined: Self = StObject.set(x, "rawFields", js.undefined)
      
      inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setShapeField(value: String): Self = StObject.set(x, "shapeField", value.asInstanceOf[js.Any])
      
      inline def setShapeFieldUndefined: Self = StObject.set(x, "shapeField", js.undefined)
      
      inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
      
      inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyleField(value: String): Self = StObject.set(x, "styleField", value.asInstanceOf[js.Any])
      
      inline def setStyleFieldUndefined: Self = StObject.set(x, "styleField", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFields(value: js.Array[String] | `false`): Self = StObject.set(x, "tooltipFields", value.asInstanceOf[js.Any])
      
      inline def setTooltipFieldsUndefined: Self = StObject.set(x, "tooltipFields", js.undefined)
      
      inline def setTooltipFieldsVarargs(value: String*): Self = StObject.set(x, "tooltipFields", js.Array(value*))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXAxis(value: Axis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYAxis(value: Axis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait Geometry_ extends StObject {
    
    /** geometry params */
    val args: js.UndefOr[Any] = js.undefined
    
    /** 分组字段 */
    val colorField: js.UndefOr[String] = js.undefined
    
    /** 自定义信息，一般在 registerShape 中使用 */
    val customInfo: js.UndefOr[Any] = js.undefined
    
    /** label 映射通道，因为历史原因导致实现略有区别 */
    val label: js.UndefOr[Label] = js.undefined
    
    /** 图形映射规则 */
    val mapping: js.UndefOr[MappingOptions] = js.undefined
    
    /** 其他原始字段, 用于 mapping 回调参数 */
    val rawFields: js.UndefOr[js.Array[String]] = js.undefined
    
    /** shape 的映射字段 */
    val shapeField: js.UndefOr[String] = js.undefined
    
    /** size 映射字段 */
    val sizeField: js.UndefOr[String] = js.undefined
    
    /** 不同状态的样式 */
    val state: js.UndefOr[State] = js.undefined
    
    /** style 的映射字段 */
    val styleField: js.UndefOr[String] = js.undefined
    
    /** tooltip 的映射字段 */
    val tooltipFields: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /** geometry 类型, 'line' | 'interval' | 'point' | 'area' | 'polygon' */
    val `type`: js.UndefOr[String] = js.undefined
    
    /** x 轴字段 */
    val xField: js.UndefOr[String] = js.undefined
    
    /** y 轴字段 */
    val yField: js.UndefOr[String] = js.undefined
  }
  object Geometry_ {
    
    inline def apply(): Geometry_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Geometry_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Geometry_] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setCustomInfo(value: Any): Self = StObject.set(x, "customInfo", value.asInstanceOf[js.Any])
      
      inline def setCustomInfoUndefined: Self = StObject.set(x, "customInfo", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMapping(value: MappingOptions): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setRawFields(value: js.Array[String]): Self = StObject.set(x, "rawFields", value.asInstanceOf[js.Any])
      
      inline def setRawFieldsUndefined: Self = StObject.set(x, "rawFields", js.undefined)
      
      inline def setRawFieldsVarargs(value: String*): Self = StObject.set(x, "rawFields", js.Array(value*))
      
      inline def setShapeField(value: String): Self = StObject.set(x, "shapeField", value.asInstanceOf[js.Any])
      
      inline def setShapeFieldUndefined: Self = StObject.set(x, "shapeField", js.undefined)
      
      inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
      
      inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyleField(value: String): Self = StObject.set(x, "styleField", value.asInstanceOf[js.Any])
      
      inline def setStyleFieldUndefined: Self = StObject.set(x, "styleField", js.undefined)
      
      inline def setTooltipFields(value: js.Array[String] | `false`): Self = StObject.set(x, "tooltipFields", value.asInstanceOf[js.Any])
      
      inline def setTooltipFieldsUndefined: Self = StObject.set(x, "tooltipFields", js.undefined)
      
      inline def setTooltipFieldsVarargs(value: String*): Self = StObject.set(x, "tooltipFields", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait MappingOptions extends StObject {
    
    /** color 映射 */
    val color: js.UndefOr[ColorAttr] = js.undefined
    
    /** shape 映射 */
    val shape: js.UndefOr[ShapeAttr] = js.undefined
    
    /** 大小映射, 提供回调的方式 */
    val size: js.UndefOr[SizeAttr] = js.undefined
    
    /** 样式映射 */
    val style: js.UndefOr[StyleAttr] = js.undefined
    
    /** tooltip 映射 */
    val tooltip: js.UndefOr[TooltipAttr] = js.undefined
  }
  object MappingOptions {
    
    inline def apply(): MappingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MappingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MappingOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setShape(value: ShapeAttr): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeFunction1(value: /* datum */ Datum => String): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setSize(value: SizeAttr): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeFunction1(value: /* datum */ Datum => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleAttr): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: /* datum */ Datum => NameString): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
