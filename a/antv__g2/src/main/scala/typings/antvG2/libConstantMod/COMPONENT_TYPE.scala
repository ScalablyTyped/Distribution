package typings.antvG2.libConstantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait COMPONENT_TYPE extends StObject
@JSImport("@antv/g2/lib/constant", "COMPONENT_TYPE")
@js.native
object COMPONENT_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[COMPONENT_TYPE & String] = js.native
  
  /** annotation 组件 */
  @js.native
  sealed trait ANNOTATION
    extends StObject
       with COMPONENT_TYPE
  /* "annotation" */ val ANNOTATION: typings.antvG2.libConstantMod.COMPONENT_TYPE.ANNOTATION & String = js.native
  
  /** axis 组件 */
  @js.native
  sealed trait AXIS
    extends StObject
       with COMPONENT_TYPE
  /* "axis" */ val AXIS: typings.antvG2.libConstantMod.COMPONENT_TYPE.AXIS & String = js.native
  
  /** grid 组件 */
  @js.native
  sealed trait GRID
    extends StObject
       with COMPONENT_TYPE
  /* "grid" */ val GRID: typings.antvG2.libConstantMod.COMPONENT_TYPE.GRID & String = js.native
  
  /** legend 组件 */
  @js.native
  sealed trait LEGEND
    extends StObject
       with COMPONENT_TYPE
  /* "legend" */ val LEGEND: typings.antvG2.libConstantMod.COMPONENT_TYPE.LEGEND & String = js.native
  
  /** 其他组件，自定义组件 */
  @js.native
  sealed trait OTHER
    extends StObject
       with COMPONENT_TYPE
  /* "other" */ val OTHER: typings.antvG2.libConstantMod.COMPONENT_TYPE.OTHER & String = js.native
  
  /** 滚动条组件 */
  @js.native
  sealed trait SCROLLBAR
    extends StObject
       with COMPONENT_TYPE
  /* "scrollbar" */ val SCROLLBAR: typings.antvG2.libConstantMod.COMPONENT_TYPE.SCROLLBAR & String = js.native
  
  /** 缩略轴组件 */
  @js.native
  sealed trait SLIDER
    extends StObject
       with COMPONENT_TYPE
  /* "slider" */ val SLIDER: typings.antvG2.libConstantMod.COMPONENT_TYPE.SLIDER & String = js.native
  
  /** tooltip 组件 */
  @js.native
  sealed trait TOOLTIP
    extends StObject
       with COMPONENT_TYPE
  /* "tooltip" */ val TOOLTIP: typings.antvG2.libConstantMod.COMPONENT_TYPE.TOOLTIP & String = js.native
}
