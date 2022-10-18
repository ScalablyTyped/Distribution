package typings.antvG2plot

import typings.antvG2.libInterfaceMod.AdjustOption
import typings.antvG2.libInterfaceMod.CoordinateOption
import typings.antvG2plot.anon.Data
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.auto
import typings.antvG2plot.antvG2plotStrings.canvas
import typings.antvG2plot.antvG2plotStrings.svg
import typings.antvG2plot.libAdaptorGeometriesBaseMod.Geometry_
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAttrMod.ColorAttr
import typings.antvG2plot.libTypesAttrMod.PatternAttr
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Region
import typings.antvG2plot.libTypesInteractionMod.Interaction
import typings.antvG2plot.libTypesLabelMod.Label
import typings.antvG2plot.libTypesLegendMod.Legend
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.antvG2plot.libTypesSliderMod.Slider
import typings.antvG2plot.libTypesStateMod.State
import typings.antvG2plot.libTypesTooltipMod.Tooltip
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import typings.std.CanvasPattern
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsMixTypesMod {
  
  trait IGeometry
    extends StObject
       with Geometry_ {
    
    var adjust: js.UndefOr[AdjustOption] = js.undefined
  }
  object IGeometry {
    
    inline def apply(): IGeometry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGeometry]
    }
    
    extension [Self <: IGeometry](x: Self) {
      
      inline def setAdjust(value: AdjustOption): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
    }
  }
  
  type IPlot = IPlotTypes & Data
  
  trait IView extends StObject {
    
    /**
      * @title annotation
      */
    val animation: js.UndefOr[Animation] = js.undefined
    
    /**
      * @title annotation
      */
    val annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    /**
      * @title x,y 轴
      */
    val axes: js.UndefOr[`false` | (Record[String, Axis])] = js.undefined
    
    /**
      * @title 坐标系的配置
      * @description 每一个 view 具有相同的坐标系
      */
    val coordinate: js.UndefOr[CoordinateOption] = js.undefined
    
    /**
      * @title view 中的数据
      */
    val data: typings.antvG2plot.libTypesCommonMod.Data
    
    /**
      * @title 图形 geometry 及映射配置
      */
    val geometries: js.Array[IGeometry]
    
    /**
      * @title interactions
      */
    val interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    /**
      * @title view 中对应的 meta 字段配置
      */
    val meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    /**
      * @title view 的布局范围
      * @default "占满全部"
      */
    val region: js.UndefOr[Region] = js.undefined
    
    /**
      * @title tooltip
      */
    val tooltip: js.UndefOr[Tooltip] = js.undefined
  }
  object IView {
    
    inline def apply(data: typings.antvG2plot.libTypesCommonMod.Data, geometries: js.Array[IGeometry]): IView = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any])
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setAxes(value: `false` | (Record[String, Axis])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setCoordinate(value: CoordinateOption): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setData(value: typings.antvG2plot.libTypesCommonMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGeometries(value: js.Array[IGeometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: IGeometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
      
      inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
      
      inline def setMeta(value: Record[String, Meta]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@antv/g2plot.@antv/g2plot/lib/types.Options, 'data' | 'legend' | 'xAxis' | 'yAxis' | 'tooltip' | 'slider' | 'scrollbar'> */
  trait MixOptions extends StObject {
    
    var animation: js.UndefOr[Animation] = js.undefined
    
    var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
    
    var appendPadding: js.UndefOr[js.Array[Double] | Double] = js.undefined
    
    var autoFit: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorAttr] = js.undefined
    
    /**
      * @title 顶层数据配置
      */
    val data: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
    
    var defaultInteractions: js.UndefOr[js.Array[String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
    
    var label: js.UndefOr[Label] = js.undefined
    
    /**
      * @title legend 配置
      * @description Mix 图例配置，统一顶层配置
      */
    val legend: js.UndefOr[`false` | (Record[String, Legend])] = js.undefined
    
    var limitInPlot: js.UndefOr[Boolean] = js.undefined
    
    var localRefresh: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[Record[String, Meta]] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double] | Double | auto] = js.undefined
    
    var pattern: js.UndefOr[PatternAttr] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 限定与指定 plot 类型
      * @description 支持使用已有的 plot，限定与指定 plot 类型
      */
    val plots: js.UndefOr[js.Array[IPlot]] = js.undefined
    
    var renderer: js.UndefOr[svg | canvas] = js.undefined
    
    /**
      * @title slider 配置
      * @description Mix 缩略轴配置，统一顶层配置
      */
    val slider: js.UndefOr[Slider] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var supportCSSTransform: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否同步子 view 的配置
      * @description 目前仅仅支持 true / false，后续需要增加 function 的方式进行自定义 view 之前的布局同步
      */
    val syncViewPadding: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * @title tooltip 配置
      * @description Mix tooltip 组件配置，统一顶层配置
      * TODO 字段映射
      */
    val tooltip: js.UndefOr[Tooltip] = js.undefined
    
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * @title 每一个图层的配置
      * @description 每个图层包括有自己的：数据、图形、图形映射
      */
    val views: js.UndefOr[js.Array[IView]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MixOptions {
    
    inline def apply(): MixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixOptions]
    }
    
    extension [Self <: MixOptions](x: Self) {
      
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
      
      inline def setLegend(value: `false` | (Record[String, Legend])): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
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
      
      inline def setPlots(value: js.Array[IPlot]): Self = StObject.set(x, "plots", value.asInstanceOf[js.Any])
      
      inline def setPlotsUndefined: Self = StObject.set(x, "plots", js.undefined)
      
      inline def setPlotsVarargs(value: IPlot*): Self = StObject.set(x, "plots", js.Array(value*))
      
      inline def setRenderer(value: svg | canvas): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSupportCSSTransform(value: Boolean): Self = StObject.set(x, "supportCSSTransform", value.asInstanceOf[js.Any])
      
      inline def setSupportCSSTransformUndefined: Self = StObject.set(x, "supportCSSTransform", js.undefined)
      
      inline def setSyncViewPadding(value: Boolean): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
      
      inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
      
      inline def setTheme(value: String | js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setViews(value: js.Array[IView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: IView*): Self = StObject.set(x, "views", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
