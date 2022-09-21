package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialBidirectionalBarOp
import typings.antvG2plot.bidirectionalBarTypesMod.BidirectionalBarOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "BidirectionalBar")
@js.native
open class BidirectionalBar protected ()
  extends typings.antvG2plot.bidirectionalBarMod.BidirectionalBar {
  def this(container: String, options: BidirectionalBarOptions) = this()
  def this(container: HTMLElement, options: BidirectionalBarOptions) = this()
}
/* static members */
object BidirectionalBar {
  
  @JSImport("@antv/g2plot", "BidirectionalBar")
  @js.native
  val ^ : js.Any = js.native
  
  /** 对称条形图分类字段 */
  @JSImport("@antv/g2plot", "BidirectionalBar.SERIES_FIELD_KEY")
  @js.native
  def SERIES_FIELD_KEY: String = js.native
  inline def SERIES_FIELD_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERIES_FIELD_KEY")(x.asInstanceOf[js.Any])
  
  /**
    * 获取 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialBidirectionalBarOp = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBidirectionalBarOp]
}
