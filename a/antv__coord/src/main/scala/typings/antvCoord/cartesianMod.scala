package typings.antvCoord

import typings.antvCoord.interfaceMod.CoordinateCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartesianMod {
  
  @JSImport("@antv/coord/lib/coord/cartesian", JSImport.Default)
  @js.native
  class default protected () extends Cartesian {
    def this(cfg: CoordinateCfg) = this()
  }
  
  @js.native
  trait Cartesian
    extends typings.antvCoord.baseMod.default
}
