package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackendEnvironmentsResult extends StObject {
  
  /**
    *  The list of backend environments for an Amplify app. 
    */
  var backendEnvironments: BackendEnvironments
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBackendEnvironmentsResult {
  
  inline def apply(backendEnvironments: BackendEnvironments): ListBackendEnvironmentsResult = {
    val __obj = js.Dynamic.literal(backendEnvironments = backendEnvironments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsResult]
  }
  
  extension [Self <: ListBackendEnvironmentsResult](x: Self) {
    
    inline def setBackendEnvironments(value: BackendEnvironments): Self = StObject.set(x, "backendEnvironments", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentsVarargs(value: BackendEnvironment*): Self = StObject.set(x, "backendEnvironments", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
