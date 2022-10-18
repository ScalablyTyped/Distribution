package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeatureGroupsResponse extends StObject {
  
  /**
    * A summary of feature groups.
    */
  var FeatureGroupSummaries: typings.awsSdk.clientsSagemakerMod.FeatureGroupSummaries
  
  /**
    * A token to resume pagination of ListFeatureGroups results.
    */
  var NextToken: typings.awsSdk.clientsSagemakerMod.NextToken
}
object ListFeatureGroupsResponse {
  
  inline def apply(FeatureGroupSummaries: FeatureGroupSummaries, NextToken: NextToken): ListFeatureGroupsResponse = {
    val __obj = js.Dynamic.literal(FeatureGroupSummaries = FeatureGroupSummaries.asInstanceOf[js.Any], NextToken = NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFeatureGroupsResponse]
  }
  
  extension [Self <: ListFeatureGroupsResponse](x: Self) {
    
    inline def setFeatureGroupSummaries(value: FeatureGroupSummaries): Self = StObject.set(x, "FeatureGroupSummaries", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupSummariesVarargs(value: FeatureGroupSummary*): Self = StObject.set(x, "FeatureGroupSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
  }
}
