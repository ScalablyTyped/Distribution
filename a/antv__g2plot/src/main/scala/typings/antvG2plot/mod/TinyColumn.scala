package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialTinyColumnOptions
import typings.antvG2plot.tinyColumnTypesMod.TinyColumnOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "TinyColumn")
@js.native
open class TinyColumn protected ()
  extends typings.antvG2plot.tinyColumnMod.TinyColumn {
  def this(container: String, options: TinyColumnOptions) = this()
  def this(container: HTMLElement, options: TinyColumnOptions) = this()
}
/* static members */
object TinyColumn {
  
  @JSImport("@antv/g2plot", "TinyColumn")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTinyColumnOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyColumnOptions]
}
