package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.antvComponent.libTypesMod.ContinueLegendHandlerCfg
import typings.antvComponent.libTypesMod.ContinueLegendLabelCfg
import typings.antvComponent.libTypesMod.ContinueLegendRailCfg
import typings.antvComponent.libTypesMod.ContinueLegendTrackCfg
import typings.antvComponent.libTypesMod.LegendBackgroundCfg
import typings.antvComponent.libTypesMod.LegendItemNameCfg
import typings.antvComponent.libTypesMod.LegendItemValueCfg
import typings.antvComponent.libTypesMod.LegendPageNavigatorCfg
import typings.antvComponent.libTypesMod.LegendRadio
import typings.antvG2.anon.namestringvaluestringMark
import typings.antvG2.antvG2Strings.`bottom-left`
import typings.antvG2.antvG2Strings.`bottom-right`
import typings.antvG2.antvG2Strings.`left-bottom`
import typings.antvG2.antvG2Strings.`left-top`
import typings.antvG2.antvG2Strings.`right-bottom`
import typings.antvG2.antvG2Strings.`right-top`
import typings.antvG2.antvG2Strings.`top-left`
import typings.antvG2.antvG2Strings.`top-right`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.horizontal
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.antvG2Strings.vertical
import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@antv/g2.@antv/g2/lib/dependents.CategoryLegendCfg, 'marker'> */
trait LegendCfg extends StObject {
  
  var LocationType: js.UndefOr[String] = js.undefined
  
  /**
    * @title 动画开关，默认关闭。
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 动画
    * @description 动画参数配置，当且仅当 `animate` 属性为 true，即动画开启时生效。
    */
  var animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
  
  /**
    * @title 背景框配置项。
    * @example
    * 属性结构如下：
    *
    * ```ts
    * {
    *   padding?: number | number[]; // 背景的留白
    *   style?: ShapeAttrs;          // 背景样式配置项
    * }
    * ```
    *
    * 详见 {@link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L652|LegendBackgroundCfg}
    */
  var background: js.UndefOr[LegendBackgroundCfg] = js.undefined
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var container: IGroup
  
  /**
    * @title 是否为自定义图例
    * @description 当该属性为 true 时，需要声明 items 属性。
    */
  val custom: js.UndefOr[Boolean] = js.undefined
  
  var defaultCfg: js.UndefOr[js.Object] = js.undefined
  
  var events: js.UndefOr[js.Object] = js.undefined
  
  var flipNavigation: js.UndefOr[LegendPageNavigatorCfg] = js.undefined
  
  /**
    * @title 是否进行分页
    * @description **适用于分类图例**，当图例项过多时是否进行分页。
    */
  var flipPage: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[IGroup] = js.undefined
  
  /**
    * @title 滑块
    * @description
    * **连续图例适用**，滑块的配置项。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   size?: number; // 滑块的大小
    *   style?: ShapeAttrs; // 滑块的样式设置
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L582|ContinueLegendTrackCfg
    */
  var handler: js.UndefOr[ContinueLegendHandlerCfg] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @title 图例项的高度
    * @description **分类图例适用**，图例的高度，默认为 null。
    */
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 垂直间距
    * @description **分类图例适用**，控制图例项垂直方向的间距。
    */
  var itemMarginBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例项 name
    * @description
    * **分类图例适用**，图例项 name 文本的配置。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   spacing?: number; // 图例项 name 同后面 value 的间距
    *   formatter?: (text: string, item: ListItem, index: number) => any; // 格式化文本函数
    *   style?: ShapeAttrs; // 文本配置项
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L665|LegendItemNameCfg
    */
  var itemName: js.UndefOr[LegendItemNameCfg] = js.undefined
  
  /**
    * @title 水平间距
    * @description **分类图例适用**，控制图例项水平方向的间距。
    */
  var itemSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例项 value
    * @description
    * **分类图例适用**，图例项 value 附加值的配置项。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   alignRight?: boolean; // 是否右对齐，默认为 false，仅当设置图例项宽度时生效
    *   formatter?: (text: string, item: ListItem, index: number) => any; // 格式化文本函数
    *   style?: ShapeAttrs; // 图例项附加值的配置
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L685|LegendItemValueCfg
    */
  var itemValue: js.UndefOr[LegendItemValueCfg] = js.undefined
  
  /**
    * @title 图例项的宽度
    * @description **分类图例适用**，图例项的宽度, 默认为 null，自动计算。
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例项
    * @description **分类图例适用**，用户自己配置图例项的内容。
    */
  var items: js.UndefOr[js.Array[LegendItem]] = js.undefined
  
  /**
    * @title 文本
    * @description
    * **连续图例适用**，文本的配置项。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   // 文本同滑轨的对齐方式，有五种类型
    *   // rail ： 同滑轨对齐，在滑轨的两端
    *   // top, bottom: 图例水平布局时有效
    *   // left, right: 图例垂直布局时有效
    *   align?: string;
    *   spacing?: number; // 文本同滑轨的距离
    *   style?: ShapeAttrs; // 文本样式
    * }
    * ```
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L618|ContinueLegendLabelCfg
    */
  var label: js.UndefOr[ContinueLegendLabelCfg] = js.undefined
  
  /**
    * @title 布局
    * @description 布局方式： horizontal，vertical
    */
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * @title 图例项的 marker
    * @description **分类图例适用**，图例项的 marker 图标的配置。
    */
  var marker: js.UndefOr[
    MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
  ] = js.undefined
  
  /**
    * @title 最大
    * @description **连续图例适用**，选择范围的最大值。
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最大高度
    * @description **分类图例适用**，图例项最大高度设置。
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最大高度比例
    * @description **分类图例适用**，图例项最大高度比例（以 view 的 bbox 高度为参照，默认 0.25）。
    */
  var maxHeightRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例项的最大宽度
    * @description
    * **分类图例适用**，图例项的最大宽度，超出则自动缩略。
    * `maxItemWidth` 可以是像素值；
    * 也可以是相对值（取 0 到 1 范围的数值），代表占图表宽度的多少
    */
  var maxItemWidth: js.UndefOr[Double] = js.undefined
  
  var maxRow: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最大宽度
    * @description **分类图例适用**，图例项最大宽度设置。
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最大宽度比例
    * @description **分类图例适用**，图例项最大宽度比例（以 view 的 bbox 宽度为参照，默认 0.25）。
    */
  var maxWidthRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最小值
    * @description **连续图例适用**，选择范围的最小值。
    */
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @title 图例 x 方向的偏移。
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例 y 方向的偏移。
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 图例在四个方向的偏移量
    */
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @title 分页器的样式
    * @description **适用于分类图例**，图例分页器的样式设置。
    */
  var pageNavigator: js.UndefOr[LegendPageNavigatorCfg] = js.undefined
  
  /**
    * @title 图例的位置。
    */
  var position: js.UndefOr[
    top | `top-left` | `top-right` | right | `right-top` | `right-bottom` | left | `left-top` | `left-bottom` | bottom | `bottom-left` | `bottom-right`
  ] = js.undefined
  
  /**
    * @title 反选
    * @description **分类图里适用**，用来配置正反选功能
    */
  var radio: js.UndefOr[LegendRadio] = js.undefined
  
  /**
    * @title 滑轨（背景
    * @description
    * **连续图例适用**，图例滑轨（背景）的样式配置项。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   type?: string; // rail 的类型，color, size
    *   size?: number; // 滑轨的宽度
    *   defaultLength?: number; // 滑轨的默认长度，，当限制了 maxWidth,maxHeight 时，不会使用这个属性会自动计算长度
    *   style?: ShapeAttrs; // 滑轨的样式
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L595|ContinueLegendRailCfg
    */
  var rail: js.UndefOr[ContinueLegendRailCfg] = js.undefined
  
  /**
    * @title 是否逆序
    * @description **分类图例适用**，是否将图例项逆序展示。
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 图例高亮状态，false 表示默认置灰，无或 true 表示高亮
    */
  var selected: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  /**
    * @title 是否可滑动
    * @description **连续图例适用**，滑块是否可以滑动。
    */
  var slidable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 图例标题配置
    * @description 默认不展示。
    * @example
    * 属性结构如下：
    *
    * ```ts
    * {
    *   spacing?: number;    // 标题同图例项的间距
    *   style?: ShapeAttrs;  // 文本样式配置项
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L639|LegendTitleCfg
    */
  var title: js.UndefOr[G2LegendTitleCfg] = js.undefined
  
  /**
    * @title 色块样式
    * @description
    * **连续图例适用**，选择范围的色块样式配置项。
    * 属性结构如下：
    *
    * ```ts
    * {
    *   style?: ShapeAttrs; // 选定范围的样式
    * }
    * ```
    *
    * @link https://github.com/antvis/component/blob/81890719a431b3f9088e0c31c4d5d382ef0089df/src/types.ts#L574|ContinueLegendTrackCfg
    */
  var track: js.UndefOr[ContinueLegendTrackCfg] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var updateAutoRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title value
    * @description **连续图例适用**，选择的值。
    */
  var value: js.UndefOr[js.Array[Double]] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object LegendCfg {
  
  inline def apply(container: IGroup): LegendCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendCfg] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
    
    inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackground(value: LegendBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDefaultCfg(value: js.Object): Self = StObject.set(x, "defaultCfg", value.asInstanceOf[js.Any])
    
    inline def setDefaultCfgUndefined: Self = StObject.set(x, "defaultCfg", js.undefined)
    
    inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFlipNavigation(value: LegendPageNavigatorCfg): Self = StObject.set(x, "flipNavigation", value.asInstanceOf[js.Any])
    
    inline def setFlipNavigationUndefined: Self = StObject.set(x, "flipNavigation", js.undefined)
    
    inline def setFlipPage(value: Boolean): Self = StObject.set(x, "flipPage", value.asInstanceOf[js.Any])
    
    inline def setFlipPageUndefined: Self = StObject.set(x, "flipPage", js.undefined)
    
    inline def setGroup(value: IGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandler(value: ContinueLegendHandlerCfg): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setItemMarginBottom(value: Double): Self = StObject.set(x, "itemMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setItemMarginBottomUndefined: Self = StObject.set(x, "itemMarginBottom", js.undefined)
    
    inline def setItemName(value: LegendItemNameCfg): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
    
    inline def setItemSpacing(value: Double): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    inline def setItemValue(value: LegendItemValueCfg): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    inline def setItemValueUndefined: Self = StObject.set(x, "itemValue", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    inline def setItems(value: js.Array[LegendItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LegendItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: ContinueLegendLabelCfg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "LocationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "LocationType", js.undefined)
    
    inline def setMarker(
      value: MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
    ): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerFunction3(value: (/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark) => MarkerCfg): Self = StObject.set(x, "marker", js.Any.fromFunction3(value))
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightRatio(value: Double): Self = StObject.set(x, "maxHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightRatioUndefined: Self = StObject.set(x, "maxHeightRatio", js.undefined)
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxItemWidth(value: Double): Self = StObject.set(x, "maxItemWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxItemWidthUndefined: Self = StObject.set(x, "maxItemWidth", js.undefined)
    
    inline def setMaxRow(value: Double): Self = StObject.set(x, "maxRow", value.asInstanceOf[js.Any])
    
    inline def setMaxRowUndefined: Self = StObject.set(x, "maxRow", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthRatio(value: Double): Self = StObject.set(x, "maxWidthRatio", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthRatioUndefined: Self = StObject.set(x, "maxWidthRatio", js.undefined)
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPageNavigator(value: LegendPageNavigatorCfg): Self = StObject.set(x, "pageNavigator", value.asInstanceOf[js.Any])
    
    inline def setPageNavigatorUndefined: Self = StObject.set(x, "pageNavigator", js.undefined)
    
    inline def setPosition(
      value: top | `top-left` | `top-right` | right | `right-top` | `right-bottom` | left | `left-top` | `left-bottom` | bottom | `bottom-left` | `bottom-right`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRadio(value: LegendRadio): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setRail(value: ContinueLegendRailCfg): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    inline def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setSelected(value: StringDictionary[Boolean]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSlidable(value: Boolean): Self = StObject.set(x, "slidable", value.asInstanceOf[js.Any])
    
    inline def setSlidableUndefined: Self = StObject.set(x, "slidable", js.undefined)
    
    inline def setTitle(value: G2LegendTitleCfg): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrack(value: ContinueLegendTrackCfg): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateAutoRender(value: Boolean): Self = StObject.set(x, "updateAutoRender", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoRenderUndefined: Self = StObject.set(x, "updateAutoRender", js.undefined)
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
