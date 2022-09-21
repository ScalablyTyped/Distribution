package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arc2CubicMod {
  
  @JSImport("@antv/util/lib/path/process/arc-2-cubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arcToCubic(
    X1: Double,
    Y1: Double,
    RX: Double,
    RY: Double,
    angle: Double,
    LAF: Double,
    SF: Double,
    X2: Double,
    Y2: Double,
    recursive: js.Array[Double]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arcToCubic")(X1.asInstanceOf[js.Any], Y1.asInstanceOf[js.Any], RX.asInstanceOf[js.Any], RY.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], LAF.asInstanceOf[js.Any], SF.asInstanceOf[js.Any], X2.asInstanceOf[js.Any], Y2.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
