package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nearestMod {
  
  @JSImport("antd-mobile/es/utils/nearest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nearest(arr: js.Array[Double], target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(arr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
}
