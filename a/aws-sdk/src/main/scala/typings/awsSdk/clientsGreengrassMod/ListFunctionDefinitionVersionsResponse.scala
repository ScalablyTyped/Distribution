package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionDefinitionVersionsResponse extends StObject {
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[listOfVersionInformation] = js.undefined
}
object ListFunctionDefinitionVersionsResponse {
  
  inline def apply(): ListFunctionDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionDefinitionVersionsResponse]
  }
  
  extension [Self <: ListFunctionDefinitionVersionsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVersions(value: listOfVersionInformation): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: VersionInformation*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
