package typings.antvCoord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/coord/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatNum(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def formatNum(num: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNum")(num.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def trunc(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def wrapNum(x: Double, range: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(x.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def wrapNum(x: Double, range: js.Array[Double], includeMax: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapNum")(x.asInstanceOf[js.Any], range.asInstanceOf[js.Any], includeMax.asInstanceOf[js.Any])).asInstanceOf[Double]
}
