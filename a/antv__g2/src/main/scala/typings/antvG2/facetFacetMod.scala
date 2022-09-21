package typings.antvG2

import typings.antvG2.anon.EachView
import typings.antvG2.anon.StyleFill
import typings.antvG2.libInterfaceMod.AxisCfg
import typings.antvG2.libInterfaceMod.Condition
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetData
import typings.antvG2.libInterfaceMod.FacetDataFilter
import typings.antvG2.libInterfaceMod.Region
import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetFacetMod {
  
  @JSImport("@antv/g2/lib/facet/facet", "Facet")
  @js.native
  abstract class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected () extends StObject {
    def this(view: View, cfg: C) = this()
    
    /**
      * @override 处理 eachView 之后
      * @param view
      * @param facet
      */
    /* protected */ def afterEachView(view: View, facet: F): Any = js.native
    
    /**
      * @override 开始处理 eachView
      * @param view
      * @param facet
      */
    /* protected */ def beforeEachView(view: View, facet: F): Any = js.native
    
    /** 分面的配置项 */
    /* protected */ var cfg: C = js.native
    
    /**
      * 清空，clear 之后如果还需要使用，需要重新调用 init 初始化过程
      * 一般在数据有变更的时候调用，重新进行数据的分面逻辑
      */
    def clear(): Unit = js.native
    
    /**
      * 从 view 中清除 facetView
      */
    /* private */ var clearFacetViews: Any = js.native
    
    /** 分面容器 */
    var container: IGroup = js.native
    
    /* private */ var createContainer: Any = js.native
    
    /**
      * 创建 分面 view
      */
    /* private */ var createFacetViews: Any = js.native
    
    /**
      * 销毁
      */
    def destroy(): Unit = js.native
    
    /** 是否销毁 */
    var destroyed: Boolean = js.native
    
    /**
      * 根据 facet 生成 view，可以给上层自定义使用
      * @param facet
      */
    /* protected */ def facetToView(facet: F): View = js.native
    
    /** 分面之后的所有分面数据结构 */
    /* protected */ var facets: js.Array[F] = js.native
    
    /**
      * @override 生成分面数据，包含布局
      * @param data
      */
    /* protected */ def generateFacets(data: js.Array[Datum]): js.Array[F] = js.native
    
    /* protected */ def getDefaultCfg(): EachView = js.native
    
    /**
      * 默认的 title 样式，因为有的分面是 title，有的分面配置是 columnTitle、rowTitle
      */
    /* protected */ def getDefaultTitleCfg(): StyleFill = js.native
    
    /**
      * 获取分面数据
      * @param conditions
      */
    /* protected */ def getFacetDataFilter(conditions: js.Array[Condition]): FacetDataFilter = js.native
    
    /**
      * 获取这个字段对应的所有值，数组
      * @protected
      * @param data 数据
      * @param field 字段名
      * @return 字段对应的值
      */
    /* protected */ def getFieldValues(data: js.Array[Datum], field: String): js.Array[String] = js.native
    
    /**
      * 获得每个分面的 region，平分区域
      * @param rows row 总数
      * @param cols col 总数
      * @param xIndex x 方向 index
      * @param yIndex y 方向 index
      */
    /* protected */ def getRegion(rows: Double, cols: Double, xIndex: Double, yIndex: Double): Region = js.native
    
    /**
      * 获取 x 轴的配置
      * @param x
      * @param axes
      * @param option
      * @param facet
      */
    /* protected */ def getXAxisOption(x: String, axes: Any, option: AxisCfg, facet: F): js.Object = js.native
    
    /**
      * 获取 y 轴的配置
      * @param y
      * @param axes
      * @param option
      * @param facet
      */
    /* protected */ def getYAxisOption(y: String, axes: Any, option: AxisCfg, facet: F): js.Object = js.native
    
    /**
      * 初始化过程
      */
    def init(): Unit = js.native
    
    /**
      * 解析 spacing
      */
    /* private */ var parseSpacing: Any = js.native
    
    /**
      * 处理 axis 的默认配置
      * @param view
      * @param facet
      */
    /* protected */ def processAxis(view: View, facet: F): Unit = js.native
    
    /**
      * 渲染分面，由上层 view 调用。包括：
      *  - 分面 view
      *  - 轴
      *  - title
      *
      *  子类可以复写，添加一些其他组件，比如滚动条等
      */
    def render(): Unit = js.native
    
    /**
      * 初始化 view
      */
    /* private */ var renderViews: Any = js.native
    
    /**
      * 更新 facet
      */
    def update(): Unit = js.native
    
    /** 分面所在的 view */
    var view: View = js.native
  }
}
