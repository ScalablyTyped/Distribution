package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBranchesResult extends StObject {
  
  /**
    *  A list of branches for an Amplify app. 
    */
  var branches: Branches
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBranchesResult {
  
  inline def apply(branches: Branches): ListBranchesResult = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesResult]
  }
  
  extension [Self <: ListBranchesResult](x: Self) {
    
    inline def setBranches(value: Branches): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesVarargs(value: Branch*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
