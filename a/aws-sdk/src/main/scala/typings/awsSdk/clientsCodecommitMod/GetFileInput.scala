package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileInput extends StObject {
  
  /**
    * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a full commit ID, a tag, a branch name, or a reference such as refs/heads/master. If none is provided, the head commit is used.
    */
  var commitSpecifier: js.UndefOr[CommitName] = js.undefined
  
  /**
    * The fully qualified path to the file, including the full name and extension of the file. For example, /examples/file.md is the fully qualified path to a file named file.md in a folder named examples.
    */
  var filePath: Path
  
  /**
    * The name of the repository that contains the file.
    */
  var repositoryName: RepositoryName
}
object GetFileInput {
  
  inline def apply(filePath: Path, repositoryName: RepositoryName): GetFileInput = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInput]
  }
  
  extension [Self <: GetFileInput](x: Self) {
    
    inline def setCommitSpecifier(value: CommitName): Self = StObject.set(x, "commitSpecifier", value.asInstanceOf[js.Any])
    
    inline def setCommitSpecifierUndefined: Self = StObject.set(x, "commitSpecifier", js.undefined)
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
