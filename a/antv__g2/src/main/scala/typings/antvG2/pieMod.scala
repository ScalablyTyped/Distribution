package typings.antvG2

import typings.antvG2.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieMod {
  
  @JSImport("@antv/g2/lib/geometry/label/pie", JSImport.Default)
  @js.native
  open class default () extends PieLabel
  
  @js.native
  trait PieLabel
    extends typings.antvG2.polarMod.default {
    
    /* protected */ def getArcPoint(point: Any): Any = js.native
    
    /** @override */
    /* protected */ def getCirclePoint(angle: Double, offset: Double): Angle = js.native
    
    /* protected */ def getPointAngle(point: Any): Any = js.native
  }
}
