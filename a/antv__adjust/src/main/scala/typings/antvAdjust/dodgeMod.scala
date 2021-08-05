package typings.antvAdjust

import typings.antvAdjust.interfaceMod.DodgeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dodgeMod {
  
  @JSImport("@antv/adjust/lib/adjusts/dodge", JSImport.Default)
  @js.native
  class default protected () extends Dodge {
    def this(cfg: DodgeCfg) = this()
  }
  
  @js.native
  trait Dodge
    extends typings.antvAdjust.adjustMod.default {
    
    /* private */ var adjustDataArray: js.Any = js.native
    
    /* private */ var cacheMap: js.Any = js.native
    
    /* private */ var getDistribution: js.Any = js.native
    
    /* private */ var getDodgeOffset: js.Any = js.native
    
    /* private */ var getDodgeOnlyOffset: js.Any = js.native
    
    /* private */ var getIntervalAndDodgeOffset: js.Any = js.native
    
    /* private */ var getIntervalOnlyOffset: js.Any = js.native
    
    /* private */ var mergeData: js.Any = js.native
  }
}
