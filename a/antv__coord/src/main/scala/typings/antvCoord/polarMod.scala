package typings.antvCoord

import typings.antvCoord.interfaceMod.Point
import typings.antvCoord.interfaceMod.PolarCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polarMod {
  
  @JSImport("@antv/coord/lib/coord/polar", JSImport.Default)
  @js.native
  class default protected () extends Polar {
    def this(cfg: PolarCfg) = this()
  }
  
  @js.native
  trait Polar
    extends typings.antvCoord.baseMod.default {
    
    var circleCenter: Point = js.native
    
    var getOneBox: js.Any = js.native
    
    var polarRadius: js.Any = js.native
  }
}
