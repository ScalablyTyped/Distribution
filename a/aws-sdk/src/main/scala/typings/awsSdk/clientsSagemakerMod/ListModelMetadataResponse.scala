package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelMetadataResponse extends StObject {
  
  /**
    * A structure that holds model metadata.
    */
  var ModelMetadataSummaries: typings.awsSdk.clientsSagemakerMod.ModelMetadataSummaries
  
  /**
    * A token for getting the next set of recommendations, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListModelMetadataResponse {
  
  inline def apply(ModelMetadataSummaries: ModelMetadataSummaries): ListModelMetadataResponse = {
    val __obj = js.Dynamic.literal(ModelMetadataSummaries = ModelMetadataSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelMetadataResponse]
  }
  
  extension [Self <: ListModelMetadataResponse](x: Self) {
    
    inline def setModelMetadataSummaries(value: ModelMetadataSummaries): Self = StObject.set(x, "ModelMetadataSummaries", value.asInstanceOf[js.Any])
    
    inline def setModelMetadataSummariesVarargs(value: ModelMetadataSummary*): Self = StObject.set(x, "ModelMetadataSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
