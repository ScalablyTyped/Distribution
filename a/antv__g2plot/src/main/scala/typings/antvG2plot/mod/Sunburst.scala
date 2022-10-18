package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialSunburstOptions
import typings.antvG2plot.libPlotsSunburstTypesMod.SunburstOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Sunburst")
@js.native
open class Sunburst protected ()
  extends typings.antvG2plot.libPlotsSunburstMod.Sunburst {
  def this(container: String, options: SunburstOptions) = this()
  def this(container: HTMLElement, options: SunburstOptions) = this()
}
/* static members */
object Sunburst {
  
  @JSImport("@antv/g2plot", "Sunburst")
  @js.native
  val ^ : js.Any = js.native
  
  /** 节点的祖先节点 */
  @JSImport("@antv/g2plot", "Sunburst.NODE_ANCESTORS_FIELD")
  @js.native
  def NODE_ANCESTORS_FIELD: String = js.native
  inline def NODE_ANCESTORS_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ANCESTORS_FIELD")(x.asInstanceOf[js.Any])
  
  /** 旭日图 节点的祖先节点 */
  @JSImport("@antv/g2plot", "Sunburst.SUNBURST_ANCESTOR_FIELD")
  @js.native
  def SUNBURST_ANCESTOR_FIELD: String = js.native
  inline def SUNBURST_ANCESTOR_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUNBURST_ANCESTOR_FIELD")(x.asInstanceOf[js.Any])
  
  /** 旭日图 节点的路径 */
  @JSImport("@antv/g2plot", "Sunburst.SUNBURST_PATH_FIELD")
  @js.native
  def SUNBURST_PATH_FIELD: String = js.native
  inline def SUNBURST_PATH_FIELD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUNBURST_PATH_FIELD")(x.asInstanceOf[js.Any])
  
  /**
    * 获取 旭日图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialSunburstOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialSunburstOptions]
}
