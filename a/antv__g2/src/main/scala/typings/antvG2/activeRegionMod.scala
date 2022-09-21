package typings.antvG2

import typings.antvG2.anon.AppendRatio
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.libInterfaceMod.TooltipCfg
import typings.antvG2.viewMod.View
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activeRegionMod {
  
  @JSImport("@antv/g2/lib/interaction/action/active-region", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 背景框的 Action. 只作用于 interval 和 schema geometry
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/active-region", JSImport.Default)
  @js.native
  open class default () extends ActiveRegion
  
  inline def getItemsOfView(view: View, point: Point, tooltipCfg: TooltipCfg): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsOfView")(view.asInstanceOf[js.Any], point.asInstanceOf[js.Any], tooltipCfg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * 背景框的 Action. 只作用于 interval 和 schema geometry
    * @ignore
    */
  @js.native
  trait ActiveRegion
    extends typings.antvG2.actionBaseMod.default[LooseObject] {
    
    /**
      * 隐藏
      */
    def hide(): Unit = js.native
    
    /* private */ var items: Any = js.native
    
    /* private */ var regionPath: Any = js.native
    
    /**
      * 显示
      * @param {ShapeAttrs} style region-path 的样式
      * @param {number} appendRatio 适用于笛卡尔坐标系. 对于 x 轴非 linear 类型: 默认：0.25, x 轴 linear 类型: 默认 0
      * @param {number} appendWidth  适用于笛卡尔坐标系. 像素级别，优先级 > appendRatio
      */
    def show(): Unit = js.native
    def show(args: AppendRatio): Unit = js.native
  }
}
