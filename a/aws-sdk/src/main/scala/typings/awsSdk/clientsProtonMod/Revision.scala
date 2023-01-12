package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revision extends StObject {
  
  /**
    * The repository branch.
    */
  var branch: GitBranchName
  
  /**
    * The repository directory changed by a commit and push that activated the sync attempt.
    */
  var directory: String
  
  /**
    * The repository name.
    */
  var repositoryName: RepositoryName
  
  /**
    * The repository provider.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * The secure hash algorithm (SHA) hash for the revision.
    */
  var sha: SHA
}
object Revision {
  
  inline def apply(
    branch: GitBranchName,
    directory: String,
    repositoryName: RepositoryName,
    repositoryProvider: RepositoryProvider,
    sha: SHA
  ): Revision = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setSha(value: SHA): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
