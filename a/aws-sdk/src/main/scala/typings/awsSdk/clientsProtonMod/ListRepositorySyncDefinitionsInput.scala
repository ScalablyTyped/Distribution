package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositorySyncDefinitionsInput extends StObject {
  
  /**
    * A token that indicates the location of the next repository sync definition in the array of repository sync definitions, after the list of repository sync definitions previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * The repository name.
    */
  var repositoryName: RepositoryName
  
  /**
    * The repository provider.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * The sync type. The only supported value is TEMPLATE_SYNC.
    */
  var syncType: SyncType
}
object ListRepositorySyncDefinitionsInput {
  
  inline def apply(repositoryName: RepositoryName, repositoryProvider: RepositoryProvider, syncType: SyncType): ListRepositorySyncDefinitionsInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], syncType = syncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositorySyncDefinitionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRepositorySyncDefinitionsInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setSyncType(value: SyncType): Self = StObject.set(x, "syncType", value.asInstanceOf[js.Any])
  }
}
