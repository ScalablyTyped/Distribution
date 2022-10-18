package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricStreamsInput extends StObject {
  
  /**
    * The maximum number of results to return in one operation.
    */
  var MaxResults: js.UndefOr[ListMetricStreamsMaxResults] = js.undefined
  
  /**
    * Include this value, if it was returned by the previous call, to get the next set of metric streams.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object ListMetricStreamsInput {
  
  inline def apply(): ListMetricStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricStreamsInput]
  }
  
  extension [Self <: ListMetricStreamsInput](x: Self) {
    
    inline def setMaxResults(value: ListMetricStreamsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
