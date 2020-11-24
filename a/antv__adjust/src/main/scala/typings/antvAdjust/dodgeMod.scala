package typings.antvAdjust

import typings.antvAdjust.interfaceMod.DodgeCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/adjust/lib/adjusts/dodge", JSImport.Namespace)
@js.native
object dodgeMod extends js.Object {
  
  @js.native
  trait Dodge
    extends typings.antvAdjust.adjustMod.default {
    
    var adjustDataArray: js.Any = js.native
    
    var cacheMap: js.Any = js.native
    
    var getDistribution: js.Any = js.native
    
    var getDodgeOffset: js.Any = js.native
    
    var getDodgeOnlyOffset: js.Any = js.native
    
    var getIntervalAndDodgeOffset: js.Any = js.native
    
    var getIntervalOnlyOffset: js.Any = js.native
    
    var mergeData: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Dodge {
    def this(cfg: DodgeCfg) = this()
  }
}
