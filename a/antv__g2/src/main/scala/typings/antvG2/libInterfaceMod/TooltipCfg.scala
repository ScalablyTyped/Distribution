package typings.antvG2.libInterfaceMod

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipCfg extends StObject {
  
  /**
    * @title 自定义 tooltip 的容器。
    */
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  /**
    * @title 图例容器的模板
    * @description 用于指定图例容器的模板，自定义模板时必须包含各个 dom 节点的 class。
    */
  var containerTpl: js.UndefOr[String] = js.undefined
  
  /**
    * @title 交叉线
    * @description 配置 tooltip 的 crosshairs，当且仅当 `showCrosshairs` 为 true 时生效。
    */
  var crosshairs: js.UndefOr[TooltipCrosshairs] = js.undefined
  
  /**
    * @title 自定义模板
    */
  var customContent: js.UndefOr[js.Function2[/* title */ String, /* data */ js.Array[Any], String | HTMLElement]] = js.undefined
  
  /**
    * @description 在 tooltip 渲染之前，对最终的 items 进行自定义处理（比如排序、过滤、格式化等）
    */
  var customItems: js.UndefOr[js.Function1[/* originalItems */ js.Array[TooltipItem], js.Array[TooltipItem]]] = js.undefined
  
  /**
    * @title dom 样式
    * @description 传入各个 dom 的样式。
    */
  var domStyles: js.UndefOr[TooltipDomStyles] = js.undefined
  
  /**
    * @title tooltip 是否允许鼠标滑入
    * @default false
    */
  var enterable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 设置 tooltip 内容框是否跟随鼠标移动。
    * @description 默认为 true，跟随鼠标移动，false 则固定位置不随鼠标移动。
    * @default true
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 默认模板
    * @description 每项记录的默认模板，自定义模板时必须包含各个 dom 节点的 class。
    */
  var itemTpl: js.UndefOr[String] = js.undefined
  
  /**
    * @title tooltipMarker 的样式配置。
    */
  var marker: js.UndefOr[js.Object] = js.undefined
  
  /**
    * @title tooltip 偏移量。
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 设置 tooltip 的固定展示位置，相对于数据点。
    */
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  
  /**
    * @title 是否将 tooltip items 逆序
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否合并当前点对应的所有数据
    * @description true 表示合并当前点对应的所有数据并展示，false 表示只展示离当前点最逼近的数据内容。
    */
  var shared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否展示 tooltip 内容框
    */
  var showContent: js.UndefOr[Boolean | (js.Function1[/* datum */ Datum, Boolean])] = js.undefined
  
  /**
    * @title 是否展示 crosshairs。
    */
  var showCrosshairs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title tooltip 显示延迟（ms）
    * @description 默认为 16ms，建议在 enterable = true 的时候才设置
    * @default "16ms"
    */
  var showDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 是否渲染 tooltipMarkers。
    */
  var showMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否显示空值的 tooltip 项目
    */
  var showNil: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 是否展示 tooltip 标题。
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 标题
    * @description
    * 设置 tooltip 的标题内容：如果值为数据字段名，则会展示数据中对应该字段的数值，如果数据中不存在该字段，则直接展示 title 值。
    * 同时支持传入方法，回调的方式返回字符串
    */
  var title: js.UndefOr[TooltipTitle] = js.undefined
}
object TooltipCfg {
  
  inline def apply(): TooltipCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipCfg] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCrosshairs(value: TooltipCrosshairs): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    inline def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    inline def setCustomContent(value: (/* title */ String, /* data */ js.Array[Any]) => String | HTMLElement): Self = StObject.set(x, "customContent", js.Any.fromFunction2(value))
    
    inline def setCustomContentUndefined: Self = StObject.set(x, "customContent", js.undefined)
    
    inline def setCustomItems(value: /* originalItems */ js.Array[TooltipItem] => js.Array[TooltipItem]): Self = StObject.set(x, "customItems", js.Any.fromFunction1(value))
    
    inline def setCustomItemsUndefined: Self = StObject.set(x, "customItems", js.undefined)
    
    inline def setDomStyles(value: TooltipDomStyles): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setDomStylesUndefined: Self = StObject.set(x, "domStyles", js.undefined)
    
    inline def setEnterable(value: Boolean): Self = StObject.set(x, "enterable", value.asInstanceOf[js.Any])
    
    inline def setEnterableUndefined: Self = StObject.set(x, "enterable", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    inline def setMarker(value: js.Object): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setShowContent(value: Boolean | (js.Function1[/* datum */ Datum, Boolean])): Self = StObject.set(x, "showContent", value.asInstanceOf[js.Any])
    
    inline def setShowContentFunction1(value: /* datum */ Datum => Boolean): Self = StObject.set(x, "showContent", js.Any.fromFunction1(value))
    
    inline def setShowContentUndefined: Self = StObject.set(x, "showContent", js.undefined)
    
    inline def setShowCrosshairs(value: Boolean): Self = StObject.set(x, "showCrosshairs", value.asInstanceOf[js.Any])
    
    inline def setShowCrosshairsUndefined: Self = StObject.set(x, "showCrosshairs", js.undefined)
    
    inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    
    inline def setShowMarkers(value: Boolean): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
    
    inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
    
    inline def setShowNil(value: Boolean): Self = StObject.set(x, "showNil", value.asInstanceOf[js.Any])
    
    inline def setShowNilUndefined: Self = StObject.set(x, "showNil", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTitle(value: TooltipTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction2(value: (/* title */ String, /* datum */ Datum) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
