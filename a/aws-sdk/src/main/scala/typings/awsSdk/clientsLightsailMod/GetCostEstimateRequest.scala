package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostEstimateRequest extends StObject {
  
  /**
    * The cost estimate end time. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify 1538427600 as the end time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var endTime: js.Date
  
  /**
    * The resource name.
    */
  var resourceName: ResourceName
  
  /**
    * The cost estimate start time. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify 1538424000 as the start time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var startTime: js.Date
}
object GetCostEstimateRequest {
  
  inline def apply(endTime: js.Date, resourceName: ResourceName, startTime: js.Date): GetCostEstimateRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostEstimateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCostEstimateRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
