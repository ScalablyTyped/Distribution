package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRumMetricsDestinationsRequest extends StObject {
  
  /**
    * The name of the app monitor associated with the destinations that you want to retrieve.
    */
  var AppMonitorName: typings.awsSdk.clientsRumMod.AppMonitorName
  
  /**
    * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is 100. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRumMetricsDestinationsRequest {
  
  inline def apply(AppMonitorName: AppMonitorName): ListRumMetricsDestinationsRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRumMetricsDestinationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRumMetricsDestinationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
