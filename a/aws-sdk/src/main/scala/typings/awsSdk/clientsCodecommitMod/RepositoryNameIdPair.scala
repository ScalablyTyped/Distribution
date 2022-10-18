package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryNameIdPair extends StObject {
  
  /**
    * The ID associated with the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  
  /**
    * The name associated with the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object RepositoryNameIdPair {
  
  inline def apply(): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
  
  extension [Self <: RepositoryNameIdPair](x: Self) {
    
    inline def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
