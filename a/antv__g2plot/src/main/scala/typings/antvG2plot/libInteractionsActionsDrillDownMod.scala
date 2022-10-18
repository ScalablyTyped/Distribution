package typings.antvG2plot

import typings.antvG2plot.anon.ActiveTextStyle
import typings.antvG2plot.anon.Children
import typings.antvG2plot.anon.ChildrenId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionsActionsDrillDownMod {
  
  @JSImport("@antv/g2plot/lib/interactions/actions/drill-down", "BREAD_CRUMB_NAME")
  @js.native
  val BREAD_CRUMB_NAME: /* "drilldown-bread-crumb" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/interactions/actions/drill-down", "DEFAULT_BREAD_CRUMB_CONFIG")
  @js.native
  val DEFAULT_BREAD_CRUMB_CONFIG: js.UndefOr[ActiveTextStyle] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any */ @JSImport("@antv/g2plot/lib/interactions/actions/drill-down", "DrillDownAction")
  @js.native
  open class DrillDownAction () extends StObject {
    
    /**
      * 返回上一层
      */
    def back(): Unit = js.native
    
    /**
      * 回退事件，点击面包屑时触发
      * @param historyCache 当前要回退到的历史
      */
    /* protected */ def backTo(historyCache: HistoryCache): Unit = js.native
    
    /* private */ var breadCrumbCfg: Any = js.native
    
    /* private */ var breadCrumbGroup: Any = js.native
    
    /**
      * 点击事件, 下钻数据，并绘制面包屑
      */
    def click(): Boolean = js.native
    
    /**
      * @override
      * destroy: 销毁资源
      */
    def destroy(): Unit = js.native
    
    /**
      * 显示面包屑
      */
    /* private */ var drawBreadCrumb: Any = js.native
    
    /**
      * 绘制 Button 和 文本
      */
    /* private */ var drawBreadCrumbGroup: Any = js.native
    
    /**
      * 下钻数据并更新 view 显示层
      * @param nodeInfo 下钻数据
      */
    /* protected */ def drill(nodeInfo: HierarchyNode[Any]): Unit = js.native
    
    /**
      * 获取 mix 默认的配置和用户配置
      */
    /* private */ var getButtonCfg: Any = js.native
    
    /**
      * 隐藏面包屑
      */
    /* private */ var hideCrumbGroup: Any = js.native
    
    /* protected */ var historyCache: HistoryCache = js.native
    
    /** Action name */
    var name: String = js.native
    
    /**
      * 重置
      */
    def reset(): Unit = js.native
    
    /**
      * 重置位置，初始化及触发 chart  afterchangesize 回调时使用
      */
    def resetPosition(): Unit = js.native
  }
  
  @JSImport("@antv/g2plot/lib/interactions/actions/drill-down", "HIERARCHY_DATA_TRANSFORM_PARAMS")
  @js.native
  val HIERARCHY_DATA_TRANSFORM_PARAMS: /* "hierarchy-data-transform-params" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/interactions/actions/drill-down", "PADDING_TOP")
  @js.native
  val PADDING_TOP: /* 5 */ Double = js.native
  
  @js.native
  trait HierarchyNode[N] extends StObject {
    
    var children: js.Array[N] = js.native
    
    /** 节点的原始数据，树型结构（todo 是否更正 key 为 origin） */
    var data: Children = js.native
    
    /** 当前的层级结构，每一次下钻都会更新. 不是 unique */
    var depth: Double = js.native
    
    /** 当前所处高度，depth + height = 总的层级 */
    var height: Double = js.native
    
    var parent: N = js.native
  }
  
  type HistoryCache = js.Array[ChildrenId]
}
