package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseResourceMetric extends StObject {
  
  /**
    * The description of the metric.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPiMod.Description] = js.undefined
  
  /**
    * The full name of the metric.
    */
  var Metric: js.UndefOr[String] = js.undefined
  
  /**
    * The unit of the metric.
    */
  var Unit: js.UndefOr[String] = js.undefined
}
object ResponseResourceMetric {
  
  inline def apply(): ResponseResourceMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseResourceMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseResourceMetric] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
