package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVectorEnrichmentJobOutput extends StObject {
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
  
  /**
    * Contains summary information about the Vector Enrichment jobs.
    */
  var VectorEnrichmentJobSummaries: VectorEnrichmentJobList
}
object ListVectorEnrichmentJobOutput {
  
  inline def apply(VectorEnrichmentJobSummaries: VectorEnrichmentJobList): ListVectorEnrichmentJobOutput = {
    val __obj = js.Dynamic.literal(VectorEnrichmentJobSummaries = VectorEnrichmentJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVectorEnrichmentJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVectorEnrichmentJobOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVectorEnrichmentJobSummaries(value: VectorEnrichmentJobList): Self = StObject.set(x, "VectorEnrichmentJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setVectorEnrichmentJobSummariesVarargs(value: ListVectorEnrichmentJobOutputConfig*): Self = StObject.set(x, "VectorEnrichmentJobSummaries", js.Array(value*))
  }
}
