package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Name] = js.undefined
  
  /**
    * The value for the metric.
    */
  var Value: js.UndefOr[Double] = js.undefined
}
object BaselineMetric {
  
  inline def apply(): BaselineMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineMetric]
  }
  
  extension [Self <: BaselineMetric](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
