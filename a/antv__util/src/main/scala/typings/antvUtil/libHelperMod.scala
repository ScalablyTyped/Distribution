package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelperMod {
  
  @JSImport("@antv/util/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mod(n: Double, m: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toRadian(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadian")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
}
