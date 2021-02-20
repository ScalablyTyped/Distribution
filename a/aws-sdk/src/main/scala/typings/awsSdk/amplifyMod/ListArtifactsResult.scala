package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListArtifactsResult extends StObject {
  
  /**
    *  A list of artifacts. 
    */
  var artifacts: Artifacts = js.native
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListArtifactsResult {
  
  @scala.inline
  def apply(artifacts: Artifacts): ListArtifactsResult = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsResult]
  }
  
  @scala.inline
  implicit class ListArtifactsResultMutableBuilder[Self <: ListArtifactsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
