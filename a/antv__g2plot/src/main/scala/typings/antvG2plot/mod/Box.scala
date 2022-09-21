package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialBoxOptions
import typings.antvG2plot.boxTypesMod.BoxOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Box")
@js.native
open class Box protected ()
  extends typings.antvG2plot.boxMod.Box {
  def this(container: String, options: BoxOptions) = this()
  def this(container: HTMLElement, options: BoxOptions) = this()
}
/* static members */
object Box {
  
  @JSImport("@antv/g2plot", "Box")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialBoxOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBoxOptions]
}
