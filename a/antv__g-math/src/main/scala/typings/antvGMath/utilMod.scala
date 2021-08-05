package typings.antvGMath

import typings.antvGMath.anon.MaxX
import typings.antvGMath.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/g-math/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getBBoxByArray(xArr: js.Array[Double], yArr: js.Array[Double]): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxByArray")(xArr.asInstanceOf[js.Any], yArr.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def getBBoxRange(x1: Double, y1: Double, x2: Double, y2: Double): MaxX = (^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxRange")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[MaxX]
  
  inline def isNumberEqual(v1: Double, v2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberEqual")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def piMod(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("piMod")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
}
