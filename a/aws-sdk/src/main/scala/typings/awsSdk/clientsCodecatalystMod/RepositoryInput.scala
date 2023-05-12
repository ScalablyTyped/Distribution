package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryInput extends StObject {
  
  /**
    * The name of the branch in a source repository.
    */
  var branchName: js.UndefOr[SourceRepositoryBranchString] = js.undefined
  
  /**
    * The name of the source repository.
    */
  var repositoryName: SourceRepositoryNameString
}
object RepositoryInput {
  
  inline def apply(repositoryName: SourceRepositoryNameString): RepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryInput] (val x: Self) extends AnyVal {
    
    inline def setBranchName(value: SourceRepositoryBranchString): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setRepositoryName(value: SourceRepositoryNameString): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
