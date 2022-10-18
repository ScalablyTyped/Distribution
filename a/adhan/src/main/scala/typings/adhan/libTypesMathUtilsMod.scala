package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMathUtilsMod {
  
  @JSImport("adhan/lib/types/MathUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def degreesToRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalizeToScale(num: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToScale")(num.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quadrantShiftAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quadrantShiftAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def radiansToDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unwindAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unwindAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
}
