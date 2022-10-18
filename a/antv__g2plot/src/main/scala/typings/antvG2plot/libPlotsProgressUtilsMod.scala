package typings.antvG2plot

import typings.antvG2plot.anon.PercentNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsProgressUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/progress/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProgressData(percent: Double): js.Array[PercentNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProgressData")(percent.asInstanceOf[js.Any]).asInstanceOf[js.Array[PercentNumber]]
}
