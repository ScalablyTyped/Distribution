package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightResultsResponse extends StObject {
  
  /**
    * The insight results returned by the operation.
    */
  var InsightResults: typings.awsSdk.clientsSecurityhubMod.InsightResults
}
object GetInsightResultsResponse {
  
  inline def apply(InsightResults: InsightResults): GetInsightResultsResponse = {
    val __obj = js.Dynamic.literal(InsightResults = InsightResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightResultsResponse]
  }
  
  extension [Self <: GetInsightResultsResponse](x: Self) {
    
    inline def setInsightResults(value: InsightResults): Self = StObject.set(x, "InsightResults", value.asInstanceOf[js.Any])
  }
}
