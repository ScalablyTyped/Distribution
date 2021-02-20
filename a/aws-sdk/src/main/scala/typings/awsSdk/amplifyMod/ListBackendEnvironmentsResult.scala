package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackendEnvironmentsResult extends StObject {
  
  /**
    *  The list of backend environments for an Amplify app. 
    */
  var backendEnvironments: BackendEnvironments = js.native
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBackendEnvironmentsResult {
  
  @scala.inline
  def apply(backendEnvironments: BackendEnvironments): ListBackendEnvironmentsResult = {
    val __obj = js.Dynamic.literal(backendEnvironments = backendEnvironments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsResult]
  }
  
  @scala.inline
  implicit class ListBackendEnvironmentsResultMutableBuilder[Self <: ListBackendEnvironmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendEnvironments(value: BackendEnvironments): Self = StObject.set(x, "backendEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendEnvironmentsVarargs(value: BackendEnvironment*): Self = StObject.set(x, "backendEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
