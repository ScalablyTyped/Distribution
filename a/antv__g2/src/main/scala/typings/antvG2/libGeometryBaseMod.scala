package typings.antvG2

import typings.antvAdjust.mod.Adjust
import typings.antvAttr.mod.Attribute
import typings.antvG2.antvG2Booleans.`false`
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.AdjustOption
import typings.antvG2.libInterfaceMod.AnimateOption
import typings.antvG2.libInterfaceMod.AttributeOption
import typings.antvG2.libInterfaceMod.ColorAttrCallback
import typings.antvG2.libInterfaceMod.CustomOption
import typings.antvG2.libInterfaceMod.Data
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.GeometryLabelCfg
import typings.antvG2.libInterfaceMod.GeometryTooltipOption
import typings.antvG2.libInterfaceMod.LabelCallback
import typings.antvG2.libInterfaceMod.LabelOption
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.ScaleOption
import typings.antvG2.libInterfaceMod.ShapeAttrCallback
import typings.antvG2.libInterfaceMod.ShapeFactory
import typings.antvG2.libInterfaceMod.ShapeInfo
import typings.antvG2.libInterfaceMod.ShapeMarkerAttrs
import typings.antvG2.libInterfaceMod.ShapeMarkerCfg
import typings.antvG2.libInterfaceMod.ShapePoint
import typings.antvG2.libInterfaceMod.SizeAttrCallback
import typings.antvG2.libInterfaceMod.StateOption
import typings.antvG2.libInterfaceMod.StyleCallback
import typings.antvG2.libInterfaceMod.StyleOption
import typings.antvG2.libInterfaceMod.TooltipCallback
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.BBox
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryBaseMod {
  
  @JSImport("@antv/g2/lib/geometry/base", JSImport.Default)
  @js.native
  open class default[S /* <: ShapePoint */] protected () extends Geometry[S] {
    /**
      * 创建 Geometry 实例。
      * @param cfg
      */
    def this(cfg: GeometryCfg) = this()
  }
  
  @js.native
  trait Geometry[S /* <: ShapePoint */]
    extends typings.antvG2.libBaseMod.default {
    
    /**
      * 设置数据调整方式。G2 目前内置了四种类型：
      * 1. dodge
      * 2. stack
      * 3. symmetric
      * 4. jitter
      *
      *
      * **Tip**
      * + 对于 'dodge' 类型，可以额外进行如下属性的配置:
      * ```typescript
      * geometry.adjust('dodge', {
      *   marginRatio: 0, // 取 0 到 1 范围的值（相对于每个柱子宽度），用于控制一个分组中柱子之间的间距
      *   dodgeBy: 'x', // 该属性只对 'dodge' 类型生效，声明以哪个数据字段为分组依据
      * });
      * ```
      *
      * + 对于 'stack' 类型，可以额外进行如下属性的配置:
      * ```typescript
      * geometry.adjust('stack', {
      *   reverseOrder: false, // 用于控制是否对数据进行反序操作
      * });
      * ```
      *
      * @example
      * ```typescript
      * geometry.adjust('stack');
      *
      * geometry.adjust({
      *   type: 'stack',
      *   reverseOrder: false,
      * });
      *
      * // 组合使用 adjust
      * geometry.adjust([ 'stack', 'dodge' ]);
      *
      * geometry.adjust([
      *   { type: 'stack' },
      *   { type: 'dodge', dodgeBy: 'x' },
      * ]);
      * ```
      *
      * @param adjustCfg 数据调整配置
      * @returns
      */
    def adjust(adjustCfg: String): Geometry[ShapePoint] = js.native
    def adjust(adjustCfg: js.Array[AdjustOption | String]): Geometry[ShapePoint] = js.native
    def adjust(adjustCfg: AdjustOption): Geometry[ShapePoint] = js.native
    
    /* private */ var adjustData: Any = js.native
    
    /** adjust 配置项 */
    /* protected */ var adjustOption: js.Array[AdjustOption] = js.native
    
    /**
      * 调整度量范围。主要针对发生层叠以及一些特殊需求的 Geometry，比如 Interval 下的柱状图 Y 轴默认从 0 开始。
      */
    /* protected */ def adjustScale(): Unit = js.native
    
    /* private */ var adjusts: Any = js.native
    
    def animate(cfg: Boolean): Geometry[ShapePoint] = js.native
    /**
      * Geometry 动画配置。
      *
      * + `animate(false)` 关闭动画
      * + `animate(true)` 开启动画，默认开启。
      *
      * 我们将动画分为四个场景：
      * 1. appear: 图表第一次加载时的入场动画；
      * 2. enter: 图表绘制完成，发生更新后，产生的新图形的进场动画；
      * 3. update: 图表绘制完成，数据发生变更后，有状态变更的图形的更新动画；
      * 4. leave: 图表绘制完成，数据发生变更后，被销毁图形的销毁动画。
      *
      * @example
      * ```typescript
      * animate({
      *   enter: {
      *     duration: 1000, // enter 动画执行时间
      *   },
      *   leave: false, // 关闭 leave 销毁动画
      * });
      * ```
      *
      * @param cfg 动画配置
      * @returns
      */
    def animate(cfg: AnimateOption): Geometry[ShapePoint] = js.native
    
    /** animate 配置项 */
    var animateOption: AnimateOption | Boolean = js.native
    
    /** 图形属性映射配置 */
    /* protected */ var attributeOption: Record[String, AttributeOption] = js.native
    
    /** Attribute map  */
    var attributes: Record[String, Attribute] = js.native
    
    /* private */ var beforeMapping: Any = js.native
    
    /** 存储发生图形属性映射前的数据 */
    /* protected */ var beforeMappingData: js.Array[Data] = js.native
    
    /**
      * 是否需要进行群组入场动画
      * 规则：
      * 1. 如果发生更新，则不进行
      * 2. 如果用户关闭 geometry 动画，则不进行
      * 3. 如果用户关闭了 appear 动画，则不进行
      * 4. 如果用户配置了 appear.animation，则不进行
      */
    /* private */ var canDoGroupAnimation: Any = js.native
    
    /** 画布区域，用于 label 布局。 */
    var canvasRegion: BBox = js.native
    
    /**
      * 清空当前 Geometry，配置项仍保留，但是内部创建的对象全部清空。
      * @override
      */
    def clear(): Unit = js.native
    
    /**
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      *
      * // 使用 '#1890ff' 颜色渲染图形
      * geometry.color('#1890ff');
      *
      * // 根据 x 字段的数据值进行颜色的映射，这时候 G2 会在内部调用默认的回调函数，读取默认提供的颜色进行数据值到颜色值的映射。
      * geometry.color('x');
      *
      * // 将 'x' 字段的数据值映射至指定的颜色值 colors（可以是字符串也可以是数组），此时用于通常映射分类数据
      * geometry.color('x', [ '#1890ff', '#5AD8A6' ]);
      *
      * // 使用回调函数进行颜色值的自定义；可以使用多个字段使用、*号连接
      * geometry.color('x', (xVal) => {
      *   if (xVal === 'a') {
      *     return 'red';
      *   }
      *   return 'blue';
      * });
      *
      * // 指定颜色的渐变路径，用于映射连续的数据
      * geometry.color('x', '#BAE7FF-#1890FF-#0050B3');
      * ```
      *
      * @param field 参与颜色映射的数据字段，多个字段使用 '*' 连接符进行连接。
      * @param cfg Optional, color 映射规则。
      * @returns
      */
    def color(field: String): Geometry[ShapePoint] = js.native
    def color(field: String, cfg: String): Geometry[ShapePoint] = js.native
    def color(field: String, cfg: js.Array[String]): Geometry[ShapePoint] = js.native
    def color(field: String, cfg: ColorAttrCallback): Geometry[ShapePoint] = js.native
    /**
      * 配置 color 通道映射规则。
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      * geometry.color({
      *   fields: [ 'x' ],
      *   values: [ '#1890ff', '#5AD8A6' ],
      * });
      * ```
      *
      * @param field 映射规则
      * @returns
      */
    def color(field: AttributeOption): Geometry[ShapePoint] = js.native
    
    /** 一般柱状图宽度占比 */
    /* protected */ var columnWidthRatio: Double = js.native
    
    /** 图形绘制容器。 */
    val container: IGroup = js.native
    
    /* private */ var convertPoint: Any = js.native
    
    /** Coordinate 坐标系实例。 */
    var coordinate: Coordinate = js.native
    
    /* protected */ def createAttrOption(attrName: String, field: String): Unit = js.native
    /* protected */ def createAttrOption(attrName: String, field: String, cfg: Any): Unit = js.native
    /* protected */ def createAttrOption(attrName: String, field: Double): Unit = js.native
    /* protected */ def createAttrOption(attrName: String, field: Double, cfg: Any): Unit = js.native
    /* protected */ def createAttrOption(attrName: String, field: AttributeOption): Unit = js.native
    /* protected */ def createAttrOption(attrName: String, field: AttributeOption, cfg: Any): Unit = js.native
    
    /**
      * 创建 Element 实例。
      * @param mappingDatum Element 对应的绘制数据
      * @param [isUpdate] 是否处于更新阶段
      * @returns element 返回创建的 Element 实例
      */
    /* protected */ def createElement(mappingDatum: MappingDatum, index: Double): typings.antvG2.libGeometryElementMod.default = js.native
    /* protected */ def createElement(mappingDatum: MappingDatum, index: Double, isUpdate: Boolean): typings.antvG2.libGeometryElementMod.default = js.native
    
    /**
      * 获取每个 Shape 对应的关键点数据。
      * @param obj 经过分组 -> 数字化 -> adjust 调整后的数据记录
      * @returns
      */
    /* protected */ def createShapePointsCfg(obj: Datum): S = js.native
    
    /**
      * 用于向 shape 中传入自定义的数据。目前可能仅仅可能用于在自定义 shape 的时候，像自定义 shape 中传入自定义的数据，方便实现自定义 shape 的配置能力。
      *
      * @example
      * ```ts
      * chart.interval().customInfo({ yourData: 'hello, g2!' });
      * ```
      *
      * 然后在自定义 shape 的时候，可以拿到这个信息。
      *
      * ```ts
      * registerShape('interval', 'your-shape', {
      *   draw(shapeInfo, container) {
      *     const { customInfo } = shapeInfo;
      *     console.log(customInfo); // will log { yourData: 'hello, g2!' }.
      *   }
      * });
      * ```
      *
      * @param cfg
      */
    def customInfo(cfg: Any): this.type = js.native
    
    /** custom 自定义的配置项 */
    /* protected */ var customOption: CustomOption = js.native
    
    /** 用户绘制数据。 */
    var data: Data = js.native
    
    /**
      * 存储处理后的数据，
      * + init() 及 updateData() 逻辑后, 结构为 Data[]；
      * + paint() 逻辑后，结构为 MappingDatum[][]。
      */
    var dataArray: js.Array[js.Array[MappingDatum]] = js.native
    
    /** 存储每个 shape 的默认 size，用于 Interval、Schema 几何标记 */
    /* protected */ var defaultSize: Double = js.native
    
    /** 组内间距 */
    /* protected */ var dodgePadding: Double = js.native
    
    /** Element map */
    var elements: js.Array[typings.antvG2.libGeometryElementMod.default] = js.native
    
    /** 使用 key-value 结构存储 Element，key 为每个 Element 实例对应的唯一 ID */
    var elementsMap: Record[String, typings.antvG2.libGeometryElementMod.default] = js.native
    
    /** 是否生成多个点来绘制图形。 */
    /* protected */ var generatePoints: Boolean = js.native
    
    /* private */ var generateShapePoints: Any = js.native
    
    /* private */ var geometryLabel: Any = js.native
    
    /**
      * 获取对应的 adjust 实例
      * @param adjustType
      * @returns
      */
    def getAdjust(adjustType: String): Adjust = js.native
    
    /**
      * 根据名字获取图形属性实例。
      */
    def getAttribute(name: String): Attribute = js.native
    
    /**
      * 获取该数据发生图形映射后对应的 Attribute 图形空间数据。
      * @param attr Attribute 图形属性实例。
      * @param obj 需要进行映射的原始数据。
      * @returns
      */
    def getAttributeValues(attr: Attribute, obj: Datum): js.Array[Any] = js.native
    
    /**
      * 获得 coordinate 实例
      * @returns
      */
    def getCoordinate(): Coordinate = js.native
    
    def getData(): Data = js.native
    
    /** 获取图形属性默认的映射值。 */
    def getDefaultValue(attrName: String): Any = js.native
    
    /**
      * 获取每条数据对应的图形绘制数据。
      * @param mappingDatum 映射后的数据
      * @returns draw cfg
      */
    /* protected */ def getDrawCfg(mappingDatum: MappingDatum): ShapeInfo = js.native
    
    def getElementId(data: js.Array[MappingDatum]): Any = js.native
    /**
      * 获取数据对应的唯一 id。
      * @param data Element 对应的绘制数据
      * @returns
      */
    def getElementId(data: MappingDatum): Any = js.native
    
    /**
      * 获取 Geometry 的所有 Elements。
      *
      * ```typescript
      * getElements();
      * ```
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
      * 获得所有的字段
      */
    def getFields(): js.Array[Any] = js.native
    
    /**
      * 获取决定分组的图形属性实例。
      */
    def getGroupAttributes(): js.Array[Attribute] = js.native
    
    /**
      * 获取当前配置中的所有分组 & 分类的字段。
      * @return fields string[]
      */
    def getGroupFields(): js.Array[String] = js.native
    
    /**
      * 获取决定分组的图形属性对应的 scale 实例。
      * @returns
      */
    def getGroupScales(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /**
      * 获取渲染的 label 类型。
      */
    /* protected */ def getLabelType(): String = js.native
    
    /**
      * 获取虚拟 Group。
      * @returns
      */
    def getOffscreenGroup(): IGroup = js.native
    
    /**
      * 获取所有需要创建 scale 的字段名称。
      */
    def getScaleFields(): js.Array[String] = js.native
    
    /**
      * 获取当前 Geometry 对应的 Shape 工厂实例。
      */
    /* protected */ def getShapeFactory(): ShapeFactory = js.native
    
    /**
      * 获取 shape 对应的 marker 样式。
      * @param shapeName shape 具体名字
      * @param cfg marker 信息
      * @returns
      */
    def getShapeMarker(shapeName: String, cfg: ShapeMarkerCfg): ShapeMarkerAttrs = js.native
    
    /**
      * 获取该 Geometry 下所有生成的 shapes。
      * @returns shapes
      */
    def getShapes(): js.Array[IShape | IGroup] = js.native
    
    /* private */ var getStyleCfg: Any = js.native
    
    /**
      * x 字段
      * @returns
      */
    def getXField(): String = js.native
    
    /** 获取 x 轴对应的 scale 实例。 */
    def getXScale(): Any = js.native
    
    /**
      * 获得图形的 x y 字段。
      */
    def getXYFields(): js.Array[String] = js.native
    
    /**
      * y 字段
      * @returns
      */
    def getYField(): String = js.native
    
    /**
      * 获取 Y 轴上的最小值。
      */
    /* protected */ def getYMinValue(): Double = js.native
    
    /** 获取 y 轴对应的 scale 实例。 */
    def getYScale(): Any = js.native
    
    /* private */ var groupData: Any = js.native
    
    /* private */ var groupScales: Any = js.native
    
    /* private */ var hasSorted: Any = js.native
    
    /* private */ var idFields: Any = js.native
    
    /**
      * 初始化 Geomtry 实例：
      * 创建 [[Attribute]] and [[Scale]] 实例，进行数据处理，包括分组、数值化以及数据调整。
      */
    def init(): Unit = js.native
    def init(cfg: InitCfg): Unit = js.native
    
    /* protected */ def initAttributes(): Unit = js.native
    
    /** 组间距 */
    /* protected */ var intervalPadding: Double = js.native
    
    /* protected */ var isCoordinateChanged: Boolean = js.native
    
    def label(field: String): Geometry[ShapePoint] = js.native
    def label(field: String, secondParam: GeometryLabelCfg): Geometry[ShapePoint] = js.native
    def label(field: String, secondParam: LabelCallback): Geometry[ShapePoint] = js.native
    def label(field: String, secondParam: LabelCallback, thirdParam: GeometryLabelCfg): Geometry[ShapePoint] = js.native
    /**
      * Geometry label 配置。
      *
      * @example
      * ```ts
      * // data: [ {x: 1, y: 2, z: 'a'}, {x: 2, y: 2, z: 'b'} ]
      * // 在每个图形上显示 z 字段对应的数值
      * label({
      *   fields: [ 'z' ]
      * });
      *
      * label(false); // 不展示 label
      *
      * // 在每个图形上显示 x 字段对应的数值，同时配置文本颜色为红色
      * label('x', {
      *   style: {
      *     fill: 'red',
      *   },
      * })
      *
      * // 以 type 类型的 label 渲染每个图形上显示 x 字段对应的数值，同时格式化文本内容
      * label('x', (xValue) => {
      *   return {
      *     content: xValue + '%',
      *   };
      * }, {
      *   type: 'base' // 声明 label 类型
      * })
      * ```
      *
      * @param field
      * @returns label
      */
    def label(field: LabelOption): Geometry[ShapePoint] = js.native
    
    /** 存储 label 配置信息。 */
    var labelOption: LabelOption | `false` = js.native
    
    @JSName("label")
    def label_false(field: `false`): Geometry[ShapePoint] = js.native
    
    /** label 绘制容器。 */
    val labelsContainer: IGroup = js.native
    
    /* private */ var lastAttributeOption: Any = js.native
    
    /** 存储上一次渲染时的 element 映射表，用于更新逻辑 */
    /* protected */ var lastElementsMap: Record[String, typings.antvG2.libGeometryElementMod.default] = js.native
    
    /* private */ var mapping: Any = js.native
    
    /** 柱状图最大宽度 */
    /* protected */ var maxColumnWidth: Double = js.native
    
    /** 柱状图最小宽度 */
    /* protected */ var minColumnWidth: Double = js.native
    
    /** 多层饼图/环图占比 */
    /* protected */ var multiplePieWidthRatio: Double = js.native
    
    /* private */ var normalizeValues: Any = js.native
    
    /** 虚拟 Group，用于图形更新 */
    /* private */ var offscreenGroup: Any = js.native
    
    /**
      * 将原始数据映射至图形空间，同时创建图形对象。
      */
    def paint(): Unit = js.native
    def paint(isUpdate: Boolean): Unit = js.native
    
    /**
      * 配置 position 通道映射规则。
      *
      * @example
      * ```typescript
      * // 数据结构: [{ x: 'A', y: 10, color: 'red' }]
      * geometry.position('x*y');
      * geometry.position([ 'x', 'y' ]);
      * geometry.position({
      *   fields: [ 'x', 'y' ],
      * });
      * ```
      *
      * @param cfg 映射规则
      * @returns
      */
    def position(cfg: String): Geometry[ShapePoint] = js.native
    def position(cfg: js.Array[String]): Geometry[ShapePoint] = js.native
    def position(cfg: AttributeOption): Geometry[ShapePoint] = js.native
    
    /* private */ var processData: Any = js.native
    
    /* private */ var renderLabels: Any = js.native
    
    /** 玫瑰图占比 */
    /* protected */ var roseWidthRatio: Double = js.native
    
    /** scale 定义，需要外部传入。 */
    var scaleDefs: Record[String, ScaleOption] = js.native
    
    /** 存储 geometry 需要的 scales，需要外部传入。 */
    var scales: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /* private */ var setCfg: Any = js.native
    
    /**
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      *
      * // 指定常量，将所有数据值映射到固定的 shape
      * geometry.shape('circle');
      *
      * // 将指定的字段映射到内置的 shapes 数组中
      * geometry.shape('x');
      *
      * // 将指定的字段映射到指定的 shapes 数组中
      * geometry.shape('x', [ 'circle', 'diamond', 'square' ]);
      *
      * // 使用回调函数获取 shape，用于个性化的 shape 定制，可以根据单个或者多个字段确定
      * geometry.shape('x', (xVal) => {
      *   if (xVal === 'a') {
      *     return 'circle';
      *   }
      *   return 'diamond';
      * });
      * ```
      *
      * @param field 参与 shape 映射的数据字段，多个字段使用 '*' 连接符进行连接。
      * @param cfg Optional, shape 映射规则。
      * @returns
      */
    def shape(field: String): Geometry[ShapePoint] = js.native
    def shape(field: String, cfg: js.Array[String]): Geometry[ShapePoint] = js.native
    def shape(field: String, cfg: ShapeAttrCallback): Geometry[ShapePoint] = js.native
    /**
      * 配置 shape 通道映射规则。
      *
      * @example
      *
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      * geometry.shape({
      *   fields: [ 'x' ],
      * });
      * ```
      *
      * @param field 映射规则配置。
      * @returns
      */
    def shape(field: AttributeOption): Geometry[ShapePoint] = js.native
    
    /** 每个 Geometry 对应的 Shape 工厂实例，用于创建各个 Shape */
    /* protected */ var shapeFactory: ShapeFactory = js.native
    
    /** ShapeFactory 对应的类型。 */
    val shapeType: String = js.native
    
    def size(field: String): Geometry[ShapePoint] = js.native
    def size(field: String, cfg: js.Tuple2[Double, Double]): Geometry[ShapePoint] = js.native
    def size(field: String, cfg: SizeAttrCallback): Geometry[ShapePoint] = js.native
    /**
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      *
      * // 直接指定像素大小
      * geometry.size(10);
      *
      * // 指定映射到 size 的字段，使用内置的默认大小范围为 [1, 10]
      * geometry.size('x');
      *
      * // 指定映射到 size 字段外，还提供了 size 的最大值和最小值范围
      * geometry.size('x', [ 5, 30 ]);
      *
      * // 使用回调函数映射 size，用于个性化的 size 定制，可以使用多个字段进行映射
      * geometry.size('x', (xVal) => {
      *   if (xVal === 'a') {
      *     return 10;
      *   }
      *   return 5;
      * });
      * ```
      *
      * @param field 参与 size 映射的数据字段，多个字段使用 '*' 连接符进行连接。
      * @param cfg Optional, size 映射规则
      * @returns
      */
    def size(field: Double): Geometry[ShapePoint] = js.native
    def size(field: Double, cfg: js.Tuple2[Double, Double]): Geometry[ShapePoint] = js.native
    def size(field: Double, cfg: SizeAttrCallback): Geometry[ShapePoint] = js.native
    /**
      * 配置 size 通道映射规则。
      *
      * @example
      * ```typescript
      * // data: [{ x: 'A', y: 10, color: 'red' }, { x: 'B', y: 30, color: 'yellow' }]
      * geometry.size({
      *   values: [ 10 ],
      * })
      * ```
      *
      * @param field 映射规则。
      * @returns
      */
    def size(field: AttributeOption): Geometry[ShapePoint] = js.native
    
    def sort(mappingArray: js.Array[Data]): Unit = js.native
    
    /** 是否需要对 zIndex 进行 sort。因为耗时长，由具体场景自行决定 */
    var sortZIndex: js.UndefOr[Boolean] = js.native
    
    /** 是否对数据进行排序，默认为 false。  */
    var sortable: Boolean = js.native
    
    /**
      * 设置状态对应的样式。
      *
      * @example
      * ```ts
      * chart.interval().state({
      *   selected: {
      *     animate: { duration: 100, easing: 'easeLinear' },
      *     style: {
      *       lineWidth: 2,
      *       stroke: '#000',
      *     },
      *   },
      * });
      * ```
      *
      * 如果图形 shape 是由多个 shape 组成，即为一个 G.Group 对象，那么针对 group 中的每个 shape，我们需要使用下列方式进行状态样式设置：
      * 如果我们为 group 中的每个 shape 设置了 'name' 属性(shape.set('name', 'xx'))，则以 'name' 作为 key，否则默认以索引值（即 shape 的 添加顺序）为 key。
      *
      * ```ts
      * chart.interval().shape('groupShape').state({
      *   selected: {
      *     style: {
      *       0: { lineWidth: 2 },
      *       1: { fillOpacity: 1 },
      *     }
      *   }
      * });
      * ```
      *
      * @param cfg 状态样式
      */
    def state(cfg: StateOption): this.type = js.native
    
    /** 状态量相关的配置项 */
    var stateOption: StateOption = js.native
    
    /**
      * @example
      * ```typescript
      * style('x*y', (xVal, yVal) => {
      *   const style = { lineWidth: 2, stroke: '#1890ff' };
      *   if (xVal === 'a') {
      *     style.lineDash = [ 2, 2 ];
      *   }
      *   return style;
      * });
      * ```
      *
      * @param field 数据字段或者样式配置规则。
      * @param styleFunc Optional, 样式配置回调函数。
      * @returns
      */
    def style(field: String, styleFunc: StyleCallback): Geometry[ShapePoint] = js.native
    def style(field: LooseObject): Geometry[ShapePoint] = js.native
    /**
      * 图形样式配置。
      *
      * @example
      * ```typescript
      * // 配置图形样式
      * style({
      *   lineWidth: 2,
      *   stroke: '#1890ff',
      * });
      *
      * // 根据具体的数据进行详细配置
      * style({
      *   fields: [ 'x', 'y' ], // 数据字段
      *   callback: (xVal, yVal) => {
      *     const style = { lineWidth: 2, stroke: '#1890ff' };
      *     if (xVal === 'a') {
      *       style.lineDash = [ 2, 2 ];
      *     }
      *     return style;
      *   },
      * });
      * ```
      *
      * @param field 配置样式属性或者样式规则。
      * @returns
      */
    def style(field: StyleOption): Geometry[ShapePoint] = js.native
    
    /** style 配置项 */
    /* protected */ var styleOption: StyleOption = js.native
    
    /** 当前 Geometry 实例主题。  */
    var theme: LooseObject = js.native
    
    /**
      * @example
      * ```typescript
      * // data: [{x: 'a', y: 10}]
      *
      * // 等同于 tooltip({ fields: [ 'x' ] })
      * tooltip('x');
      *
      * // 等同于 tooltip({ fields: [ 'x', 'y' ] })
      * tooltip('x*y');
      *
      * // 等同于 tooltip({ fields: [ 'x', 'y' ], callback: (x, y) => { x, y } })
      * tooltip('x*y', (x, y) => {
      *   return {
      *     x,
      *     y,
      *   };
      * });
      * ```
      *
      * @param field 参与映射的字段。
      * @param cfg Optional, 回调函数
      * @returns
      */
    def tooltip(field: String): Geometry[ShapePoint] = js.native
    def tooltip(field: String, cfg: TooltipCallback): Geometry[ShapePoint] = js.native
    def tooltip(field: Boolean): Geometry[ShapePoint] = js.native
    /**
      * 配置 Geometry 显示的 tooltip 内容。
      *
      * `tooltip(false)` 代表关闭 tooltip。
      * `tooltip(true)` 代表开启 tooltip。
      *
      * Geometry 默认允许 tooltip 展示，我们可以使用以下方法对 tooltip 的展示内容进行配置：
      *
      * @example
      * ```typescript
      * // data: [{x: 'a', y: 10}]
      * tooltip({
      *   fields: [ 'x' ],
      * });
      * ```
      * ![](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*268uQ50if60AAAAAAAAAAABkARQnAQ)
      *
      * ```typescript
      * tooltip({
      *   fields: [ 'x', 'y' ],
      * });
      * ```
      * ![](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*A_ujSa8QhtcAAAAAAAAAAABkARQnAQ)
      *
      * tooltip() 方法同样支持数据映射及回调用法：
      *
      * @example
      * ```typescript
      * chart.tooltip({
      *   itemTpl: '<li>{x}: {y}</li>',
      * });
      *
      * chart.line()
      *   .position('x*y')
      *   .tooltip({
      *     fields: [ 'x', 'y' ],
      *     callback: (x, y) => {
      *       return {
      *         x,
      *         y,
      *       };
      *     },
      *   });
      * ```
      *
      * 其返回的值必须为对象，该值中的属性同 chart.tooltip() 的 itemTpl 模板相对应，返回的变量可用于 itemTpl 的字符串模板。
      *
      * @param field tooltip 配置信息。
      * @returns
      */
    def tooltip(field: GeometryTooltipOption): Geometry[ShapePoint] = js.native
    
    /** 存储 tooltip 配置信息。 */
    var tooltipOption: GeometryTooltipOption | Boolean = js.native
    
    /** Geometry 几何标记类型。 */
    val `type`: String = js.native
    
    /**
      * Geometry 更新。
      * @param [cfg] 更新的配置
      */
    def update(): Unit = js.native
    def update(cfg: InitCfg): Unit = js.native
    
    /* protected */ def updateElements(mappingDataArray: js.Array[js.Array[MappingDatum]]): Unit = js.native
    /* protected */ def updateElements(mappingDataArray: js.Array[js.Array[MappingDatum]], isUpdate: Boolean): Unit = js.native
    
    /* private */ var updateStackRange: Any = js.native
    
    /* protected */ var useDeferredLabel: js.UndefOr[Null | Double] = js.native
    
    /* private */ var userTheme: Any = js.native
    
    /** elements 的 zIndex 默认按顺序提升，通过 zIndexReversed 可以反序，从而数据越前，层级越高 */
    var zIndexReversed: js.UndefOr[Boolean] = js.native
  }
  
  trait GeometryCfg extends StObject {
    
    /** 默认宽度占比，interval类型和schema类型通用 */
    var columnWidthRatio: js.UndefOr[Double] = js.undefined
    
    /** Geometry shape 的容器。 */
    var container: IGroup
    
    /** 绘制的坐标系对象。 */
    var coordinate: js.UndefOr[Coordinate] = js.undefined
    
    /** 绘制数据。 */
    var data: js.UndefOr[Data] = js.undefined
    
    /** 组内间距 */
    var dodgePadding: js.UndefOr[Double] = js.undefined
    
    /** 组间距 */
    var intervalPadding: js.UndefOr[Double] = js.undefined
    
    /** Geometry labels 的容器 */
    var labelsContainer: js.UndefOr[IGroup] = js.undefined
    
    /** 柱状图最大宽度 */
    var maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    /** 柱状图最小宽度 */
    var minColumnWidth: js.UndefOr[Double] = js.undefined
    
    /** 多层饼图/环图占比 */
    var multiplePieWidthRatio: js.UndefOr[Double] = js.undefined
    
    /** 玫瑰图占比 */
    var roseWidthRatio: js.UndefOr[Double] = js.undefined
    
    /** 列定义 */
    var scaleDefs: js.UndefOr[Record[String, ScaleOption]] = js.undefined
    
    /** 需要的 scales。 */
    var scales: js.UndefOr[
        Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ]
      ] = js.undefined
    
    /** 是否需要对 zIndex 进行 sort。因为耗时长，由具体场景自行决定 */
    var sortZIndex: js.UndefOr[Boolean] = js.undefined
    
    /** 是否对数据进行排序 */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** 主题配置 */
    var theme: js.UndefOr[LooseObject] = js.undefined
    
    /** 延迟渲染 Geometry 数据标签. 设置为 true 时，会在浏览器空闲时期被调用, 也可以指定具体 timeout 时间 */
    var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
    
    /** 是否可见 */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** elements 的 zIndex 默认按顺序提升，通过 zIndexReversed 可以反序，从而数据越前，层级越高 */
    var zIndexReversed: js.UndefOr[Boolean] = js.undefined
  }
  object GeometryCfg {
    
    inline def apply(container: IGroup): GeometryCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryCfg]
    }
    
    extension [Self <: GeometryCfg](x: Self) {
      
      inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
      
      inline def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
      
      inline def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
      
      inline def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
      
      inline def setLabelsContainer(value: IGroup): Self = StObject.set(x, "labelsContainer", value.asInstanceOf[js.Any])
      
      inline def setLabelsContainerUndefined: Self = StObject.set(x, "labelsContainer", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      inline def setMultiplePieWidthRatio(value: Double): Self = StObject.set(x, "multiplePieWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setMultiplePieWidthRatioUndefined: Self = StObject.set(x, "multiplePieWidthRatio", js.undefined)
      
      inline def setRoseWidthRatio(value: Double): Self = StObject.set(x, "roseWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setRoseWidthRatioUndefined: Self = StObject.set(x, "roseWidthRatio", js.undefined)
      
      inline def setScaleDefs(value: Record[String, ScaleOption]): Self = StObject.set(x, "scaleDefs", value.asInstanceOf[js.Any])
      
      inline def setScaleDefsUndefined: Self = StObject.set(x, "scaleDefs", js.undefined)
      
      inline def setScales(
        value: Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]
      ): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setSortZIndex(value: Boolean): Self = StObject.set(x, "sortZIndex", value.asInstanceOf[js.Any])
      
      inline def setSortZIndexUndefined: Self = StObject.set(x, "sortZIndex", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setTheme(value: LooseObject): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
      
      inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndexReversed(value: Boolean): Self = StObject.set(x, "zIndexReversed", value.asInstanceOf[js.Any])
      
      inline def setZIndexReversedUndefined: Self = StObject.set(x, "zIndexReversed", js.undefined)
    }
  }
  
  trait InitCfg extends StObject {
    
    /** 坐标系 */
    var coordinate: js.UndefOr[Coordinate] = js.undefined
    
    /** 数据 */
    var data: js.UndefOr[Data] = js.undefined
    
    var isCoordinateChanged: js.UndefOr[Boolean] = js.undefined
    
    /** 因为数据使用的引用，所以需要有一个标识位标识数据是否发生了更新 */
    var isDataChanged: js.UndefOr[Boolean] = js.undefined
    
    /** 列定义 */
    var scaleDefs: js.UndefOr[Record[String, ScaleOption]] = js.undefined
    
    /** 主题对象 */
    var theme: js.UndefOr[LooseObject] = js.undefined
  }
  object InitCfg {
    
    inline def apply(): InitCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitCfg]
    }
    
    extension [Self <: InitCfg](x: Self) {
      
      inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIsCoordinateChanged(value: Boolean): Self = StObject.set(x, "isCoordinateChanged", value.asInstanceOf[js.Any])
      
      inline def setIsCoordinateChangedUndefined: Self = StObject.set(x, "isCoordinateChanged", js.undefined)
      
      inline def setIsDataChanged(value: Boolean): Self = StObject.set(x, "isDataChanged", value.asInstanceOf[js.Any])
      
      inline def setIsDataChangedUndefined: Self = StObject.set(x, "isDataChanged", js.undefined)
      
      inline def setScaleDefs(value: Record[String, ScaleOption]): Self = StObject.set(x, "scaleDefs", value.asInstanceOf[js.Any])
      
      inline def setScaleDefsUndefined: Self = StObject.set(x, "scaleDefs", js.undefined)
      
      inline def setTheme(value: LooseObject): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
