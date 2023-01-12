package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArtifactsResponse extends StObject {
  
  /**
    * A list of artifacts and their properties.
    */
  var ArtifactSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactSummaries] = js.undefined
  
  /**
    * A token for getting the next set of artifacts, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListArtifactsResponse {
  
  inline def apply(): ListArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArtifactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListArtifactsResponse] (val x: Self) extends AnyVal {
    
    inline def setArtifactSummaries(value: ArtifactSummaries): Self = StObject.set(x, "ArtifactSummaries", value.asInstanceOf[js.Any])
    
    inline def setArtifactSummariesUndefined: Self = StObject.set(x, "ArtifactSummaries", js.undefined)
    
    inline def setArtifactSummariesVarargs(value: ArtifactSummary*): Self = StObject.set(x, "ArtifactSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
