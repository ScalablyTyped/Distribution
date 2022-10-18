package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRubberbandMod {
  
  @JSImport("antd-mobile/es/utils/rubberband", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rubberband(distance: Double, dimension: Double, constant: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(distance.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rubberbandIfOutOfBounds(position: Double, min: Double, max: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rubberbandIfOutOfBounds")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rubberbandIfOutOfBounds(position: Double, min: Double, max: Double, dimension: Double, constant: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rubberbandIfOutOfBounds")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[Double]
}
