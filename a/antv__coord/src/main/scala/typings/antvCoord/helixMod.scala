package typings.antvCoord

import typings.antvCoord.interfaceMod.PolarCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord/lib/coord/helix", JSImport.Namespace)
@js.native
object helixMod extends js.Object {
  
  @js.native
  trait Helix
    extends typings.antvCoord.baseMod.default {
    
    var a: js.Any = js.native
    
    var d: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Helix {
    def this(cfg: PolarCfg) = this()
  }
}
