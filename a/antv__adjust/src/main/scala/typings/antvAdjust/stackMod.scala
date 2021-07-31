package typings.antvAdjust

import typings.antvAdjust.interfaceMod.StackCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@antv/adjust/lib/adjusts/stack", JSImport.Default)
  @js.native
  class default protected () extends Stack {
    def this(cfg: StackCfg) = this()
  }
  
  @js.native
  trait Stack
    extends typings.antvAdjust.adjustMod.default {
    
    var processOneDimStack: js.Any = js.native
    
    var processStack: js.Any = js.native
    
    var reverse: js.Any = js.native
  }
}
