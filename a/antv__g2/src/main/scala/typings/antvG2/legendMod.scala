package typings.antvG2

import typings.antvG2.controllerBaseMod.Controller
import typings.antvG2.libInterfaceMod.AllLegendsOptions
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("@antv/g2/lib/chart/controller/legend", JSImport.Default)
  @js.native
  open class default protected () extends Legend {
    def this(view: View) = this()
  }
  
  @js.native
  trait Legend extends Controller[AllLegendsOptions] {
    
    /** the draw group of axis */
    /* private */ var container: Any = js.native
    
    /**
      * 创建分类图例
      * @param geometry
      * @param attr
      * @param scale
      * @param legendOption
      */
    /* private */ var createCategoryLegend: Any = js.native
    
    /**
      * 创建连续图例
      * @param geometry
      * @param attr
      * @param scale
      * @param legendOption
      */
    /* private */ var createContinuousLegend: Any = js.native
    
    /**
      * 自定义图例使用 category 图例去渲染
      * @param geometry
      * @param attr
      * @param scale
      * @param legendOption
      */
    /* private */ var createCustomLegend: Any = js.native
    
    /**
      * 创建一个 legend
      * @param geometry
      * @param attr
      * @param scale
      */
    /* private */ var createFieldLegend: Any = js.native
    
    /**
      * 获取分类图例的配置项
      * @param geometry
      * @param attr
      * @param scale
      * @param custom
      * @param legendOption
      */
    /* private */ var getCategoryCfg: Any = js.native
    
    /* private */ var getCategoryLegendSizeCfg: Any = js.native
    
    /**
      * 根据 id 来获取组件
      * @param id
      */
    /* private */ var getComponentById: Any = js.native
    
    /**
      * 获得连续图例的配置
      * @param geometry
      * @param attr
      * @param scale
      * @param legendOption
      */
    /* private */ var getContinuousCfg: Any = js.native
    
    /**
      * 递归获取所有的 Geometry
      */
    /* private */ var getGeometries: Any = js.native
    
    /**
      * 生成 id
      * @param key
      */
    /* private */ var getId: Any = js.native
    
    /** 用于多个 legend 布局的 bbox */
    /* private */ var layoutBBox: Any = js.native
    
    /**
      * 遍历 Geometry，处理 legend 逻辑
      * @param doEach 每个 loop 中的处理方法
      */
    /* private */ var loopLegends: Any = js.native
    
    /**
      * get legend config, use option > suggestion > theme
      * @param baseCfg
      * @param legendOption
      * @param direction
      */
    /* private */ var mergeLegendCfg: Any = js.native
  }
}
