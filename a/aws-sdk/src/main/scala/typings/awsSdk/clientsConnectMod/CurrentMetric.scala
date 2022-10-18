package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[CurrentMetricName] = js.undefined
  
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.clientsConnectMod.Unit] = js.undefined
}
object CurrentMetric {
  
  inline def apply(): CurrentMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetric]
  }
  
  extension [Self <: CurrentMetric](x: Self) {
    
    inline def setName(value: CurrentMetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
