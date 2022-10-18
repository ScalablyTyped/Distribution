package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLineageGroupsResponse extends StObject {
  
  /**
    * A list of lineage groups and their properties.
    */
  var LineageGroupSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageGroupSummaries] = js.undefined
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListLineageGroupsResponse {
  
  inline def apply(): ListLineageGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLineageGroupsResponse]
  }
  
  extension [Self <: ListLineageGroupsResponse](x: Self) {
    
    inline def setLineageGroupSummaries(value: LineageGroupSummaries): Self = StObject.set(x, "LineageGroupSummaries", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupSummariesUndefined: Self = StObject.set(x, "LineageGroupSummaries", js.undefined)
    
    inline def setLineageGroupSummariesVarargs(value: LineageGroupSummary*): Self = StObject.set(x, "LineageGroupSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
