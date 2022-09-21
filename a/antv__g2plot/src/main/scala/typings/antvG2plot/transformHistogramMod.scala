package typings.antvG2plot

import typings.antvG2plot.typesCommonMod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformHistogramMod {
  
  @JSImport("@antv/g2plot/lib/utils/transform/histogram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binHistogram(data: Data, binField: String, binWidth: Double): js.Array[StatisticData] = (^.asInstanceOf[js.Dynamic].applyDynamic("binHistogram")(data.asInstanceOf[js.Any], binField.asInstanceOf[js.Any], binWidth.asInstanceOf[js.Any])).asInstanceOf[js.Array[StatisticData]]
  inline def binHistogram(data: Data, binField: String, binWidth: Double, binNumber: Double): js.Array[StatisticData] = (^.asInstanceOf[js.Dynamic].applyDynamic("binHistogram")(data.asInstanceOf[js.Any], binField.asInstanceOf[js.Any], binWidth.asInstanceOf[js.Any], binNumber.asInstanceOf[js.Any])).asInstanceOf[js.Array[StatisticData]]
  inline def binHistogram(data: Data, binField: String, binWidth: Double, binNumber: Double, stackField: String): js.Array[StatisticData] = (^.asInstanceOf[js.Dynamic].applyDynamic("binHistogram")(data.asInstanceOf[js.Any], binField.asInstanceOf[js.Any], binWidth.asInstanceOf[js.Any], binNumber.asInstanceOf[js.Any], stackField.asInstanceOf[js.Any])).asInstanceOf[js.Array[StatisticData]]
  inline def binHistogram(data: Data, binField: String, binWidth: Double, binNumber: Unit, stackField: String): js.Array[StatisticData] = (^.asInstanceOf[js.Dynamic].applyDynamic("binHistogram")(data.asInstanceOf[js.Any], binField.asInstanceOf[js.Any], binWidth.asInstanceOf[js.Any], binNumber.asInstanceOf[js.Any], stackField.asInstanceOf[js.Any])).asInstanceOf[js.Array[StatisticData]]
  
  trait StatisticData extends StObject {
    
    var count: Double
    
    var range: js.Array[Double]
  }
  object StatisticData {
    
    inline def apply(count: Double, range: js.Array[Double]): StatisticData = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatisticData]
    }
    
    extension [Self <: StatisticData](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
}
