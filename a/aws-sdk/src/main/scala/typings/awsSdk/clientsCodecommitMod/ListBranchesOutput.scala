package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBranchesOutput extends StObject {
  
  /**
    * The list of branch names.
    */
  var branches: js.UndefOr[BranchNameList] = js.undefined
  
  /**
    * An enumeration token that returns the batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBranchesOutput {
  
  inline def apply(): ListBranchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBranchesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBranchesOutput] (val x: Self) extends AnyVal {
    
    inline def setBranches(value: BranchNameList): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
    
    inline def setBranchesVarargs(value: BranchName*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
