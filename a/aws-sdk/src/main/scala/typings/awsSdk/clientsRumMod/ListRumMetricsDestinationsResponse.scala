package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRumMetricsDestinationsResponse extends StObject {
  
  /**
    * The list of CloudWatch RUM extended metrics destinations associated with the app monitor that you specified.
    */
  var Destinations: js.UndefOr[MetricDestinationSummaryList] = js.undefined
  
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListRumMetricsDestinationsResponse {
  
  inline def apply(): ListRumMetricsDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRumMetricsDestinationsResponse]
  }
  
  extension [Self <: ListRumMetricsDestinationsResponse](x: Self) {
    
    inline def setDestinations(value: MetricDestinationSummaryList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: MetricDestinationSummary*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
