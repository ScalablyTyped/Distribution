package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialTinyAreaOptions
import typings.antvG2plot.tinyAreaTypesMod.TinyAreaOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "TinyArea")
@js.native
open class TinyArea protected ()
  extends typings.antvG2plot.tinyAreaMod.TinyArea {
  def this(container: String, options: TinyAreaOptions) = this()
  def this(container: HTMLElement, options: TinyAreaOptions) = this()
}
/* static members */
object TinyArea {
  
  @JSImport("@antv/g2plot", "TinyArea")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialTinyAreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialTinyAreaOptions]
}
