package typings.antvScale

import typings.antvScale.typesMod.ScaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/util/d3-linear", JSImport.Namespace)
@js.native
object utilD3LinearMod extends js.Object {
  
  def default(cfg: ScaleConfig): js.Array[Double] = js.native
  
  @js.native
  class D3Linear () extends js.Object {
    
    var _domain: js.Any = js.native
    
    def domain(): D3Linear | js.Array[Double] = js.native
    def domain(domain: js.Array[Double]): D3Linear | js.Array[Double] = js.native
    
    def nice(): this.type = js.native
    def nice(count: Double): this.type = js.native
    
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
}
