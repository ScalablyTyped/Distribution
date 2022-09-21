package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialHistogramOptions
import typings.antvG2plot.histogramTypesMod.HistogramOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Histogram")
@js.native
open class Histogram protected ()
  extends typings.antvG2plot.histogramMod.Histogram {
  def this(container: String, options: HistogramOptions) = this()
  def this(container: HTMLElement, options: HistogramOptions) = this()
}
/* static members */
object Histogram {
  
  @JSImport("@antv/g2plot", "Histogram")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialHistogramOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialHistogramOptions]
}
