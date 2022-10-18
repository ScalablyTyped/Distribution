package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialRingProgressOption
import typings.antvG2plot.libPlotsRingProgressTypesMod.RingProgressOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "RingProgress")
@js.native
open class RingProgress protected ()
  extends typings.antvG2plot.libPlotsRingProgressMod.RingProgress {
  def this(container: String, options: RingProgressOptions) = this()
  def this(container: HTMLElement, options: RingProgressOptions) = this()
}
/* static members */
object RingProgress {
  
  @JSImport("@antv/g2plot", "RingProgress")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialRingProgressOption = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRingProgressOption]
}
