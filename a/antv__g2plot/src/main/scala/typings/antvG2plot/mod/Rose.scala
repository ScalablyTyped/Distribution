package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialRoseOptions
import typings.antvG2plot.libPlotsRoseTypesMod.RoseOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Rose")
@js.native
open class Rose protected ()
  extends typings.antvG2plot.libPlotsRoseMod.Rose {
  def this(container: String, options: RoseOptions) = this()
  def this(container: HTMLElement, options: RoseOptions) = this()
}
/* static members */
object Rose {
  
  @JSImport("@antv/g2plot", "Rose")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 玫瑰图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialRoseOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialRoseOptions]
}
