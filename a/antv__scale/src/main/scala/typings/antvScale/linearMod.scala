package typings.antvScale

import typings.antvScale.continuousBaseMod.Continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/continuous/linear", JSImport.Namespace)
@js.native
object linearMod extends js.Object {
  
  @js.native
  trait Linear extends Continuous {
    
    @JSName("isLinear")
    val isLinear_Linear: Boolean = js.native
    
    var minTickInterval: Double = js.native
  }
  
  @js.native
  class default () extends Linear
}
