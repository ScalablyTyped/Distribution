package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with /**
  * @title 其他自定义的 option
  */
/* name */ StringDictionary[Any] {
  
  /**
    * @title 开启/关闭动画，默认开启
    */
  val animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 静态辅助元素声明。
    */
  val annotations: js.UndefOr[
    js.Array[
      ArcOption | RegionFilterOption | ImageOption | LineOption | TextOption | RegionOption | DataMarkerOption | DataRegionOption
    ]
  ] = js.undefined
  
  /**
    * @title 坐标轴配置，以 data 中的数据属性为 key。
    */
  val axes: js.UndefOr[(Record[String, AxisOption]) | Boolean] = js.undefined
  
  /**
    * @title 坐标系配置。
    */
  val coordinate: js.UndefOr[CoordinateOption] = js.undefined
  
  /**
    * @title 数据源配置。
    */
  val data: js.UndefOr[Data] = js.undefined
  
  /**
    * @title 事件配置
    */
  val events: js.UndefOr[EventCfg] = js.undefined
  
  /**
    * @title 分面
    */
  val facets: js.UndefOr[js.Array[RectCfg | MirrorCfg | CircleCfg | ListCfg | TreeCfg]] = js.undefined
  
  /**
    * @title 设置数据过滤条件，以 data 中的数据属性为 key。
    */
  val filters: js.UndefOr[Record[String, FilterCondition]] = js.undefined
  
  /**
    * @title Geometry 配置
    */
  val geometries: js.UndefOr[js.Array[GeometryOption]] = js.undefined
  
  /**
    * @title 配置需要使用的交互行为
    */
  val interactions: js.UndefOr[js.Array[InteractionOption]] = js.undefined
  
  /**
    * @title 图例配置，以 data 中的数据属性为 key。
    */
  val legends: js.UndefOr[AllLegendsOptions] = js.undefined
  
  /**
    * @title 列定义配置，用于配置数值的类型等，以 data 中的数据属性为 key。
    */
  val scales: js.UndefOr[Record[String, ScaleOption]] = js.undefined
  
  /**
    * @title 滚动条配置
    */
  val scrollbar: js.UndefOr[ScrollbarOption] = js.undefined
  
  /**
    * @title 缩略轴的配置
    */
  val slider: js.UndefOr[SliderOption] = js.undefined
  
  /**
    * @title Tooltip 配置。
    */
  val tooltip: js.UndefOr[TooltipOption] = js.undefined
  
  /**
    * @title 子 View
    */
  val views: js.UndefOr[js.Array[ViewOption]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnnotations(
      value: js.Array[
          ArcOption | RegionFilterOption | ImageOption | LineOption | TextOption | RegionOption | DataMarkerOption | DataRegionOption
        ]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(
      value: (ArcOption | RegionFilterOption | ImageOption | LineOption | TextOption | RegionOption | DataMarkerOption | DataRegionOption)*
    ): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAxes(value: (Record[String, AxisOption]) | Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setCoordinate(value: CoordinateOption): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEvents(value: EventCfg): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFacets(value: js.Array[RectCfg | MirrorCfg | CircleCfg | ListCfg | TreeCfg]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: (RectCfg | MirrorCfg | CircleCfg | ListCfg | TreeCfg)*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setFilters(value: Record[String, FilterCondition]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setGeometries(value: js.Array[GeometryOption]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: GeometryOption*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setInteractions(value: js.Array[InteractionOption]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: InteractionOption*): Self = StObject.set(x, "interactions", js.Array(value*))
    
    inline def setLegends(value: AllLegendsOptions): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setScales(value: Record[String, ScaleOption]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setScrollbar(value: ScrollbarOption): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setSlider(value: SliderOption): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
    
    inline def setTooltip(value: TooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setViews(value: js.Array[ViewOption]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: ViewOption*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
