package typings.antvG2plot

import typings.antvG2plot.libCoreAdaptorMod.Adaptor
import typings.antvG2plot.libCorePlotMod.PickOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginMod {
  
  @JSImport("@antv/g2plot/lib/plugin", "P")
  @js.native
  open class P[O /* <: PickOptions */] protected () extends Plot[O] {
    /**
      * 相比普通图表增加 adaptor 参数。
      * @param container
      * @param options
      * @param adaptor
      * @param defaultOptions
      */
    def this(container: String, options: O, adaptor: Adaptor[O]) = this()
    def this(container: HTMLElement, options: O, adaptor: Adaptor[O]) = this()
    def this(container: String, options: O, adaptor: Adaptor[O], defaultOptions: Partial[O]) = this()
    def this(container: HTMLElement, options: O, adaptor: Adaptor[O], defaultOptions: Partial[O]) = this()
    
    /** 外部传入的 adaptor 函数 */
    /* private */ var adaptor: Any = js.native
    
    /** 外部传入的 defaultOptions */
    /* private */ var defaultOptions: Any = js.native
  }
}
