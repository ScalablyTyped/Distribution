package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clampMod {
  
  @JSImport("@antv/util/lib/clamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
