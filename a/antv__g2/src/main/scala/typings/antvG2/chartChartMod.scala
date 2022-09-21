package typings.antvG2

import typings.antvG2.antvG2Strings.canvas
import typings.antvG2.antvG2Strings.svg
import typings.antvG2.libInterfaceMod.AriaOption
import typings.antvG2.libInterfaceMod.ChartCfg
import typings.antvG2.viewMod.View
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartChartMod {
  
  @JSImport("@antv/g2/lib/chart/chart", JSImport.Default)
  @js.native
  open class default protected () extends Chart {
    def this(props: ChartCfg) = this()
  }
  
  @js.native
  trait Chart extends View {
    
    /**
      * 设置 WAI-ARIA 无障碍标签。如何根据图形语法自动生成 arial 内容？
      * @param ariaOption
      */
    def aria(ariaOption: AriaOption): Unit = js.native
    
    /** 是否自适应 DOM 容器宽高，默认为 false，需要用户手动指定宽高 */
    var autoFit: Boolean = js.native
    
    /* private */ var bindAutoFit: Any = js.native
    
    /**
      * 改变图表大小，同时重新渲染。
      * @param width 图表宽度
      * @param height 图表高度
      * @returns
      */
    def changeSize(width: Double, height: Double): this.type = js.native
    
    /** Chart 的 DOM 容器 */
    var ele: HTMLElement = js.native
    
    /**
      * 自动根据容器大小 resize 画布
      */
    def forceFit(): Unit = js.native
    
    /** 图表高度 */
    var height: Double = js.native
    
    /* private */ var initDefaultInteractions: Any = js.native
    
    /** 是否开启局部刷新 */
    var localRefresh: Boolean = js.native
    
    /**
      * when container size changed, change chart size props, and re-render.
      */
    /* private */ var onResize: Any = js.native
    
    /** 图表渲染引擎 */
    var renderer: canvas | svg = js.native
    
    /* private */ var unbindAutoFit: Any = js.native
    
    /* private */ var updateCanvasStyle: Any = js.native
    
    /** 图表宽度 */
    var width: Double = js.native
    
    /* private */ var wrapperElement: Any = js.native
  }
}
