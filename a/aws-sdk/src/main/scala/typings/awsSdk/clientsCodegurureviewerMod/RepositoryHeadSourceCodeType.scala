package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryHeadSourceCodeType extends StObject {
  
  /**
    * The name of the branch in an associated repository. The RepositoryHeadSourceCodeType specifies the tip of this branch.
    */
  var BranchName: typings.awsSdk.clientsCodegurureviewerMod.BranchName
}
object RepositoryHeadSourceCodeType {
  
  inline def apply(BranchName: BranchName): RepositoryHeadSourceCodeType = {
    val __obj = js.Dynamic.literal(BranchName = BranchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryHeadSourceCodeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryHeadSourceCodeType] (val x: Self) extends AnyVal {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "BranchName", value.asInstanceOf[js.Any])
  }
}
