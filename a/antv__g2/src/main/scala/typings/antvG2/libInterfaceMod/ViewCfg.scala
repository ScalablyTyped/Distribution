package typings.antvG2.libInterfaceMod

import typings.antvG2.libChartLayoutPaddingCalMod.PaddingCalCtor
import typings.antvG2.libChartViewMod.View
import typings.antvGBase.libInterfacesMod.ICanvas
import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewCfg extends StObject {
  
  /**
    * @title 额外边距
    * @description 设置图表的内边距在padding的基础上增加appendPadding的调整。
    * @example
    * 1. padding: 20
    * 2. padding: [ 10, 30, 30 ]
    */
  val appendPadding: js.UndefOr[ViewAppendPadding] = js.undefined
  
  /**
    * @title 背景层
    */
  val backgroundGroup: IGroup
  
  /**
    * @title canvas 实例。
    */
  val canvas: ICanvas
  
  /**
    * @title 前景层
    */
  val foregroundGroup: IGroup
  
  /**
    * @title View id，可以由外部传入
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * @title 是否对超出坐标系范围的 Geometry 进行剪切
    */
  val limitInPlot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @title 中间层
    */
  val middleGroup: IGroup
  
  /**
    * @title 图表组件、图形映射等相关的配置。
    */
  val options: js.UndefOr[Options] = js.undefined
  
  /**
    * @title 内边距
    * @description 设置图表的内边距，使用方式参考 CSS 盒模型，下图黄色区域即为 padding 的范围。
    * @see ![](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*pYwiQrdXGJ8AAAAAAAAAAABkARQnAQ)
    * @example
    * 1. padding: 20
    * 2. padding: [ 10, 30, 30 ]
    */
  val padding: js.UndefOr[ViewPadding] = js.undefined
  
  /**
    * @title 当前 view 的父级 view。
    */
  val parent: View
  
  /**
    * @title view 的绘制范围
    */
  val region: js.UndefOr[Region] = js.undefined
  
  /**
    * @title 是否同步子 view 的 padding
    * @description 是否同步子 view 的 padding，可以是 boolean / SyncViewPaddingFn
    * @example
    *  view1 的 padding 10
    *  view2 的 padding 20
    *  那么两个子 view 的 padding 统一变成最大的 20.
    *
    * 如果是 Funcion，则使用自定义的方式去计算子 view 的 padding，这个函数中去修改所有的 views autoPadding 值
    */
  val syncViewPadding: js.UndefOr[Boolean | SyncViewPaddingFn] = js.undefined
  
  /**
    * @title 主题
    * @description 设置 view 实例主题
    */
  val theme: js.UndefOr[LooseObject | String] = js.undefined
  
  /**
    * @title 是否可见
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}
object ViewCfg {
  
  inline def apply(
    backgroundGroup: IGroup,
    canvas: ICanvas,
    foregroundGroup: IGroup,
    middleGroup: IGroup,
    parent: View
  ): ViewCfg = {
    val __obj = js.Dynamic.literal(backgroundGroup = backgroundGroup.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], foregroundGroup = foregroundGroup.asInstanceOf[js.Any], middleGroup = middleGroup.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewCfg] (val x: Self) extends AnyVal {
    
    inline def setAppendPadding(value: ViewAppendPadding): Self = StObject.set(x, "appendPadding", value.asInstanceOf[js.Any])
    
    inline def setAppendPaddingUndefined: Self = StObject.set(x, "appendPadding", js.undefined)
    
    inline def setAppendPaddingVarargs(value: Double*): Self = StObject.set(x, "appendPadding", js.Array(value*))
    
    inline def setBackgroundGroup(value: IGroup): Self = StObject.set(x, "backgroundGroup", value.asInstanceOf[js.Any])
    
    inline def setCanvas(value: ICanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setForegroundGroup(value: IGroup): Self = StObject.set(x, "foregroundGroup", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLimitInPlot(value: Boolean): Self = StObject.set(x, "limitInPlot", value.asInstanceOf[js.Any])
    
    inline def setLimitInPlotUndefined: Self = StObject.set(x, "limitInPlot", js.undefined)
    
    inline def setMiddleGroup(value: IGroup): Self = StObject.set(x, "middleGroup", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setParent(value: View): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSyncViewPadding(value: Boolean | SyncViewPaddingFn): Self = StObject.set(x, "syncViewPadding", value.asInstanceOf[js.Any])
    
    inline def setSyncViewPaddingFunction3(value: (/* chart */ View, /* views */ js.Array[View], /* PC */ PaddingCalCtor) => Unit): Self = StObject.set(x, "syncViewPadding", js.Any.fromFunction3(value))
    
    inline def setSyncViewPaddingUndefined: Self = StObject.set(x, "syncViewPadding", js.undefined)
    
    inline def setTheme(value: LooseObject | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
