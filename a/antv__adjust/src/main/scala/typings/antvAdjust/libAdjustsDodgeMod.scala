package typings.antvAdjust

import typings.antvAdjust.libInterfaceMod.DodgeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdjustsDodgeMod {
  
  @JSImport("@antv/adjust/lib/adjusts/dodge", JSImport.Default)
  @js.native
  open class default protected () extends Dodge {
    def this(cfg: DodgeCfg) = this()
  }
  
  @js.native
  trait Dodge
    extends typings.antvAdjust.libAdjustsAdjustMod.default {
    
    /* private */ var adjustDataArray: Any = js.native
    
    /* private */ var cacheMap: Any = js.native
    
    /* private */ var getDistribution: Any = js.native
    
    /* private */ var getDodgeOffset: Any = js.native
    
    /* private */ var getDodgeOnlyOffset: Any = js.native
    
    /* private */ var getIntervalAndDodgeOffset: Any = js.native
    
    /* private */ var getIntervalOnlyOffset: Any = js.native
    
    /* private */ var mergeData: Any = js.native
  }
}
