package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBranchOutput extends StObject {
  
  /**
    * Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.
    */
  var deletedBranch: js.UndefOr[BranchInfo] = js.undefined
}
object DeleteBranchOutput {
  
  inline def apply(): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBranchOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
    
    inline def setDeletedBranch(value: BranchInfo): Self = StObject.set(x, "deletedBranch", value.asInstanceOf[js.Any])
    
    inline def setDeletedBranchUndefined: Self = StObject.set(x, "deletedBranch", js.undefined)
  }
}
