package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricValuesRequest extends StObject {
  
  /**
    * The dimension name.
    */
  var dimensionName: js.UndefOr[DimensionName] = js.undefined
  
  /**
    * The dimension value operator.
    */
  var dimensionValueOperator: js.UndefOr[DimensionValueOperator] = js.undefined
  
  /**
    * The end of the time period for which metric values are returned.
    */
  var endTime: js.Date
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name of the security profile metric for which values are returned.
    */
  var metricName: BehaviorMetric
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The start of the time period for which metric values are returned.
    */
  var startTime: js.Date
  
  /**
    * The name of the thing for which security profile metric values are returned.
    */
  var thingName: DeviceDefenderThingName
}
object ListMetricValuesRequest {
  
  inline def apply(
    endTime: js.Date,
    metricName: BehaviorMetric,
    startTime: js.Date,
    thingName: DeviceDefenderThingName
  ): ListMetricValuesRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMetricValuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricValuesRequest] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: DimensionName): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setDimensionValueOperator(value: DimensionValueOperator): Self = StObject.set(x, "dimensionValueOperator", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueOperatorUndefined: Self = StObject.set(x, "dimensionValueOperator", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMetricName(value: BehaviorMetric): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
