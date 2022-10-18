package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyDetectorsResponse extends StObject {
  
  /**
    * A list of anomaly detectors in the account in the current region.
    */
  var AnomalyDetectorSummaryList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorSummaryList] = js.undefined
  
  /**
    * If the response is truncated, the service returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object ListAnomalyDetectorsResponse {
  
  inline def apply(): ListAnomalyDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomalyDetectorsResponse]
  }
  
  extension [Self <: ListAnomalyDetectorsResponse](x: Self) {
    
    inline def setAnomalyDetectorSummaryList(value: AnomalyDetectorSummaryList): Self = StObject.set(x, "AnomalyDetectorSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorSummaryListUndefined: Self = StObject.set(x, "AnomalyDetectorSummaryList", js.undefined)
    
    inline def setAnomalyDetectorSummaryListVarargs(value: AnomalyDetectorSummary*): Self = StObject.set(x, "AnomalyDetectorSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
