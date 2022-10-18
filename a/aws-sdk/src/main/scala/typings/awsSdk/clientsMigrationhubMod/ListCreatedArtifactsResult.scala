package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreatedArtifactsResult extends StObject {
  
  /**
    * List of created artifacts up to the maximum number of results specified in the request.
    */
  var CreatedArtifactList: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.CreatedArtifactList] = js.undefined
  
  /**
    * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCreatedArtifactsResult {
  
  inline def apply(): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
  
  extension [Self <: ListCreatedArtifactsResult](x: Self) {
    
    inline def setCreatedArtifactList(value: CreatedArtifactList): Self = StObject.set(x, "CreatedArtifactList", value.asInstanceOf[js.Any])
    
    inline def setCreatedArtifactListUndefined: Self = StObject.set(x, "CreatedArtifactList", js.undefined)
    
    inline def setCreatedArtifactListVarargs(value: CreatedArtifact*): Self = StObject.set(x, "CreatedArtifactList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
