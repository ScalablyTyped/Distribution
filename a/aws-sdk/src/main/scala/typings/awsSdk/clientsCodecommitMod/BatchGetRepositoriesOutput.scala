package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRepositoriesOutput extends StObject {
  
  /**
    * A list of repositories returned by the batch get repositories operation.
    */
  var repositories: js.UndefOr[RepositoryMetadataList] = js.undefined
  
  /**
    * Returns a list of repository names for which information could not be found.
    */
  var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined
}
object BatchGetRepositoriesOutput {
  
  inline def apply(): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
    
    inline def setRepositories(value: RepositoryMetadataList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesNotFound(value: RepositoryNotFoundList): Self = StObject.set(x, "repositoriesNotFound", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesNotFoundUndefined: Self = StObject.set(x, "repositoriesNotFound", js.undefined)
    
    inline def setRepositoriesNotFoundVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoriesNotFound", js.Array(value*))
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: RepositoryMetadata*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
