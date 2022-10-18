package typings.antvG2

import typings.antvG2.anon.PartialAreaCfg
import typings.antvG2.anon.PartialGeometryCfg
import typings.antvG2.anon.PartialIntervalCfg
import typings.antvG2.anon.PartialPathCfg
import typings.antvG2.anon.PartialViewCfg
import typings.antvG2.antvG2Strings.annotation
import typings.antvG2.antvG2Strings.axis
import typings.antvG2.antvG2Strings.circle
import typings.antvG2.antvG2Strings.gestucre
import typings.antvG2.antvG2Strings.legend
import typings.antvG2.antvG2Strings.list
import typings.antvG2.antvG2Strings.matrix
import typings.antvG2.antvG2Strings.mirror
import typings.antvG2.antvG2Strings.rect
import typings.antvG2.antvG2Strings.scrollbar
import typings.antvG2.antvG2Strings.slider
import typings.antvG2.antvG2Strings.tooltip
import typings.antvG2.antvG2Strings.tree
import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import typings.antvG2.libChartControllerBaseMod.Controller
import typings.antvG2.libChartLayoutMod.Layout
import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCal
import typings.antvG2.libConstantMod.LAYER
import typings.antvG2.libDependentsMod.Attribute
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libFacetMod.Facet
import typings.antvG2.libInteractionMod.Interaction
import typings.antvG2.libInterfaceMod.AxisOption
import typings.antvG2.libInterfaceMod.CircleCfg
import typings.antvG2.libInterfaceMod.ComponentOption
import typings.antvG2.libInterfaceMod.CoordinateCfg
import typings.antvG2.libInterfaceMod.CoordinateOption
import typings.antvG2.libInterfaceMod.Data
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.EventPayload
import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetData
import typings.antvG2.libInterfaceMod.FilterCondition
import typings.antvG2.libInterfaceMod.LegendOption
import typings.antvG2.libInterfaceMod.ListCfg
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.MatrixCfg
import typings.antvG2.libInterfaceMod.MirrorCfg
import typings.antvG2.libInterfaceMod.Options
import typings.antvG2.libInterfaceMod.Padding
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.RectCfg
import typings.antvG2.libInterfaceMod.Region
import typings.antvG2.libInterfaceMod.ScaleOption
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.libInterfaceMod.TooltipOption
import typings.antvG2.libInterfaceMod.TreeCfg
import typings.antvG2.libInterfaceMod.ViewAppendPadding
import typings.antvG2.libInterfaceMod.ViewCfg
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.antvG2.libUtilBboxMod.BBox
import typings.antvGBase.libInterfacesMod.ICanvas
import typings.antvGBase.libInterfacesMod.IGroup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartViewMod {
  
  @JSImport("@antv/g2/lib/chart/view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/chart/view", JSImport.Default)
  @js.native
  open class default protected () extends View {
    def this(props: ViewCfg) = this()
  }
  
  @JSImport("@antv/g2/lib/chart/view", "View")
  @js.native
  open class View protected ()
    extends typings.antvG2.libBaseMod.default {
    def this(props: ViewCfg) = this()
    
    /**
      * 调整分类 scale 的 range，防止超出坐标系外面
      * @private
      */
    /* private */ var adjustCategoryScaleRange: Any = js.native
    
    /**
      * 调整 coordinate 的坐标范围。
      */
    def adjustCoordinate(): Unit = js.native
    
    /**
      * 调整 scale 配置
      * @private
      */
    /* private */ var adjustScales: Any = js.native
    
    def animate(status: Boolean): View = js.native
    
    /**
      * 辅助标记配置。
      *
      * ```ts
      * view.annotation().line({
      *   start: ['min', 85],
      *   end: ['max', 85],
      *   style: {
      *     stroke: '#595959',
      *     lineWidth: 1,
      *     lineDash: [3, 3],
      *   },
      * });
      * ```
      * 更详细的配置项：https://github.com/antvis/component#annotation
      * @returns [[Annotation]]
      */
    def annotation(): typings.antvG2.libChartControllerAnnotationMod.default = js.native
    
    /** padding的基础上增加的调整值 */
    var appendPadding: ViewAppendPadding = js.native
    
    /**
      * 创建 Area 几何标记。
      * @param [cfg] 传入 Area 构造函数的配置。
      * @returns area 返回 Area 实例。
      */
    def area(): typings.antvG2.libGeometryAreaMod.default = js.native
    def area(cfg: PartialAreaCfg): typings.antvG2.libGeometryAreaMod.default = js.native
    
    /** 存储最终计算的 padding 结果 */
    var autoPadding: PaddingCal = js.native
    
    /**
      * 对特定的某条坐标轴进行配置。
      *
      * @example
      * ```ts
      * view.axis('city', false); // 不展示 'city' 字段对应的坐标轴
      *
      * // 将 'city' 字段对应的坐标轴的标题隐藏
      * view.axis('city', {
      *   title: null,
      * });
      * ```
      *
      * @param field 要配置的坐标轴对应的字段名称
      * @param axisOption 坐标轴具体配置，更详细的配置项可以参考：https://github.com/antvis/component#axis
      */
    def axis(field: String, axisOption: AxisOption): View = js.native
    /**
      * 开启或者关闭坐标轴。
      *
      * ```ts
      *  view.axis(false); // 不展示坐标轴
      * ```
      * @param field 坐标轴开关
      */
    def axis(field: Boolean): View = js.native
    
    /** 三层 Group 图形中的背景层。 */
    var backgroundGroup: IGroup = js.native
    
    /** 背景色样式的 shape */
    /* private */ var backgroundStyleRectShape: Any = js.native
    
    /**
      * 计算 region，计算实际的像素范围坐标
      * @private
      */
    /* private */ var calculateViewBBox: Any = js.native
    
    /** G.Canvas 实例。 */
    var canvas: ICanvas = js.native
    
    /**
      * 修改数据，数据更新逻辑，数据更新仅仅影响当前这一层的 view
      *
      * ```ts
      * view.changeData([{ city: '北京', sale: '200' }]);
      * ```
      *
      * @param data
      * @returns void
      */
    def changeData(data: Data): Unit = js.native
    
    /**
      * 生命周期：清空图表上所有的绘制内容，但是不销毁图表，chart 仍可使用。
      * @returns void
      */
    def clear(): Unit = js.native
    
    /** 所有的组件 controllers。 */
    var controllers: js.Array[Controller[Any]] = js.native
    
    /**
      * @deprecated
      * This method will be removed at G2 V4.1. Replaced by {@link #coordinate()}
      */
    def coord(`type`: String): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    def coord(`type`: String, coordinateCfg: CoordinateCfg): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    def coord(`type`: CoordinateOption): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    def coord(`type`: CoordinateOption, coordinateCfg: CoordinateCfg): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    
    /**
      * 坐标系配置。
      *
      * @example
      * ```ts
      * view.coordinate({
      *   type: 'polar',
      *   cfg: {
      *     radius: 0.85,
      *   },
      *   actions: [
      *     [ 'transpose' ],
      *   ],
      * });
      * ```
      *
      * @param option
      * @returns
      */
    def coordinate(): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    def coordinate(option: CoordinateOption): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    /**
      * 声明坐标系类型，并进行配置。
      *
      * ```ts
      * // 直角坐标系，并进行转置变换
      * view.coordinate('rect').transpose();
      *
      * // 默认创建直角坐标系
      * view.coordinate();
      * ```
      *
      * @param type 坐标系类型
      * @param [coordinateCfg] 坐标系配置
      * @returns
      */
    def coordinate(`type`: String): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    def coordinate(`type`: String, coordinateCfg: CoordinateCfg): typings.antvG2.libChartControllerCoordinateMod.default = js.native
    
    /** 坐标系的位置大小，ViewBBox - padding = coordinateBBox。 */
    var coordinateBBox: BBox = js.native
    
    /** Coordinate 相关的控制器类，负责坐标系实例的创建、更新、变换等 */
    /* protected */ var coordinateController: typings.antvG2.libChartControllerCoordinateMod.default = js.native
    
    /** 生成的坐标系实例，{@link https://github.com/antvis/coord/blob/master/src/coord/base.ts|Coordinate} */
    /* protected */ var coordinateInstance: Coordinate = js.native
    
    /**
      * 创建坐标系
      * @private
      */
    /* private */ var createCoordinate: Any = js.native
    
    /* private */ var createGeometry: Any = js.native
    
    /**
      * 根据 Geometry 的所有字段创建 scales
      * 如果存在，则更新，不存在则创建
      */
    /* private */ var createOrUpdateScales: Any = js.native
    
    /**
      * 创建 scale，递归到顶层 view 去创建和缓存 scale
      * @param field
      * @param data
      * @param scaleDef
      * @param key
      */
    /* protected */ def createScale(field: String, data: Data, scaleDef: ScaleOption, key: String): Any = js.native
    
    /**
      * 创建子 view
      *
      * ```ts
      * const innerView = view.createView({
      *   start: { x: 0, y: 0 },
      *   end: { x: 0.5, y: 0.5 },
      *   padding: 8,
      * });
      * ```
      *
      * @param cfg
      * @returns View
      */
    def createView(): View = js.native
    def createView(cfg: PartialViewCfg): View = js.native
    
    /* private */ var createViewEvent: Any = js.native
    
    /** 从当前这个 view 创建的 scale key */
    /* private */ var createdScaleKeys: Any = js.native
    
    /**
      * 装载数据源。
      *
      * ```ts
      * view.data([{ city: '杭州', sale: 100 }, { city: '上海', sale: 110 } ]);
      * ```
      *
      * @param data 数据源，json 数组。
      * @returns View
      */
    def data(data: Data): View = js.native
    
    /**
      * 处理筛选器，筛选数据
      * @private
      */
    /* private */ var doFilterData: Any = js.native
    
    /* private */ var doLayout: Any = js.native
    
    /**
      * 处理 PLOT_EVENTS
      * plot event 需要处理所有的基础事件，并判断是否在画布中，然后再决定是否要 emit。
      * 对于 mouseenter、mouseleave 比较特殊，需要做一下数学比较。
      * @param e
      */
    /* private */ var doPlotEvent: Any = js.native
    
    /**
      * 创建 Edge 几何标记。
      * @param [cfg] 传入 Edge 构造函数的配置。
      * @returns schema 返回 Edge 实例。
      */
    def edge(): typings.antvG2.libGeometryEdgeMod.default = js.native
    def edge(cfg: PartialGeometryCfg): typings.antvG2.libGeometryEdgeMod.default = js.native
    
    /** 分面类实例 */
    /* protected */ var facetInstance: Facet[FacetCfg[FacetData], FacetData] = js.native
    
    @JSName("facet")
    def facet_circle(`type`: circle, cfg: CircleCfg): View = js.native
    @JSName("facet")
    def facet_list(`type`: list, cfg: ListCfg): View = js.native
    @JSName("facet")
    def facet_matrix(`type`: matrix, cfg: MatrixCfg): View = js.native
    @JSName("facet")
    def facet_mirror(`type`: mirror, cfg: MirrorCfg): View = js.native
    /**
      * view 分面绘制。
      *
      * ```ts
      * view.facet('rect', {
      *   rowField: 'province',
      *   columnField: 'category',
      *   eachView: (innerView: View, facet?: FacetData) => {
      *     innerView.line().position('city*sale');
      *   },
      * });
      * ```
      *
      * @param type 分面类型
      * @param cfg 分面配置， [[FacetCfgMap]]
      * @returns View
      */
    @JSName("facet")
    def facet_rect(`type`: rect, cfg: RectCfg): View = js.native
    @JSName("facet")
    def facet_tree(`type`: tree, cfg: TreeCfg): View = js.native
    
    /**
      * 设置数据筛选规则。
      *
      * ```ts
      * view.filter('city', (value: any, datum: Datum) => value !== '杭州');
      *
      * // 删除 'city' 字段对应的筛选规则。
      * view.filter('city', null);
      * ```
      *
      * @param field 数据字段
      * @param condition 筛选规则
      * @returns View
      */
    def filter(field: String): View = js.native
    def filter(field: String, condition: FilterCondition): View = js.native
    
    /**
      * 将 data 数据进行过滤。
      * @param data
      * @returns 过滤之后的数据
      */
    def filterData(data: Data): Data = js.native
    
    /**
      * 对某一个字段进行过滤
      * @param field
      * @param data
      */
    def filterFieldData(field: String, data: Data): Data = js.native
    
    /** 过滤之后的数据 */
    /* protected */ var filteredData: Data = js.native
    
    /** 三层 Group 图形中的前景层。 */
    var foregroundGroup: IGroup = js.native
    
    /** 所有的 geometry 实例。 */
    var geometries: js.Array[typings.antvG2.libGeometryBaseMod.default[ShapePoint]] = js.native
    
    /**
      * 获取 G.Canvas 实例。
      * @returns G.Canvas 画布实例。
      */
    def getCanvas(): ICanvas = js.native
    
    /**
      * 获取所有的 pure component 组件，用于布局。
      */
    def getComponents(): js.Array[ComponentOption] = js.native
    
    def getController(name: String): Controller[Any] = js.native
    @JSName("getController")
    def getController_annotation(name: annotation): typings.antvG2.libChartControllerAnnotationMod.default = js.native
    @JSName("getController")
    def getController_axis(name: axis): typings.antvG2.libChartControllerAxisMod.default = js.native
    @JSName("getController")
    def getController_gestucre(name: gestucre): typings.antvG2.libChartControllerGestureMod.default = js.native
    @JSName("getController")
    def getController_legend(name: legend): typings.antvG2.libChartControllerLegendMod.default = js.native
    @JSName("getController")
    def getController_scrollbar(name: scrollbar): typings.antvG2.libChartControllerScrollbarMod.default = js.native
    @JSName("getController")
    def getController_slider(name: slider): typings.antvG2.libChartControllerSliderMod.default = js.native
    @JSName("getController")
    def getController_tooltip(name: tooltip): typings.antvG2.libChartControllerTooltipMod.default = js.native
    
    /**
      * 获取当前坐标系实例。
      * @returns [[Coordinate]]
      */
    def getCoordinate(): Coordinate = js.native
    
    /**
      * 获取 view 的数据（过滤后的数据）。
      * @returns 处理过滤器之后的数据。
      */
    def getData(): Data = js.native
    
    /**
      * 获取 view 中的所有 geome
      */
    def getElements(): js.Array[typings.antvG2.libGeometryElementMod.default] = js.native
    
    /**
      * 根据一定的规则查找 Geometry 的 Elements。
      *
      * ```typescript
      * getElementsBy((element) => {
      *   const data = element.getData();
      *
      *   return data.a === 'a';
      * });
      * ```
      *
      * @param condition 定义查找规则的回调函数。
      * @returns
      */
    def getElementsBy(condition: js.Function1[/* element */ typings.antvG2.libGeometryElementMod.default, Boolean]): js.Array[typings.antvG2.libGeometryElementMod.default] = js.native
    
    /**
      * 获取当前 view 有的 geometries
      * @returns
      */
    def getGeometries(): js.Array[typings.antvG2.libGeometryBaseMod.default[ShapePoint]] = js.native
    
    /**
      * 获得 Geometry 中的 scale 对象
      */
    /* private */ var getGeometryScales: Any = js.native
    
    /**
      * 获取所有的分组字段的 scale 实例。
      * @returns 获得分组字段的 scale 实例数组。
      */
    def getGroupScales(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /* private */ var getGroupedFields: Any = js.native
    
    /**
      * 获得绘制的层级 group。
      * @param layer 层级名称。
      * @returns 对应层级的 Group。
      */
    def getLayer(layer: LAYER): IGroup = js.native
    
    /**
      * 获得所有的 legend 对应的 attribute 实例。
      * @returns 维度字段的 Attribute 数组
      */
    def getLegendAttributes(): js.Array[Attribute] = js.native
    
    /**
      * 返回所有配置信息。
      * @returns 所有的 view API 配置。
      */
    def getOptions(): Options = js.native
    
    /**
      * 获取原始数据
      * @returns 传入 G2 的原始数据
      */
    def getOriginalData(): Data = js.native
    
    /**
      * 获取布局后的边距 padding
      * @returns
      */
    def getPadding(): Padding = js.native
    
    /**
      * 获得根节点 view。
      */
    def getRootView(): View = js.native
    
    /**
      * 根据字段名去获取 scale 实例。
      * @param field 数据字段名称
      * @param key id
      */
    def getScale(field: String): Any = js.native
    def getScale(field: String, key: String): Any = js.native
    
    /**
      * @deprecated
      * This method will be removed at G2 V4.1. Please use `getScale`.
      */
    def getScaleByField(field: String): Any = js.native
    def getScaleByField(field: String, key: String): Any = js.native
    
    /* private */ var getScaleFields: Any = js.native
    
    /**
      * scale key 的创建方式
      * @param field
      */
    /* private */ var getScaleKey: Any = js.native
    
    /**
      * 获取 x 轴或者 y 轴对应的所有 scale 实例。
      * @param dimType x | y
      * @returns x 轴或者 y 轴对应的所有 scale 实例。
      */
    def getScalesByDim(dimType: x | y): Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /**
      * 获取逼近的点的数据集合
      * @param point 当前坐标点
      * @returns  数据
      */
    def getSnapRecords(point: Point): js.Array[Any] = js.native
    
    /**
      * 获取当前 view 的主题配置。
      * @returns themeObject
      */
    def getTheme(): LooseObject = js.native
    
    /**
      * 获取当前 point 对应的 tooltip 数据项。
      * @param point 坐标点
      * @returns tooltip 数据项
      */
    def getTooltipItems(point: Point): js.Array[Any] = js.native
    
    /**
      * 获得 x 轴字段的 scale 实例。
      * @returns view 中 Geometry 对于的 x scale
      */
    def getXScale(): Any = js.native
    
    /**
      * 获取该数据在可视化后，对应的画布坐标点。
      * @param data 原始数据记录
      * @returns 对应的画布坐标点
      */
    def getXY(data: Datum): Point = js.native
    
    /**
      * 获取 y 轴字段的 scales 实例。
      * @returns view 中 Geometry 对于的 y scale 数组
      */
    def getYScales(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /**
      * @deprecated
      * This method will be removed at G2 V4.1. Replaced by {@link #guide()}
      */
    def guide(): typings.antvG2.libChartControllerAnnotationMod.default = js.native
    
    /**
      * 创建 Heatmap 几何标记。
      * @param [cfg] 传入 Heatmap 构造函数的配置。
      * @returns heatmap 返回 Heatmap 实例。
      */
    def heatmap(): typings.antvG2.libGeometryHeatmapMod.default = js.native
    def heatmap(cfg: PartialGeometryCfg): typings.antvG2.libGeometryHeatmapMod.default = js.native
    
    /**
      * 隐藏 tooltip。
      * @returns View
      */
    def hideTooltip(): View = js.native
    
    /** view id，全局唯一。 */
    var id: String = js.native
    
    /**
      * 生命周期：初始化
      * @returns voids
      */
    def init(): Unit = js.native
    
    /**
      * 初始化插件
      */
    /* private */ var initComponentController: Any = js.native
    
    /**
      * 根据 options 配置、Geometry 字段配置，自动生成 components
      * @param isUpdate 是否是更新
      * @private
      */
    /* private */ var initComponents: Any = js.native
    
    /**
      * 初始化事件机制：G 4.0 底层内置支持 name:event 的机制，那么只要所有组件都有自己的 name 即可。
      *
      * G2 的事件只是获取事件委托，然后在 view 嵌套结构中，形成事件冒泡机制。
      * 当前 view 只委托自己 view 中的 Component 和 Geometry 事件，并向上冒泡
      * @private
      */
    /* private */ var initEvents: Any = js.native
    
    /**
      * 初始化 Geometries
      * @private
      */
    /* private */ var initGeometries: Any = js.native
    
    /* private */ var initOptions: Any = js.native
    
    /**
      * Call the interaction based on the interaction name
      *
      * ```ts
      * view.interaction('my-interaction', { extra: 'hello world' });
      * ```
      * 详细文档可以参考：https://g2.antv.vision/zh/docs/api/general/interaction
      * @param name interaction name
      * @param cfg interaction config
      * @returns
      */
    def interaction(name: String): View = js.native
    def interaction(name: String, cfg: LooseObject): View = js.native
    
    /** 所有的 Interaction 实例。 */
    var interactions: Record[String, Interaction] = js.native
    
    /**
      * 创建 Interval 几何标记。
      * @param [cfg] 传入 Interval 构造函数的配置。
      * @returns interval 返回 Interval 实例。
      */
    def interval(): typings.antvG2.libGeometryIntervalMod.default = js.native
    def interval(cfg: PartialIntervalCfg): typings.antvG2.libGeometryIntervalMod.default = js.native
    
    /** 用于判断坐标系范围是否发生变化的标志位 */
    /* private */ var isCoordinateChanged: Any = js.native
    
    /** 默认标识位，用于判定数据是否更新 */
    /* private */ var isDataChanged: Any = js.native
    
    /**
      * 对外暴露方法，判断一个点是否在绘图区域（即坐标系范围）内部。
      * @param point 坐标点
      */
    def isPointInPlot(point: Point): Boolean = js.native
    
    /** 当前鼠标是否在 plot 内（CoordinateBBox） */
    /* private */ var isPreMouseInPlot: Any = js.native
    
    /**
      * 是否锁定 tooltip。
      * @returns 是否锁定
      */
    def isTooltipLocked(): Boolean = js.native
    
    /** 布局函数 */
    /* protected */ def layoutFunc(view: View): Unit = js.native
    /** 布局函数 */
    /* protected */ @JSName("layoutFunc")
    var layoutFunc_Original: Layout = js.native
    
    /**
      * 对特定的图例进行配置。
      *
      * @example
      * ```ts
      * view.legend('city', false); // 关闭某个图例，通过数据字段名进行关联
      *
      * // 对特定的图例进行配置
      * view.legend('city', {
      *   position: 'right',
      * });
      * ```
      *
      * @param field 图例对应的数据字段名称
      * @param legendOption 图例配置，更详细的配置项可以参考：https://github.com/antvis/component#axis
      * @returns View
      */
    def legend(field: String, legendOption: LegendOption): View = js.native
    /**
      * 对图例进行整体配置。
      *
      * ```ts
      * view.legend(false); // 关闭图例
      *
      * view.legend({
      *   position: 'right',
      * }); // 图例进行整体配置
      * ```
      * @param field
      * @returns View
      */
    def legend(field: LegendOption): View = js.native
    
    /** 是否对超出坐标系范围的 Geometry 进行剪切 */
    var limitInPlot: Boolean = js.native
    
    /**
      * 创建 Line 几何标记。
      * @param [cfg] 传入 Line 构造函数的配置。
      * @returns line 返回 Line 实例。
      */
    def line(): typings.antvG2.libGeometryLineMod.default = js.native
    def line(cfg: PartialPathCfg): typings.antvG2.libGeometryLineMod.default = js.native
    
    /**
      * 将 tooltip 锁定到当前位置不能移动。
      * @returns View
      */
    def lockTooltip(): View = js.native
    
    /** 三层 Group 图形中的中间层。 */
    var middleGroup: IGroup = js.native
    
    /* private */ var onCanvasEvent: Any = js.native
    
    /**
      * 触发事件之后
      * @param evt
      */
    /* private */ var onDelegateEvents: Any = js.native
    
    /**
      * 往 `view.options` 属性中存储配置项。
      * @param name 属性名称
      * @param opt 属性值
      * @returns view
      */
    def option(name: String, opt: Any): View = js.native
    
    /* protected */ var options: Options = js.native
    
    /** view 的 padding 大小，传入的配置（不是解析之后的值）。 */
    var padding: ViewPadding = js.native
    
    /* protected */ def paint(isUpdate: Boolean): Unit = js.native
    
    /**
      * 根据 options 配置自动渲染 geometry
      * @private
      */
    /* private */ var paintGeometries: Any = js.native
    
    /** 父级 view，如果没有父级，则为空。 */
    var parent: View = js.native
    
    /**
      * 创建 Path 几何标记。
      * @param [cfg] 传入 Path 构造函数的配置。
      * @returns path 返回 Path 实例。
      */
    def path(): typings.antvG2.libGeometryPathMod.default = js.native
    def path(cfg: PartialPathCfg): typings.antvG2.libGeometryPathMod.default = js.native
    
    /**
      * 创建 Point 几何标记。
      * @param [cfg] 传入 Point 构造函数的配置。
      * @returns point 返回 Point 实例。
      */
    def point(): Point = js.native
    def point(cfg: PartialGeometryCfg): Point = js.native
    
    /**
      * 创建 Polygon 几何标记。
      * @param [cfg] 传入 Polygon 构造函数的配置。
      * @returns polygon 返回 Polygon 实例。
      */
    def polygon(): typings.antvG2.libGeometryPolygonMod.default = js.native
    def polygon(cfg: PartialGeometryCfg): typings.antvG2.libGeometryPolygonMod.default = js.native
    
    /**
      * 标记 view 的大小位置范围，均是 0 ~ 1 范围，便于开发者使用，起始点为左上角。
      */
    /* protected */ var region: Region = js.native
    
    /**
      * 移除当前 View 的 interaction
      * ```ts
      * view.removeInteraction('my-interaction');
      * ```
      * @param name interaction name
      */
    def removeInteraction(name: String): Unit = js.native
    
    /**
      * 删除一个子 view
      * @param view
      * @return removedView
      */
    def removeView(view: View): View = js.native
    
    /**
      * 生命周期：渲染流程，渲染过程需要处理数据更新的情况。
      * render 函数仅仅会处理 view 和子 view。
      * @param isUpdate 是否触发更新流程。
      * @param params render 事件参数
      */
    def render(): Unit = js.native
    def render(isUpdate: Boolean): Unit = js.native
    def render(isUpdate: Boolean, payload: EventPayload): Unit = js.native
    def render(isUpdate: Unit, payload: EventPayload): Unit = js.native
    
    /**
      * 渲染背景样式的 shape。
      * 放到 view 中创建的原因是让使用 view 绘制图形的时候，也能够处理背景色
      */
    /* private */ var renderBackgroundStyleShape: Any = js.native
    
    /**
      * 最后的绘制组件
      * @param isUpdate
      */
    /* private */ var renderComponents: Any = js.native
    
    /**
      * 递归渲染中的数据处理
      * @param isUpdate
      */
    /* private */ var renderDataRecursive: Any = js.native
    
    /**
      * 渲染分面，会在其中进行数据分面，然后进行子 view 创建
      * @param isUpdate
      */
    /* private */ var renderFacet: Any = js.native
    
    /**
      * 递归处理 view 的布局，最终是计算各个 view 的 coordinateBBox 和 coordinateInstance
      * @param isUpdate
      */
    /* protected */ def renderLayoutRecursive(isUpdate: Boolean): Unit = js.native
    
    /**
      * 递归计算每个 view 的 padding 值，coordinateBBox 和 coordinateInstance
      * @param isUpdate
      */
    /* protected */ def renderPaddingRecursive(isUpdate: Boolean): Unit = js.native
    
    /**
      * 最终递归绘制组件和图形
      * @param isUpdate
      */
    /* protected */ def renderPaintRecursive(isUpdate: Boolean): Unit = js.native
    
    /**
      * 为特性的数据字段进行 scale 配置。
      *
      * ```ts
      * view.scale('sale', {
      *   min: 0,
      *   max: 100,
      * });
      * ```
      *
      * @returns View
      */
    def scale(field: String, scaleOption: ScaleOption): View = js.native
    /**
      * 批量设置 scale 配置。
      *
      * ```ts
      * view.scale({
      *   sale: {
      *     min: 0,
      *     max: 100,
      *   }
      * });
      * ```
      * Scale 的详细配置项可以参考：https://github.com/antvis/scale#api
      * @returns View
      */
    def scale(field: Record[String, ScaleOption]): View = js.native
    
    /** 所有的 scales */
    /* private */ var scalePool: Any = js.native
    
    /**
      * 创建 Schema 几何标记。
      * @param [cfg] 传入 Schema 构造函数的配置。
      * @returns schema 返回 Schema 实例。
      */
    def schema(): typings.antvG2.libGeometrySchemaMod.default = js.native
    def schema(cfg: PartialGeometryCfg): typings.antvG2.libGeometrySchemaMod.default = js.native
    
    /**
      * 设置 layout 布局函数
      * @param layout 布局函数
      * @returns void
      */
    def setLayout(layout: Layout): Unit = js.native
    
    /**
      * 显示 point 坐标点对应的 tooltip。
      * @param point 画布坐标点
      * @returns View
      */
    def showTooltip(point: Point): View = js.native
    
    /**
      * @deprecated
      * This method will be removed at G2 V4.1. Replaced by {@link #data(data)}
      */
    def source(data: Data): View = js.native
    
    /**
      * 处理 scale 同步逻辑
      */
    /* private */ var syncScale: Any = js.native
    
    /** 是否同步子 view 的 padding */
    /* private */ var syncViewPadding: Any = js.native
    
    /**
      * 设置主题。
      *
      * ```ts
      * view.theme('dark'); // 'dark' 需要事先通过 `registerTheme()` 接口注册完成
      *
      * view.theme({ defaultColor: 'red' });
      * ```
      *
      * @param theme 主题名或者主题配置
      * @returns View
      */
    def theme(theme: String): View = js.native
    def theme(theme: LooseObject): View = js.native
    
    /** 主题配置，存储当前主题配置。 */
    /* protected */ var themeObject: LooseObject = js.native
    
    /**
      * tooltip 提示信息配置。
      *
      * ```ts
      * view.tooltip(false); // 关闭 tooltip
      *
      * view.tooltip({
      *   shared: true
      * });
      * ```
      *
      * @param cfg Tooltip 配置，更详细的配置项参考：https://github.com/antvis/component#tooltip
      * @returns View
      */
    def tooltip(cfg: Boolean): View = js.native
    def tooltip(cfg: TooltipOption): View = js.native
    
    /**
      * 将 tooltip 锁定解除。
      * @returns View
      */
    def unlockTooltip(): View = js.native
    
    /**
      * 更新配置项，用于配置项式声明。
      * @param options 配置项
      */
    def updateOptions(options: Options): this.type = js.native
    
    /** 配置开启的组件插件，默认为全局配置的组件。 */
    /* private */ var usedControllers: Any = js.native
    
    /**
      * @deprecated
      * This method will be removed at G2 V4.1. Replaced by {@link #createView()}
      */
    def view(): View = js.native
    def view(cfg: PartialViewCfg): View = js.native
    
    /** view 区域空间。 */
    var viewBBox: BBox = js.native
    
    /** 所有的子 view。 */
    var views: js.Array[View] = js.native
    
    /**
      * 创建 Violin 几何标记。
      * @param [cfg] 传入 Violin 构造函数的配置。
      * @returns violin 返回 Violin 实例。
      */
    def violin(): typings.antvG2.libGeometryViolinMod.default = js.native
    def violin(cfg: PartialGeometryCfg): typings.antvG2.libGeometryViolinMod.default = js.native
  }
  
  inline def registerGeometry(name: String, Ctor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometry")(name.asInstanceOf[js.Any], Ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
