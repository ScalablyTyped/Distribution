package typings.antvCoord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsAdjustAngleMod {
  
  @JSImport("@antv/coord/lib/utils/adjustAngle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustAngle(theta: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustAngle")(theta.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
