package typings.antvG2plot.mod

import typings.antvG2plot.libCoreAdaptorMod.Adaptor
import typings.antvG2plot.libCorePlotMod.PickOptions
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "P")
@js.native
open class P[O /* <: PickOptions */] protected ()
  extends typings.antvG2plot.libPluginMod.P[O] {
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
}
