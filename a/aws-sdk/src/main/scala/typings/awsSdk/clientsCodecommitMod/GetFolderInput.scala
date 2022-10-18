package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFolderInput extends StObject {
  
  /**
    * A fully qualified reference used to identify a commit that contains the version of the folder's content to return. A fully qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no specifier is provided, the folder content is returned as it exists in the HEAD commit.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.undefined
  
  /**
    * The fully qualified path to the folder whose contents are returned, including the folder name. For example, /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of a repository. 
    */
  var folderPath: Path
  
  /**
    * The name of the repository.
    */
  var repositoryName: RepositoryName
}
object GetFolderInput {
  
  inline def apply(folderPath: Path, repositoryName: RepositoryName): GetFolderInput = {
    val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderInput]
  }
  
  extension [Self <: GetFolderInput](x: Self) {
    
    inline def setCommitSpecifier(value: CommitName): Self = StObject.set(x, "commitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setCommitSpecifierUndefined: Self = StObject.set(x, "commitSpecifier", js.undefined)
    
    inline def setFolderPath(value: Path): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
