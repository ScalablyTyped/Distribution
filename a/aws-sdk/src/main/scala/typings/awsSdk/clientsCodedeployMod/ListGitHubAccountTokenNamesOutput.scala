package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGitHubAccountTokenNamesOutput extends StObject {
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent ListGitHubAccountTokenNames call to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of names of connections to GitHub accounts.
    */
  var tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined
}
object ListGitHubAccountTokenNamesOutput {
  
  inline def apply(): ListGitHubAccountTokenNamesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
  }
  
  extension [Self <: ListGitHubAccountTokenNamesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTokenNameList(value: GitHubAccountTokenNameList): Self = StObject.set(x, "tokenNameList", value.asInstanceOf[js.Any])
    
    inline def setTokenNameListUndefined: Self = StObject.set(x, "tokenNameList", js.undefined)
    
    inline def setTokenNameListVarargs(value: GitHubAccountTokenName*): Self = StObject.set(x, "tokenNameList", js.Array(value*))
  }
}
