package typings.add

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(numbers: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].apply(numbers.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dumbSum(numbers: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dumbSum")(numbers.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fastTwoSum(a: Double, b: Double): js.Tuple3[Double, Double, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("fastTwoSum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, Null]]
  
  /**
    * Finds the immediate power of 2 that is larger than p
    * in a fast way
    */
  inline def nextPowerTwo(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPowerTwo")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
}
