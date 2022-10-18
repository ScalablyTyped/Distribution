package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectParentPathsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.PathToObjectIdentifiersList] = js.undefined
}
object BatchListObjectParentPathsResponse {
  
  inline def apply(): BatchListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentPathsResponse]
  }
  
  extension [Self <: BatchListObjectParentPathsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPathToObjectIdentifiersList(value: PathToObjectIdentifiersList): Self = StObject.set(x, "PathToObjectIdentifiersList", value.asInstanceOf[js.Any])
    
    inline def setPathToObjectIdentifiersListUndefined: Self = StObject.set(x, "PathToObjectIdentifiersList", js.undefined)
    
    inline def setPathToObjectIdentifiersListVarargs(value: PathToObjectIdentifiers*): Self = StObject.set(x, "PathToObjectIdentifiersList", js.Array(value*))
  }
}
