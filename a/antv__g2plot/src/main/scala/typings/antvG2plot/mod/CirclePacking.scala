package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialCirclePackingOptio
import typings.antvG2plot.circlePackingTypesMod.CirclePackingOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "CirclePacking")
@js.native
open class CirclePacking protected ()
  extends typings.antvG2plot.circlePackingMod.CirclePacking {
  def this(container: String, options: CirclePackingOptions) = this()
  def this(container: HTMLElement, options: CirclePackingOptions) = this()
}
/* static members */
object CirclePacking {
  
  @JSImport("@antv/g2plot", "CirclePacking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 面积图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialCirclePackingOptio = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialCirclePackingOptio]
}
