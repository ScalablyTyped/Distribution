package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArtifactsResult extends StObject {
  
  /**
    *  A list of artifacts. 
    */
  var artifacts: Artifacts
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListArtifactsResult {
  
  inline def apply(artifacts: Artifacts): ListArtifactsResult = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsResult]
  }
  
  extension [Self <: ListArtifactsResult](x: Self) {
    
    inline def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
