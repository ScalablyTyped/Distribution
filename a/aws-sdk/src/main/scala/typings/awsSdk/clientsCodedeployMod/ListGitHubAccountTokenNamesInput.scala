package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGitHubAccountTokenNamesInput extends StObject {
  
  /**
    * An identifier returned from the previous ListGitHubAccountTokenNames call. It can be used to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListGitHubAccountTokenNamesInput {
  
  inline def apply(): ListGitHubAccountTokenNamesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGitHubAccountTokenNamesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGitHubAccountTokenNamesInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
