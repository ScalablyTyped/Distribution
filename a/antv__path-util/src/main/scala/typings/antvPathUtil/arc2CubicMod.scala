package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arc2CubicMod {
  
  @JSImport("@antv/path-util/lib/process/arc-2-cubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arcToCubic(
    x1: Double,
    y1: Double,
    rx: Double,
    ry: Double,
    angle: Double,
    LAF: Double,
    SF: Double,
    x2: Double,
    y2: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("arcToCubic")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], LAF.asInstanceOf[js.Any], SF.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
