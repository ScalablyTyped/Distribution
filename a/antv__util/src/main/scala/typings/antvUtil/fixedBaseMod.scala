package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedBaseMod {
  
  @JSImport("@antv/util/lib/fixed-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(v: Double, base: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def default(v: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
}
