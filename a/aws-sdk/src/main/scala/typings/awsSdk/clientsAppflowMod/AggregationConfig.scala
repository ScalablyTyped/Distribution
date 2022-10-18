package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationConfig extends StObject {
  
  /**
    *  Specifies whether Amazon AppFlow aggregates the flow records into a single file, or leave them unaggregated. 
    */
  var aggregationType: js.UndefOr[AggregationType] = js.undefined
}
object AggregationConfig {
  
  inline def apply(): AggregationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationConfig]
  }
  
  extension [Self <: AggregationConfig](x: Self) {
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
  }
}
