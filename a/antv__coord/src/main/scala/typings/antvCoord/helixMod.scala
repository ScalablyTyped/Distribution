package typings.antvCoord

import typings.antvCoord.interfaceMod.PolarCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helixMod {
  
  @JSImport("@antv/coord/lib/coord/helix", JSImport.Default)
  @js.native
  class default protected () extends Helix {
    def this(cfg: PolarCfg) = this()
  }
  
  @js.native
  trait Helix
    extends typings.antvCoord.baseMod.default {
    
    /* private */ var a: js.Any = js.native
    
    /* private */ var d: js.Any = js.native
  }
}
