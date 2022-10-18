package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupSummariesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MaxResults] = js.undefined
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
  
  /**
    * The minimum severity score for inclusion in the output.
    */
  var SensitivityThreshold: typings.awsSdk.clientsLookoutmetricsMod.SensitivityThreshold
}
object ListAnomalyGroupSummariesRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, SensitivityThreshold: SensitivityThreshold): ListAnomalyGroupSummariesRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], SensitivityThreshold = SensitivityThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomalyGroupSummariesRequest]
  }
  
  extension [Self <: ListAnomalyGroupSummariesRequest](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSensitivityThreshold(value: SensitivityThreshold): Self = StObject.set(x, "SensitivityThreshold", value.asInstanceOf[js.Any])
  }
}
