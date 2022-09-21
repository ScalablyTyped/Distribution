package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prettyNumberMod {
  
  @JSImport("@antv/scale/lib/utils/pretty-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prettyNumber(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
}
