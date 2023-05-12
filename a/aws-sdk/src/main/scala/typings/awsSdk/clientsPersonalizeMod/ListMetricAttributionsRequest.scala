package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricAttributionsRequest extends StObject {
  
  /**
    * The metric attributions' dataset group Amazon Resource Name (ARN).
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The maximum number of metric attributions to return in one page of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMetricAttributionsRequest {
  
  inline def apply(): ListMetricAttributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricAttributionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricAttributionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
