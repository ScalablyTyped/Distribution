package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clampMod {
  
  @JSImport("@antv/scale/lib/utils/clamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClamp(a: Double, b: Double): js.Function1[/* x */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClamp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Double, Double]]
}
