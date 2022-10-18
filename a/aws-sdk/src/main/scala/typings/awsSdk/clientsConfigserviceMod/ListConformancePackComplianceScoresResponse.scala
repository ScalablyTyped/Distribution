package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConformancePackComplianceScoresResponse extends StObject {
  
  /**
    * A list of ConformancePackComplianceScore objects.
    */
  var ConformancePackComplianceScores: typings.awsSdk.clientsConfigserviceMod.ConformancePackComplianceScores
  
  /**
    * The nextToken string that you can use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object ListConformancePackComplianceScoresResponse {
  
  inline def apply(ConformancePackComplianceScores: ConformancePackComplianceScores): ListConformancePackComplianceScoresResponse = {
    val __obj = js.Dynamic.literal(ConformancePackComplianceScores = ConformancePackComplianceScores.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConformancePackComplianceScoresResponse]
  }
  
  extension [Self <: ListConformancePackComplianceScoresResponse](x: Self) {
    
    inline def setConformancePackComplianceScores(value: ConformancePackComplianceScores): Self = StObject.set(x, "ConformancePackComplianceScores", value.asInstanceOf[js.Any])
    
    inline def setConformancePackComplianceScoresVarargs(value: ConformancePackComplianceScore*): Self = StObject.set(x, "ConformancePackComplianceScores", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
