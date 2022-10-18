package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessQuad2CubicMod {
  
  @JSImport("@antv/util/lib/path/process/quad-2-cubic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def quadToCubic(x1: Double, y1: Double, qx: Double, qy: Double, x2: Double, y2: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quadToCubic")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], qx.asInstanceOf[js.Any], qy.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
