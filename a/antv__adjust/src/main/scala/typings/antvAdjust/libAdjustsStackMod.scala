package typings.antvAdjust

import typings.antvAdjust.libInterfaceMod.StackCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdjustsStackMod {
  
  @JSImport("@antv/adjust/lib/adjusts/stack", JSImport.Default)
  @js.native
  open class default protected () extends Stack {
    def this(cfg: StackCfg) = this()
  }
  
  @js.native
  trait Stack
    extends typings.antvAdjust.libAdjustsAdjustMod.default {
    
    /* private */ var processOneDimStack: Any = js.native
    
    /* private */ var processStack: Any = js.native
    
    /* private */ var reverse: Any = js.native
  }
}
