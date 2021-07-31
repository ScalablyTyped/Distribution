package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@antv/scale/lib/util/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calBase(a: Double, b: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calBase")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getLogPositiveMin(values: js.Any, base: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogPositiveMin")(values.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getLogPositiveMin(values: js.Any, base: js.Any, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLogPositiveMin")(values.asInstanceOf[js.Any], base.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def log(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
