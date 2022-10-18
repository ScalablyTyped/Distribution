package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsBoundMod {
  
  @JSImport("antd-mobile/es/utils/bound", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bound(position: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bound")(position.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def bound(position: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bound(position: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bound(position: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
