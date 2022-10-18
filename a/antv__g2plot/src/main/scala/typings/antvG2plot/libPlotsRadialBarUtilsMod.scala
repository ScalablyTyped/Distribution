package typings.antvG2plot

import typings.antvG2plot.libTypesCommonMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadialBarUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/radial-bar/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScaleMax(maxAngle: Double, yField: String, data: Data): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaleMax")(maxAngle.asInstanceOf[js.Any], yField.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getStackedData(data: Data, xField: String, yField: String): Data = (^.asInstanceOf[js.Dynamic].applyDynamic("getStackedData")(data.asInstanceOf[js.Any], xField.asInstanceOf[js.Any], yField.asInstanceOf[js.Any])).asInstanceOf[Data]
}
