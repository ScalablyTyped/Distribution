package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArtifactsRequest extends StObject {
  
  /**
    * A filter that returns only artifacts of the specified type.
    */
  var ArtifactType: js.UndefOr[String256] = js.undefined
  
  /**
    * A filter that returns only artifacts created on or after the specified time.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only artifacts created on or before the specified time.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of artifacts to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous call to ListArtifacts didn't return the full set of artifacts, the call returns a token for getting the next set of artifacts.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortArtifactsBy] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that returns only artifacts with the specified source URI.
    */
  var SourceUri: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceUri] = js.undefined
}
object ListArtifactsRequest {
  
  inline def apply(): ListArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArtifactsRequest]
  }
  
  extension [Self <: ListArtifactsRequest](x: Self) {
    
    inline def setArtifactType(value: String256): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypeUndefined: Self = StObject.set(x, "ArtifactType", js.undefined)
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortArtifactsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setSourceUri(value: SourceUri): Self = StObject.set(x, "SourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "SourceUri", js.undefined)
  }
}
