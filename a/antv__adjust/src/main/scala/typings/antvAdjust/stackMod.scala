package typings.antvAdjust

import typings.antvAdjust.interfaceMod.StackCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/adjust/lib/adjusts/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  
  @js.native
  trait Stack
    extends typings.antvAdjust.adjustMod.default {
    
    var processOneDimStack: js.Any = js.native
    
    var processStack: js.Any = js.native
    
    var reverse: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Stack {
    def this(cfg: StackCfg) = this()
  }
}
