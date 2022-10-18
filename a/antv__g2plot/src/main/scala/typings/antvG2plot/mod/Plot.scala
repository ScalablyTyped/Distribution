package typings.antvG2plot.mod

import typings.antvG2plot.libCorePlotMod.PickOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@antv/g2plot", "Plot")
@js.native
open class Plot[O /* <: PickOptions */] protected ()
  extends typings.antvG2plot.libCorePlotMod.Plot[O] {
  def this(container: String, options: O) = this()
  def this(container: HTMLElement, options: O) = this()
}
/* static members */
object Plot {
  
  @JSImport("@antv/g2plot", "Plot")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认的 options 配置项
    * 每个组件都可以复写
    */
  inline def getDefaultOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[Any]
}
