package typings.antvCoord

import typings.antvCoord.interfaceMod.CoordinateCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord/lib/coord/cartesian", JSImport.Namespace)
@js.native
object cartesianMod extends js.Object {
  
  @js.native
  trait Cartesian
    extends typings.antvCoord.baseMod.default
  
  @js.native
  class default protected () extends Cartesian {
    def this(cfg: CoordinateCfg) = this()
  }
}
