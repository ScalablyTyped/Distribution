package typings.antvG2

import typings.antvG2.libChartControllerBaseMod.Controller
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.AxisOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerAxisMod {
  
  @JSImport("@antv/g2/lib/chart/controller/axis", JSImport.Default)
  @js.native
  open class default protected () extends Axis {
    def this(view: View) = this()
  }
  
  @js.native
  trait Axis extends Controller[Option] {
    
    /** the draw group of axis */
    /* private */ var axisContainer: Any = js.native
    
    /* private */ var axisForeContainer: Any = js.native
    
    /** 使用 object 存储组件 */
    /* private */ var cache: Any = js.native
    
    /* private */ var createCircleAxis: Any = js.native
    
    /* private */ var createCircleGrid: Any = js.native
    
    /**
      * 创建 line axis
      * @param scale
      * @param option
      * @param layer
      * @param direction
      * @param dim
      */
    /* private */ var createLineAxis: Any = js.native
    
    /* private */ var createLineGrid: Any = js.native
    
    /* private */ var getAnimateCfg: Any = js.native
    
    /**
      * generate circle axis cfg
      * @param scale
      * @param axisOption
      * @param direction
      * @return circle axis cfg
      */
    /* private */ var getCircleAxisCfg: Any = js.native
    
    /**
      * generate circle grid cfg
      * @param scale
      * @param axisOption
      * @param direction
      * @return circle grid cfg
      */
    /* private */ var getCircleGridCfg: Any = js.native
    
    /* private */ var getId: Any = js.native
    
    /**
      * generate line axis cfg
      * @param scale
      * @param axisOption
      * @param direction
      * @return line axis cfg
      */
    /* private */ var getLineAxisCfg: Any = js.native
    
    /**
      * generate line grid cfg
      * @param scale
      * @param axisOption
      * @param direction
      * @param dim
      * @return line grid cfg
      */
    /* private */ var getLineGridCfg: Any = js.native
    
    /* private */ var gridContainer: Any = js.native
    
    /* private */ var gridForeContainer: Any = js.native
    
    /**
      * 更新 x axis
      * @param updatedCache
      */
    /* private */ var updateXAxes: Any = js.native
    
    /* private */ var updateYAxes: Any = js.native
  }
  
  type Option = (Record[String, AxisOption]) | Boolean
}
