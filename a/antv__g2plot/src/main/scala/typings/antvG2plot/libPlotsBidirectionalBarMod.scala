package typings.antvG2plot

import typings.antvG2plot.anon.PartialBidirectionalBarOp
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsBidirectionalBarTypesMod.BidirectionalBarOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBidirectionalBarMod {
  
  @JSImport("@antv/g2plot/lib/plots/bidirectional-bar", "BidirectionalBar")
  @js.native
  open class BidirectionalBar protected () extends Plot[BidirectionalBarOptions] {
    def this(container: String, options: BidirectionalBarOptions) = this()
    def this(container: HTMLElement, options: BidirectionalBarOptions) = this()
    
    /**
      * @override
      */
    def changeData(): Unit = js.native
    def changeData(data: js.Array[Any]): Unit = js.native
  }
  /* static members */
  object BidirectionalBar {
    
    @JSImport("@antv/g2plot/lib/plots/bidirectional-bar", "BidirectionalBar")
    @js.native
    val ^ : js.Any = js.native
    
    /** 对称条形图分类字段 */
    @JSImport("@antv/g2plot/lib/plots/bidirectional-bar", "BidirectionalBar.SERIES_FIELD_KEY")
    @js.native
    def SERIES_FIELD_KEY: String = js.native
    inline def SERIES_FIELD_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERIES_FIELD_KEY")(x.asInstanceOf[js.Any])
    
    /**
      * 获取 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialBidirectionalBarOp = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBidirectionalBarOp]
  }
}
