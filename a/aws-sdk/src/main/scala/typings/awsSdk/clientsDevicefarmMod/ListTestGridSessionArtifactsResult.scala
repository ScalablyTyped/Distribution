package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridSessionArtifactsResult extends StObject {
  
  /**
    * A list of test grid session artifacts for a TestGridSession.
    */
  var artifacts: js.UndefOr[TestGridSessionArtifacts] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTestGridSessionArtifactsResult {
  
  inline def apply(): ListTestGridSessionArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionArtifactsResult]
  }
  
  extension [Self <: ListTestGridSessionArtifactsResult](x: Self) {
    
    inline def setArtifacts(value: TestGridSessionArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: TestGridSessionArtifact*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
