package typings.antvG2plot

import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.SyncViewPaddingFn
import typings.antvG2plot.anon.PickPointGeometryOptionss
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAttrMod.ShapeAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.SizeAttr
import typings.antvG2plot.libTypesAttrMod.StyleAttr
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

object libPlotsDualAxesTypesMod {
  
  @js.native
  sealed trait AxisType extends StObject
  @JSImport("@antv/g2plot/lib/plots/dual-axes/types", "AxisType")
  @js.native
  object AxisType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AxisType & String] = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with AxisType
    /* "Left" */ val Left: typings.antvG2plot.libPlotsDualAxesTypesMod.AxisType.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with AxisType
    /* "Right" */ val Right: typings.antvG2plot.libPlotsDualAxesTypesMod.AxisType.Right & String = js.native
  }
  
  @js.native
  sealed trait DualAxesGeometry extends StObject
  @JSImport("@antv/g2plot/lib/plots/dual-axes/types", "DualAxesGeometry")
  @js.native
  object DualAxesGeometry extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DualAxesGeometry & String] = js.native
    
    @js.native
    sealed trait Column
      extends StObject
         with DualAxesGeometry
    /* "column" */ val Column: typings.antvG2plot.libPlotsDualAxesTypesMod.DualAxesGeometry.Column & String = js.native
    
    @js.native
    sealed trait Line
      extends StObject
         with DualAxesGeometry
    /* "line" */ val Line: typings.antvG2plot.libPlotsDualAxesTypesMod.DualAxesGeometry.Line & String = js.native
  }
  
  trait CommonGeometryOption extends StObject {
    
    /**
      * @title 颜色色板
      */
    val color: js.UndefOr[ColorAttr] = js.undefined
    
    /**
      * @title 图形类型
      */
    val geometry: js.UndefOr[String] = js.undefined
    
    /**
      * @title 分组字段
      * @description 优先级高于 seriesField
      */
    val groupField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否分组
      * @default false
      */
    val isGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 数据标签的配置
      */
    val label: js.UndefOr[Label] = js.undefined
    
    /**
      * @title 图例legend的配置项
      */
    val legend: js.UndefOr[Legend] = js.undefined
  }
  object CommonGeometryOption {
    
    inline def apply(): CommonGeometryOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonGeometryOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonGeometryOption] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@antv/g2plot.@antv/g2plot/lib/types.Options, 'data' | 'yAxis' | 'color' | 'annotations'> & { readonly data :std.Array<std.Array<std.Record<string, any>>>,  readonly xField :string,  readonly yField :std.Array<string>,  readonly yAxis :std.Array<@antv/g2plot.@antv/g2plot/lib/types.Options['yAxis']> | std.Record<string, @antv/g2plot.@antv/g2plot/lib/types.Options['yAxis']> | undefined,  readonly geometryOptions :std.Array<@antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.GeometryOption> | undefined,  readonly annotations :std.Array<@antv/g2plot.@antv/g2plot/lib/types.Options['annotations']> | std.Record<string, @antv/g2plot.@antv/g2plot/lib/types.Options['annotations']> | undefined} */
  trait DualAxesOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * @title 左右两边的 annotation 配置
      * @description 同时支持数组和object 两种形式，以防出现 field 相同无法设置的情况
      */
    val annotations: js.UndefOr[
        js.Array[js.UndefOr[js.Array[Annotation]]] | (Record[String, js.UndefOr[js.Array[Annotation]]])
      ] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 数据
      * @description 具体的数据，左右两边的数据
      */
    val data: js.Array[js.Array[Record[String, Any]]]
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @title 左右两边的图形配置
      */
    val geometryOptions: js.UndefOr[js.Array[GeometryOption]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    var legend: js.UndefOr[Legend] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    var scrollbar: js.UndefOr[Scrollbar] = js.undefined
    
    var slider: js.UndefOr[Slider] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    var syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    var tooltip: js.UndefOr[Tooltip] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var xAxis: js.UndefOr[Axis] = js.undefined
    
    /**
      * @title 双轴图的 x 字段
      * @description x 字段名称需要保持一致
      */
    val xField: String
    
    /**
      * @title 左右两边的 yAxis 配置
      * @description 使用 object 的方式，key 为 y 字段名，或者数组分别表示左右
      */
    val yAxis: js.UndefOr[js.Array[js.UndefOr[Axis]] | (Record[String, js.UndefOr[Axis]])] = js.undefined
    
    /**
      * @title 双轴图左右 y 字段
      * @description 需要不一致
      */
    val yField: js.Array[String]
  }
  object DualAxesOptions {
    
    inline def apply(data: js.Array[js.Array[Record[String, Any]]], xField: String, yField: js.Array[String]): DualAxesOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[DualAxesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DualAxesOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(
        value: js.Array[js.UndefOr[js.Array[Annotation]]] | (Record[String, js.UndefOr[js.Array[Annotation]]])
      ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: js.UndefOr[js.Array[Annotation]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAppendPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
      
      inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
      
      inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
      
      inline def setAutoFit(value: Boolean): Self = StObject.set(x, "autoFit", value.asInstanceOf[js.Any])
      
      inline def setAutoFitUndefined: Self = StObject.set(x, "autoFit", js.undefined)
      
      inline def setData(value: js.Array[js.Array[Record[String, Any]]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (js.Array[Record[String, Any]])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaultInteractions(value: js.Array[String]): Self = StObject.set(x, "defaultInteractions", value.asInstanceOf[js.Any])
      
      inline def setDefaultInteractionsUndefined: Self = StObject.set(x, "defaultInteractions", js.undefined)
      
      inline def setDefaultInteractionsVarargs(value: String*): Self = StObject.set(x, "defaultInteractions", js.Array(value*))
      
      inline def setGeometryOptions(value: js.Array[GeometryOption]): Self = StObject.set(x, "geometryOptions", value.asInstanceOf[js.Any])
      
      inline def setGeometryOptionsUndefined: Self = StObject.set(x, "geometryOptions", js.undefined)
      
      inline def setGeometryOptionsVarargs(value: GeometryOption*): Self = StObject.set(x, "geometryOptions", js.Array(value*))
      
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
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYAxis(value: js.Array[js.UndefOr[Axis]] | (Record[String, js.UndefOr[Axis]])): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
      
      inline def setYAxisVarargs(value: js.UndefOr[Axis]*): Self = StObject.set(x, "yAxis", js.Array(value*))
      
      inline def setYField(value: js.Array[String]): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldVarargs(value: String*): Self = StObject.set(x, "yField", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/column/types.ColumnOptions, 'seriesField' | 'isGroup' | 'isStack' | 'isRange' | 'isPercent' | 'columnWidthRatio' | 'marginRatio' | 'columnStyle' | 'pattern'> & @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.CommonGeometryOption */
  trait GeometryColumnOption
    extends StObject
       with GeometryOption {
    
    /**
      * @title 颜色色板
      */
    val color: js.UndefOr[ColorAttr] = js.undefined
    
    var columnStyle: js.UndefOr[StyleAttr] = js.undefined
    
    var columnWidthRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 图形类型
      */
    val geometry: js.UndefOr[String] = js.undefined
    
    /**
      * @title 分组字段
      * @description 优先级高于 seriesField
      */
    val groupField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否分组
      * @default false
      */
    var isGroup: js.UndefOr[Boolean] = js.undefined
    
    var isPercent: js.UndefOr[Boolean] = js.undefined
    
    var isRange: js.UndefOr[Boolean] = js.undefined
    
    var isStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 数据标签的配置
      */
    val label: js.UndefOr[Label] = js.undefined
    
    /**
      * @title 图例legend的配置项
      */
    val legend: js.UndefOr[Legend] = js.undefined
    
    var marginRatio: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var seriesField: js.UndefOr[String] = js.undefined
  }
  object GeometryColumnOption {
    
    inline def apply(): GeometryColumnOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeometryColumnOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryColumnOption] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setColumnStyle(value: StyleAttr): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "columnStyle", js.Any.fromFunction1(value))
      
      inline def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      inline def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsPercent(value: Boolean): Self = StObject.set(x, "isPercent", value.asInstanceOf[js.Any])
      
      inline def setIsPercentUndefined: Self = StObject.set(x, "isPercent", js.undefined)
      
      inline def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
      
      inline def setIsRangeUndefined: Self = StObject.set(x, "isRange", js.undefined)
      
      inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
      
      inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setPattern(value: PatternAttr): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternFunction2(value: (/* datum */ Datum, /* color */ String) => PatternOption | CanvasPattern): Self = StObject.set(x, "pattern", js.Any.fromFunction2(value))
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/line/types.LineOptions, 'seriesField' | 'smooth' | 'connectNulls' | 'lineStyle' | 'point' | 'isStack' | 'stepType'> & @antv/g2plot.@antv/g2plot/lib/plots/dual-axes/types.CommonGeometryOption */
  trait GeometryLineOption
    extends StObject
       with GeometryOption {
    
    /**
      * @title 颜色色板
      */
    val color: js.UndefOr[ColorAttr] = js.undefined
    
    var connectNulls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 图形类型
      */
    val geometry: js.UndefOr[String] = js.undefined
    
    /**
      * @title 分组字段
      * @description 优先级高于 seriesField
      */
    val groupField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否分组
      * @default false
      */
    val isGroup: js.UndefOr[Boolean] = js.undefined
    
    var isStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 数据标签的配置
      */
    val label: js.UndefOr[Label] = js.undefined
    
    /**
      * @title 图例legend的配置项
      */
    val legend: js.UndefOr[Legend] = js.undefined
    
    var lineStyle: js.UndefOr[StyleAttr] = js.undefined
    
    var point: js.UndefOr[js.UndefOr[MappingOptions] & PickPointGeometryOptionss] = js.undefined
    
    var seriesField: js.UndefOr[String] = js.undefined
    
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    var stepType: js.UndefOr[String] = js.undefined
  }
  object GeometryLineOption {
    
    inline def apply(): GeometryLineOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeometryLineOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryLineOption] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ColorAttr): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction2(value: (/* datum */ Datum, /* defaultColor */ js.UndefOr[String]) => String): Self = StObject.set(x, "color", js.Any.fromFunction2(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setConnectNulls(value: Boolean): Self = StObject.set(x, "connectNulls", value.asInstanceOf[js.Any])
      
      inline def setConnectNullsUndefined: Self = StObject.set(x, "connectNulls", js.undefined)
      
      inline def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
      
      inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
      
      inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLineStyle(value: StyleAttr): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "lineStyle", js.Any.fromFunction1(value))
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setPoint(value: js.UndefOr[MappingOptions] & PickPointGeometryOptionss): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStepType(value: String): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
      
      inline def setStepTypeUndefined: Self = StObject.set(x, "stepType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryColumnOption
    - typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryLineOption
  */
  trait GeometryOption extends StObject
  object GeometryOption {
    
    inline def GeometryColumnOption(): typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryColumnOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryColumnOption]
    }
    
    inline def GeometryLineOption(): typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryLineOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryLineOption]
    }
  }
  
  trait PointConfig extends StObject {
    
    val shape: js.UndefOr[ShapeAttr] = js.undefined
    
    val size: js.UndefOr[SizeAttr] = js.undefined
    
    val style: js.UndefOr[StyleAttr] = js.undefined
  }
  object PointConfig {
    
    inline def apply(): PointConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointConfig] (val x: Self) extends AnyVal {
      
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
    }
  }
}
