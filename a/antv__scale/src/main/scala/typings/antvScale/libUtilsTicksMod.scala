package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsTicksMod {
  
  @JSImport("@antv/scale/lib/utils/ticks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tickIncrement(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickIncrement")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tickStep(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickStep")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
}
