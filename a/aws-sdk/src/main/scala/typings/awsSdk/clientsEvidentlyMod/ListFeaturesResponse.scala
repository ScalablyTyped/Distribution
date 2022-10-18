package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFeaturesResponse extends StObject {
  
  /**
    * An array of structures that contain the configuration details of the features in the specified project.
    */
  var features: js.UndefOr[FeatureSummariesList] = js.undefined
  
  /**
    * The token to use in a subsequent ListFeatures operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFeaturesResponse {
  
  inline def apply(): ListFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFeaturesResponse]
  }
  
  extension [Self <: ListFeaturesResponse](x: Self) {
    
    inline def setFeatures(value: FeatureSummariesList): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: FeatureSummary*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
